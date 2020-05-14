package fr.inria.kairos.sock.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.kairos.sock.dsl.model.sock.NamedElement
import fr.inria.kairos.sock.dsl.model.sock.IotSystem
import fr.inria.kairos.sock.dsl.model.sock.Resource
import fr.inria.kairos.sock.dsl.model.sock.Actor

import static extension fr.inria.kairos.sock.aspects.NamedElementAspect.*
import static extension fr.inria.kairos.sock.aspects.IotSystemAspect.*
import static extension fr.inria.kairos.sock.aspects.ResourceAspect.*
import static extension fr.inria.kairos.sock.aspects.ActorAspect.*
import static extension fr.inria.kairos.sock.aspects.MaliciousActorAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.SynchroField
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.List
import java.util.Collections
import java.util.Comparator
import java.util.ArrayList
import java.io.FileWriter
import java.io.File
import java.util.Calendar
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import fr.inria.kairos.sock.dsl.model.sock.MaliciousActor
import java.util.Map

import fr.inria.kairos.sock.dsl.example.sidechannel.*;

import groovy.lang.Binding
import groovy.lang.GroovyShell

@Aspect(className=NamedElement)
abstract class NamedElementAspect {

	
}

@Aspect(className=IotSystem)
class IotSystemAspect extends NamedElementAspect {

	@SynchroField 
	public var Integer currentTime = 0
	
	def public void time() {
		_self.currentTime = _self.currentTime + 1
	}
	
}

@Aspect(className=Resource)
class ResourceAspect extends NamedElementAspect {
	
	public var String currentData = ""
	
	public var Integer lastActorSensibility = 0
	
	var Integer startingIdleIntervalTime = -1
	
	@ReplaceAspectMethod
	def public void isEntered(Actor actor, String secret) {
		_self.currentData = secret
		_self.lastActorSensibility = actor.isSensible
		_self.run(_self.name + " is entered")
	}
	
	@ReplaceAspectMethod
	def public void isProcessed() {
		_self.run(_self.name + " is busy")
	}
	
	@ReplaceAspectMethod
	def public void isExited() {
		_self.run(_self.name + " is exited")
	}
	
	@ReplaceAspectMethod
	def public void clean() {
//		ScheduLeak.busy(_self.eContainer() as IotSystem, _self.resourceTimeIndex)
		println("[" + _self.resourceTimeIndex + "] " + _self.name + " clean")
		_self.run(_self.name + " clean")
		_self.currentData = ""
	}
	
	@ReplaceAspectMethod
	def public void idle() {
		ScheduLeak.idle(_self.eContainer() as IotSystem, _self.resourceTimeIndex)
		_self.run(_self.name + " idle")
	}
	
	// UTILS AROUND TIME AND EXECUTION TRACES 
	
	public var Integer resourceTimeIndex = 0
	
	def public void run(String message) {
//		println("[" + _self.resourceTimeIndex + "] " + message)
		_self.time()
	}
	
	def public void time() {
		_self.resourceTimeIndex = _self.resourceTimeIndex + 1
	}
	
	def public void untime() {
		_self.resourceTimeIndex = _self.resourceTimeIndex - 1
	}
	
}

@Aspect(className=Actor)
class ActorAspect extends NamedElementAspect {
	
	@SynchroField
	public var Integer isSensible = 0
	
	@SynchroField
	public var Integer processTime = 3
	
	@SynchroField
	public var Integer periodTime = 25

	public var String secret = new java.util.Random().nextInt().toString()
	
	@SynchroField
	public var Integer currentProcessTime = 0
	
	@SynchroField
	public var String code = ""

	@ReplaceAspectMethod
	def public void ready() {
		_self.write("+")
		run(_self,  _self.name + " is ready")
	}
	
	def public void handleTakesOver() {
		if (ActorAspect.anActorEntered === ActorAspect.anActorExited && lastExitedActor !== null) {
			ScheduLeak.takesOver(_self.eContainer() as IotSystem, _self.actorTimeIndex, lastExitedActor)
		}
	}
	
	private static var Actor lastExitedActor = null
	private static var Integer anActorEntered = -1
	private static var Integer anActorExited = -2
	
