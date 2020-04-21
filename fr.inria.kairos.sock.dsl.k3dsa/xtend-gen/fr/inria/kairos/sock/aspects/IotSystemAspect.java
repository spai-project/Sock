package fr.inria.kairos.sock.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectProperties;
import fr.inria.kairos.sock.aspects.NamedElementAspect;
import fr.inria.kairos.sock.aspects.ResourceAspect;
import fr.inria.kairos.sock.dsl.model.sock.IotSystem;
import fr.inria.kairos.sock.dsl.model.sock.Resource;
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
  
  public static Integer timeIndex(final IotSystem _self) {
    final fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectProperties _self_ = fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer timeIndex()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.IotSystem){
    	result = fr.inria.kairos.sock.aspects.IotSystemAspect._privk3_timeIndex(_self_, (fr.inria.kairos.sock.dsl.model.sock.IotSystem)_self);
    };
    return (java.lang.Integer)result;
  }
  
  public static void timeIndex(final IotSystem _self, final Integer timeIndex) {
    final fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectProperties _self_ = fr.inria.kairos.sock.aspects.IotSystemAspectIotSystemAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void timeIndex(Integer)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.IotSystem){
    	fr.inria.kairos.sock.aspects.IotSystemAspect._privk3_timeIndex(_self_, (fr.inria.kairos.sock.dsl.model.sock.IotSystem)_self,timeIndex);
    };
  }
  
  protected static void _privk3_time(final IotSystemAspectIotSystemAspectProperties _self_, final IotSystem _self) {
    InputOutput.<Integer>println(IotSystemAspect.timeIndex(_self));
    Integer _timeIndex = IotSystemAspect.timeIndex(_self);
    int _plus = ((_timeIndex).intValue() + 1);
    IotSystemAspect.timeIndex(_self, Integer.valueOf(_plus));
  }
  
  protected static void _privk3_main(final IotSystemAspectIotSystemAspectProperties _self_, final IotSystem _self) {
    InputOutput.<String>println("Launching Sock for IoTSystem...");
    InputOutput.<String>println("The system is as follow: ");
    EList<Resource> _ownedResource = _self.getOwnedResource();
    for (final Resource r : _ownedResource) {
      ResourceAspect.printInfo(r);
    }
  }
  
  protected static Integer _privk3_timeIndex(final IotSystemAspectIotSystemAspectProperties _self_, final IotSystem _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTimeIndex") &&
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
    return _self_.timeIndex;
  }
  
  protected static void _privk3_timeIndex(final IotSystemAspectIotSystemAspectProperties _self_, final IotSystem _self, final Integer timeIndex) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTimeIndex")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, timeIndex);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.timeIndex = timeIndex;
    }
  }
}
