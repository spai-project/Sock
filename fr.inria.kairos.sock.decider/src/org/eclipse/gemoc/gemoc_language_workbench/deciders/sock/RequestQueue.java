package org.eclipse.gemoc.gemoc_language_workbench.deciders.sock;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.IotSystemManager;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderChecker;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderHelper;
import org.eclipse.gemoc.trace.commons.model.generictrace.GenericParallelStep;
import org.eclipse.gemoc.trace.commons.model.trace.Step;

import fr.inria.kairos.sock.dsl.model.sock.IotSystem;

public class RequestQueue {

	public boolean initialRequests = false;

	private final Queue<String> requestQueue = new LinkedList<>();

	public String peek() {
		return this.requestQueue.peek();
	}

	public boolean isNextToEnter(final Step<?> possibleLogicalStep) {
		return possibleLogicalStep instanceof GenericParallelStep
				? isNextToEnter((GenericParallelStep) possibleLogicalStep)
				: false;
	}

	public boolean isNextToEnter(final GenericParallelStep possibleLogicalStep) {
		if (requestQueue.isEmpty()) {
			return false;
		}
		final String head = requestQueue.peek();

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
					+ this.requestQueue.peek() + " "
					+ candidatesNextToEnter.stream().map(SockDeciderHelper::concatAllSubStepsName)
							.collect(Collectors.joining(SockDeciderHelper.NEW_LINE)));
		} else if (candidatesNextToEnter.isEmpty()) {
			return null;
		} else {
			this.requestQueue.peek();
			return candidatesNextToEnter.get(0);
		}
	}

	private void handleTakeOverEvent(Step<?> choosenOne) {
		SockDeciderHelper.getAllSubStepsNameMatchingPredicate(choosenOne, SockDeciderChecker.isTakenOver).stream()
				.map(clockName -> clockName.split("_")[1]).findAny()
				.ifPresent(clockName -> ((LinkedList<String>) this.requestQueue).add(0, clockName));
	}

	public void addRequestsToQueue(Step<?> choosenOne, IotSystemManager systemManager) {
		List<String> candidates = SockDeciderHelper
				.getAllSubStepsNameMatchingPredicate(choosenOne, SockDeciderChecker.request).stream()
				.map(clockName -> clockName.split("_")[1]).collect(Collectors.toList());
		if (candidates.isEmpty()) {
			this.handleTakeOverEvent(choosenOne);
		} else if (candidates.size() == 1) {
			this.requestQueue.add(candidates.get(0));
		} else if (!this.initialRequests) {
			// TODO it might be a problem with the semantics establish by Liu and Layland
			// since the proof
			// has been done in the context of non-preemptive tasks
			// We handle the initial requests by actor to schedule them.
			// After that, the period and compute time will naturally schedule the actors
			this.initialRequests = true;
			systemManager.getScheduledActors(candidates).forEach(this.requestQueue::add);
		}
	}

}
