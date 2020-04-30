/**
 */
package fr.inria.kairos.sock.dsl.model.sock.exp_attacks.impl;

import fr.inria.kairos.sock.dsl.model.sock.exp_attacks.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Exp_attacksFactoryImpl extends EFactoryImpl implements Exp_attacksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Exp_attacksFactory init() {
		try {
			Exp_attacksFactory theExp_attacksFactory = (Exp_attacksFactory) EPackage.Registry.INSTANCE
					.getEFactory(Exp_attacksPackage.eNS_URI);
			if (theExp_attacksFactory != null) {
				return theExp_attacksFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Exp_attacksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exp_attacksFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Exp_attacksPackage.MALICIOUS_ACTOR:
			return createMaliciousActor();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaliciousActor createMaliciousActor() {
		MaliciousActorImpl maliciousActor = new MaliciousActorImpl();
		return maliciousActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exp_attacksPackage getExp_attacksPackage() {
		return (Exp_attacksPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Exp_attacksPackage getPackage() {
		return Exp_attacksPackage.eINSTANCE;
	}

} //Exp_attacksFactoryImpl
