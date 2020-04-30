/**
 */
package fr.inria.kairos.sock.dsl.model.sock.exp_attacks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.kairos.sock.dsl.model.sock.exp_attacks.Exp_attacksPackage
 * @generated
 */
public interface Exp_attacksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Exp_attacksFactory eINSTANCE = fr.inria.kairos.sock.dsl.model.sock.exp_attacks.impl.Exp_attacksFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Malicious Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Malicious Actor</em>'.
	 * @generated
	 */
	MaliciousActor createMaliciousActor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Exp_attacksPackage getExp_attacksPackage();

} //Exp_attacksFactory
