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
			return (this.i + ";" + this.j).toString().hashCode();
		}
		public String toString() {
			return "[" + String.format("%.2f", this.i) + ";" + String.format("%.2f", this.j) + "]";
		}
	}

	public static void main(String[] args) {
		final Random rand = new Random(23L);
		final List<IotSystem> systems = new ArrayList<>();
		final Map<Interval, List<IotSystem>> classification = initInterval();
		
		populateSystems(rand, systems);
		classify(systems, classification);
		
		final List<IotSystem> globalUnschedulableSystems = computeUnschedulableSystems(systems);
		System.out.println(globalUnschedulableSystems.size() + "/" + systems.size());
		System.out.println((double)globalUnschedulableSystems.size() / (double)systems.size());

		for (Interval interval : classification.keySet()) {
			System.out.println(interval + "/" + classification.get(interval).size());
			final List<IotSystem> unschedulableSystems = computeUnschedulableSystems(classification.get(interval));
			System.out.println(unschedulableSystems.size() + "/" + systems.size());
			System.out.println((double)unschedulableSystems.size() / (double)systems.size());
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

	private static void populateSystems(final Random rand, final List<IotSystem> systems) {
		for (int p = 50; p <= 1000; p += 50) {
			for (int e = 3; e <= 30; e++) {
				for (int n = 3; n <= 10; n++) {
					final IotSystem s = new IotSystem("s_"
							+ Arrays.stream(new String[] { p + "", e + "", n + ""}).collect(Collectors.joining("_")));
					final Resource r = new Resource("r");
					for (int nb = 0 ; nb < n ; nb ++) {
						final Actor actor = new Actor("a_" + nb, rand.nextInt(2), e, p, r);
						s.getOwnedActor().add(actor);
					}
					s.getOwnedResource().add(r);
					systems.add(s);
				}
			}
		}
	}
	
	private static void classify(List<IotSystem> systems,  Map<Interval, List<IotSystem>> classification) {
		systems.stream()
			.forEach(system -> {
				final double schulableScore = system.getOwnedResource().get(0).computeSchedulableScore();
				for (Interval interval : classification.keySet()) {
					if (interval.check(schulableScore)) {
						classification.get(interval).add(system);
					}
				}
			});
	}
	
	private static List<IotSystem> computeUnschedulableSystems(List<IotSystem> systems) {
		return systems.stream()
				.filter(system -> ! system.isSchedulable())
				.collect(Collectors.toList());
	}

}
