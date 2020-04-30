/**
 */
package fr.inria.kairos.sock.dsl.model.sock.exp_attacks;

import fr.inria.kairos.sock.dsl.model.sock.SockPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.kairos.sock.dsl.model.sock.exp_attacks.Exp_attacksFactory
 * @model kind="package"
 * @generated
 */
public interface Exp_attacksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "exp_attacks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://kairos.inria.fr/sock/exp_attacks";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "exp_attacks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Exp_attacksPackage eINSTANCE = fr.inria.kairos.sock.dsl.model.sock.exp_attacks.impl.Exp_attacksPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.kairos.sock.dsl.model.sock.exp_attacks.impl.MaliciousActorImpl <em>Malicious Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.sock.dsl.model.sock.exp_attacks.impl.MaliciousActorImpl
	 * @see fr.inria.kairos.sock.dsl.model.sock.exp_attacks.impl.Exp_attacksPackageImpl#getMaliciousActor()
	 * @generated
	 */
	int MALICIOUS_ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALICIOUS_ACTOR__NAME = SockPackage.ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALICIOUS_ACTOR__RESOURCE = SockPackage.ACTOR__RESOURCE;

	/**
	 * The feature id for the '<em><b>Is Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALICIOUS_ACTOR__IS_PRIORITY = SockPackage.ACTOR__IS_PRIORITY;

	/**
	 * The feature id for the '<em><b>Process Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALICIOUS_ACTOR__PROCESS_TIME = SockPackage.ACTOR__PROCESS_TIME;

	/**
	 * The feature id for the '<em><b>Period Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALICIOUS_ACTOR__PERIOD_TIME = SockPackage.ACTOR__PERIOD_TIME;

	/**
	 * The number of structural features of the '<em>Malicious Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALICIOUS_ACTOR_FEATURE_COUNT = SockPackage.ACTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Enter In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALICIOUS_ACTOR___ENTER_IN = SockPackage.ACTOR___ENTER_IN;

	/**
	 * The operation id for the '<em>Exit Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALICIOUS_ACTOR___EXIT_OF = SockPackage.ACTOR___EXIT_OF;

	/**
	 * The operation id for the '<em>Idle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALICIOUS_ACTOR___IDLE = SockPackage.ACTOR___IDLE;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALICIOUS_ACTOR___PROCESS = SockPackage.ACTOR___PROCESS;

	/**
	 * The operation id for the '<em>Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALICIOUS_ACTOR___REQUEST = SockPackage.ACTOR___REQUEST;

	/**
	 * The operation id for the '<em>Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALICIOUS_ACTOR___READY = SockPackage.ACTOR___READY;

	/**
	 * The number of operations of the '<em>Malicious Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALICIOUS_ACTOR_OPERATION_COUNT = SockPackage.ACTOR_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.sock.dsl.model.sock.exp_attacks.MaliciousActor <em>Malicious Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Malicious Actor</em>'.
	 * @see fr.inria.kairos.sock.dsl.model.sock.exp_attacks.MaliciousActor
	 * @generated
	 */
	EClass getMaliciousActor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Exp_attacksFactory getExp_attacksFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.kairos.sock.dsl.model.sock.exp_attacks.impl.MaliciousActorImpl <em>Malicious Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.sock.dsl.model.sock.exp_attacks.impl.MaliciousActorImpl
		 * @see fr.inria.kairos.sock.dsl.model.sock.exp_attacks.impl.Exp_attacksPackageImpl#getMaliciousActor()
		 * @generated
		 */
		EClass MALICIOUS_ACTOR = eINSTANCE.getMaliciousActor();

	}

} //Exp_attacksPackage
