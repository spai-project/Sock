package org.eclipse.gemoc.gemoc_language_workbench.deciders;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.core.AbstractConcurrentExecutionEngine;
import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.core.ILogicalStepDecider;
import org.eclipse.gemoc.trace.commons.model.generictrace.GenericParallelStep;
import org.eclipse.gemoc.trace.commons.model.generictrace.GenericStep;
import org.eclipse.gemoc.trace.commons.model.trace.Step;

public class SockDecider implements ILogicalStepDecider {

	private final Random rand = new Random();
	
	public static final String nl = System.lineSeparator();

	public SockDecider() {
		super();
	}

	@Override
	public Step<?> decide(AbstractConcurrentExecutionEngine engine, final List<Step<?>> possibleLogicalSteps) {
		if (possibleLogicalSteps.size() == 1) {
			return possibleLogicalSteps.get(0);
		}
		final Step<?> choosenOne = possibleLogicalSteps.stream()
			.filter(possibleLogicalStep -> possibleLogicalStep instanceof GenericParallelStep)
			.filter(possibleLogicalStep -> this.hasAnotherClockThanOnlyIdle((GenericParallelStep)possibleLogicalStep))
			.collect(Collectors.collectingAndThen(Collectors.toList(), collected -> {
			      Collections.shuffle(collected, rand);
			      return collected.stream();
			})).findAny()
			.orElseGet(() -> this.returnRandomOne(possibleLogicalSteps));
		if (!hasAnotherClockThanOnlyIdle((GenericParallelStep)choosenOne)) {
			System.out.println("bp");
		}
		return choosenOne;
	}
	
	private String getAllSubStepsName(Step<?> possibleLogicalStep) {
		return possibleLogicalStep instanceof GenericParallelStep ?
				this.getAllSubStepsName((GenericParallelStep)possibleLogicalStep) : "";
	}		
	
	private String getAllSubStepsName(GenericParallelStep possibleLogicalStep) {
		return possibleLogicalStep.getSubSteps()
			.stream()
			.map(substep -> substep.getMseoccurrence().getMse().getName())
			.collect(Collectors.joining(nl));
	}
	
	private boolean hasAnotherClockThanOnlyIdle(GenericParallelStep possibleLogicalStep) {
		for (GenericStep substep : possibleLogicalStep.getSubSteps()) {
			if (!this.isIdle(substep.getMseoccurrence().getMse().getName())) {
				return true;
			}
		}
		return false;
	}
	
	private boolean isIdle(String name) {
		return name.endsWith("_idleActorEvent") ||
				name.endsWith("_idleResourceEvent") || 
				name.endsWith("_timeEvent");
	}
	
	private Step<?> returnRandomOne(List<Step<?>> possibleLogicalSteps) {
		return possibleLogicalSteps.get(possibleLogicalSteps.size() < 2 ? 0 : rand.nextInt(possibleLogicalSteps.size()));
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
