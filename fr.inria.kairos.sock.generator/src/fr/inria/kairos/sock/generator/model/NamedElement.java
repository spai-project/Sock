package fr.inria.kairos.sock.generator.model;

public abstract class NamedElement {
	
	protected final String name;
	
	public NamedElement(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
