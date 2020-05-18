package fr.inria.kairos.sock.generator.example;

import fr.inria.kairos.sock.generator.model.IotSystem;
import fr.inria.kairos.sock.generator.Generator;
import fr.inria.kairos.sock.generator.GeneratorHelper;
import fr.inria.kairos.sock.generator.Interval;
import fr.inria.kairos.sock.generator.io.SockWriter;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
	
	private static int minNbActor = 3;
	
	private static int maxNbActor = 4;
	
	private static int minPeriodTime = 10;
	
	private static int maxPeriodTime = 50;
	
	private static int stepPeriodTime = 2;
	
	private static int minProcessTime = 3;
	
	private static int maxProcessTime = 10;
	
	public static void main(String[] args) {
		final SockWriter writer = new SockWriter(GeneratorHelper.PATH_OUTPUT);
		final Random random = new Random(23L);
		Generator generator = new Generator(
				random,
				minPeriodTime, 
				maxPeriodTime, 
				stepPeriodTime, 
				minProcessTime, 
				maxProcessTime,
				minNbActor,
				maxNbActor
		);
		final List<Interval> intervals = Arrays.asList(new Interval[] {
				new Interval(0.50d, 0.60d),
				new Interval(0.60d, 0.70d),
				new Interval(0.70d, 0.80d),
				new Interval(0.80d, 0.90d)
		});
		for (Interval interval : intervals) {
			final IotSystem system = new IotSystem("s" + interval.format());
			generator.initSystemWithGivenBoundForResource(interval, system, true);
			
			writer.write(system.getName(), system);
			system.getOwnedActor().stream()
				.forEach(actor -> System.out.println(actor.getName() + " " + actor.getScore(true)));
			System.out.println(system.getOwnedResource().get(0).getBound());
			System.out.println(system.getOwnedActor().stream().map(actor -> actor.getScore(true)).reduce((acc, actor) -> acc + actor));
		}
		System.out.println("Generation of " + intervals.size() + " tsock model successful");
		
	}

}
