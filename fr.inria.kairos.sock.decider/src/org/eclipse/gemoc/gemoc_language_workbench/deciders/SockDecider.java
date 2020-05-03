package org.eclipse.gemoc.gemoc_language_workbench.deciders;

import java.util.List;
import java.util.Optional;

import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.core.AbstractConcurrentExecutionEngine;
import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.core.ILogicalStepDecider;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.Scheduler;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderChecker;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderHelper;
import org.eclipse.gemoc.trace.commons.model.trace.Step;

import fr.inria.kairos.sock.dsl.model.sock.IotSystem;

public class SockDecider implements ILogicalStepDecider {

	private Scheduler scheduler;

	public SockDecider() {
		super();
	}
	
	public Step<?> decide(AbstractConcurrentExecutionEngine engine, final List<Step<?>> possibleLogicalSteps) {
		if (possibleLogicalSteps.size() == 1) {
			return possibleLogicalSteps.get(0);
		}
		if (this.scheduler == null) {
			this.scheduler = new Scheduler((IotSystem) engine.getExecutionContext().getResourceModel().getContents().get(0));
		}
		Optional<Step<?>> choosenOneOptional = possibleLogicalSteps
			.stream()
			.filter(possibleLogicalStep -> SockDeciderChecker.hasClockPredicate(possibleLogicalStep, SockDeciderChecker.enter))
			.sorted(this.scheduler.getComparator())
			.findFirst();
		if (choosenOneOptional.isPresent()) {
			return choosenOneOptional.get();
		}
		choosenOneOptional = possibleLogicalSteps
					.stream()
					.filter(possibleLogicalStep -> SockDeciderChecker.hasClockPredicate(possibleLogicalStep, SockDeciderChecker.takesOver))
					.sorted(this.scheduler.getComparator())
					.findFirst();
		if (choosenOneOptional.isPresent()) {
			final Step<?> stepWithProcess = possibleLogicalSteps
				.stream()
				.filter(possibleLogicalStep -> 
					SockDeciderChecker.hasClockPredicate(possibleLogicalStep, SockDeciderChecker.process)
				).findFirst()
				.orElseThrow(() -> new RuntimeException(""));
			final String actorNameProcessing = SockDeciderHelper.getEntityNameFromClockName(
					SockDeciderHelper.getAllSubStepsNameMatchingPredicate(stepWithProcess,  SockDeciderChecker.process).get(0)
			);
			final Step<?> stepWithTakesOver = choosenOneOptional.get();
			final String actorNameTakingOver = SockDeciderHelper.getEntityNameFromClockName(
					SockDeciderHelper.getAllSubStepsNameMatchingPredicate(stepWithTakesOver,  SockDeciderChecker.takesOver).get(0)
			);
			if (this.scheduler.compare(actorNameProcessing, actorNameTakingOver) <= 0) {
				return stepWithProcess;
			} else {
				return stepWithTakesOver;
			}
		}
		return SockDeciderHelper.returnRandomOne(possibleLogicalSteps);
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
