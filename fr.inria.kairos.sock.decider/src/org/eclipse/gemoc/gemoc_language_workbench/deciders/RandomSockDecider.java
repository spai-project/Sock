package org.eclipse.gemoc.gemoc_language_workbench.deciders;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.core.AbstractConcurrentExecutionEngine;
import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.core.ILogicalStepDecider;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.Scheduler;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.Shifter;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderChecker;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderHelper;
import org.eclipse.gemoc.trace.commons.model.trace.Step;

import fr.inria.kairos.sock.dsl.model.sock.Actor;
import fr.inria.kairos.sock.dsl.model.sock.IotSystem;

public class RandomSockDecider implements ILogicalStepDecider {

	private Scheduler scheduler;

	private int nbDecide;

	private List<ArrivalTime> schedule;

	private Shifter shifter;

	public RandomSockDecider() {
		super();
		this.nbDecide = 0;
		this.schedule = new ArrayList<>();
	}

	private class ArrivalTime {
		public final String actor;
		public final int arrivalTime;

		public ArrivalTime(String actor, int arrivalTime) {
			this.actor = actor;
			this.arrivalTime = arrivalTime;
		}
	}

	public static String BASE_PATH_OUTPUT = "/Users/stephaniechallita/Desktop/runtime-EclipseApplication/";

	public static final String NEW_LINE = System.lineSeparator();

	public String toString(List<ArrivalTime> schedule) {
		return schedule.stream().map(arrivalTime -> arrivalTime.actor + " " + arrivalTime.arrivalTime)
				.collect(Collectors.joining(NEW_LINE));
	}

	public Step<?> decide(AbstractConcurrentExecutionEngine engine, final List<Step<?>> possibleLogicalSteps) {
		final IotSystem system = (IotSystem) engine.getExecutionContext().getResourceModel().getContents().get(0);
		final int hyperPeriod = SockDeciderHelper.getHyperPeriod(system);
		if (this.nbDecide != 0 && this.nbDecide % (hyperPeriod + 2) == 0) {
			System.out.println("Reach hyperperiod {" + hyperPeriod + "}. Stopping... in 3s");
			try (FileWriter writer = new FileWriter(new File(BASE_PATH_OUTPUT + system.getName() + "/schedule"),
					true)) {
				writer.write(this.toString(this.schedule) + NEW_LINE);
			} catch (Exception ignored) {
			}
			this.schedule.clear();
			this.scheduler = null;
			this.shifter = null;
			this.nbDecide = 0;
			SockDeciderHelper.hyperPeriod = -1;
			engine.stop();
		}
		if (possibleLogicalSteps.size() == 1) {
			this.nbDecide++;
			return possibleLogicalSteps.get(0);
		}
		if (this.scheduler == null) {
			this.scheduler = new Scheduler(system);
			this.shifter = new Shifter(system);
		}
		Optional<Step<?>> choosenOneOptional = this.findEnter(system, possibleLogicalSteps);
		if (choosenOneOptional.isPresent()) {
			Step<?> choosenStep = choosenOneOptional.get();
			if (this.shifter.shiftEnter(choosenStep)) {
				try {
					choosenStep = SockDeciderHelper.getLogicalStepThatHaveOnlyGivenPredicate(possibleLogicalSteps,
							SockDeciderChecker.butterflyAttack.negate()
									.and(SockDeciderChecker.isIdle.or(SockDeciderChecker.periodStart)));
				} catch (Exception e) {
					possibleLogicalSteps.stream().map(
							logicalStep -> ">>>\n" + SockDeciderHelper.concatAllSubStepsName(logicalStep) + "\n<<<<<\n")
							.forEach(System.err::println);
					e.printStackTrace();
				}
				System.out.println(SockDeciderHelper.concatAllSubStepsName(choosenStep));
				this.nbDecide++;
				return choosenStep;
			}
			System.out.println(SockDeciderHelper.concatAllSubStepsName(choosenStep));
			final String enteringActorName = SockDeciderHelper
					.getAllSubStepsNameMatchingPredicate(choosenStep, SockDeciderChecker.enter).get(0).split("_")[1];
			this.schedule.add(new ArrivalTime(enteringActorName, this.nbDecide));
			this.nbDecide++;
			return choosenStep;
		}
		choosenOneOptional = possibleLogicalSteps.stream()
				.filter(possibleLogicalStep -> SockDeciderChecker.hasClockPredicate(possibleLogicalStep,
						SockDeciderChecker.takesOver))
				.filter(possibleLogicalStep -> SockDeciderChecker.hasNoClockPredicate(possibleLogicalStep,
						SockDeciderChecker.butterflyAttack))
				.sorted(this.scheduler.getComparator()).findFirst();
		if (choosenOneOptional.isPresent()) {
			final Step<?> stepWithProcess = possibleLogicalSteps.stream()
					.filter(possibleLogicalStep -> SockDeciderChecker.hasClockPredicate(possibleLogicalStep,
							SockDeciderChecker.process))
					.filter(possibleLogicalStep -> SockDeciderChecker.hasNoClockPredicate(possibleLogicalStep,
							SockDeciderChecker.butterflyAttack))
					.findFirst().orElseThrow(() -> new RuntimeException(""));
			final String actorNameProcessing = SockDeciderHelper.getEntityNameFromClockName(SockDeciderHelper
					.getAllSubStepsNameMatchingPredicate(stepWithProcess, SockDeciderChecker.process).get(0));
			final Step<?> stepWithTakesOver = choosenOneOptional.get();
			final String actorNameTakingOver = SockDeciderHelper.getEntityNameFromClockName(SockDeciderHelper
					.getAllSubStepsNameMatchingPredicate(stepWithTakesOver, SockDeciderChecker.takesOver).get(0));
			if (this.scheduler.compare(actorNameProcessing, actorNameTakingOver) <= 0) {
				this.nbDecide++;
				return stepWithProcess;
			} else {
				final String enteringActorName = SockDeciderHelper
						.getAllSubStepsNameMatchingPredicate(stepWithTakesOver, SockDeciderChecker.takesOver).get(0)
						.split("_")[1];
				this.schedule.add(new ArrivalTime(enteringActorName, this.nbDecide));
				this.nbDecide++;
				return stepWithTakesOver;
			}
		}
		List<Step<?>> logicalStepsWithoutButterflyAttack = possibleLogicalSteps.stream()
				.filter(possibleLogicalStep -> SockDeciderChecker.hasNoClockPredicate(possibleLogicalStep,
						SockDeciderChecker.butterflyAttack))
				.collect(Collectors.toList());
		this.nbDecide++;
		return SockDeciderHelper.returnRandomOne(logicalStepsWithoutButterflyAttack);
	}

