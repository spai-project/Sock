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
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderChecker;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderHelper;
import org.eclipse.gemoc.trace.commons.model.trace.Step;

import fr.inria.kairos.sock.dsl.model.sock.IotSystem;

public class SockDecider implements ILogicalStepDecider {

	private Scheduler scheduler;

	private int nbDecide;

	private List<ArrivalTime> schedule;

	public SockDecider() {
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

	public static final String BASE_PATH_OUTPUT = "/Users/stephaniechallita/Desktop/runtime-EclipseApplication/";

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
		}
		Optional<Step<?>> choosenOneOptional = possibleLogicalSteps.stream()
				.filter(possibleLogicalStep -> SockDeciderChecker.hasClockPredicate(possibleLogicalStep,
						SockDeciderChecker.enter))
				.filter(possibleLogicalStep -> SockDeciderChecker.hasNoClockPredicate(possibleLogicalStep,
						SockDeciderChecker.butterflyAttack))
				.sorted(this.scheduler.getComparator()).findFirst();
		if (choosenOneOptional.isPresent()) {
			final Step<?> choosenStep = choosenOneOptional.get();
			final String enteringActorName = SockDeciderHelper
					.getAllSubStepsNameMatchingPredicate(choosenStep, SockDeciderChecker.enter).get(0).split("_")[1];
			this.schedule.add(new ArrivalTime(enteringActorName, this.nbDecide));
			this.nbDecide++;
//			System.out.println(">>>\n" + SockDeciderHelper.concatAllSubStepsName(choosenStep) + "\n<<<<<");
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
//				System.out.println(">>>\n" + SockDeciderHelper.concatAllSubStepsName(stepWithProcess) + "\n<<<<<");
				return stepWithProcess;
			} else {
				final String enteringActorName = SockDeciderHelper
						.getAllSubStepsNameMatchingPredicate(stepWithTakesOver, SockDeciderChecker.takesOver).get(0)
						.split("_")[1];
				this.schedule.add(new ArrivalTime(enteringActorName, this.nbDecide));
				this.nbDecide++;
//				System.out.println(">>>\n" + SockDeciderHelper.concatAllSubStepsName(stepWithTakesOver) + "\n<<<<<");
				return stepWithTakesOver;
			}
		}
		List<Step<?>> logicalStepsWithoutButterflyAttack = possibleLogicalSteps.stream()
				.filter(possibleLogicalStep -> SockDeciderChecker.hasNoClockPredicate(possibleLogicalStep,
						SockDeciderChecker.butterflyAttack))
				.collect(Collectors.toList());

		this.nbDecide++;
		final Step<?> choosenOne = SockDeciderHelper.returnRandomOne(logicalStepsWithoutButterflyAttack);
//		System.out.println(">>>\n" + SockDeciderHelper.concatAllSubStepsName(choosenOne) + "\n<<<<<");
		return choosenOne;
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
