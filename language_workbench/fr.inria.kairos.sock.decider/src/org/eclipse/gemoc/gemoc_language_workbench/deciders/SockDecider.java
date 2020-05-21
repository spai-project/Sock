package org.eclipse.gemoc.gemoc_language_workbench.deciders;

import java.util.List;
import java.util.Optional;

import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderChecker;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderHelper;
import org.eclipse.gemoc.trace.commons.model.trace.Step;

import fr.inria.kairos.sock.dsl.model.sock.IotSystem;

public class SockDecider extends AbstractSockDecider {

	@Override
	protected Optional<Step<?>> getNextEnter(final IotSystem system, final List<Step<?>> possibleLogicalSteps) {
		return possibleLogicalSteps.stream()
				.filter(possibleLogicalStep -> SockDeciderChecker.hasClockPredicate(possibleLogicalStep,
						SockDeciderChecker.enter))
				.filter(possibleLogicalStep -> SockDeciderChecker.hasNoClockPredicate(possibleLogicalStep,
						SockDeciderChecker.butterflyAttack))
				.sorted(this.scheduler.getComparator()).findFirst();
	}

	@Override
	protected Optional<Step<?>> getNextTakesOver(final IotSystem system, final List<Step<?>> possibleLogicalSteps) {
		return possibleLogicalSteps.stream()
				.filter(possibleLogicalStep -> SockDeciderChecker.hasClockPredicate(possibleLogicalStep,
						SockDeciderChecker.takesOver))
				.filter(possibleLogicalStep -> SockDeciderChecker.hasNoClockPredicate(possibleLogicalStep,
						SockDeciderChecker.butterflyAttack))
				.sorted(this.scheduler.getComparator()).findFirst();
	}

	@Override
	protected Step<?> decideTakesOverOrProcess(
				Step<?> stepWithProcess, 
				String actorNameProcessing,
				Step<?> stepWithTakesOver, 
				String actorNameTakingOver) {
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

}
