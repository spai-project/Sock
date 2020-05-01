package org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils;

import java.util.function.Predicate;

import org.eclipse.gemoc.trace.commons.model.generictrace.GenericParallelStep;
import org.eclipse.gemoc.trace.commons.model.generictrace.GenericStep;
import org.eclipse.gemoc.trace.commons.model.trace.Step;

public class SockDeciderChecker {
	
	public static boolean hasAnotherClockThanOnlyPredicate(Step<?> possibleLogicalStep, Predicate<String> predicate) {
		return hasAnotherClockThanOnlyPredicate((GenericParallelStep) possibleLogicalStep, predicate);
	}
	
	public static boolean hasClockPredicate(Step<?> possibleLogicalStep, Predicate<String> predicate) {
		return hasClockPredicate((GenericParallelStep) possibleLogicalStep, predicate);
	}
	
	public static boolean hasAnotherClockThanOnlyPredicate(GenericParallelStep possibleLogicalStep, Predicate<String> predicate) {
		return possibleLogicalStep.getSubSteps()
			.stream()
			.map(substep -> substep.getMseoccurrence().getMse().getName())
			.anyMatch(substepName -> ! predicate.test(substepName));
	}
	
	public static boolean hasClockPredicate(GenericParallelStep possibleLogicalStep, Predicate<String> predicate) {
			return possibleLogicalStep.getSubSteps()
				.stream()
				.map(substep -> substep.getMseoccurrence().getMse().getName())
				.anyMatch(substepName -> predicate.test(substepName));
	}
	
	private static final String IDLE_ACTOR_EVENT = "_idleActorEvent";
	
	private static final String IDLE_RESOURCE_EVENT = "_idleResourceEvent";
	
	private static final String IDLE_TIME_EVENT = "_timeEvent";
	
	private static final String IS_TAKEN_OVER_ACTOR_EVENT = "_isTakenOverActorEvent";
	
	private static final String TAKES_OVER_ACTOR_EVENT = "_takesOverActorEvent";
	
	private static final String PROCESS_ACTOR_EVENT = "_processActorEvent";
	
	private static final String REQUEST_EVENT_ACTOR_EVENT = "_requestActorEvent";
	
	private static final String ENTER_IN_EVENT_ACTOR_EVENT = "_enterActorEvent";
	
	public static final Predicate<String> enter = name -> name.endsWith(ENTER_IN_EVENT_ACTOR_EVENT);
	
	public static final Predicate<String> request = name -> name.endsWith(REQUEST_EVENT_ACTOR_EVENT);
	
	public static final Predicate<String> process = name -> name.endsWith(PROCESS_ACTOR_EVENT);
	
	public static final Predicate<String> takesOver = name -> name.endsWith(TAKES_OVER_ACTOR_EVENT);
	
	public static final Predicate<String> isTakenOver= name -> name.endsWith(IS_TAKEN_OVER_ACTOR_EVENT);
	
	public static final Predicate<String> isIdle = name ->
				name.endsWith(IDLE_ACTOR_EVENT) ||
				name.endsWith(IDLE_RESOURCE_EVENT) || 
				name.endsWith(IDLE_TIME_EVENT);

}
