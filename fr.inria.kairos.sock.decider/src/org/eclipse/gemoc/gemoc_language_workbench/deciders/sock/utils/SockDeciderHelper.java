package org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.gemoc.trace.commons.model.generictrace.GenericParallelStep;
import org.eclipse.gemoc.trace.commons.model.trace.Step;

public class SockDeciderHelper {
	
	public static final Random RAND = new Random();
	
	public static final String NEW_LINE = System.lineSeparator();
	
	public static Step<?> returnRandomOne(List<Step<?>> possibleLogicalSteps) {
		return possibleLogicalSteps.get(possibleLogicalSteps.size() < 2 ? 0 : RAND.nextInt(possibleLogicalSteps.size()));
	}
	
	public static List<String> getAllSubStepsNameMatchingPredicate(Step<?>  possibleLogicalStep, Predicate<String> predicate) {
		return possibleLogicalStep instanceof GenericParallelStep ?
				getAllSubStepsNameMatchingPredicate((GenericParallelStep)possibleLogicalStep, predicate) : Collections.emptyList();
	}
	
	public static List<String> getAllSubStepsNameMatchingPredicate(GenericParallelStep  possibleLogicalStep, Predicate<String> predicate) {
		return possibleLogicalStep.getSubSteps()
				.stream()
				.map(substep -> substep.getMseoccurrence().getMse().getName())
				.filter(predicate::test)
				.collect(Collectors.toList());
	}
	
	public static List<String> getAllSubStepsName(Step<?>  possibleLogicalStep) {
		return possibleLogicalStep instanceof GenericParallelStep ?
				getAllSubStepsName((GenericParallelStep)possibleLogicalStep) : Collections.emptyList();
	}
	public static List<String> getAllSubStepsName(GenericParallelStep possibleLogicalStep) {
		return possibleLogicalStep.getSubSteps()
			.stream()
			.map(substep -> substep.getMseoccurrence().getMse().getName())
			.collect(Collectors.toList());
	}
	
	public static String concatAllSubStepsName(Step<?> possibleLogicalStep) {
		return possibleLogicalStep instanceof GenericParallelStep ?
				concatAllSubStepsName((GenericParallelStep)possibleLogicalStep) : "";
	}
	
	public static String concatAllSubStepsName(GenericParallelStep possibleLogicalStep) {
		return possibleLogicalStep.getSubSteps()
			.stream()
			.map(substep -> substep.getMseoccurrence().getMse().getName())
			.collect(Collectors.joining(NEW_LINE));
	}


}
