package fr.inria.kairos.sock.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.kairos.sock.aspects.ActorAspect;
import fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectProperties;
import fr.inria.kairos.sock.aspects.NamedElementAspect;
import fr.inria.kairos.sock.dsl.model.sock.Actor;
import fr.inria.kairos.sock.dsl.model.sock.IotSystem;
import fr.inria.kairos.sock.dsl.model.sock.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = IotSystem.class)
@SuppressWarnings("all")
public class IotSystemAspect extends NamedElementAspect {
  public static void time(final IotSystem _self) {
    final fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectProperties _self_ = fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void time()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.IotSystem){
    	fr.inria.kairos.sock.aspects.IotSystemAspect._privk3_time(_self_, (fr.inria.kairos.sock.dsl.model.sock.IotSystem)_self);
    };
  }
  
  @Main
  public static void main(final IotSystem _self) {
    final fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectProperties _self_ = fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void main()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.IotSystem){
    	fr.inria.kairos.sock.aspects.IotSystemAspect._privk3_main(_self_, (fr.inria.kairos.sock.dsl.model.sock.IotSystem)_self);
    };
  }
  
  public static void checkSchedulability(final IotSystem _self) {
    final fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectProperties _self_ = fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void checkSchedulability()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.IotSystem){
    	fr.inria.kairos.sock.aspects.IotSystemAspect._privk3_checkSchedulability(_self_, (fr.inria.kairos.sock.dsl.model.sock.IotSystem)_self);
    };
  }
  
  private static void checkSchedulabilityResource(final IotSystem _self, final Resource resource) {
    final fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectProperties _self_ = fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void checkSchedulabilityResource(Resource)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.IotSystem){
    	fr.inria.kairos.sock.aspects.IotSystemAspect._privk3_checkSchedulabilityResource(_self_, (fr.inria.kairos.sock.dsl.model.sock.IotSystem)_self,resource);
    };
  }
  
  private static Integer computeProcessTime(final IotSystem _self, final Actor actor) {
    final fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectProperties _self_ = fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer computeProcessTime(Actor)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.IotSystem){
    	result = fr.inria.kairos.sock.aspects.IotSystemAspect._privk3_computeProcessTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.IotSystem)_self,actor);
    };
    return (java.lang.Integer)result;
  }
  
  private static boolean schedulabilityChecked(final IotSystem _self) {
    final fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectProperties _self_ = fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean schedulabilityChecked()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.IotSystem){
    	result = fr.inria.kairos.sock.aspects.IotSystemAspect._privk3_schedulabilityChecked(_self_, (fr.inria.kairos.sock.dsl.model.sock.IotSystem)_self);
    };
    return (boolean)result;
  }
  
  private static void schedulabilityChecked(final IotSystem _self, final boolean schedulabilityChecked) {
    final fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectProperties _self_ = fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void schedulabilityChecked(boolean)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.IotSystem){
    	fr.inria.kairos.sock.aspects.IotSystemAspect._privk3_schedulabilityChecked(_self_, (fr.inria.kairos.sock.dsl.model.sock.IotSystem)_self,schedulabilityChecked);
    };
  }
  
  protected static void _privk3_time(final IotSystemAspectIotSystemAspectProperties _self_, final IotSystem _self) {
    boolean _schedulabilityChecked = IotSystemAspect.schedulabilityChecked(_self);
    boolean _not = (!_schedulabilityChecked);
    if (_not) {
      IotSystemAspect.checkSchedulability(_self);
      IotSystemAspect.schedulabilityChecked(_self, true);
    }
  }
  
  protected static void _privk3_main(final IotSystemAspectIotSystemAspectProperties _self_, final IotSystem _self) {
    EList<Actor> _ownedActor = _self.getOwnedActor();
    for (final Actor actor : _ownedActor) {
      {
        InputOutput.<String>println(actor.getName());
        actor.enterIn();
      }
    }
    final Integer index = Integer.valueOf(new Random(23L).nextInt(_self.getOwnedActor().size()));
    final Actor actor_1 = _self.getOwnedActor().get((index).intValue());
    actor_1.enterIn();
    for (Integer i = Integer.valueOf(0); (i.compareTo(ActorAspect.processTime(actor_1)) < 0); i++) {
      actor_1.process();
    }
    actor_1.exitOf();
    boolean _checkPriority = ActorAspect.checkPriority(actor_1);
    if (_checkPriority) {
      actor_1.getResource().clean();
    }
  }
  
  protected static void _privk3_checkSchedulability(final IotSystemAspectIotSystemAspectProperties _self_, final IotSystem _self) {
    EList<Resource> _ownedResource = _self.getOwnedResource();
    for (final Resource resource : _ownedResource) {
      IotSystemAspect.checkSchedulabilityResource(_self, resource);
    }
  }
  
  protected static void _privk3_checkSchedulabilityResource(final IotSystemAspectIotSystemAspectProperties _self_, final IotSystem _self, final Resource resource) {
    String _name = resource.getName();
    String _plus = ("Checking schedulability for " + _name);
    String _plus_1 = (_plus + "...");
    InputOutput.<String>println(_plus_1);
    EList<Actor> _actor = resource.getActor();
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
      {
        Integer realProcessTime = IotSystemAspect.computeProcessTime(_self, actor);
        int _periodTime = actor.getPeriodTime();
        float _divide = (((float) (realProcessTime).intValue()) / ((float) _periodTime));
        float _plus_2 = (acc + ((float) _divide));
        acc = _plus_2;
      }
    }
    if ((acc > 1.0f)) {
      throw new RuntimeException(("The system seems not to be schedulable: " + Float.valueOf(acc)));
    }
    InputOutput.<String>println(("Score: " + Float.valueOf(acc)));
  }
  
  protected static Integer _privk3_computeProcessTime(final IotSystemAspectIotSystemAspectProperties _self_, final IotSystem _self, final Actor actor) {
    boolean _checkPriority = ActorAspect.checkPriority(actor);
    if (_checkPriority) {
      int _processTime = actor.getProcessTime();
      return Integer.valueOf((_processTime + 2));
    } else {
      int _processTime_1 = actor.getProcessTime();
      return Integer.valueOf((_processTime_1 + 1));
    }
  }
  
  protected static boolean _privk3_schedulabilityChecked(final IotSystemAspectIotSystemAspectProperties _self_, final IotSystem _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isSchedulabilityChecked") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.schedulabilityChecked;
  }
  
  protected static void _privk3_schedulabilityChecked(final IotSystemAspectIotSystemAspectProperties _self_, final IotSystem _self, final boolean schedulabilityChecked) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setSchedulabilityChecked")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, schedulabilityChecked);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.schedulabilityChecked = schedulabilityChecked;
    }
  }
}
