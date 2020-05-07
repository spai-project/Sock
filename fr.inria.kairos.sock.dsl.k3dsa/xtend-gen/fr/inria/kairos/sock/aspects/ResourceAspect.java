package fr.inria.kairos.sock.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.kairos.sock.aspects.NamedElementAspect;
import fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties;
import fr.inria.kairos.sock.dsl.model.sock.Actor;
import fr.inria.kairos.sock.dsl.model.sock.IotSystem;
import fr.inria.kairos.sock.dsl.model.sock.Resource;
import org.eclipse.emf.ecore.EObject;

@Aspect(className = Resource.class)
@SuppressWarnings("all")
public class ResourceAspect extends NamedElementAspect {
  @ReplaceAspectMethod
  public static void isEntered(final Resource _self, final Actor actor, final String secret) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isEntered(Actor,String)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	fr.inria.kairos.sock.aspects.ResourceAspect._privk3_isEntered(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self,actor,secret);
    };
  }
  
  @ReplaceAspectMethod
  public static void isProcessed(final Resource _self) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isProcessed()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	fr.inria.kairos.sock.aspects.ResourceAspect._privk3_isProcessed(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self);
    };
  }
  
  @ReplaceAspectMethod
  public static void isExited(final Resource _self) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isExited()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	fr.inria.kairos.sock.aspects.ResourceAspect._privk3_isExited(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self);
    };
  }
  
  @ReplaceAspectMethod
  public static void clean(final Resource _self) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void clean()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	fr.inria.kairos.sock.aspects.ResourceAspect._privk3_clean(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self);
    };
  }
  
  @ReplaceAspectMethod
  public static void idle(final Resource _self) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void idle()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	fr.inria.kairos.sock.aspects.ResourceAspect._privk3_idle(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self);
    };
  }
  
  public static String currentData(final Resource _self) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String currentData()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	result = fr.inria.kairos.sock.aspects.ResourceAspect._privk3_currentData(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self);
    };
    return (java.lang.String)result;
  }
  
  public static void currentData(final Resource _self, final String currentData) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentData(String)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	fr.inria.kairos.sock.aspects.ResourceAspect._privk3_currentData(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self,currentData);
    };
  }
  
  public static Integer lastActorSensibility(final Resource _self) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer lastActorSensibility()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	result = fr.inria.kairos.sock.aspects.ResourceAspect._privk3_lastActorSensibility(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self);
    };
    return (java.lang.Integer)result;
  }
  
  public static void lastActorSensibility(final Resource _self, final Integer lastActorSensibility) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void lastActorSensibility(Integer)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	fr.inria.kairos.sock.aspects.ResourceAspect._privk3_lastActorSensibility(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self,lastActorSensibility);
    };
  }
  
  private static Integer idleTime(final Resource _self) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer idleTime()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	result = fr.inria.kairos.sock.aspects.ResourceAspect._privk3_idleTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self);
    };
    return (java.lang.Integer)result;
  }
  
  private static void idleTime(final Resource _self, final Integer idleTime) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void idleTime(Integer)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	fr.inria.kairos.sock.aspects.ResourceAspect._privk3_idleTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self,idleTime);
    };
  }
  
  protected static void _privk3_isEntered(final ResourceAspectResourceAspectProperties _self_, final Resource _self, final Actor actor, final String secret) {
    ResourceAspect.currentData(_self, secret);
    ResourceAspect.lastActorSensibility(_self, Integer.valueOf(actor.getIsSensible()));
  }
  
  protected static void _privk3_isProcessed(final ResourceAspectResourceAspectProperties _self_, final Resource _self) {
  }
  
  protected static void _privk3_isExited(final ResourceAspectResourceAspectProperties _self_, final Resource _self) {
  }
  
  protected static void _privk3_clean(final ResourceAspectResourceAspectProperties _self_, final Resource _self) {
    ResourceAspect.currentData(_self, "");
  }
  
  protected static void _privk3_idle(final ResourceAspectResourceAspectProperties _self_, final Resource _self) {
    EObject _eContainer = _self.eContainer();
    ResourceAspect.idleTime(_self, Integer.valueOf(((IotSystem) _eContainer).getCurrentTime()));
  }
  
  protected static String _privk3_currentData(final ResourceAspectResourceAspectProperties _self_, final Resource _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentData") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentData;
  }
  
  protected static void _privk3_currentData(final ResourceAspectResourceAspectProperties _self_, final Resource _self, final String currentData) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentData")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentData);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentData = currentData;
    }
  }
  
  protected static Integer _privk3_lastActorSensibility(final ResourceAspectResourceAspectProperties _self_, final Resource _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getLastActorSensibility") &&
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
    return _self_.lastActorSensibility;
  }
  
  protected static void _privk3_lastActorSensibility(final ResourceAspectResourceAspectProperties _self_, final Resource _self, final Integer lastActorSensibility) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setLastActorSensibility")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, lastActorSensibility);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.lastActorSensibility = lastActorSensibility;
    }
  }
  
  protected static Integer _privk3_idleTime(final ResourceAspectResourceAspectProperties _self_, final Resource _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getIdleTime") &&
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
    return _self_.idleTime;
  }
  
  protected static void _privk3_idleTime(final ResourceAspectResourceAspectProperties _self_, final Resource _self, final Integer idleTime) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIdleTime")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, idleTime);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.idleTime = idleTime;
    }
  }
}
