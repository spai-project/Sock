package org.eclipse.gemoc.gemoc_language_workbench.deciders;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.core.AbstractConcurrentExecutionEngine;
import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.core.ILogicalStepDecider;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.RequestQueue;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.IotSystemManager;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderChecker;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderHelper;
import org.eclipse.gemoc.trace.commons.model.generictrace.GenericParallelStep;
import org.eclipse.gemoc.trace.commons.model.trace.Step;

import fr.inria.kairos.sock.dsl.model.sock.Actor;
import fr.inria.kairos.sock.dsl.model.sock.IotSystem;

public class SockDecider implements ILogicalStepDecider {

	private final RequestQueue requestQueue = new RequestQueue();

	public SockDecider() {
		super();
	}

	@Override
	public Step<?> decide(AbstractConcurrentExecutionEngine engine, final List<Step<?>> possibleLogicalSteps) {
		Step<?> choosenOne;
		if (possibleLogicalSteps.size() == 1) {
			choosenOne = possibleLogicalSteps.get(0);
		} else {
			choosenOne = this.requestQueue.findStepWithNextToEnter(possibleLogicalSteps);
			if (choosenOne == null) {
				List<Step<?>> stepsWithoutOnlyIdle = possibleLogicalSteps.stream()
						.filter(possibleLogicalStep -> possibleLogicalStep instanceof GenericParallelStep)
						.filter(possibleLogicalStep -> SockDeciderChecker
								.hasAnotherClockThanOnlyPredicate(possibleLogicalStep, SockDeciderChecker.isIdle))
						.collect(Collectors.toList());
				choosenOne = SockDeciderHelper
						.returnRandomOne(stepsWithoutOnlyIdle.isEmpty() ? possibleLogicalSteps : stepsWithoutOnlyIdle);
			}
		}
		IotSystemManager systemManager = new IotSystemManager(
				(IotSystem) engine.getExecutionContext().getResourceModel().getContents().get(0));
		List<String> clockNamesTakenOver = 
				SockDeciderHelper.getAllSubStepsNameMatchingPredicate(choosenOne, SockDeciderChecker.isTakenOver);
		if (!clockNamesTakenOver.isEmpty()) {
			Actor actorTakenOver = systemManager.getActorByNameOfClock(clockNamesTakenOver.get(0));
			// It should not be empty, because the existence of a isTakenOver clock should
			// be sufficient to have a takesOver clock
			Actor actorTakingOver = systemManager.getActorByNameOfClock(SockDeciderHelper
					.getAllSubStepsNameMatchingPredicate(choosenOne, SockDeciderChecker.takesOver).get(0));
			double processTimeIsTakenOver = systemManager.computeProcessTimeActor(actorTakenOver);
			double processTimeTakingOver = systemManager.computeProcessTimeActor(actorTakingOver);
			double requiredTimeToCompleteTaskForActorTakenOver = processTimeIsTakenOver + processTimeTakingOver;
			int timeUntilNextPeriodOfTakenOverActor = (systemManager.getCurrentTime() % actorTakenOver.getPeriodTime()) + 1;
			if (requiredTimeToCompleteTaskForActorTakenOver > timeUntilNextPeriodOfTakenOverActor) {
				choosenOne = possibleLogicalSteps.stream()
						.filter(possibleLogicalStep -> possibleLogicalStep instanceof GenericParallelStep)
						.filter(possibleLogicalStep -> SockDeciderChecker
								.hasAnotherClockThanOnlyPredicate(possibleLogicalStep, SockDeciderChecker.process))
						.findFirst()
						.get(); // TODO improve handle errors
			}
		}
		this.requestQueue.addRequestsToQueue(choosenOne, systemManager);
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
