package fr.inria.kairos.sock.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.SynchroField;
import fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties;
import fr.inria.kairos.sock.aspects.NamedElementAspect;
import fr.inria.kairos.sock.aspects.ResourceAspect;
import fr.inria.kairos.sock.dsl.model.sock.Actor;
import fr.inria.kairos.sock.dsl.model.sock.IotSystem;
import fr.inria.kairos.sock.dsl.model.sock.Resource;
import java.io.File;
import java.io.FileWriter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Actor.class)
@SuppressWarnings("all")
public class ActorAspect extends NamedElementAspect {
  @ReplaceAspectMethod
  public static void ready(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void ready()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_ready(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
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
    	// BeginInjectInto fr.inria.kairos.sock.aspects.ActorAspect#void enterIn() from fr.inria.kairos.sock.aspects.MaliciousActorAspect
    		if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.exp_attacks.MaliciousActor){
    			fr.inria.kairos.sock.aspects.MaliciousActorAspect.enterIn((fr.inria.kairos.sock.dsl.model.sock.exp_attacks.MaliciousActor)_self);
    		} else
    		// EndInjectInto fr.inria.kairos.sock.aspects.ActorAspect#void enterIn() from fr.inria.kairos.sock.aspects.MaliciousActorAspect
    // #DispatchPointCut_before# void enterIn()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_enterIn(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
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
  
  @ReplaceAspectMethod
  public static void exitOf(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exitOf()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_exitOf(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
  }
  
  @ReplaceAspectMethod
  public static void idle(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void idle()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_idle(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
  }
  
  public static void createIfDoesNotExists(final Actor _self, final String path) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void createIfDoesNotExists(String)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_createIfDoesNotExists(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self,path);
    };
  }
  
  public static void initFolder(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initFolder()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_initFolder(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
  }
  
  public static void write(final Actor _self, final String action) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void write(String)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_write(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self,action);
    };
  }
  
  public static float computeProcessTime(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# float computeProcessTime()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	result = fr.inria.kairos.sock.aspects.ActorAspect._privk3_computeProcessTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
    return (float)result;
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
  
  public static String folder(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String folder()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	result = fr.inria.kairos.sock.aspects.ActorAspect._privk3_folder(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
    return (java.lang.String)result;
  }
  
  public static String subFolder(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String subFolder()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	result = fr.inria.kairos.sock.aspects.ActorAspect._privk3_subFolder(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
    return (java.lang.String)result;
  }
  
  public static void subFolder(final Actor _self, final String subFolder) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void subFolder(String)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_subFolder(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self,subFolder);
    };
  }
  
  public static boolean hasFinishedTaskForPeriod(final Actor _self) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean hasFinishedTaskForPeriod()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	result = fr.inria.kairos.sock.aspects.ActorAspect._privk3_hasFinishedTaskForPeriod(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self);
    };
    return (boolean)result;
  }
  
  public static void hasFinishedTaskForPeriod(final Actor _self, final boolean hasFinishedTaskForPeriod) {
    final fr.inria.kairos.sock.aspects.ActorAspectActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.ActorAspectActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void hasFinishedTaskForPeriod(boolean)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.Actor){
    	fr.inria.kairos.sock.aspects.ActorAspect._privk3_hasFinishedTaskForPeriod(_self_, (fr.inria.kairos.sock.dsl.model.sock.Actor)_self,hasFinishedTaskForPeriod);
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
  
  protected static void _privk3_ready(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    String _name = _self.getName();
    String _plus = (_name + " is ready");
    ActorAspect.run(_self, _plus);
    ActorAspect.write(_self, "+");
    ActorAspect.hasFinishedTaskForPeriod(_self, false);
  }
  
  protected static void _privk3_request(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    ActorAspect.initFolder(_self);
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
    ActorAspect.write(_self, "1");
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
  
  protected static void _privk3_exitOf(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    String _name = _self.getName();
    String _plus = (_name + " exits of ");
    String _name_1 = _self.getResource().getName();
    String _plus_1 = (_plus + _name_1);
    ActorAspect.run(_self, _plus_1);
    ResourceAspect.isExited(_self.getResource());
    ActorAspect.write(_self, "0");
    ActorAspect.hasFinishedTaskForPeriod(_self, true);
  }
  
  protected static void _privk3_idle(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    ActorAspect.time(_self);
  }
  
  protected static void _privk3_createIfDoesNotExists(final ActorAspectActorAspectProperties _self_, final Actor _self, final String path) {
    final File fd = new File(path);
    boolean _exists = fd.exists();
    boolean _not = (!_exists);
    if (_not) {
      fd.mkdir();
    }
  }
  
  protected static void _privk3_initFolder(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    ActorAspect.createIfDoesNotExists(_self, ActorAspect.folder(_self));
    boolean _isEmpty = ActorAspect.subFolder(_self).isEmpty();
    if (_isEmpty) {
      EObject _eContainer = _self.eContainer();
      String _name = ((IotSystem) _eContainer).getName();
      String _plus = (_name + "/");
      ActorAspect.subFolder(_self, _plus);
    }
    String _folder = ActorAspect.folder(_self);
    String _subFolder = ActorAspect.subFolder(_self);
    String _plus_1 = (_folder + _subFolder);
    ActorAspect.createIfDoesNotExists(_self, _plus_1);
  }
  
  protected static void _privk3_write(final ActorAspectActorAspectProperties _self_, final Actor _self, final String action) {
    try {
      String _folder = ActorAspect.folder(_self);
      String _subFolder = ActorAspect.subFolder(_self);
      String _plus = (_folder + _subFolder);
      String _name = _self.getName();
      String _plus_1 = (_plus + _name);
      final FileWriter writer = new FileWriter(_plus_1, true);
      Integer _actorTimeIndex = ActorAspect.actorTimeIndex(_self);
      String _plus_2 = (_actorTimeIndex + " ");
      String _plus_3 = (_plus_2 + action);
      String _plus_4 = (_plus_3 + "\n");
      writer.write(_plus_4);
      writer.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static float _privk3_computeProcessTime(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    boolean _checkPriority = ActorAspect.checkPriority(_self);
    if (_checkPriority) {
      int _processTime = _self.getProcessTime();
      return (_processTime + 2);
    } else {
      int _processTime_1 = _self.getProcessTime();
      return (_processTime_1 + 1);
    }
  }
  
  protected static boolean _privk3_checkPriority(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    int _isPriority = _self.getIsPriority();
    return (_isPriority == 1);
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
  
  protected static String _privk3_folder(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getFolder") &&
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
    return _self_.folder;
  }
  
  protected static String _privk3_subFolder(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getSubFolder") &&
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
    return _self_.subFolder;
  }
  
  protected static void _privk3_subFolder(final ActorAspectActorAspectProperties _self_, final Actor _self, final String subFolder) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setSubFolder")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, subFolder);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.subFolder = subFolder;
    }
  }
  
  protected static boolean _privk3_hasFinishedTaskForPeriod(final ActorAspectActorAspectProperties _self_, final Actor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isHasFinishedTaskForPeriod") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.hasFinishedTaskForPeriod;
  }
  
  protected static void _privk3_hasFinishedTaskForPeriod(final ActorAspectActorAspectProperties _self_, final Actor _self, final boolean hasFinishedTaskForPeriod) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setHasFinishedTaskForPeriod")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, hasFinishedTaskForPeriod);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.hasFinishedTaskForPeriod = hasFinishedTaskForPeriod;
    }
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
}
