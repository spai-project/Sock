package fr.inria.kairos.sock.generator.example;

import fr.inria.kairos.sock.generator.model.IotSystem;
import fr.inria.kairos.sock.generator.Generator;
import fr.inria.kairos.sock.generator.GeneratorHelper;
import fr.inria.kairos.sock.generator.Interval;
import fr.inria.kairos.sock.generator.io.SockWriter;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Map;

public class Main {
	
	private static int minPeriodTime = 15;
	
	private static int maxPeriodTime = 50;
	
	private static int stepPeriodTime = 5;
	
	private static int minProcessTime = 3;
	
	private static int maxProcessTime = 10;
	
	public static void main(String[] args) {
		final SockWriter writer = new SockWriter(GeneratorHelper.PATH_OUTPUT);
		final Random random = new Random(23L);
		Generator generator = new Generator(random, minPeriodTime, maxPeriodTime, stepPeriodTime, minProcessTime, maxProcessTime);
		final List<Interval> intervals = Arrays.asList(new Interval[] {
				new Interval(0.60d, 0.70d),
				new Interval(0.80d, 0.90d),
				new Interval(0.90d, 1.00d)
		});
		for (Interval interval : intervals) {
			final IotSystem system = new IotSystem("s" + interval.format());
			generator.initSystemWithGivenBaseUtilization(interval, system);
			writer.write(system.getName(), system);
		}
	}

}
