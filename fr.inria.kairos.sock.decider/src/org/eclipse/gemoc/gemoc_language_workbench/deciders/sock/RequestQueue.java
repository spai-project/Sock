package org.eclipse.gemoc.gemoc_language_workbench.deciders.sock;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.IotSystemManager;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderChecker;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderHelper;
import org.eclipse.gemoc.trace.commons.model.generictrace.GenericParallelStep;
import org.eclipse.gemoc.trace.commons.model.trace.Step;

public class RequestQueue {

	public boolean initialRequests = false;

	private List<String> requestQueue = new ArrayList<>();

	public boolean isNextToEnter(final Step<?> possibleLogicalStep) {
		return possibleLogicalStep instanceof GenericParallelStep
				? isNextToEnter((GenericParallelStep) possibleLogicalStep)
				: false;
	}

	public boolean isNextToEnter(final GenericParallelStep possibleLogicalStep) {
		if (requestQueue.isEmpty()) {
			return false;
		}
		final String head = requestQueue.get(0);

		return !SockDeciderHelper.getAllSubStepsNameMatchingPredicate(possibleLogicalStep,
				SockDeciderChecker.enter.and(new Predicate<String>() {
					@Override
					public boolean test(String clockName) {
						return head.equals(clockName.split("_")[1]);
					}
				})).isEmpty();
	}

	public Step<?> findStepWithNextToEnter(final List<Step<?>> possibleLogicalStep) {
		final List<Step<?>> candidatesNextToEnter = possibleLogicalStep.stream().filter(this::isNextToEnter)
				.collect(Collectors.toList());
		if (candidatesNextToEnter.size() > 1) {
			throw new RuntimeException("Should not have two candidates for next to enter. " + SockDeciderHelper.NEW_LINE
					+ this.requestQueue.get(0) + " "
					+ candidatesNextToEnter.stream().map(SockDeciderHelper::concatAllSubStepsName)
							.collect(Collectors.joining(SockDeciderHelper.NEW_LINE)));
		} else if (candidatesNextToEnter.isEmpty()) {
			return null;
		} else {
			this.requestQueue.remove(0);
			return candidatesNextToEnter.get(0);
		}
	}

	private void handleTakeOverEvent(Step<?> choosenOne) {
		SockDeciderHelper.getAllSubStepsNameMatchingPredicate(choosenOne, SockDeciderChecker.isTakenOver).stream()
				.map(clockName -> clockName.split("_")[1]).findAny()
				.ifPresent(clockName -> this.requestQueue.add(0, clockName));
	}

	public void addRequestsToQueue(Step<?> choosenOne, IotSystemManager systemManager) {
		List<String> candidates = SockDeciderHelper
				.getAllSubStepsNameMatchingPredicate(choosenOne, SockDeciderChecker.request).stream()
				.map(clockName -> clockName.split("_")[1]).collect(Collectors.toList());
		if (candidates.isEmpty()) {
			this.handleTakeOverEvent(choosenOne);
		} else if (candidates.size() >= 1) {
			candidates.addAll(this.requestQueue);
			this.requestQueue = systemManager.getScheduledActors(candidates);
		}
		String enteringActorName = SockDeciderHelper
				.getAllSubStepsNameMatchingPredicate(choosenOne, SockDeciderChecker.enter)
				.stream()
				.map(clockName -> clockName.split("_")[1])
				.findFirst()
				.orElse(null);
		if (enteringActorName != null) {
			this.requestQueue.remove(enteringActorName);
		}
	}

}
