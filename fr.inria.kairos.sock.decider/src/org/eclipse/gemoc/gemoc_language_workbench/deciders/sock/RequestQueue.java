package org.eclipse.gemoc.gemoc_language_workbench.deciders.sock;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import java.util.stream.Collectors;

import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderHelper;
import org.eclipse.gemoc.trace.commons.model.generictrace.GenericParallelStep;
import org.eclipse.gemoc.trace.commons.model.trace.Step;

public class RequestQueue {

	private final Queue<String> requestQueue = new LinkedList<>();

	private final String ENTER_IN_EVENT_NAME = "_enterActorEvent";

	private final String REQUEST_EVENT_NAME = "_requestActorEvent";
	
	private final String IS_TAKEN_OUT_EVENT_NAME = "_isTakenOverActorEvent";

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
		return SockDeciderHelper.getAllSubStepsName(possibleLogicalStep)
				.stream()
				.anyMatch(clockName -> 
							clockName.endsWith(ENTER_IN_EVENT_NAME) && 
							head.equals(clockName.split("_")[1])
				);
	}

	public Step<?> findStepWithNextToEnter(final List<Step<?>> possibleLogicalStep) {
		final List<Step<?>> candidatesNextToEnter = possibleLogicalStep
				.stream()
				.filter(this::isNextToEnter)
				.collect(Collectors.toList());
		if (candidatesNextToEnter.size() > 1) {
			throw new RuntimeException("Should not have two candidates for next to enter. " + SockDeciderHelper.NEW_LINE + this.requestQueue.peek()
					+ " " + candidatesNextToEnter.stream().map(SockDeciderHelper::concatAllSubStepsName)
							.collect(Collectors.joining(SockDeciderHelper.NEW_LINE)));
		} else if (candidatesNextToEnter.isEmpty()) {
			return null;
		} else {
			this.requestQueue.peek();
			return candidatesNextToEnter.get(0);
		}
	}

	public void addRequestsToQueue(Step<?> choosenOne) {
		Optional<String> candidate = SockDeciderHelper.getAllSubStepsName(choosenOne)
				.stream()
				.filter(clockName -> clockName.endsWith(REQUEST_EVENT_NAME))
				.map(clockName -> clockName.split("_")[1])
				.findFirst();
		if (candidate.isPresent()) {
			this.requestQueue.add(candidate.get());
		} else {
			candidate = SockDeciderHelper.getAllSubStepsName(choosenOne)
					.stream()
					.filter(clockName -> clockName.endsWith(IS_TAKEN_OUT_EVENT_NAME))
					.map(clockName -> clockName.split("_")[1])
					.findFirst();
			if (candidate.isPresent()) {
				((LinkedList<String>)this.requestQueue).add(0, candidate.get());
			}
		}
	}

}