	@ReplaceAspectMethod
	def public void enterIn() {
		_self.initFolder();
		ScheduLeak.busy(_self.eContainer() as IotSystem, _self.actorTimeIndex)
		ActorAspect.anActorEntered = _self.actorTimeIndex
		_self.handleTakesOver()
		_self.write("1")
		if (_self.currentProcessTime  == _self.processTime) {
			_self.currentProcessTime = 0
		}
		_self.resource.isEntered(_self, _self.name + " " + _self.secret)
		_self.run(_self.name + " enters in " + _self.resource.name)
	}
			
	@ReplaceAspectMethod
	def public void process() {
		_self.currentProcessTime = _self.currentProcessTime + 1
		ScheduLeak.busy(_self.eContainer() as IotSystem, _self.actorTimeIndex)
		_self.resource.isProcessed()
		_self.run(_self.name + " processes ("+ _self.currentProcessTime + "/" + _self.processTime +") {"+ _self.resource.name +"}")
	}
	
	@ReplaceAspectMethod
	def public void exitOf() {
		ScheduLeak.busy(_self.eContainer() as IotSystem, _self.actorTimeIndex)
		ActorAspect.anActorExited = _self.actorTimeIndex
		ActorAspect.lastExitedActor = _self
		_self.handleTakesOver()
		_self.write("0")
		_self.resource.isExited()
		if (_self.checkSensible()) {
			_self.time()
			_self.write("-")
			ScheduLeak.busy(_self.eContainer() as IotSystem, _self.actorTimeIndex)
			_self.untime()
		}
		if (_self.code !== null && _self.code !== ""){
			try{
				val binding = new Binding
				binding.setVariable("time", _self.actorTimeIndex)
				binding.setVariable("outputFolder", _self.folder + "/" + _self.subFolder + "/")
				val ucl = ActorAspect.classLoader
				val shell = new GroovyShell(ucl, binding)
				val energyCost = shell.evaluate(_self.code) as Integer
				_self.write(energyCost + "", _self.name + "_energy")	
//				if (energyCost > 0 && _self.actorTimeIndex > 300) {
//					throw new RuntimeException("WARNING: Something is wrong and " + _self.name + " is consuming to much energy!")
//				}		
			} catch (Exception cnfe){
				println("Failed to call Groovy script " + _self.code)
				cnfe.printStackTrace
			}			
		}
		_self.run(_self.name + " exits of " + _self.resource.name)
	}
	
	@ReplaceAspectMethod
	def public void idle() {
		_self.time()
	}

	// MANAGEMENT OF FILE OUTPUT TO BUILD BINARY SIGNAL GRAPH
	
	public val String folder = "/Users/stephaniechallita/Desktop/runtime-EclipseApplication/"
	
	public var String subFolder = ""
	
	def public void createIfDoesNotExists(String pathfolder) {
		val File fd = new File(pathfolder);
		if (! fd.exists()) {
			fd.mkdir()
		}
	}
	
	def public void initFolder() {
		_self.createIfDoesNotExists(_self.folder)
		if (_self.subFolder.isEmpty()) {
			_self.subFolder = (_self.eContainer as IotSystem).name + "/";
		}
		_self.createIfDoesNotExists(_self.folder + "/" + _self.subFolder)
		
	}
	
	def public void write(String action) {
		_self.write(action, _self.name)
	}
	
	def public void write(String action, String filename) {
		val java.io.FileWriter writer = new java.io.FileWriter(
			_self.folder + _self.subFolder + "/" +  filename, true
		);
		writer.write(_self.actorTimeIndex + " " + action + "\n")
		writer.close()
	}
	
	def public boolean checkSensible() {
		return _self.isSensible == 1
	}
	
	// UTILS AROUND TIME AND EXECUTION TRACES 
	
	public var Integer actorTimeIndex = 0
	
	def public void run(String message) {
		println("[" + _self.actorTimeIndex + "] " + message)
		_self.time()
	}
	
	def public void time() {
		_self.actorTimeIndex = _self.actorTimeIndex + 1
	}
	
	def public void untime() {
		_self.actorTimeIndex = _self.actorTimeIndex - 1
	}

}

@Aspect(className=MaliciousActor)
class MaliciousActorAspect extends ActorAspect {
	
	// MALICIOUS RELATED
	
	def public void stealSensibleInformationFromResource() {
		if (_self.resource.lastActorSensibility == 1) {
			// here we check that the resource did not leak any sensible information
			if (_self.resource.currentData != "") {
				println("WARNING: The resource " + _self.name + " may have leak the following secret:")
				println(_self.resource.currentData)
			}
		}
	}
	
}
