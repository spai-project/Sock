package fr.inria.kairos.sock.generator.model;

import static fr.inria.kairos.sock.generator.GeneratorHelper.NEW_LINE;

public class Actor extends NamedElement {
	
	public static int flushTaskCost = 5;
	
	private final Resource resource;
	
	private final int isPriority;
	
	private final int processTime;

	private final int periodTime;
	
	public Actor(String name, int isPriority, int processTime, int periodTime, Resource resource) {
		super(name);
		this.isPriority = isPriority;
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
		return (withFlushTask ? this.computeProccessTime() : this.getProcessTime() + 1) / ((double)this.getPeriodTime());
	}
	
	public int getIsPriority() {
		return isPriority;
	}

	public int getProcessTime() {
		return processTime;
	}

	public int getPeriodTime() {
		return periodTime;
	}
	
	public double computeProccessTime() {
		return (double)(this.getProcessTime() + 
				1 + (this.getIsPriority() == 1 ? this.flushTaskCost : 0));
	}
	
	public String toTSock() {
		return "\t\tActor " + this.getName() + " {" + NEW_LINE +
					"\t\t\tisPriority " + this.getIsPriority() + NEW_LINE +
					"\t\t\tprocessTime " + this.getProcessTime() + NEW_LINE +
					"\t\t\tperiodTime " + this.getPeriodTime() + NEW_LINE +
					"\t\t\tresource \"" + this.resource.getName() + "\"" + NEW_LINE +
				"\t\t}";
	}

	@Override
	public String toString() {
		return "Actor [resource=" + resource.getName() + ", isPriority=" + isPriority + ", processTime=" + processTime
				+ ", periodTime=" + periodTime + ", name=" + name + "]";
	}
	
}
