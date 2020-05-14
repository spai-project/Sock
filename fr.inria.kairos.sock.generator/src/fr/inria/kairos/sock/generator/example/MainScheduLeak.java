package fr.inria.kairos.sock.generator.example;

import fr.inria.kairos.sock.generator.model.IotSystem;
import fr.inria.kairos.sock.generator.Generator;
import fr.inria.kairos.sock.generator.GeneratorHelper;
import fr.inria.kairos.sock.generator.Interval;
import fr.inria.kairos.sock.generator.io.SockWriter;
import fr.inria.kairos.sock.generator.launch.LaunchGenerator;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainScheduLeak {

	private static int NB_CONFIGURATION = 5;

	private static int minNbActor = 2;

	private static int maxNbActor = 5;

	private static int minPeriodTime = 10;

	private static int maxPeriodTime = 50;

	private static int stepPeriodTime = 5;

	private static int minProcessTime = 1;

	private static int maxProcessTime = 5;
	
	private static int maxHyperPeriod = 1000;

//	private static int NB_CONFIGURATION = 5;
//
//	private static int minNbActor = 2;
//
//	private static int maxNbActor = 3;
//
//	private static int minPeriodTime = 6;
//
//	private static int maxPeriodTime = 20;
//
//	private static int stepPeriodTime = 2;
//
//	private static int minProcessTime = 1;
//
//	private static int maxProcessTime = 3;
//	
//	private static int maxHyperPeriod = 1000;

	public static void main(String[] args) {
		new File(GeneratorHelper.PATH_OUTPUT + "schedule_side_channel_attacks/").delete();
		new File(GeneratorHelper.PATH_OUTPUT + "schedule_side_channel_attacks/").mkdirs();
		new File(GeneratorHelper.PATH_OUTPUT + "schedule_side_channel_attacks/launch/").mkdirs();
		final SockWriter writer = new SockWriter(GeneratorHelper.PATH_OUTPUT + "schedule_side_channel_attacks/");
		final Random random = new Random(23L);
		Generator generator = new Generator(random, minPeriodTime, maxPeriodTime, stepPeriodTime, minProcessTime,
				maxProcessTime, minNbActor, maxNbActor);
		final Interval interval = new Interval(0.60d, 0.70d);
		final LaunchGenerator launchGenerator = new LaunchGenerator();
		for (int i = 0; i < NB_CONFIGURATION; i++) {
			final IotSystem system = new IotSystem("s" + i);
			generator.initSystemWithGivenBoundForResource(interval, system, true);
			if (system.getOwnedResource().get(0).getHyperPeriod() > maxHyperPeriod) {
				--i;
				continue;
			}
			writer.write(system.getName(), system);
			writer.write("launch/" + system.getName() + SockWriter.LAUNCH_EXTENSION,
					launchGenerator.generateLaunchConfiguration(
							"/test-project/schedule_side_channel_attacks/" + system.getName() + SockWriter.TSOCK_EXTENSION, false));
			system.setName(system.getName() + "rnd");
			writer.write("launch/" + system.getName() + SockWriter.LAUNCH_EXTENSION,
					launchGenerator.generateLaunchConfiguration(
							"/test-project/schedule_side_channel_attacks/" + system.getName() + SockWriter.TSOCK_EXTENSION, true));
			writer.write(system.getName(), system);
			System.out.println(system.getOwnedResource().get(0).getHyperPeriod());
		}
		System.out.println("Generation of " + NB_CONFIGURATION + " tsock model successful");
	}

}
