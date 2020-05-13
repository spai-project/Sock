package fr.inria.kairos.sock.dsl.example.sidechannel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import fr.inria.kairos.sock.dsl.example.sidechannel.steps.Estimation;
import fr.inria.kairos.sock.dsl.example.sidechannel.steps.ArrivalWindows;
import fr.inria.kairos.sock.dsl.example.sidechannel.steps.CompactSchedulingTranslator;
import fr.inria.kairos.sock.dsl.example.sidechannel.steps.CompactSchedulingTranslator.Record;
import fr.inria.kairos.sock.dsl.example.sidechannel.steps.TheoremTwo;
import fr.inria.kairos.sock.dsl.model.sock.Actor;
import fr.inria.kairos.sock.dsl.model.sock.IotSystem;
import fr.inria.kairos.sock.example.utils.IOUtils;
import fr.inria.kairos.sock.example.utils.Interval;
import fr.inria.kairos.sock.example.utils.Utils;

public class ScheduLeak {

	private static ScheduLeak _instance;

	public static ScheduLeak initInstance(IotSystem system) {
		_instance = new ScheduLeak(system);
		return _instance;
	}

	public static ScheduLeak getInstance() {
		return _instance;
	}

	private int currentBusyTime;

	private int startingBusyTime = -1;

	private IotSystem system;

	private int hyperPeriod;

	// hacking here
	public List<Interval> busyIntervals = new ArrayList<>();

	private ScheduLeak(IotSystem system) {
		this.system = system;
		this.hyperPeriod = Utils
				.lcm(this.system.getOwnedActor().stream().map(Actor::getPeriodTime).collect(Collectors.toList()));
	}

	public int getHyperPeriod() {
		return this.hyperPeriod;
	}

	public List<Interval> getBusyInterval() {
		return this.busyIntervals;
	}

	/*
	 * USABLE API FROM KERMETA
	 */
	public static void idle(IotSystem system, int time) {
		if (_instance == null) {
			_instance = new ScheduLeak(system);
		}
		_instance._idle(time);
	}

	public static void busy(IotSystem system, int time) {
		if (_instance == null) {
			_instance = new ScheduLeak(system);
		}
		_instance._busy(time);
	}

	public static void takesOver(IotSystem system, int time, Actor takenOver) {
		if (_instance == null) {
			_instance = new ScheduLeak(system);
		}
		_instance._takesOver(time, takenOver);
	}

	private void _idle(int time) {
		if (this.startingBusyTime != -1) {
			this.busyIntervals.add(new Interval(this.startingBusyTime, this.currentBusyTime));
			this.startingBusyTime = -1;
		}
	}

	private void _busy(int time) {
		if (this.startingBusyTime == -1) {
			this.startingBusyTime = time;
		}
		this.currentBusyTime = time;
		if (!hasRun && this.hyperPeriod < time) {
			run();
			this.hasRun = true;
			_instance = new ScheduLeak(system);
			Utils.indicesOfTakesOver.clear();
//			throw new RuntimeException();
		}
	}
	
	private boolean hasRun = false;

	private void _takesOver(int time, Actor takenOver) {
		if (!Utils.indicesOfTakesOver.containsKey(takenOver)) {
			Utils.indicesOfTakesOver.put(takenOver, new ArrayList<>());
		}
		Utils.indicesOfTakesOver.get(takenOver).add(time);
	}

