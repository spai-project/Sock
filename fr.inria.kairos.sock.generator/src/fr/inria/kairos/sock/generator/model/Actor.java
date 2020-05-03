package fr.inria.kairos.sock.generator.model;

import static fr.inria.kairos.sock.generator.GeneratorHelper.NEW_LINE;

public class Actor extends NamedElement {
	
	public static int flushTaskCost = 1;
	
	public static int enterTaskCost = 1;
	
	public static int exitTaskCost = 1;
	
	private final Resource resource;
	
	private final int isSensible;
	
	private final int processTime;

	private final int periodTime;
	
	public Actor(String name, int isSensible, int processTime, int periodTime, Resource resource) {
		super(name);
		this.isSensible = isSensible;
		this.processTime = processTime;
		this.periodTime = periodTime;
		this.resource = resource;
		this.resource.addActor(this);
	}

	public Resource getResource() {
		return resource;
	}
	
	public double getScore() {
		return this.getScore(true);
	}

	public double getScore(boolean withFlushTask) {
		return  this.computeProccessTime(withFlushTask) / ((double)this.getPeriodTime());
	}
	
	public int getIsSensible() {
		return this.isSensible;
	}

	public int getProcessTime() {
		return processTime;
	}

	public int getPeriodTime() {
		return periodTime;
	}
	
	public double computeProccessTime(boolean withFlushTask) {
		return this.getProcessTime() + Actor.enterTaskCost + Actor.exitTaskCost
				+ (withFlushTask && this.getIsSensible() == 1 ? Actor.flushTaskCost : 0);
	}
	
	public String toTSock() {
		return "\t\tActor " + this.getName() + " {" + NEW_LINE +
					"\t\t\tisPriority " + this.getIsSensible() + NEW_LINE +
					"\t\t\tprocessTime " + this.getProcessTime() + NEW_LINE +
					"\t\t\tperiodTime " + this.getPeriodTime() + NEW_LINE +
					"\t\t\tresource \"" + this.resource.getName() + "\"" + NEW_LINE +
				"\t\t}";
	}

	@Override
	public String toString() {
		return "Actor [resource=" + resource.getName() + ", isSensible=" + getIsSensible() + ", processTime=" + processTime
				+ ", periodTime=" + periodTime + ", name=" + name + "]";
	}
	
}
