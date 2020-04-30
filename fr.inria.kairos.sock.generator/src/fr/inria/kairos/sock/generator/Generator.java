package fr.inria.kairos.sock.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import fr.inria.kairos.sock.generator.model.Actor;
import fr.inria.kairos.sock.generator.model.IotSystem;
import fr.inria.kairos.sock.generator.model.Resource;

public class Generator {
	
	private Random random;
	
	private int minPeriodTime;
	
	private int maxPeriodTime;
	
	private int stepPeriodTime;
	
	private int minProcessTime;
	
	private int maxProcessTime;
	
	public Generator(Random random) {
		this(random, 50, 1000, 50, 3, 30);
	}
	
	public Generator(Random random, int minPeriodTime, int maxPeriodTime, int stepPeriodTime, int minProcessTime, int maxProcessTime) {
		this.random = random;
		this.minPeriodTime = minPeriodTime;
		this.maxPeriodTime = maxPeriodTime;
		this.stepPeriodTime = stepPeriodTime;
		this.minProcessTime = minProcessTime;
		this.maxProcessTime = maxProcessTime;
	}
	
	public List<IotSystem> generateSystemsWithGivenBaseUtilization(int targetNumberSystems, Interval targetedInterval) {
		List<IotSystem> systems = new ArrayList<>();
		while (systems.size() < targetNumberSystems) {
			systems.add(
					initSystemWithGivenBaseUtilization(
							targetedInterval, 
							new IotSystem("s" + targetedInterval.format() + "" + systems.size()))
			);
		}
		return systems;
	}
	
	public IotSystem initSystemWithGivenBaseUtilization(Interval targetedInterval, final IotSystem system) {
		final Resource resource = new Resource("r" + targetedInterval.format());
		while (true) {
			final int nbActor = 3 + this.random.nextInt(7);
			for (int i = 0 ; i < nbActor ; i++) {
				final Actor actor = getNextActor(resource, system.getOwnedActor().size() + targetedInterval.format());
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
		
	public Actor getNextActor(final Resource resource, String suffix) {
		final int periodTime = this.minPeriodTime + (this.stepPeriodTime *  this.random.nextInt( (this.maxPeriodTime - this.minPeriodTime) / this.stepPeriodTime));
		final int processTime  = this.minProcessTime + this.random.nextInt(this.maxProcessTime - this.minProcessTime);
		final int isPriority = this.random.nextInt(2);
		return new Actor("a" + suffix, isPriority, processTime, periodTime, resource);
	}
}
