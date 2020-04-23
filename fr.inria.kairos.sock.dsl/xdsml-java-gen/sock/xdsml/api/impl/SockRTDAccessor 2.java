/* GENERATED FILE, do not modify manually                                                    *
 * If you need to modify it, copy it first */
package sock.xdsml.api.impl;
import org.eclipse.emf.ecore.EObject;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.lang.reflect.Method;
import org.eclipse.gemoc.executionframework.engine.commons.K3DslHelper;


public class SockRTDAccessor {
  public static java.lang.String getcurrentData(EObject eObject) {
		return (java.lang.String)  getAspectProperty(eObject, "fr.inria.kairos.sock.Sock", "fr.inria.kairos.sock.aspects.ResourceAspect", "currentData");
	}
	public static boolean setcurrentData(EObject eObject, java.lang.String newValue) {
		return setAspectProperty(eObject, "fr.inria.kairos.sock.Sock", "fr.inria.kairos.sock.aspects.ResourceAspect", "currentData", newValue);
	}
  public static java.lang.Integer getlastActorPriority(EObject eObject) {
		return (java.lang.Integer)  getAspectProperty(eObject, "fr.inria.kairos.sock.Sock", "fr.inria.kairos.sock.aspects.ResourceAspect", "lastActorPriority");
	}
	public static boolean setlastActorPriority(EObject eObject, java.lang.Integer newValue) {
		return setAspectProperty(eObject, "fr.inria.kairos.sock.Sock", "fr.inria.kairos.sock.aspects.ResourceAspect", "lastActorPriority", newValue);
	}
  public static java.lang.Integer gettimeIndex(EObject eObject) {
		return (java.lang.Integer)  getAspectProperty(eObject, "fr.inria.kairos.sock.Sock", "fr.inria.kairos.sock.aspects.ActorAspect", "timeIndex");
	}
	public static boolean settimeIndex(EObject eObject, java.lang.Integer newValue) {
		return setAspectProperty(eObject, "fr.inria.kairos.sock.Sock", "fr.inria.kairos.sock.aspects.ActorAspect", "timeIndex", newValue);
	}
  public static java.lang.String getsecret(EObject eObject) {
		return (java.lang.String)  getAspectProperty(eObject, "fr.inria.kairos.sock.Sock", "fr.inria.kairos.sock.aspects.ActorAspect", "secret");
	}
	public static boolean setsecret(EObject eObject, java.lang.String newValue) {
		return setAspectProperty(eObject, "fr.inria.kairos.sock.Sock", "fr.inria.kairos.sock.aspects.ActorAspect", "secret", newValue);
	}
  public static java.lang.Integer getcurrentProcessTime(EObject eObject) {
		return (java.lang.Integer)  getAspectProperty(eObject, "fr.inria.kairos.sock.Sock", "fr.inria.kairos.sock.aspects.ActorAspect", "currentProcessTime");
	}
	public static boolean setcurrentProcessTime(EObject eObject, java.lang.Integer newValue) {
		return setAspectProperty(eObject, "fr.inria.kairos.sock.Sock", "fr.inria.kairos.sock.aspects.ActorAspect", "currentProcessTime", newValue);
	}
  public static java.lang.Integer getisPriority(EObject eObject) {
		return (java.lang.Integer)  getAspectProperty(eObject, "fr.inria.kairos.sock.Sock", "fr.inria.kairos.sock.aspects.ActorAspect", "isPriority");
	}
	public static boolean setisPriority(EObject eObject, java.lang.Integer newValue) {
		return setAspectProperty(eObject, "fr.inria.kairos.sock.Sock", "fr.inria.kairos.sock.aspects.ActorAspect", "isPriority", newValue);
	}
  public static java.lang.Integer getprocessTime(EObject eObject) {
		return (java.lang.Integer)  getAspectProperty(eObject, "fr.inria.kairos.sock.Sock", "fr.inria.kairos.sock.aspects.ActorAspect", "processTime");
	}
	public static boolean setprocessTime(EObject eObject, java.lang.Integer newValue) {
		return setAspectProperty(eObject, "fr.inria.kairos.sock.Sock", "fr.inria.kairos.sock.aspects.ActorAspect", "processTime", newValue);
	}
  public static java.lang.Integer getperiodTime(EObject eObject) {
		return (java.lang.Integer)  getAspectProperty(eObject, "fr.inria.kairos.sock.Sock", "fr.inria.kairos.sock.aspects.ActorAspect", "periodTime");
	}
	public static boolean setperiodTime(EObject eObject, java.lang.Integer newValue) {
		return setAspectProperty(eObject, "fr.inria.kairos.sock.Sock", "fr.inria.kairos.sock.aspects.ActorAspect", "periodTime", newValue);
	}

public static Object getAspectProperty(EObject eObject, String languageName, String aspectName, String propertyName) {
			List<Class<?>> aspects = K3DslHelper.getAspectsOn(languageName, eObject.getClass());
			Class<?> aspect = null;
			for (Class<?> a : aspects) {
				try {
					if (Class.forName(aspectName).isAssignableFrom(a)) {
						aspect = a;
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
			if (aspect == null) {
				return null;
			}
			Object res = null;
			 try {
				res = aspect.getDeclaredMethod(propertyName, ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className()).invoke(eObject, eObject);
				if (res != null) {
				return res;
				}else {
					return null;
				}
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
			
			 return null;
		}
	
	
	public static boolean setAspectProperty(EObject eObject, String languageName, String aspectName, String propertyName, Object newValue) {
		List<Class<?>> aspects = K3DslHelper.getAspectsOn(languageName, eObject.getClass());
		Class<?> aspect = null;
		for (Class<?> a : aspects) {
			try {
				if (Class.forName(aspectName).isAssignableFrom(a)) {
					aspect = a;
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				return false;
			}
		}
		if (aspect == null) {
			return false;
		}
			 try {
				 aspect.getMethod(propertyName, ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className(), newValue.getClass()).invoke(eObject, eObject, newValue);
				return true;
				} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					Method m = null;
					for(Class<?> c : ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).getClass().getInterfaces()) {
						
						try {
							aspect.getMethod(propertyName, c, newValue.getClass()).invoke(eObject, eObject, newValue);
							return true;
						} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
						}
						if (m == null) {
							throw new RuntimeException("not method found for "+((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className()+"::set"+propertyName);
						}
					}
				}
			return false;
	}
};