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

@Aspect(className=NamedElement)
abstract class NamedElementAspect {

}

@Aspect(className=IotSystem)
class IotSystemAspect extends NamedElementAspect {

//	public var Integer timeIndex = 0
	
//	def public void time() {
//		_self.timeIndex = _self.timeIndex + 1
//	}

}

@Aspect(className=Resource)
class ResourceAspect extends NamedElementAspect {

	public var String currentData = ""
	
	private var Integer lastActorPriority = 0
	
	def public void printInfo() {
		print(_self.name + " : ")
		for (Actor a : _self.actor) {
			print(a.name + " ")
		}
		println("")
	}
	
	// TODO implement methods of the model
	// TODO implement the time inside the resource
	
	def public void clean() {
		// must be link to the ECL file
		_self.currentData = ""
	}
	
	def public void isEntered(Actor actor) {
		if (_self.lastActorPriority == 1) {
			// here we check that the resource did not leak any sensible information
			if (_self.currentData != "") {
				println("WARNING: The resource " + _self.name + " may have leak the following secret:")
				println(_self.currentData)
			}
		}
		_self.lastActorPriority = actor.priority
	}
	
}

@Aspect(className=Actor)
class ActorAspect extends NamedElementAspect {
	
	private var Integer timeIndex = 0

	private var String secret = new java.util.Random().nextInt().toString()
	
	private var Integer currentProcessTime = 0
	
	def private void run(String message) {
		println("[" + _self.timeIndex + "] " + message)
		time(_self)
	}
	
	def private void time() {
		_self.timeIndex = _self.timeIndex + 1
	}
	
	def public void request() {
		run(_self, _self.name + " requests " + _self.resource.name)
	}
	
	def public void idle() {
		time(_self)
	}
	
	def public void enterIn() {
		run(_self, _self.name + " enters in " + _self.resource.name)
		if (_self.currentProcessTime  == _self.processTime) {
			_self.currentProcessTime = 0
		}
		_self.resource.currentData = _self.name + " " + _self.secret
		_self.resource.isEntered(_self)
	}
	
	def public void exitOf() {
		run(_self, _self.name + " exits of " + _self.resource.name)
	}
	
	def public void process() {
		_self.currentProcessTime = _self.currentProcessTime + 1
		run(_self, _self.name + " processes ("+ _self.currentProcessTime + "/" + _self.processTime +") {"+ _self.resource.name +"}")
	}
	
	@SynchroField
	public var Integer isPriority = 0
	
	@SynchroField
	public var Integer processTime = 3
	
	@SynchroField
	public var Integer periodTime = 25

}



