// AspectJ classes that have been aspectized and name
package fr.inria.kairos.sock.dsl.model.sock;
public aspect AspectJMaliciousActor{
void around (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor self)  :target (self) && (call ( void fr.inria.kairos.sock.dsl.model.sock.MaliciousActor.enterIn(  ) ) ) { fr.inria.kairos.sock.aspects.MaliciousActorAspect.enterIn(self );}

}
