package fr.inria.kairos.sock.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectProperties;
import fr.inria.kairos.sock.aspects.NamedElementAspect;
import fr.inria.kairos.sock.dsl.model.sock.IotSystem;

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
  
  protected static void _privk3_time(final IotSystemAspectIotSystemAspectProperties _self_, final IotSystem _self) {
  }
}
