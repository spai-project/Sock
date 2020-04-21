package fr.inria.kairos.sock.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.kairos.sock.aspects.NamedElementAspect;
import fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties;
import fr.inria.kairos.sock.dsl.model.sock.Actor;
import fr.inria.kairos.sock.dsl.model.sock.Resource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Resource.class)
@SuppressWarnings("all")
public class ResourceAspect extends NamedElementAspect {
  public static void printInfo(final Resource _self) {
    final fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectProperties _self_ = fr.inria.kairos.sock.aspects.ResourceAspectResourceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void printInfo()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Resource){
    	fr.inria.kairos.sock.aspects.ResourceAspect._privk3_printInfo(_self_, (fr.inria.kairos.sock.dsl.model.sock.Resource)_self);
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
}
