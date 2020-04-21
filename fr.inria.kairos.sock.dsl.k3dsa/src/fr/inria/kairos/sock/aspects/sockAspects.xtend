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

@Aspect(className=NamedElement)
abstract class NamedElementAspect {

}

@Aspect(className=IotSystem)
class IotSystemAspect extends NamedElementAspect {

	public var Integer timeIndex = 0
	
	def public void time() {
		println(_self.timeIndex)
		_self.timeIndex = _self.timeIndex + 1
	}

	@Main
	def public void main() {
		println("Launching Sock for IoTSystem...")
		println("The system is as follow: ")
		for (Resource r : _self.ownedResource) {
			r.printInfo();
		}
	}

}


@Aspect(className=Resource)
class ResourceAspect extends NamedElementAspect {

	public var String currentData = ""
	
	def public void printInfo() {
		print(_self.name + " : ")
		for (Actor a : _self.actor) {
			print(a.name + " ")
		}
		println("")
	}

}

@Aspect(className=Actor)
class ActorAspect extends NamedElementAspect {

	@SynchroField
	public var Integer isPriority = 0
	
	@SynchroField
	public var Integer processTime = 3
	
	@SynchroField
	public var Integer periodTime = 10

}



