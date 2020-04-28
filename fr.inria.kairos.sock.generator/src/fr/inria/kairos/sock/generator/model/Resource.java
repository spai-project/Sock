package fr.inria.kairos.sock.generator.model;

import java.util.List;
import java.util.stream.Collectors;

import fr.inria.kairos.sock.generator.Main;

import java.util.ArrayList;

public class Resource extends NamedElement {

	private final List<Actor> actors;
	
	public Resource(String name) {
		super(name);
		this.actors = new ArrayList<>();
	}
	
	public void addActor(Actor actor) {
		this.actors.add(actor);
	}

	public List<Actor> getActors() {
		return actors;
	}
	
	public double computeSchedulableScore() {
		double acc = 0.0f;
		for (Actor actor : this.actors) {
			acc += ((double)actor.getProcessTime() + (actor.getIsPriority() == 1 ? 2 : 1)) / ((double)actor.getPeriodTime());
		}
		return acc;
	}
	
	public boolean isSchedulable() {
		return computeSchedulableScore() < 1.0d;
	}
	
	public String toTSock() {
		return "\t\tResource " + this.getName() + " {" + Main.nl +
					"\t\t\tactor (" + 
						this.actors.stream()
							.map(a -> "\"" + a.getName() + "\"")
							.collect(Collectors.joining(", ")) + 
						")" + Main.nl +
				"\t\t}";
	}
	
}
