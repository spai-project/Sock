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

@Aspect(className=NamedElement)
abstract class NamedElementAspect {

	
}

@Aspect(className=IotSystem)
class IotSystemAspect extends NamedElementAspect {
	
	def public void time() {
		_self.checkSchedulability()
	}
	
	def public void checkSchedulability() {
		for (Resource resource : _self.ownedResource) {
			_self.checkSchedulabilityResource(resource)
		}
	}
	
	def public void checkSchedulabilityResource(Resource resource){
		println("Checking schedulability for " + resource.name + "...")
		var List<Actor> actors = new ArrayList<Actor>(resource.actor)
		Collections.sort(actors, new Comparator<Actor>() {
			override compare(Actor o1, Actor o2) {
				return o2.priority - o1.priority
			}
		});
		var float acc = 0.0f
		for (Actor actor : actors) {
			if (! actor.hasFinishedTaskForPeriod) {
				var float realProcessTime = _self.computeProcessTime(actor)
				acc = acc + ((realProcessTime as float / actor.periodTime as float) as float)
			}
		}
		if (acc > 1.0f) {
			throw new RuntimeException("The system seems not to be schedulable: " + acc)
		}
		println("Score: " + acc)
	}
	
	def public float computeProcessTime(Actor actor) {
		if (checkPriority(actor)) {
			return actor.processTime + 2
		} else {
			return actor.processTime + 1
		}
	}
}

@Aspect(className=Resource)
class ResourceAspect extends NamedElementAspect {
	
	public var String currentData = ""
	
	public var Integer lastActorPriority = 0
	
	def public void printInfo() {
		print(_self.name + " : ")
		for (Actor a : _self.actor) {
			print(a.name + " ")
		}
		println("")
	}
	
	@ReplaceAspectMethod
	def public void clean() {
		_self.currentData = ""
	}
	
	@ReplaceAspectMethod
	def public void isEntered(Actor actor, String secret) {
		if (_self.lastActorPriority == 1) {
			// here we check that the resource did not leak any sensible information
			if (_self.currentData != "") {
				println("WARNING: The resource " + _self.name + " may have leak the following secret:")
				println(_self.currentData)
			}
		}
		_self.currentData = secret
		_self.lastActorPriority = actor.priority
	}
	
	@ReplaceAspectMethod
	def public void isProcessed() {
		
	}
	
	@ReplaceAspectMethod
	def public void isExited() {
		
	}
	
}

@Aspect(className=Actor)
class ActorAspect extends NamedElementAspect {
	
	public val String folder = "/Users/stephaniechallita/Desktop/runtime-EclipseApplication/"
	
	public var String subFolder = ""
	
	public var Integer actorTimeIndex = 0
	
	public var boolean hasFinishedTaskForPeriod = false
	
	def public void run(String message) {
		println("[" + _self.actorTimeIndex + "] " + message)
		time(_self)
	}
	
	def public void time() {
		_self.actorTimeIndex = _self.actorTimeIndex + 1
	}
	
	def public void idle() {
		time(_self)
	}
	
	def public void write(String action) {
		val java.io.FileWriter writer = new java.io.FileWriter(
			_self.folder + _self.subFolder + _self.name, true
		);
		writer.write(_self.actorTimeIndex + " " + action + "\n")
		writer.close()
	}

	public var String secret = new java.util.Random().nextInt().toString()
	
	public var Integer currentProcessTime = 0
	
	def public void createIfDoesNotExists(String path) {
		val File fd = new File(path);
		if (! fd.exists()) {
			fd.mkdir()
		}
	}
	
	def public void initFolder() {
		_self.createIfDoesNotExists(_self.folder)
		if (_self.subFolder.isEmpty()) {
			_self.subFolder = (_self.eContainer as IotSystem).name + "/";
		}
		_self.createIfDoesNotExists(_self.folder + _self.subFolder)
	}
	
	@ReplaceAspectMethod
	def public void request() {
		_self.initFolder()
		run(_self, _self.name + " requests " + _self.resource.name)
	}
	
	@ReplaceAspectMethod
	def public void enterIn() {
		run(_self, _self.name + " enters in " + _self.resource.name)
		if (_self.currentProcessTime  == _self.processTime) {
			_self.currentProcessTime = 0
		}
		_self.resource.isEntered(_self, _self.name + " " + _self.secret)
		_self.write("1")
	}
	
	@ReplaceAspectMethod
	def public void exitOf() {
		run(_self, _self.name + " exits of " + _self.resource.name)
		_self.resource.isExited()
		_self.write("0")
		_self.hasFinishedTaskForPeriod = true
	}
	
	@ReplaceAspectMethod
	def public void process() {
		_self.currentProcessTime = _self.currentProcessTime + 1
		run(_self, _self.name + " processes ("+ _self.currentProcessTime + "/" + _self.processTime +") {"+ _self.resource.name +"}")
		_self.resource.isProcessed()
	}
	
	def public boolean checkPriority() {
		return _self.isPriority == 1
	}
	
	def public void ready() {
		run(_self,  _self.name + " is ready")
		_self.write("+")
		_self.hasFinishedTaskForPeriod = false
	}
	
	@SynchroField
	public var Integer isPriority = 0
	
	@SynchroField
	public var Integer processTime = 3
	
	@SynchroField
	public var Integer periodTime = 25

}
