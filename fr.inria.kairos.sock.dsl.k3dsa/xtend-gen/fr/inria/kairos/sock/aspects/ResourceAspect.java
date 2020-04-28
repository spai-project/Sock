package fr.inria.kairos.sock.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.kairos.sock.aspects.ActorAspect;
import fr.inria.kairos.sock.aspects.NamedElementAspect;
import fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties;
import fr.inria.kairos.sock.dsl.model.sock.Actor;
import fr.inria.kairos.sock.dsl.model.sock.Resource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Resource.class)
@SuppressWarnings("all")
public class ResourceAspect extends NamedElementAspect {
  public static void run(final Resource _self, final String message) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void run(String)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	fr.inria.kairos.sock.aspects.ResourceAspect._privk3_run(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self,message);
    };
  }
  
  public static void time(final Resource _self) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void time()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	fr.inria.kairos.sock.aspects.ResourceAspect._privk3_time(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self);
    };
  }
  
  public static void idle(final Resource _self) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void idle()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	fr.inria.kairos.sock.aspects.ResourceAspect._privk3_idle(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self);
    };
  }
  
  public static void printInfo(final Resource _self) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void printInfo()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	fr.inria.kairos.sock.aspects.ResourceAspect._privk3_printInfo(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self);
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
  
  public static Integer resourceTimeIndex(final Resource _self) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer resourceTimeIndex()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	result = fr.inria.kairos.sock.aspects.ResourceAspect._privk3_resourceTimeIndex(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self);
    };
    return (java.lang.Integer)result;
  }
  
  public static void resourceTimeIndex(final Resource _self, final Integer resourceTimeIndex) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void resourceTimeIndex(Integer)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	fr.inria.kairos.sock.aspects.ResourceAspect._privk3_resourceTimeIndex(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self,resourceTimeIndex);
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
  
  public static Integer lastActorPriority(final Resource _self) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer lastActorPriority()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	result = fr.inria.kairos.sock.aspects.ResourceAspect._privk3_lastActorPriority(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self);
    };
    return (java.lang.Integer)result;
  }
  
  public static void lastActorPriority(final Resource _self, final Integer lastActorPriority) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void lastActorPriority(Integer)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	fr.inria.kairos.sock.aspects.ResourceAspect._privk3_lastActorPriority(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self,lastActorPriority);
    };
  }
  
  protected static void _privk3_run(final ResourceAspectResourceAspectProperties _self_, final Resource _self, final String message) {
    Integer _resourceTimeIndex = ResourceAspect.resourceTimeIndex(_self);
    String _plus = ("[" + _resourceTimeIndex);
    String _plus_1 = (_plus + "] ");
    String _plus_2 = (_plus_1 + message);
    InputOutput.<String>println(_plus_2);
    ResourceAspect.time(_self);
  }
  
  protected static void _privk3_time(final ResourceAspectResourceAspectProperties _self_, final Resource _self) {
    Integer _resourceTimeIndex = ResourceAspect.resourceTimeIndex(_self);
    int _plus = ((_resourceTimeIndex).intValue() + 1);
    ResourceAspect.resourceTimeIndex(_self, Integer.valueOf(_plus));
  }
  
  protected static void _privk3_idle(final ResourceAspectResourceAspectProperties _self_, final Resource _self) {
    ResourceAspect.time(_self);
  }
  
  protected static void _privk3_printInfo(final ResourceAspectResourceAspectProperties _self_, final Resource _self) {
    String _name = _self.getName();
    String _plus = (_name + " : ");
    InputOutput.<String>print(_plus);
    EList<Actor> _actor = _self.getActor();
    for (final Actor a : _actor) {
      String _name_1 = a.getName();
      String _plus_1 = (_name_1 + " ");
      InputOutput.<String>print(_plus_1);
    }
    InputOutput.<String>println("");
  }
  
  protected static void _privk3_clean(final ResourceAspectResourceAspectProperties _self_, final Resource _self) {
    ResourceAspect.currentData(_self, "");
    ResourceAspect.run(_self, "clean data");
  }
  
  protected static void _privk3_isEntered(final ResourceAspectResourceAspectProperties _self_, final Resource _self, final Actor actor, final String secret) {
    Integer _lastActorPriority = ResourceAspect.lastActorPriority(_self);
    boolean _equals = ((_lastActorPriority).intValue() == 1);
    if (_equals) {
      String _currentData = ResourceAspect.currentData(_self);
      boolean _notEquals = (!Objects.equal(_currentData, ""));
      if (_notEquals) {
        String _name = _self.getName();
        String _plus = ("WARNING: The resource " + _name);
        String _plus_1 = (_plus + " may have leak the following secret:");
        InputOutput.<String>println(_plus_1);
        InputOutput.<String>println(ResourceAspect.currentData(_self));
      }
    }
    ResourceAspect.currentData(_self, secret);
    ResourceAspect.lastActorPriority(_self, ActorAspect.isPriority(actor));
    ResourceAspect.time(_self);
  }
  
  protected static void _privk3_isProcessed(final ResourceAspectResourceAspectProperties _self_, final Resource _self) {
    ResourceAspect.time(_self);
  }
  
  protected static void _privk3_isExited(final ResourceAspectResourceAspectProperties _self_, final Resource _self) {
    ResourceAspect.time(_self);
  }
  
  protected static Integer _privk3_resourceTimeIndex(final ResourceAspectResourceAspectProperties _self_, final Resource _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getResourceTimeIndex") &&
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
    return _self_.resourceTimeIndex;
  }
  
  protected static void _privk3_resourceTimeIndex(final ResourceAspectResourceAspectProperties _self_, final Resource _self, final Integer resourceTimeIndex) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setResourceTimeIndex")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, resourceTimeIndex);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.resourceTimeIndex = resourceTimeIndex;
    }
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
  
  protected static Integer _privk3_lastActorPriority(final ResourceAspectResourceAspectProperties _self_, final Resource _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getLastActorPriority") &&
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
    return _self_.lastActorPriority;
  }
  
  protected static void _privk3_lastActorPriority(final ResourceAspectResourceAspectProperties _self_, final Resource _self, final Integer lastActorPriority) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setLastActorPriority")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, lastActorPriority);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.lastActorPriority = lastActorPriority;
    }
  }
}
