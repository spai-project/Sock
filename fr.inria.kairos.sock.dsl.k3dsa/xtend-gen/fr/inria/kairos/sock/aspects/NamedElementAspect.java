package fr.inria.kairos.sock.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.kairos.sock.aspects.NamedElementAspectNamedElementAspectProperties;
import fr.inria.kairos.sock.dsl.model.sock.NamedElement;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = NamedElement.class)
@SuppressWarnings("all")
public abstract class NamedElementAspect {
  protected static void run(final NamedElement _self, final String message) {
    final fr.inria.kairos.sock.aspects.NamedElementAspectNamedElementAspectProperties _self_ = fr.inria.kairos.sock.aspects.NamedElementAspectNamedElementAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void run(String)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.NamedElement){
    	fr.inria.kairos.sock.aspects.NamedElementAspect._privk3_run(_self_, (fr.inria.kairos.sock.dsl.model.sock.NamedElement)_self,message);
    };
  }
  
  protected static void time(final NamedElement _self) {
    final fr.inria.kairos.sock.aspects.NamedElementAspectNamedElementAspectProperties _self_ = fr.inria.kairos.sock.aspects.NamedElementAspectNamedElementAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void time()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.NamedElement){
    	fr.inria.kairos.sock.aspects.NamedElementAspect._privk3_time(_self_, (fr.inria.kairos.sock.dsl.model.sock.NamedElement)_self);
    };
  }
  
  public static void idle(final NamedElement _self) {
    final fr.inria.kairos.sock.aspects.NamedElementAspectNamedElementAspectProperties _self_ = fr.inria.kairos.sock.aspects.NamedElementAspectNamedElementAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void idle()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.NamedElement){
    	fr.inria.kairos.sock.aspects.NamedElementAspect._privk3_idle(_self_, (fr.inria.kairos.sock.dsl.model.sock.NamedElement)_self);
    };
  }
  
  protected static Integer timeIndex(final NamedElement _self) {
    final fr.inria.kairos.sock.aspects.NamedElementAspectNamedElementAspectProperties _self_ = fr.inria.kairos.sock.aspects.NamedElementAspectNamedElementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer timeIndex()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.NamedElement){
    	result = fr.inria.kairos.sock.aspects.NamedElementAspect._privk3_timeIndex(_self_, (fr.inria.kairos.sock.dsl.model.sock.NamedElement)_self);
    };
    return (java.lang.Integer)result;
  }
  
  protected static void timeIndex(final NamedElement _self, final Integer timeIndex) {
    final fr.inria.kairos.sock.aspects.NamedElementAspectNamedElementAspectProperties _self_ = fr.inria.kairos.sock.aspects.NamedElementAspectNamedElementAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void timeIndex(Integer)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.NamedElement){
    	fr.inria.kairos.sock.aspects.NamedElementAspect._privk3_timeIndex(_self_, (fr.inria.kairos.sock.dsl.model.sock.NamedElement)_self,timeIndex);
    };
  }
  
  protected static void _privk3_run(final NamedElementAspectNamedElementAspectProperties _self_, final NamedElement _self, final String message) {
    Integer _timeIndex = NamedElementAspect.timeIndex(_self);
    String _plus = ("[" + _timeIndex);
    String _plus_1 = (_plus + "] ");
    String _plus_2 = (_plus_1 + message);
    InputOutput.<String>println(_plus_2);
    NamedElementAspect.time(_self);
  }
  
  protected static void _privk3_time(final NamedElementAspectNamedElementAspectProperties _self_, final NamedElement _self) {
    Integer _timeIndex = NamedElementAspect.timeIndex(_self);
    int _plus = ((_timeIndex).intValue() + 1);
    NamedElementAspect.timeIndex(_self, Integer.valueOf(_plus));
  }
  
  protected static void _privk3_idle(final NamedElementAspectNamedElementAspectProperties _self_, final NamedElement _self) {
    NamedElementAspect.time(_self);
  }
  
  protected static Integer _privk3_timeIndex(final NamedElementAspectNamedElementAspectProperties _self_, final NamedElement _self) {
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
  
  protected static void _privk3_timeIndex(final NamedElementAspectNamedElementAspectProperties _self_, final NamedElement _self, final Integer timeIndex) {
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
