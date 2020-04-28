package fr.inria.kairos.sock.generator.model;

import java.util.List;
import java.util.stream.Collectors;

import fr.inria.kairos.sock.generator.Main;

import java.util.ArrayList;

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
		for (Resource resource : this.getOwnedResource()) {
			if (!resource.isSchedulable()) {
				return false;
			}
		}
		return true;
	}
	
	public String toTSock() {
		return "IotSystem " + this.name + " {" + Main.nl + 
					"\townedActor {" + Main.nl + 
						this.ownedActor.stream()
							.map(a -> a.toTSock())
							.collect(Collectors.joining("," + Main.nl)) + Main.nl +
					"\t}" + Main.nl + "\townedResource {" + Main.nl + 
						this.ownedResource.stream()
							.map(r -> r.toTSock())
							.collect(Collectors.joining("," + Main.nl)) + Main.nl +
					"\t}" + Main.nl +
				"}";
					
	}
	
}
