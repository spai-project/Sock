package org.eclipse.gemoc.gemoc_language_workbench.deciders.sock;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderChecker;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderHelper;
import org.eclipse.gemoc.trace.commons.model.trace.Step;

import fr.inria.kairos.sock.dsl.model.sock.Actor;
import fr.inria.kairos.sock.dsl.model.sock.IotSystem;

public class Scheduler implements Comparator<String>{

	private IotSystem system;

	private List<String> scheduledActorNames;

	private Comparator<Step<?>> priorityComparator;

	private int getIndexOfFromStep(Step<?> step, Predicate<String> predicate) {
		return scheduledActorNames.indexOf(SockDeciderHelper.getEntityNameFromClockName(
				SockDeciderHelper.getAllSubStepsNameMatchingPredicate(step, predicate).get(0)));
	}

	public Scheduler(IotSystem system) {
		this.system = system;
		this.scheduledActorNames = this.initScheduledActorNames();
		this.priorityComparator = new Comparator<Step<?>>() {
			@Override
			public int compare(Step<?> a, Step<?> b) {
				return getIndexOfFromStep(a, SockDeciderChecker.enter.or(SockDeciderChecker.takesOver))
						- getIndexOfFromStep(b, SockDeciderChecker.enter.or(SockDeciderChecker.takesOver));
			}
		};
	}
	
	@Override
	public int compare(String a, String b) {
		return this.scheduledActorNames.indexOf(a) - this.scheduledActorNames.indexOf(b);
	}
	
	public Comparator<Step<?>> getComparator() {
		return this.priorityComparator;
	}

	private List<String> initScheduledActorNames() {
		return this.system.getOwnedActor().stream().sorted(new Comparator<Actor>() {
			@Override
			public int compare(Actor a, Actor b) {
				final double scoreA = getScore(a);
				final double scoreB = getScore(b);
				int comparison = -Double.compare(scoreA, scoreB);
				return comparison;
			}
		}).map(Actor::getName).collect(Collectors.toList());
	}

	// TODO we should maybe use the formulas in fr.inria.kairos.sock.generator...
	private double getScore(Actor actor) {
		return this.computeProccessTime(actor) / ((double) actor.getPeriodTime());
	}

	private double computeProccessTime(Actor actor) {
		return actor.getProcessTime() + 2.0D + (actor.getIsSensible() == 1 ? 1 : 0);
	}
}
