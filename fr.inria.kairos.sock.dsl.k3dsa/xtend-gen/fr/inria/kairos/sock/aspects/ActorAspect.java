package fr.inria.kairos.sock.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.SynchroField;
import fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties;
import fr.inria.kairos.sock.aspects.NamedElementAspect;
import fr.inria.kairos.sock.aspects.ResourceAspect;
import fr.inria.kairos.sock.dsl.model.sock.Actor;
import fr.inria.kairos.sock.dsl.model.sock.Resource;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Actor.class)
@SuppressWarnings("all")
public class ActorAspect extends NamedElementAspect {
  public static void run(final Actor _self, final String message) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void run(String)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_run(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self,message);
    };
  }
  
  public static void time(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void time()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_time(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
  }
  
  public static void idle(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void idle()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_idle(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
  }
  
  @ReplaceAspectMethod
  public static void request(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void request()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_request(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
  }
  
  @ReplaceAspectMethod
  public static void enterIn(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void enterIn()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_enterIn(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
  }
  
  @ReplaceAspectMethod
  public static void exitOf(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exitOf()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_exitOf(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
  }
  
  @ReplaceAspectMethod
  public static void process(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void process()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_process(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
  }
  
  public static boolean checkPriority(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean checkPriority()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	result = fr.inria.kairos.sock.aspects.ActorAspect._privk3_checkPriority(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
    return (boolean)result;
  }
  
  public static void periodStart(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void periodStart()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_periodStart(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
  }
  
  public static Integer actorTimeIndex(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer actorTimeIndex()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	result = fr.inria.kairos.sock.aspects.ActorAspect._privk3_actorTimeIndex(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
    return (java.lang.Integer)result;
  }
  
  public static void actorTimeIndex(final Actor _self, final Integer actorTimeIndex) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void actorTimeIndex(Integer)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_actorTimeIndex(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self,actorTimeIndex);
    };
  }
  
  public static String secret(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String secret()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	result = fr.inria.kairos.sock.aspects.ActorAspect._privk3_secret(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
    return (java.lang.String)result;
  }
  
  public static void secret(final Actor _self, final String secret) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void secret(String)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_secret(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self,secret);
    };
  }
  
  public static Integer currentProcessTime(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer currentProcessTime()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	result = fr.inria.kairos.sock.aspects.ActorAspect._privk3_currentProcessTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
    return (java.lang.Integer)result;
  }
  
  public static void currentProcessTime(final Actor _self, final Integer currentProcessTime) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentProcessTime(Integer)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_currentProcessTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self,currentProcessTime);
    };
  }
  
  @SynchroField
  public static Integer isPriority(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer isPriority()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	result = fr.inria.kairos.sock.aspects.ActorAspect._privk3_isPriority(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
    return (java.lang.Integer)result;
  }
  
  @SynchroField
  public static void isPriority(final Actor _self, final Integer isPriority) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isPriority(Integer)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_isPriority(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self,isPriority);
    };
  }
  
  @SynchroField
  public static Integer processTime(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer processTime()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	result = fr.inria.kairos.sock.aspects.ActorAspect._privk3_processTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
    return (java.lang.Integer)result;
  }
  
  @SynchroField
  public static void processTime(final Actor _self, final Integer processTime) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void processTime(Integer)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_processTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self,processTime);
    };
  }
  
  @SynchroField
  public static Integer periodTime(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer periodTime()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	result = fr.inria.kairos.sock.aspects.ActorAspect._privk3_periodTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
    return (java.lang.Integer)result;
  }
  
  @SynchroField
  public static void periodTime(final Actor _self, final Integer periodTime) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void periodTime(Integer)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_periodTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self,periodTime);
    };
  }
  
  protected static void _privk3_run(final ActorAspectActorAspectProperties _self_, final Actor _self, final String message) {
    Integer _actorTimeIndex = ActorAspect.actorTimeIndex(_self);
    String _plus = ("[" + _actorTimeIndex);
    String _plus_1 = (_plus + "] ");
    String _plus_2 = (_plus_1 + message);
    InputOutput.<String>println(_plus_2);
    ActorAspect.time(_self);
  }
  
  protected static void _privk3_time(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    Integer _actorTimeIndex = ActorAspect.actorTimeIndex(_self);
    int _plus = ((_actorTimeIndex).intValue() + 1);
    ActorAspect.actorTimeIndex(_self, Integer.valueOf(_plus));
  }
  
  protected static void _privk3_idle(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    ActorAspect.time(_self);
  }
  
  protected static void _privk3_request(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    String _name = _self.getName();
    String _plus = (_name + " requests ");
    String _name_1 = _self.getResource().getName();
    String _plus_1 = (_plus + _name_1);
    ActorAspect.run(_self, _plus_1);
  }
  
  protected static void _privk3_enterIn(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    String _name = _self.getName();
    String _plus = (_name + " enters in ");
    String _name_1 = _self.getResource().getName();
    String _plus_1 = (_plus + _name_1);
    ActorAspect.run(_self, _plus_1);
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
  }
  
  protected static void _privk3_exitOf(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    String _name = _self.getName();
    String _plus = (_name + " exits of ");
    String _name_1 = _self.getResource().getName();
    String _plus_1 = (_plus + _name_1);
    ActorAspect.run(_self, _plus_1);
    ResourceAspect.isExited(_self.getResource());
  }
  
  protected static void _privk3_process(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    Integer _currentProcessTime = ActorAspect.currentProcessTime(_self);
    int _plus = ((_currentProcessTime).intValue() + 1);
    ActorAspect.currentProcessTime(_self, Integer.valueOf(_plus));
    String _name = _self.getName();
    String _plus_1 = (_name + " processes (");
    Integer _currentProcessTime_1 = ActorAspect.currentProcessTime(_self);
    String _plus_2 = (_plus_1 + _currentProcessTime_1);
    String _plus_3 = (_plus_2 + "/");
    int _processTime = _self.getProcessTime();
    String _plus_4 = (_plus_3 + Integer.valueOf(_processTime));
    String _plus_5 = (_plus_4 + ") {");
    String _name_1 = _self.getResource().getName();
    String _plus_6 = (_plus_5 + _name_1);
    String _plus_7 = (_plus_6 + "}");
    ActorAspect.run(_self, _plus_7);
    ResourceAspect.isProcessed(_self.getResource());
  }
  
  protected static boolean _privk3_checkPriority(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    int _isPriority = _self.getIsPriority();
    return (_isPriority == 1);
  }
  
  protected static void _privk3_periodStart(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    String _name = _self.getName();
    String _plus = ("period of " + _name);
    String _plus_1 = (_plus + " starts");
    ActorAspect.run(_self, _plus_1);
  }
  
  protected static Integer _privk3_actorTimeIndex(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getActorTimeIndex") &&
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
    return _self_.actorTimeIndex;
  }
  
  protected static void _privk3_actorTimeIndex(final ActorAspectActorAspectProperties _self_, final Actor _self, final Integer actorTimeIndex) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setActorTimeIndex")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, actorTimeIndex);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.actorTimeIndex = actorTimeIndex;
    }
  }
  
  protected static String _privk3_secret(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getSecret") &&
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
    return _self_.secret;
  }
  
  protected static void _privk3_secret(final ActorAspectActorAspectProperties _self_, final Actor _self, final String secret) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setSecret")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, secret);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.secret = secret;
    }
  }
  
  protected static Integer _privk3_currentProcessTime(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentProcessTime") &&
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
    return _self_.currentProcessTime;
  }
  
  protected static void _privk3_currentProcessTime(final ActorAspectActorAspectProperties _self_, final Actor _self, final Integer currentProcessTime) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentProcessTime")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentProcessTime);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentProcessTime = currentProcessTime;
    }
  }
  
  protected static Integer _privk3_isPriority(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getIsPriority") &&
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
    return _self_.isPriority;
  }
  
  protected static void _privk3_isPriority(final ActorAspectActorAspectProperties _self_, final Actor _self, final Integer isPriority) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIsPriority")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, isPriority);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.isPriority = isPriority;
    }
  }
  
  protected static Integer _privk3_processTime(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getProcessTime") &&
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
    return _self_.processTime;
  }
  
  protected static void _privk3_processTime(final ActorAspectActorAspectProperties _self_, final Actor _self, final Integer processTime) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setProcessTime")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, processTime);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.processTime = processTime;
    }
  }
  
  protected static Integer _privk3_periodTime(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getPeriodTime") &&
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
    return _self_.periodTime;
  }
  
  protected static void _privk3_periodTime(final ActorAspectActorAspectProperties _self_, final Actor _self, final Integer periodTime) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setPeriodTime")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, periodTime);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.periodTime = periodTime;
    }
  }
}
