package fr.inria.kairos.sock.scheduler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import fr.inria.kairos.sock.generator.Generator;
import fr.inria.kairos.sock.generator.Interval;
import fr.inria.kairos.sock.generator.model.Actor;
import fr.inria.kairos.sock.generator.model.IotSystem;

public class Main {
	
	public static void main(String [] args) {
		final IotSystem s = new IotSystem("s");
		new Generator(new Random(23L)).initSystemWithGivenBaseUtilization(new Interval(0.62d, 0.68d), s);
		printListActors(s.getOwnedActor());
		printListActors(schedule(s));
	}
	
	public static void printListActors(List<Actor> actors) {
		System.out.println(actors.stream()
				.map(actor -> actor.getName() + "(" + String.format("%.2f", actor.getScore()) + ")")
				.collect(Collectors.joining(" -> "))
		);
	}
	 
	public static List<Actor> schedule(IotSystem system){
		final List<Actor> scheduledActor = new ArrayList<>(system.getOwnedActor());
		Collections.sort(scheduledActor, RMScheduler);
		return scheduledActor;
	}
	
	private static final Comparator<Actor> RMScheduler = new Comparator<Actor>() {
		public int compare(Actor a, Actor b) {
			return - (int) ((a.getScore() - b.getScore())*100.0D);
		}
	};
	
	private static final Comparator<Actor> DMScheduler = new Comparator<Actor>() {
		public int compare(Actor a, Actor b) {
			return - (int) ((a.getScore() - b.getScore())*100.0D);
		}
	};

}
