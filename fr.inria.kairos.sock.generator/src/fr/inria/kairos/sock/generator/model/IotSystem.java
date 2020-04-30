package fr.inria.kairos.sock.generator.model;

import java.util.List;
import java.util.stream.Collectors;

import java.util.ArrayList;

import static fr.inria.kairos.sock.generator.GeneratorHelper.NEW_LINE;

public class IotSystem extends NamedElement {
		
	private List<Actor> ownedActor;
	
	private List<Resource> ownedResource;
	
	public IotSystem(String name) {
		super(name);
		this.ownedActor = new ArrayList<>();
		this.ownedResource = new ArrayList<>();
	}

	public List<Actor> getOwnedActor() {
		return ownedActor;
	}

	public List<Resource> getOwnedResource() {
		return ownedResource;
	}
	
	public boolean isSchedulable() {
		return this.isSchedulable(true);
	}
	
	public boolean isSchedulable(boolean withFlushTask) {
		for (Resource resource : this.getOwnedResource()) {
			if (!resource.isSchedulable(withFlushTask)) {
				return false;
			}
		}
		return true;
	}
	
	public String toTSock() {
		return "IotSystem " + this.name + " {" + NEW_LINE + 
					"\townedActor {" + NEW_LINE + 
						this.ownedActor.stream()
							.map(a -> a.toTSock())
							.collect(Collectors.joining("," + NEW_LINE)) + NEW_LINE +
					"\t}" + NEW_LINE + "\townedResource {" + NEW_LINE + 
						this.ownedResource.stream()
							.map(r -> r.toTSock())
							.collect(Collectors.joining("," + NEW_LINE)) + NEW_LINE +
					"\t}" + NEW_LINE +
				"}";
					
	}
	
}
