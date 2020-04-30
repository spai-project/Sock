// AspectJ classes that have been aspectized and name
package fr.inria.kairos.sock.dsl.model.sock.exp_attacks;
public aspect AspectJMaliciousActor{
void around (fr.inria.kairos.sock.dsl.model.sock.exp_attacks.MaliciousActor self)  :target (self) && (call ( void fr.inria.kairos.sock.dsl.model.sock.exp_attacks.MaliciousActor.enterIn(  ) ) ) { fr.inria.kairos.sock.aspects.MaliciousActorAspect.enterIn(self );}

}
