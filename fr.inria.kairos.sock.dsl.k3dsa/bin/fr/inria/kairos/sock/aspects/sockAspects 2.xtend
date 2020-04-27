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
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel

@Aspect(className=NamedElement)
abstract class NamedElementAspect {
	
	protected var Integer timeIndex = 0
	
	def protected void run(String message) {
		println("[" + _self.timeIndex + "] " + message)
		time(_self)
	}
	
	def protected void time() {
		_self.timeIndex = _self.timeIndex + 1
	}
	
	def public void idle() {
		time(_self)
	}
	
}

@Aspect(className=IotSystem)
class IotSystemAspect extends NamedElementAspect {

	@InitializeModel
	def public void checkSchedulability() {
		for (Resource resource : _self.ownedResource) {
			_self.checkSchedulability(resource)
		}
	}
	
	def private void checkSchedulability(Resource resource){
		var List<Actor> actors = new ArrayList<Actor>(resource.actor)
		Collections.sort(actors, new Comparator<Actor>() {
			override compare(Actor o1, Actor o2) {
				return o2.priority - o1.priority
			}
		});
		var float acc = 0.0f
		for (Actor actor : actors) {
			var Integer realProcessTime = _self.computeProcessTime(actor)
			acc = acc + ((realProcessTime as float / actor.periodTime as float) as float)
		}
	}
	
	def private Integer computeProcessTime(Actor actor) {
		if (checkPriority(actor)) {
			return actor.processTime + 2
		} else {
			return actor.processTime	
		}
	}
}

@Aspect(className=Resource)
class ResourceAspect extends NamedElementAspect {

	private var String currentData = ""
	
	private var Integer lastActorPriority = 0
	
	def public void printInfo() {
		print(_self.name + " : ")
		for (Actor a : _self.actor) {
			print(a.name + " ")
		}
		println("")
	}
	
	def public void clean() {
		_self.currentData = ""
		run(_self, "clean data")
	}
	
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
		_self.time()
	}
	
	def public void isProcessed() {
		_self.time()
	}
	
	def public void isExited() {
		_self.time()
	}
	
}

@Aspect(className=Actor)
class ActorAspect extends NamedElementAspect {

	private var String secret = new java.util.Random().nextInt().toString()
	
	private var Integer currentProcessTime = 0
	
	def public void request() {
		run(_self, _self.name + " requests " + _self.resource.name)
	}
	
	def public void enterIn() {
		run(_self, _self.name + " enters in " + _self.resource.name)
		if (_self.currentProcessTime  == _self.processTime) {
			_self.currentProcessTime = 0
		}
		_self.resource.isEntered(_self,  _self.name + " " + _self.secret)
	}
	
	def public void exitOf() {
		run(_self, _self.name + " exits of " + _self.resource.name)
		_self.resource.isExited()
	}
	
	def public void process() {
		_self.currentProcessTime = _self.currentProcessTime + 1
		run(_self, _self.name + " processes ("+ _self.currentProcessTime + "/" + _self.processTime +") {"+ _self.resource.name +"}")
		_self.resource.isProcessed()
	}
	
	def public boolean checkPriority() {
		return _self.isPriority == 1
	}
	
	@SynchroField
	public var Integer isPriority = 0
	
	@SynchroField
	public var Integer processTime = 3
	
	@SynchroField
	public var Integer periodTime = 25

}



