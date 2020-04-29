package fr.inria.kairos.sock.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.kairos.sock.aspects.ActorAspect;
import fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties;
import fr.inria.kairos.sock.aspects.ResourceAspect;
import fr.inria.kairos.sock.dsl.model.sock.MaliciousActor;
import fr.inria.kairos.sock.dsl.model.sock.Resource;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = MaliciousActor.class)
@SuppressWarnings("all")
public class MaliciousActorAspect extends ActorAspect {
  @ReplaceAspectMethod
  public static void enterIn(final MaliciousActor _self) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void enterIn()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_enterIn(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self);
    };
  }
  
  public static void stealSensibleInformationFromResource(final MaliciousActor _self) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void stealSensibleInformationFromResource()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_stealSensibleInformationFromResource(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self);
    };
  }
  
  protected static void _privk3_enterIn(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self) {
    String _name = _self.getName();
    String _plus = (_name + " enters in ");
    String _name_1 = _self.getResource().getName();
    String _plus_1 = (_plus + _name_1);
    ActorAspect.run(_self, _plus_1);
    MaliciousActorAspect.stealSensibleInformationFromResource(_self);
    Integer _currentProcessTime = ActorAspect.currentProcessTime(_self);
    int _processTime = _self.getProcessTime();
    boolean _equals = ((_currentProcessTime).intValue() == _processTime);
    if (_equals) {
      ActorAspect.currentProcessTime(_self, Integer.valueOf(0));
    }
    Resource _resource = _self.getResource();
    String _name_2 = _self.getName();
    String _plus_2 = (_name_2 + " ");
    String _secret = ActorAspect.secret(_self);
    String _plus_3 = (_plus_2 + _secret);
    ResourceAspect.isEntered(_resource, _self, _plus_3);
    ActorAspect.write(_self, "1");
  }
  
  protected static void _privk3_stealSensibleInformationFromResource(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self) {
    Integer _lastActorPriority = ResourceAspect.lastActorPriority(_self.getResource());
    boolean _equals = ((_lastActorPriority).intValue() == 1);
    if (_equals) {
      String _currentData = ResourceAspect.currentData(_self.getResource());
      boolean _notEquals = (!Objects.equal(_currentData, ""));
      if (_notEquals) {
        String _name = _self.getName();
        String _plus = ("WARNING: The resource " + _name);
        String _plus_1 = (_plus + " may have leak the following secret:");
        InputOutput.<String>println(_plus_1);
        InputOutput.<String>println(ResourceAspect.currentData(_self.getResource()));
      }
    }
  }
}
