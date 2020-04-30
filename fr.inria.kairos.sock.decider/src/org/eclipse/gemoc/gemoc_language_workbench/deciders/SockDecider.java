package org.eclipse.gemoc.gemoc_language_workbench.deciders;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.core.AbstractConcurrentExecutionEngine;
import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.core.ILogicalStepDecider;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.RequestQueue;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderChecker;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderHelper;
import org.eclipse.gemoc.trace.commons.model.generictrace.GenericParallelStep;
import org.eclipse.gemoc.trace.commons.model.trace.Step;

public class SockDecider implements ILogicalStepDecider {

	private final RequestQueue requestQueue = new RequestQueue();
	
	public SockDecider() {
		super();
	}

	@Override
	public Step<?> decide(AbstractConcurrentExecutionEngine engine, final List<Step<?>> possibleLogicalSteps) {
		Step<?> choosenOne;
		if (possibleLogicalSteps.size() == 1) {
			return possibleLogicalSteps.get(0);
		} else {
			choosenOne = this.requestQueue.findStepWithNextToEnter(possibleLogicalSteps);
			if (choosenOne == null) {
				choosenOne = possibleLogicalSteps.stream()
						.filter(possibleLogicalStep -> possibleLogicalStep instanceof GenericParallelStep)
						.filter(possibleLogicalStep -> SockDeciderChecker.hasAnotherClockThanOnlyIdle((GenericParallelStep)possibleLogicalStep))
						.collect(Collectors.collectingAndThen(Collectors.toList(), collected -> {
						      Collections.shuffle(collected, SockDeciderHelper.RAND);
						      return collected.stream();
						})).findAny()
						.orElseGet(() -> SockDeciderHelper.returnRandomOne(possibleLogicalSteps));
			}
		}
		this.requestQueue.addRequestsToQueue(choosenOne);
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
