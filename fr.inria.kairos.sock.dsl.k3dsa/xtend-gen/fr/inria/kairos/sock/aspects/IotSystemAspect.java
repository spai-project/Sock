package fr.inria.kairos.sock.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
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
  
  public static void checkSchedulability(final IotSystem _self) {
    final fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectProperties _self_ = fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void checkSchedulability()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.IotSystem){
    	fr.inria.kairos.sock.aspects.IotSystemAspect._privk3_checkSchedulability(_self_, (fr.inria.kairos.sock.dsl.model.sock.IotSystem)_self);
    };
  }
  
  public static void checkSchedulabilityResource(final IotSystem _self, final Resource resource) {
    final fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectProperties _self_ = fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void checkSchedulabilityResource(Resource)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.IotSystem){
    	fr.inria.kairos.sock.aspects.IotSystemAspect._privk3_checkSchedulabilityResource(_self_, (fr.inria.kairos.sock.dsl.model.sock.IotSystem)_self,resource);
    };
  }
  
  public static Integer computeProcessTime(final IotSystem _self, final Actor actor) {
    final fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectProperties _self_ = fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer computeProcessTime(Actor)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.IotSystem){
    	result = fr.inria.kairos.sock.aspects.IotSystemAspect._privk3_computeProcessTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.IotSystem)_self,actor);
    };
    return (java.lang.Integer)result;
  }
  
  protected static void _privk3_time(final IotSystemAspectIotSystemAspectProperties _self_, final IotSystem _self) {
    IotSystemAspect.checkSchedulability(_self);
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
}
