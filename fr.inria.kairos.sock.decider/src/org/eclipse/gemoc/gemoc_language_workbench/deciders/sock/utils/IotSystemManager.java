package org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import fr.inria.kairos.sock.dsl.model.sock.Actor;
import fr.inria.kairos.sock.dsl.model.sock.IotSystem;

public class IotSystemManager {
	
	private IotSystem system;
	
	public IotSystemManager(IotSystem system) {
		this.system = system;
	}
	
	public int getCurrentTime() {
		return this.system.getCurrentTime();
	}
	
	public List<String> getScheduledActors(List<String> candidates) {
		return this.system.getOwnedActor()
			.stream()
			.filter(actor -> candidates.contains(actor.getName()))
			.sorted(new Comparator<Actor>() {
				public int compare(Actor a, Actor b) {
					int comparison = - Double.compare(computeRateMonotonicScore(a), computeRateMonotonicScore(b));
					return comparison;
				}
			}).map(Actor::getName)
			.collect(Collectors.toList());
	}
	
	public Actor getActorByNameOfClock(String clockName) {
		return this.getActorByName(clockName.split("_")[1]);
	}
	
	public Actor getActorByName(String name) {
		return this.system.getOwnedActor()
					.stream()
					.filter(actor -> actor.getName().equals(name))
					.findFirst()
					.orElseGet(() -> null);
	}
	
	public double computeRateMonotonicScore(Actor actor) {
		return (this.computeProcessTimeActor(actor) / ((double) actor.getPeriodTime()));
	}
	
	public double computeProcessTimeActor(Actor actor) {
		return ((double) actor.getProcessTime() - actor.getCurrentProcessTime()) + (actor.getIsPriority() == 1 ? 2.0D : 1.0D);
	}

}
