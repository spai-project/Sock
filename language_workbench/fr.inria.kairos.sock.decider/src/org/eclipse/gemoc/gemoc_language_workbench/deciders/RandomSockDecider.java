package org.eclipse.gemoc.gemoc_language_workbench.deciders;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderChecker;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderHelper;
import org.eclipse.gemoc.trace.commons.model.trace.Step;

import fr.inria.kairos.sock.dsl.model.sock.Actor;
import fr.inria.kairos.sock.dsl.model.sock.IotSystem;

public class RandomSockDecider extends SockDecider {
	
	private Actor replacement;

	@Override
	protected Optional<Step<?>> getNextEnter(final IotSystem system, final List<Step<?>> possibleLogicalSteps) {
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
		final String enteringActorName = SockDeciderHelper
				.getAllSubStepsNameMatchingPredicate(stepsWithEnter.get(0), SockDeciderChecker.enter).get(0)
				.split("_")[1];
		final Actor enteringActor = system.getOwnedActor().stream()
				.filter(actor -> actor.getName().equals(enteringActorName)).findFirst().get();
		final List<Step<?>> randomEnteringLogicalStep = stepsWithEnter.stream()
			.filter( logicalStep -> {
				final String secondEnteringActorName = SockDeciderHelper
						.getAllSubStepsNameMatchingPredicate(logicalStep, SockDeciderChecker.enter).get(0)
						.split("_")[1];
				final Actor secondEnteringActor = system.getOwnedActor().stream()
						.filter(actor -> actor.getName().equals(secondEnteringActorName)).findFirst().get();
				return SockDeciderHelper.computeRealProcessTime(secondEnteringActor)
						+ SockDeciderHelper.computeRealProcessTime(enteringActor) < enteringActor.getPeriodTime();
			}).collect(Collectors.toList());
		if (randomEnteringLogicalStep.isEmpty()) {
			return Optional.of(stepsWithEnter.get(0));
		} else {
			final Step<?> choosenStep = SockDeciderHelper.returnRandomOne(randomEnteringLogicalStep);
			final String choosenActor = SockDeciderHelper
					.getAllSubStepsNameMatchingPredicate(choosenStep, SockDeciderChecker.enter).get(0)
					.split("_")[1];
			this.replacement = system.getOwnedActor().stream()
					.filter(actor -> actor.getName().equals(choosenActor)).findFirst().get();
			return Optional.of(choosenStep);
		}
	}

	@Override
	protected Step<?> decideTakesOverOrProcess(
				Step<?> stepWithProcess, 
				String actorNameProcessing,
				Step<?> stepWithTakesOver, 
				String actorNameTakingOver) {
		if (this.replacement != null && !this.replacement.getName().equals(actorNameProcessing)) {
			// the replacement is no more inside the ressource
			this.replacement = null;
		}
		if (this.replacement != null && this.replacement.getName().equals(actorNameProcessing) || 
				this.scheduler.compare(actorNameProcessing, actorNameTakingOver) <= 0) {
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
