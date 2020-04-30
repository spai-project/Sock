// AspectJ classes that have been aspectized and name
package fr.inria.kairos.sock.dsl.model.sock;
public aspect AspectJMaliciousActor{
void around (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor self)  :target (self) && (call ( void fr.inria.kairos.sock.dsl.model.sock.MaliciousActor.ready(  ) ) ) { fr.inria.kairos.sock.aspects.MaliciousActorAspect.ready(self );}
void around (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor self)  :target (self) && (call ( void fr.inria.kairos.sock.dsl.model.sock.MaliciousActor.request(  ) ) ) { fr.inria.kairos.sock.aspects.MaliciousActorAspect.request(self );}
void around (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor self)  :target (self) && (call ( void fr.inria.kairos.sock.dsl.model.sock.MaliciousActor.enterIn(  ) ) ) { fr.inria.kairos.sock.aspects.MaliciousActorAspect.enterIn(self );}
void around (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor self)  :target (self) && (call ( void fr.inria.kairos.sock.dsl.model.sock.MaliciousActor.process(  ) ) ) { fr.inria.kairos.sock.aspects.MaliciousActorAspect.process(self );}
void around (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor self)  :target (self) && (call ( void fr.inria.kairos.sock.dsl.model.sock.MaliciousActor.exitOf(  ) ) ) { fr.inria.kairos.sock.aspects.MaliciousActorAspect.exitOf(self );}
void around (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor self)  :target (self) && (call ( void fr.inria.kairos.sock.dsl.model.sock.MaliciousActor.idle(  ) ) ) { fr.inria.kairos.sock.aspects.MaliciousActorAspect.idle(self );}
void around (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor self)  :target (self) &&  call ( void MaliciousActor.setIsPriority(java.lang.Integer)){fr.inria.kairos.sock.aspects.MaliciousActorAspect.isPriority(self, (java.lang.Integer)thisJoinPoint.getArgs()[0]);proceed(self);
}
void around (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor self)  :target (self) &&  call ( void fr.inria.kairos.sock.aspects.MaliciousActorAspect.isPriority(fr.inria.kairos.sock.dsl.model.sock.MaliciousActor,java.lang.Integer)){self.setIsPriority( (java.lang.Integer)thisJoinPoint.getArgs()[0]);proceed(self);
}
void around (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor self)  :target (self) &&  call ( void MaliciousActor.setProcessTime(java.lang.Integer)){fr.inria.kairos.sock.aspects.MaliciousActorAspect.processTime(self, (java.lang.Integer)thisJoinPoint.getArgs()[0]);proceed(self);
}
void around (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor self)  :target (self) &&  call ( void fr.inria.kairos.sock.aspects.MaliciousActorAspect.processTime(fr.inria.kairos.sock.dsl.model.sock.MaliciousActor,java.lang.Integer)){self.setProcessTime( (java.lang.Integer)thisJoinPoint.getArgs()[0]);proceed(self);
}
void around (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor self)  :target (self) &&  call ( void MaliciousActor.setPeriodTime(java.lang.Integer)){fr.inria.kairos.sock.aspects.MaliciousActorAspect.periodTime(self, (java.lang.Integer)thisJoinPoint.getArgs()[0]);proceed(self);
}
void around (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor self)  :target (self) &&  call ( void fr.inria.kairos.sock.aspects.MaliciousActorAspect.periodTime(fr.inria.kairos.sock.dsl.model.sock.MaliciousActor,java.lang.Integer)){self.setPeriodTime( (java.lang.Integer)thisJoinPoint.getArgs()[0]);proceed(self);
}

}
