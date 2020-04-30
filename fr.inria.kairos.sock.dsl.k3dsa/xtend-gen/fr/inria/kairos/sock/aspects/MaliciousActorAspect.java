package fr.inria.kairos.sock.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.SynchroField;
import fr.inria.kairos.sock.aspects.ActorAspect;
import fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties;
import fr.inria.kairos.sock.aspects.ResourceAspect;
import fr.inria.kairos.sock.dsl.model.sock.IotSystem;
import fr.inria.kairos.sock.dsl.model.sock.MaliciousActor;
import fr.inria.kairos.sock.dsl.model.sock.Resource;
import java.io.File;
import java.io.FileWriter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = MaliciousActor.class)
@SuppressWarnings("all")
public class MaliciousActorAspect extends ActorAspect {
  @ReplaceAspectMethod
  public static void ready(final MaliciousActor _self) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void ready()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_ready(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self);
    };
  }
  
  @ReplaceAspectMethod
  public static void request(final MaliciousActor _self) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void request()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_request(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self);
    };
  }
  
  @ReplaceAspectMethod
  public static void enterIn(final MaliciousActor _self) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void enterIn()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_enterIn(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self);
    };
  }
  
  @ReplaceAspectMethod
  public static void process(final MaliciousActor _self) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void process()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_process(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self);
    };
  }
  
  @ReplaceAspectMethod
  public static void exitOf(final MaliciousActor _self) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exitOf()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_exitOf(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self);
    };
  }
  
  @ReplaceAspectMethod
  public static void idle(final MaliciousActor _self) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void idle()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_idle(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self);
    };
  }
  
  public static void createIfDoesNotExists(final MaliciousActor _self, final String path) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void createIfDoesNotExists(String)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_createIfDoesNotExists(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self,path);
    };
  }
  
  public static void initFolder(final MaliciousActor _self) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initFolder()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_initFolder(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self);
    };
  }
  
  public static void write(final MaliciousActor _self, final String action) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void write(String)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_write(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self,action);
    };
  }
  
  public static boolean checkPriority(final MaliciousActor _self) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean checkPriority()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	result = fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_checkPriority(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self);
    };
    return (boolean)result;
  }
  
  public static void stealSensibleInformationFromResource(final MaliciousActor _self) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void stealSensibleInformationFromResource()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_stealSensibleInformationFromResource(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self);
    };
  }
  
  public static void run(final MaliciousActor _self, final String message) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void run(String)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_run(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self,message);
    };
  }
  
  public static void time(final MaliciousActor _self) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void time()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_time(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self);
    };
  }
  
  @SynchroField
  public static Integer isPriority(final MaliciousActor _self) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer isPriority()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	result = fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_isPriority(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self);
    };
    return (java.lang.Integer)result;
  }
  
  @SynchroField
  public static void isPriority(final MaliciousActor _self, final Integer isPriority) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isPriority(Integer)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_isPriority(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self,isPriority);
    };
  }
  
  @SynchroField
  public static Integer processTime(final MaliciousActor _self) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer processTime()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	result = fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_processTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self);
    };
    return (java.lang.Integer)result;
  }
  
  @SynchroField
  public static void processTime(final MaliciousActor _self, final Integer processTime) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void processTime(Integer)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_processTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self,processTime);
    };
  }
  
  @SynchroField
  public static Integer periodTime(final MaliciousActor _self) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer periodTime()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	result = fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_periodTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self);
    };
    return (java.lang.Integer)result;
  }
  
  @SynchroField
  public static void periodTime(final MaliciousActor _self, final Integer periodTime) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void periodTime(Integer)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_periodTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self,periodTime);
    };
  }
  
  public static String secret(final MaliciousActor _self) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String secret()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	result = fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_secret(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self);
    };
    return (java.lang.String)result;
  }
  
  public static void secret(final MaliciousActor _self, final String secret) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void secret(String)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_secret(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self,secret);
    };
  }
  
  public static Integer currentProcessTime(final MaliciousActor _self) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer currentProcessTime()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	result = fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_currentProcessTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self);
    };
    return (java.lang.Integer)result;
  }
  
  public static void currentProcessTime(final MaliciousActor _self, final Integer currentProcessTime) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentProcessTime(Integer)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_currentProcessTime(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self,currentProcessTime);
    };
  }
  
  public static String folder(final MaliciousActor _self) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String folder()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	result = fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_folder(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self);
    };
    return (java.lang.String)result;
  }
  
  public static String subFolder(final MaliciousActor _self) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String subFolder()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	result = fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_subFolder(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self);
    };
    return (java.lang.String)result;
  }
  
  public static void subFolder(final MaliciousActor _self, final String subFolder) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void subFolder(String)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_subFolder(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self,subFolder);
    };
  }
  
  public static Integer actorTimeIndex(final MaliciousActor _self) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer actorTimeIndex()
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	result = fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_actorTimeIndex(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self);
    };
    return (java.lang.Integer)result;
  }
  
  public static void actorTimeIndex(final MaliciousActor _self, final Integer actorTimeIndex) {
    final fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectProperties _self_ = fr.inria.kairos.sock.aspects.MaliciousActorAspectMaliciousActorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void actorTimeIndex(Integer)
    if (_self instanceof fr.inria.kairos.sock.dsl.model.sock.MaliciousActor){
    	fr.inria.kairos.sock.aspects.MaliciousActorAspect._privk3_actorTimeIndex(_self_, (fr.inria.kairos.sock.dsl.model.sock.MaliciousActor)_self,actorTimeIndex);
    };
  }
  
  protected static void _privk3_ready(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self) {
    String _name = _self.getName();
    String _plus = (_name + " is ready");
    MaliciousActorAspect.run(_self, _plus);
    MaliciousActorAspect.write(_self, "+");
  }
  
  protected static void _privk3_request(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self) {
    MaliciousActorAspect.initFolder(_self);
    String _name = _self.getName();
    String _plus = (_name + " requests ");
    String _name_1 = _self.getResource().getName();
    String _plus_1 = (_plus + _name_1);
    MaliciousActorAspect.run(_self, _plus_1);
  }
  
  protected static void _privk3_enterIn(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self) {
    String _name = _self.getName();
    String _plus = (_name + " enters in ");
    String _name_1 = _self.getResource().getName();
    String _plus_1 = (_plus + _name_1);
    MaliciousActorAspect.run(_self, _plus_1);
    Integer _currentProcessTime = MaliciousActorAspect.currentProcessTime(_self);
    int _processTime = _self.getProcessTime();
    boolean _equals = ((_currentProcessTime).intValue() == _processTime);
    if (_equals) {
      MaliciousActorAspect.currentProcessTime(_self, Integer.valueOf(0));
    }
    Resource _resource = _self.getResource();
    String _name_2 = _self.getName();
    String _plus_2 = (_name_2 + " ");
    String _secret = MaliciousActorAspect.secret(_self);
    String _plus_3 = (_plus_2 + _secret);
    ResourceAspect.isEntered(_resource, _self, _plus_3);
    MaliciousActorAspect.write(_self, "1");
  }
  
  protected static void _privk3_process(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self) {
    Integer _currentProcessTime = MaliciousActorAspect.currentProcessTime(_self);
    int _plus = ((_currentProcessTime).intValue() + 1);
    MaliciousActorAspect.currentProcessTime(_self, Integer.valueOf(_plus));
    String _name = _self.getName();
    String _plus_1 = (_name + " processes (");
    Integer _currentProcessTime_1 = MaliciousActorAspect.currentProcessTime(_self);
    String _plus_2 = (_plus_1 + _currentProcessTime_1);
    String _plus_3 = (_plus_2 + "/");
    int _processTime = _self.getProcessTime();
    String _plus_4 = (_plus_3 + Integer.valueOf(_processTime));
    String _plus_5 = (_plus_4 + ") {");
    String _name_1 = _self.getResource().getName();
    String _plus_6 = (_plus_5 + _name_1);
    String _plus_7 = (_plus_6 + "}");
    MaliciousActorAspect.run(_self, _plus_7);
    ResourceAspect.isProcessed(_self.getResource());
  }
  
  protected static void _privk3_exitOf(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self) {
    String _name = _self.getName();
    String _plus = (_name + " exits of ");
    String _name_1 = _self.getResource().getName();
    String _plus_1 = (_plus + _name_1);
    MaliciousActorAspect.run(_self, _plus_1);
    ResourceAspect.isExited(_self.getResource());
    MaliciousActorAspect.write(_self, "0");
  }
  
  protected static void _privk3_idle(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self) {
    MaliciousActorAspect.time(_self);
  }
  
  protected static void _privk3_createIfDoesNotExists(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self, final String path) {
    final File fd = new File(path);
    boolean _exists = fd.exists();
    boolean _not = (!_exists);
    if (_not) {
      fd.mkdir();
    }
  }
  
  protected static void _privk3_initFolder(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self) {
    MaliciousActorAspect.createIfDoesNotExists(_self, MaliciousActorAspect.folder(_self));
    boolean _isEmpty = MaliciousActorAspect.subFolder(_self).isEmpty();
    if (_isEmpty) {
      EObject _eContainer = _self.eContainer();
      String _name = ((IotSystem) _eContainer).getName();
      String _plus = (_name + "/");
      MaliciousActorAspect.subFolder(_self, _plus);
    }
    String _folder = MaliciousActorAspect.folder(_self);
    String _subFolder = MaliciousActorAspect.subFolder(_self);
    String _plus_1 = (_folder + _subFolder);
    MaliciousActorAspect.createIfDoesNotExists(_self, _plus_1);
  }
  
  protected static void _privk3_write(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self, final String action) {
    try {
      String _folder = MaliciousActorAspect.folder(_self);
      String _subFolder = MaliciousActorAspect.subFolder(_self);
      String _plus = (_folder + _subFolder);
      String _name = _self.getName();
      String _plus_1 = (_plus + _name);
      final FileWriter writer = new FileWriter(_plus_1, true);
      Integer _actorTimeIndex = MaliciousActorAspect.actorTimeIndex(_self);
      String _plus_2 = (_actorTimeIndex + " ");
      String _plus_3 = (_plus_2 + action);
      String _plus_4 = (_plus_3 + "\n");
      writer.write(_plus_4);
      writer.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static boolean _privk3_checkPriority(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self) {
    int _isPriority = _self.getIsPriority();
    return (_isPriority == 1);
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
  
  protected static void _privk3_run(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self, final String message) {
    Integer _actorTimeIndex = MaliciousActorAspect.actorTimeIndex(_self);
    String _plus = ("[" + _actorTimeIndex);
    String _plus_1 = (_plus + "] ");
    String _plus_2 = (_plus_1 + message);
    InputOutput.<String>println(_plus_2);
    MaliciousActorAspect.time(_self);
  }
  
  protected static void _privk3_time(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self) {
    Integer _actorTimeIndex = MaliciousActorAspect.actorTimeIndex(_self);
    int _plus = ((_actorTimeIndex).intValue() + 1);
    MaliciousActorAspect.actorTimeIndex(_self, Integer.valueOf(_plus));
  }
  
  protected static Integer _privk3_isPriority(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self) {
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
  
  protected static void _privk3_isPriority(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self, final Integer isPriority) {
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
  
  protected static Integer _privk3_processTime(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self) {
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
  
  protected static void _privk3_processTime(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self, final Integer processTime) {
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
  
  protected static Integer _privk3_periodTime(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self) {
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
  
  protected static void _privk3_periodTime(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self, final Integer periodTime) {
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
  
  protected static String _privk3_secret(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self) {
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
  
  protected static void _privk3_secret(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self, final String secret) {
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
  
  protected static Integer _privk3_currentProcessTime(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self) {
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
  
  protected static void _privk3_currentProcessTime(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self, final Integer currentProcessTime) {
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
  
  protected static String _privk3_folder(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self) {
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
  
  protected static String _privk3_subFolder(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self) {
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
  
  protected static void _privk3_subFolder(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self, final String subFolder) {
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
  
  protected static Integer _privk3_actorTimeIndex(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self) {
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
  
  protected static void _privk3_actorTimeIndex(final MaliciousActorAspectMaliciousActorAspectProperties _self_, final MaliciousActor _self, final Integer actorTimeIndex) {
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
