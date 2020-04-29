package fr.inria.kairos.sock.generator;

import fr.inria.kairos.sock.generator.model.IotSystem;
import fr.inria.kairos.sock.generator.model.Actor;
import fr.inria.kairos.sock.generator.model.Resource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class Main {

	public static final String nl = System.lineSeparator();
	
	private final static Random RANDOM = new Random(23L);

	public static void main(String[] args) {
		final Map<Interval, List<IotSystem>> classification = initInterval();
		final int nbSystemPerInterval = 200;
		for (Interval interval : classification.keySet()) {
			classification.get(interval).addAll(generateSystemsWithGivenBaseUtilization(nbSystemPerInterval, interval));
			final List<IotSystem> unschedulableSystems = computeUnschedulableSystems(classification.get(interval), true);
			System.out.println(interval + "/" +(double)unschedulableSystems.size() / (double)classification.get(interval).size());
		}
	}

	private static Map<Interval, List<IotSystem>> initInterval() {
		final Map<Interval, List<IotSystem>> classification = new HashMap<>();
		for (int i = 0 ; i < 10 ; i++) {
			classification.put(
					new Interval(0.02D + (0.1D * (double)i),  0.08d + (0.1d * (double)i)), new ArrayList<>()
			);
		}
		return classification;
	}
	
	public static IotSystem initSystemWithGivenBaseUtilization(Interval targetedInterval, final IotSystem system) {
		final Resource resource = new Resource("r_" + targetedInterval.format());
		while (true) {
			final int nbActor = 3 + RANDOM.nextInt(7);
			for (int i = 0 ; i < nbActor ; i++) {
				final Actor actor = getNextActor(resource, "_" + targetedInterval.format() + "_" + system.getOwnedActor().size());
				system.getOwnedActor().add(actor);
			}
			double score = resource.computeSchedulableScore(false);
			if (targetedInterval.i <= score && score <= targetedInterval.j) {
				break;
			} else {
				system.getOwnedActor().clear();
				resource.getActors().clear();
			}
		}
		system.getOwnedResource().add(resource);
		return system;
	}
	
	public static List<IotSystem> generateSystemsWithGivenBaseUtilization(int targetNumberSystems, Interval targetedInterval) {
		List<IotSystem> systems = new ArrayList<>();
		while (systems.size() < targetNumberSystems) {
			systems.add(initSystemWithGivenBaseUtilization(
					targetedInterval, 
					new IotSystem("s_" + targetedInterval.format() + "_" + systems.size()))
			);
		}
		return systems;
	}
		
	public static Actor getNextActor(final Resource resource, String suffix) {
		final int periodTime = 50 * (1 + RANDOM.nextInt(20));
		final int processTime  = 3 + RANDOM.nextInt(28);
		final int isPriority = RANDOM.nextInt(2);
		return new Actor("a_" + suffix, isPriority, processTime, periodTime, resource);
	}
	
	private static List<IotSystem> computeUnschedulableSystems(List<IotSystem> systems, boolean withFlushTask) {
		return systems.stream()
				.filter(system -> ! system.isSchedulable(withFlushTask))
				.collect(Collectors.toList());
	}
	
	public static class Interval {
		public final double i;
		public final double j;
		public Interval(double i, double j) {
			this.i = i;
			this.j = j;
		}
		public boolean check(double toBeChecked) {
			return this.i <= toBeChecked &&
					toBeChecked <= this.j;
		}
		public int hashCode() {
			return (int) this.i;
		}
		public String toString() {
			return "[" + String.format("%.2f", this.i) + ";" + String.format("%.2f", this.j) + "]";
		}
		public String format() {
			return String.format("%.2f", this.i) + "_" + String.format("%.2f", this.j);
		}
	}
	
	private static void classify(List<IotSystem> systems,  Map<Interval, List<IotSystem>> classification) {
		systems.stream()
			.forEach(system -> {
				final double schulableScore = system.getOwnedResource().get(0).computeSchedulableScore(false);
				for (Interval interval : classification.keySet()) {
					if (interval.check(schulableScore)) {
						classification.get(interval).add(system);
					}
				}
			});
	}

}
