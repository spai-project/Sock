package fr.inria.kairos.sock.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.kairos.sock.aspects.ActorAspect;
import fr.inria.kairos.sock.aspects.NamedElementAspect;
import fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties;
import fr.inria.kairos.sock.dsl.model.sock.Actor;
import fr.inria.kairos.sock.dsl.model.sock.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

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
  
  public static void checkSchedulabilityResource(final Resource _self) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void checkSchedulabilityResource()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	fr.inria.kairos.sock.aspects.ResourceAspect._privk3_checkSchedulabilityResource(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self);
    };
  }
  
  public static double getBound(final Resource _self) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# double getBound()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	result = fr.inria.kairos.sock.aspects.ResourceAspect._privk3_getBound(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self);
    };
    return (double)result;
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
  
  protected static void _privk3_isEntered(final ResourceAspectResourceAspectProperties _self_, final Resource _self, final Actor actor, final String secret) {
    ResourceAspect.currentData(_self, secret);
    ResourceAspect.lastActorPriority(_self, ActorAspect.isPriority(actor));
  }
  
  protected static void _privk3_isProcessed(final ResourceAspectResourceAspectProperties _self_, final Resource _self) {
  }
  
  protected static void _privk3_isExited(final ResourceAspectResourceAspectProperties _self_, final Resource _self) {
    ResourceAspect.checkSchedulabilityResource(_self);
  }
  
  protected static void _privk3_clean(final ResourceAspectResourceAspectProperties _self_, final Resource _self) {
    ResourceAspect.currentData(_self, "");
  }
  
  protected static void _privk3_checkSchedulabilityResource(final ResourceAspectResourceAspectProperties _self_, final Resource _self) {
    String _name = _self.getName();
    String _plus = ("Checking schedulability for " + _name);
    String _plus_1 = (_plus + "...");
    InputOutput.<String>println(_plus_1);
    EList<Actor> _actor = _self.getActor();
    List<Actor> actors = new ArrayList<Actor>(_actor);
    Collections.<Actor>sort(actors, new Comparator<Actor>() {
      @Override
      public int compare(final Actor o1, final Actor o2) {
        Integer _isPriority = ActorAspect.isPriority(o2);
        Integer _isPriority_1 = ActorAspect.isPriority(o1);
        return ((_isPriority).intValue() - (_isPriority_1).intValue());
      }
    });
    float acc = 0.0f;
    for (final Actor actor : actors) {
      boolean _hasFinishedTaskForPeriod = ActorAspect.hasFinishedTaskForPeriod(actor);
      boolean _not = (!_hasFinishedTaskForPeriod);
      if (_not) {
        float realProcessTime = ActorAspect.computeProcessTime(actor);
        int _periodTime = actor.getPeriodTime();
        float _divide = (((float) realProcessTime) / ((float) _periodTime));
        float _plus_2 = (acc + ((float) _divide));
        acc = _plus_2;
      }
    }
    if ((acc > 1.0f)) {
      throw new RuntimeException(("The system seems not to be schedulable: " + Float.valueOf(acc)));
    } else {
      double _bound = ResourceAspect.getBound(_self);
      boolean _lessEqualsThan = (acc <= _bound);
      if (_lessEqualsThan) {
      } else {
        if (((1 <= acc) && (acc < ResourceAspect.getBound(_self)))) {
        }
      }
    }
    InputOutput.<String>println(("Score: " + Float.valueOf(acc)));
  }
  
  protected static double _privk3_getBound(final ResourceAspectResourceAspectProperties _self_, final Resource _self) {
    final double n = _self.getActor().size();
    double _pow = Math.pow(2.0d, (1 / n));
    double _minus = (_pow - 1);
    return (n * _minus);
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
