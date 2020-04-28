// AspectJ classes that have been aspectized and name
package fr.inria.kairos.sock.dsl.model.sock;
public aspect AspectJActor{
void around (fr.inria.kairos.sock.dsl.model.sock.Actor self)  :target (self) && (call ( void fr.inria.kairos.sock.dsl.model.sock.Actor.request(  ) ) ) { fr.inria.kairos.sock.aspects.ActorAspect.request(self );}
void around (fr.inria.kairos.sock.dsl.model.sock.Actor self)  :target (self) && (call ( void fr.inria.kairos.sock.dsl.model.sock.Actor.enterIn(  ) ) ) { fr.inria.kairos.sock.aspects.ActorAspect.enterIn(self );}
void around (fr.inria.kairos.sock.dsl.model.sock.Actor self)  :target (self) && (call ( void fr.inria.kairos.sock.dsl.model.sock.Actor.exitOf(  ) ) ) { fr.inria.kairos.sock.aspects.ActorAspect.exitOf(self );}
void around (fr.inria.kairos.sock.dsl.model.sock.Actor self)  :target (self) && (call ( void fr.inria.kairos.sock.dsl.model.sock.Actor.process(  ) ) ) { fr.inria.kairos.sock.aspects.ActorAspect.process(self );}
void around (fr.inria.kairos.sock.dsl.model.sock.Actor self)  :target (self) &&  call ( void Actor.setIsPriority(java.lang.Integer)){fr.inria.kairos.sock.aspects.ActorAspect.isPriority(self, (java.lang.Integer)thisJoinPoint.getArgs()[0]);proceed(self);
}
void around (fr.inria.kairos.sock.dsl.model.sock.Actor self)  :target (self) &&  call ( void fr.inria.kairos.sock.aspects.ActorAspect.isPriority(fr.inria.kairos.sock.dsl.model.sock.Actor,java.lang.Integer)){self.setIsPriority( (java.lang.Integer)thisJoinPoint.getArgs()[0]);proceed(self);
}
void around (fr.inria.kairos.sock.dsl.model.sock.Actor self)  :target (self) &&  call ( void Actor.setProcessTime(java.lang.Integer)){fr.inria.kairos.sock.aspects.ActorAspect.processTime(self, (java.lang.Integer)thisJoinPoint.getArgs()[0]);proceed(self);
}
void around (fr.inria.kairos.sock.dsl.model.sock.Actor self)  :target (self) &&  call ( void fr.inria.kairos.sock.aspects.ActorAspect.processTime(fr.inria.kairos.sock.dsl.model.sock.Actor,java.lang.Integer)){self.setProcessTime( (java.lang.Integer)thisJoinPoint.getArgs()[0]);proceed(self);
}
void around (fr.inria.kairos.sock.dsl.model.sock.Actor self)  :target (self) &&  call ( void Actor.setPeriodTime(java.lang.Integer)){fr.inria.kairos.sock.aspects.ActorAspect.periodTime(self, (java.lang.Integer)thisJoinPoint.getArgs()[0]);proceed(self);
}
void around (fr.inria.kairos.sock.dsl.model.sock.Actor self)  :target (self) &&  call ( void fr.inria.kairos.sock.aspects.ActorAspect.periodTime(fr.inria.kairos.sock.dsl.model.sock.Actor,java.lang.Integer)){self.setPeriodTime( (java.lang.Integer)thisJoinPoint.getArgs()[0]);proceed(self);
}

}
