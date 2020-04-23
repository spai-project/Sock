package fr.inria.kairos.sock.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.kairos.sock.aspects.NamedElementAspect;
import fr.inria.kairos.sock.dsl.model.sock.IotSystem;

@Aspect(className = IotSystem.class)
@SuppressWarnings("all")
public class IotSystemAspect extends NamedElementAspect {
}
