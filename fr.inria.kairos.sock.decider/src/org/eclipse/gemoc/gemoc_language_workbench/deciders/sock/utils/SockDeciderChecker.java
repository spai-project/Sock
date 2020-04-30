package org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils;

import org.eclipse.gemoc.trace.commons.model.generictrace.GenericParallelStep;
import org.eclipse.gemoc.trace.commons.model.generictrace.GenericStep;

public class SockDeciderChecker {
	
	public static boolean hasAnotherClockThanOnlyIdle(GenericParallelStep possibleLogicalStep) {
		for (GenericStep substep : possibleLogicalStep.getSubSteps()) {
			if (!isIdle(substep.getMseoccurrence().getMse().getName())) {
				return true;
			}
		}
		return false;
	}
	
	private static final String IDLE_ACTOR_EVENT = "_idleActorEvent";
	
	private static final String IDLE_RESOURCE_EVENT = "_idleResourceEvent";
	
	private static final String IDLE_TIME_EVENT = "_timeEvent";
	
	public static boolean isIdle(String name) {
		return name.endsWith(IDLE_ACTOR_EVENT) ||
				name.endsWith(IDLE_RESOURCE_EVENT) || 
				name.endsWith(IDLE_TIME_EVENT);
	}

}
