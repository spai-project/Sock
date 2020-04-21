package fr.inria.kairos.sock.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.SynchroField;
import fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties;
import fr.inria.kairos.sock.aspects.NamedElementAspect;
import fr.inria.kairos.sock.dsl.model.sock.Actor;

@Aspect(className = Actor.class)
@SuppressWarnings("all")
public class ActorAspect extends NamedElementAspect {
  @SynchroField
  public static Integer isPriority(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer isPriority()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	result = fr.inria.kairos.sock.aspects.ActorAspect._privk3_isPriority(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
    return (java.lang.Integer)result;
  }
  
  @SynchroField
  public static void isPriority(final Actor _self, final Integer isPriority) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isPriority(Integer)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_isPriority(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self,isPriority);
    };
  }
  
  @SynchroField
  public static Integer processTime(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer processTime()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	result = fr.inria.kairos.sock.aspects.ActorAspect._privk3_processTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
    return (java.lang.Integer)result;
  }
  
  @SynchroField
  public static void processTime(final Actor _self, final Integer processTime) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void processTime(Integer)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_processTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self,processTime);
    };
  }
  
  @SynchroField
  public static Integer periodTime(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer periodTime()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	result = fr.inria.kairos.sock.aspects.ActorAspect._privk3_periodTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
    return (java.lang.Integer)result;
  }
  
  @SynchroField
  public static void periodTime(final Actor _self, final Integer periodTime) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void periodTime(Integer)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_periodTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self,periodTime);
    };
  }
  
  protected static Integer _privk3_isPriority(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getIsPriority") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Integer) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.isPriority;
  }
  
  protected static void _privk3_isPriority(final ActorAspectActorAspectProperties _self_, final Actor _self, final Integer isPriority) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIsPriority")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, isPriority);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.isPriority = isPriority;
    }
  }
  
  protected static Integer _privk3_processTime(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getProcessTime") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Integer) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.processTime;
  }
  
  protected static void _privk3_processTime(final ActorAspectActorAspectProperties _self_, final Actor _self, final Integer processTime) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setProcessTime")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, processTime);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.processTime = processTime;
    }
  }
  
  protected static Integer _privk3_periodTime(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getPeriodTime") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Integer) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.periodTime;
  }
  
  protected static void _privk3_periodTime(final ActorAspectActorAspectProperties _self_, final Actor _self, final Integer periodTime) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setPeriodTime")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, periodTime);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.periodTime = periodTime;
    }
  }
}
