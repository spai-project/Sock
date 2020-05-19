package fr.inria.kairos.sock.generator.example;

import java.util.ArrayList;

import fr.inria.kairos.sock.generator.GeneratorHelper;
import fr.inria.kairos.sock.generator.example.groovy.DCMotorGroovy;
import fr.inria.kairos.sock.generator.example.groovy.VehiculePositionningGroovy;
import fr.inria.kairos.sock.generator.io.SockWriter;
import fr.inria.kairos.sock.generator.model.Actor;
import fr.inria.kairos.sock.generator.model.IotSystem;
import fr.inria.kairos.sock.generator.model.Resource;

public class ButterFlyMain {

	// read the position in the DCMotor

	public static void main(String[] args) {
		Actor.flushTaskCost = 1;
		SockWriter writer = new SockWriter(GeneratorHelper.PATH_OUTPUT);
		final IotSystem[] butterflySystems = new IotSystem[] {
			createDisabledButterfly(),
			createEnabledButterfly(),
//			createCounteredEnabledButterfly()
		};
		for (IotSystem system : butterflySystems) {
			System.out.println(system.isSchedulable(true));
			System.out.println(new ArrayList<>(system.getOwnedResource()).get(0).getBound());
			system.getOwnedActor().stream()
					.forEach(actor -> System.out.println(actor.getName() + " " + actor.getScore(true)));
			System.out.println(
					system.getOwnedActor().stream().map(actor -> actor.getScore(true)).reduce((acc, actor) -> acc + actor));
			writer.write(system.getName(), system);
		}
	}
	
	public static IotSystem createDisabledButterfly() {
		final IotSystem system = new IotSystem("DisabledButterFly");
		final Resource resource = new Resource("CPU");
		system.getOwnedResource().add(resource);
		system.getOwnedActor().add(new Actor("ControllerVehiculePositionning", 0, 7, 15, resource, VehiculePositionningGroovy.getVehiculePositionningGroovyScript()));
		system.getOwnedActor().add(new Actor("DCMotor", 0, 3, 30, resource, DCMotorGroovy.getDCMotorGroovyScript()));
//		system.getOwnedActor().add(new Actor("Dummy", 0, 1, 15, resource));
		return system;
	}
	
	public static IotSystem createEnabledButterfly() {
		final IotSystem system = new IotSystem("EnabledButterFly");
		final Resource resource = new Resource("CPU");
		system.getOwnedResource().add(resource);
		system.getOwnedActor().add(new Actor("ControllerVehiculePositionning", 0, 7, 60, resource, VehiculePositionningGroovy.getVehiculePositionningGroovyScript()));
		system.getOwnedActor().add(new Actor("DCMotor", 0, 3, 30, resource, DCMotorGroovy.getDCMotorGroovyScript()));
		return system;
	}
	
	public static IotSystem createCounteredEnabledButterfly() {
		final IotSystem system = new IotSystem("EnabledButterFly");
		final Resource resource = new Resource("CPU");
		system.getOwnedResource().add(resource);
		system.getOwnedActor().add(new Actor("ControllerVehiculePositionning", 0, 7, 60, resource, VehiculePositionningGroovy.getVehiculePositionningGroovyScript()));
		system.getOwnedActor().add(new Actor("DCMotor", 0, 3, 30, resource, DCMotorGroovy.getDCMotorGroovyScript()));
		system.getOwnedActor().add(new Actor("Dummy", 0, 1, 15, resource));
		return system;
	}
}