	/*
	 * MAIN ALGORITHM FOR THE SIDE CHANNEL
	 */
	public void run() {
		final Estimation estimation = new Estimation(this.system);
		List<Interval> busyIntervals = this.getBusyInterval();
		System.out.println(busyIntervals);
		System.out.println(Utils.indicesOfTakesOver);
		List<List<Interval>> partitionnedIntervalPerActor = new ArrayList<>();
		for (int i = 0; i < this.system.getOwnedActor().size(); i++) {
			partitionnedIntervalPerActor.add(new ArrayList<>());
		}
		List<List<int[]>> estimationsNPerBusyInterval = new ArrayList<>();
		for (Interval busyInterval : busyIntervals) {
			int[][] candidatesActor = estimation.findCandidateForActor(busyInterval);
			List<int[]> estimationsN = estimation.estimateNbTaskForGivenInterval(busyInterval, candidatesActor);
			if (estimationsN.isEmpty()) {
				throw new RuntimeException();
			}
			estimationsNPerBusyInterval.add(estimationsN);
		}
		boolean hasBeenUpdated = true;
		final List<List<Interval>> arrivalWindows = new ArrayList<>();
		while (hasBeenUpdated) {
			hasBeenUpdated = false;
			for (Interval busyInterval : busyIntervals) {
				List<int[]> estimationsN = estimationsNPerBusyInterval.get(busyIntervals.indexOf(busyInterval));
				for (int i = 0; i < this.system.getOwnedActor().size(); i++) {
					final int smallest = Utils.getSmallest(estimationsN, i);
					List<Interval> partitionnedInterval = TheoremTwo.classify(this.system.getOwnedActor().get(i),
							busyInterval, estimationsN.size() > 1, smallest);
					if (!partitionnedInterval.isEmpty()) {
						partitionnedIntervalPerActor.get(i).addAll(partitionnedInterval);
					}
				}
			}
			arrivalWindows.clear();
			for (int i = 0; i < this.system.getOwnedActor().size(); i++) {
				List<Interval> arrivalWindow = ArrivalWindows.findArrivalWindows(partitionnedIntervalPerActor.get(i),
						this.system.getOwnedActor().get(i));
				arrivalWindows.add(arrivalWindow);
			}
			for (Interval busyInterval : busyIntervals) {
				List<int[]> estimationsN = estimationsNPerBusyInterval.get(busyIntervals.indexOf(busyInterval));
				if (estimationsN.size() < 2) {
					continue;
				}
				for (int i = 0; i < arrivalWindows.size(); i++) {
					List<Interval> arrivalWindow = arrivalWindows.get(i);
					if (this.allEquals(estimationsN, i)) {
						continue;
					}
					final int nbTimeTaskMustBeCompletedWithinBusyInterval = applyArrivalWindowsToBusyInterval(
							busyInterval, arrivalWindow, this.system.getOwnedActor().get(i));
					List<int[]> copyEstimationsN = new ArrayList<>(estimationsN);
					for (int[] estimationN : copyEstimationsN) {
						if (estimationN[i] != nbTimeTaskMustBeCompletedWithinBusyInterval) {
							estimationsN.remove(estimationN);
							hasBeenUpdated = true;
						}
					}
				}
			}
		}
		CompactSchedulingTranslator algorithm = new CompactSchedulingTranslator(this.system);
		for (int i = 0; i < busyIntervals.size() ; i++) {
			final Interval busyInterval = busyIntervals.get(i);
			List<int[]> estimationForBusyInterval = estimationsNPerBusyInterval.get(i);
			List<Record> arrivalTimesForCurrentBusyInterval = new ArrayList<>();
			final List<Integer> arrivalTimeForEachTask = buildArrivalWindows(arrivalWindows);
			for (int j = 0; j < estimationForBusyInterval.get(0).length; j++) {
				for (int nbActor = 0; nbActor < estimationForBusyInterval.get(0)[j]; nbActor++) {
					final Actor actor = this.system.getOwnedActor().get(j);
					final int periodActor = actor.getPeriodTime();
					int firstPeriodStart = (busyInterval.time1 / periodActor) * periodActor;
					firstPeriodStart = this.getNextPeriodStart(busyInterval, actor);
					final int arrivalTime = firstPeriodStart + (nbActor * periodActor) + arrivalTimeForEachTask.get(j);
					arrivalTimesForCurrentBusyInterval.add(new Record(j,
							arrivalTime,
							Utils.computeRealProcessTime(this.system.getOwnedActor().get(j), busyInterval)));
				}
			}
			List<Record> schedule = algorithm.run(busyInterval, arrivalTimesForCurrentBusyInterval);
			System.out.println(i + " " + busyInterval + " " + schedule.toString()
					+ Arrays.toString(estimationForBusyInterval.get(0)));
			IOUtils.writeRaw(toString(schedule), this.system.getName() + "/attack_schedule");
		}
	}

	public String toString(List<Record> schedule) {
		return schedule.stream()
				.map(record -> this.system.getOwnedActor().get(record.indexActor).getName() + " " + record.arrivalTime)
				.collect(Collectors.joining(IOUtils.NEW_LINE));
	}

	public int getNextPeriodStart(Interval busyInterval, Actor actor) {
		final int periodActor = actor.getPeriodTime();
		final int atTimeCompleteTaskFromStart = busyInterval.time1 + Utils.computeRealProcessTime(actor, busyInterval);
		final int nextDeadline = ((busyInterval.time1 / periodActor) + 1) * periodActor;
		if (atTimeCompleteTaskFromStart > nextDeadline) {
			return nextDeadline + 1;
		} else {
			return busyInterval.time1;
		}
	}

	public List<Integer> buildArrivalWindows(List<List<Interval>> arrivalWindows) {
		final List<Integer> resArrivalWindows = new ArrayList<>();
		for (List<Interval> arrivalWindowsForAnActor : arrivalWindows) {
			Collections.sort(arrivalWindowsForAnActor, new Comparator<Interval>() {
				@Override
				public int compare(Interval a, Interval b) {
					return a.time1 - b.time1;
				}
			});
			resArrivalWindows.add(arrivalWindowsForAnActor.get(0).time1);
		}
		return resArrivalWindows;
	}

	public int correctArrivalTime(List<Record> arrivalTimesForCurrentBusyInterval, int arrivalTime) {
		for (Record record : arrivalTimesForCurrentBusyInterval) {
			if (record.arrivalTime == arrivalTime) {
				return this.correctArrivalTime(arrivalTimesForCurrentBusyInterval, record.timeProcess + arrivalTime);
			}
		}
		return arrivalTime;
	}

	private boolean allEquals(List<int[]> list, int index) {
		int firstValue = list.get(0)[index];
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i)[index] != firstValue) {
				return false;
			}
		}
		return true;
	}

	private int applyArrivalWindowsToBusyInterval(Interval busyInterval, List<Interval> arrivalWindows, Actor actor) {
		final List<Interval> converteds = busyInterval.convert(actor.getPeriodTime());
		final List<Interval> withinArrivalWindow = arrivalWindows.stream().filter(
				arrivalWindow -> converteds.stream().anyMatch(interval -> interval.isWithin(arrivalWindow.time1)))
				.collect(Collectors.toList());
		int nbTimeTaskMustBeCompletedWithinBusyInterval = 0;
		for (int i = 0; i < converteds.size(); i++) {
			for (int j = 0; j < withinArrivalWindow.size(); j++) {
				final Interval interval = new Interval(withinArrivalWindow.get(j).time1, converteds.get(i).time2);
				int startTask = busyInterval.time1 + interval.time1;
				if (busyInterval.isWithin(startTask)) {
					nbTimeTaskMustBeCompletedWithinBusyInterval++;
				}
			}
		}
		return nbTimeTaskMustBeCompletedWithinBusyInterval;
	}

}