	public Optional<Step<?>> findEnter(IotSystem system, final List<Step<?>> possibleLogicalSteps) {
		List<Step<?>> stepsWithEnter = possibleLogicalSteps.stream()
				.filter(possibleLogicalStep -> SockDeciderChecker.hasClockPredicate(possibleLogicalStep,
						SockDeciderChecker.enter))
				.filter(possibleLogicalStep -> SockDeciderChecker.hasNoClockPredicate(possibleLogicalStep,
						SockDeciderChecker.butterflyAttack))
				.sorted(this.scheduler.getComparator()).collect(Collectors.toList());
		if (stepsWithEnter.isEmpty()) {
			return Optional.empty();
		}
		if (stepsWithEnter.size() <= 1) {
			return Optional.of(stepsWithEnter.get(0));
		}
		final String secondEnteringActorName = SockDeciderHelper
				.getAllSubStepsNameMatchingPredicate(stepsWithEnter.get(1), SockDeciderChecker.enter).get(0)
				.split("_")[1];
		final Actor secondEnteringActor = system.getOwnedActor().stream()
				.filter(actor -> actor.getName().equals(secondEnteringActorName)).findFirst().get();
		final String enteringActorName = SockDeciderHelper
				.getAllSubStepsNameMatchingPredicate(stepsWithEnter.get(0), SockDeciderChecker.enter).get(0)
				.split("_")[1];
		final Actor enteringActor = system.getOwnedActor().stream()
				.filter(actor -> actor.getName().equals(enteringActorName)).findFirst().get();
		if (SockDeciderHelper.computeRealProcessTime(secondEnteringActor)
				+ SockDeciderHelper.computeRealProcessTime(enteringActor) < enteringActor.getPeriodTime()) {
			return Optional.of(stepsWithEnter.get(1));
		} else {
			return Optional.of(stepsWithEnter.get(0));
		}
	}

	@Override
	public void dispose() {
		// nothing to do
	}

	@Override
	public void preempt() {
		// not possible
	}

}