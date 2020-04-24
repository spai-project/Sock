/**
 */
package fr.inria.kairos.sock.dsl.model.sock;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see fr.inria.kairos.sock.dsl.model.sock.SockFactory
 * @model kind="package"
 * @generated
 */
public interface SockPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sock";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://kairos.inria.fr/sock";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sock";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SockPackage eINSTANCE = fr.inria.kairos.sock.dsl.model.sock.impl.SockPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.kairos.sock.dsl.model.sock.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.sock.dsl.model.sock.impl.NamedElementImpl
	 * @see fr.inria.kairos.sock.dsl.model.sock.impl.SockPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.sock.dsl.model.sock.impl.IotSystemImpl <em>Iot System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.sock.dsl.model.sock.impl.IotSystemImpl
	 * @see fr.inria.kairos.sock.dsl.model.sock.impl.SockPackageImpl#getIotSystem()
	 * @generated
	 */
	int IOT_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_SYSTEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Actor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_SYSTEM__OWNED_ACTOR = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_SYSTEM__OWNED_RESOURCE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Iot System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_SYSTEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_SYSTEM___TIME = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iot System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_SYSTEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.sock.dsl.model.sock.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.sock.dsl.model.sock.impl.ResourceImpl
	 * @see fr.inria.kairos.sock.dsl.model.sock.impl.SockPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ACTOR = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Clean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___CLEAN = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Idle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___IDLE = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.sock.dsl.model.sock.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.sock.dsl.model.sock.impl.ActorImpl
	 * @see fr.inria.kairos.sock.dsl.model.sock.impl.SockPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__RESOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IS_PRIORITY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Process Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PROCESS_TIME = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Period Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PERIOD_TIME = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Enter In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___ENTER_IN = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Exit Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___EXIT_OF = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Idle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___IDLE = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___PROCESS = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___REQUEST = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.sock.dsl.model.sock.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.inria.kairos.sock.dsl.model.sock.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.sock.dsl.model.sock.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.kairos.sock.dsl.model.sock.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.sock.dsl.model.sock.IotSystem <em>Iot System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iot System</em>'.
	 * @see fr.inria.kairos.sock.dsl.model.sock.IotSystem
	 * @generated
	 */
	EClass getIotSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.sock.dsl.model.sock.IotSystem#getOwnedActor <em>Owned Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Actor</em>'.
	 * @see fr.inria.kairos.sock.dsl.model.sock.IotSystem#getOwnedActor()
	 * @see #getIotSystem()
	 * @generated
	 */
	EReference getIotSystem_OwnedActor();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.sock.dsl.model.sock.IotSystem#getOwnedResource <em>Owned Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Resource</em>'.
	 * @see fr.inria.kairos.sock.dsl.model.sock.IotSystem#getOwnedResource()
	 * @see #getIotSystem()
	 * @generated
	 */
	EReference getIotSystem_OwnedResource();

	/**
	 * Returns the meta object for the '{@link fr.inria.kairos.sock.dsl.model.sock.IotSystem#time() <em>Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Time</em>' operation.
	 * @see fr.inria.kairos.sock.dsl.model.sock.IotSystem#time()
	 * @generated
	 */
	EOperation getIotSystem__Time();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.sock.dsl.model.sock.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see fr.inria.kairos.sock.dsl.model.sock.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.kairos.sock.dsl.model.sock.Resource#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actor</em>'.
	 * @see fr.inria.kairos.sock.dsl.model.sock.Resource#getActor()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Actor();

	/**
	 * Returns the meta object for the '{@link fr.inria.kairos.sock.dsl.model.sock.Resource#clean() <em>Clean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clean</em>' operation.
	 * @see fr.inria.kairos.sock.dsl.model.sock.Resource#clean()
	 * @generated
	 */
	EOperation getResource__Clean();

	/**
	 * Returns the meta object for the '{@link fr.inria.kairos.sock.dsl.model.sock.Resource#idle() <em>Idle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Idle</em>' operation.
	 * @see fr.inria.kairos.sock.dsl.model.sock.Resource#idle()
	 * @generated
	 */
	EOperation getResource__Idle();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.sock.dsl.model.sock.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see fr.inria.kairos.sock.dsl.model.sock.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.kairos.sock.dsl.model.sock.Actor#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see fr.inria.kairos.sock.dsl.model.sock.Actor#getResource()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Resource();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.sock.dsl.model.sock.Actor#getPeriodTime <em>Period Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period Time</em>'.
	 * @see fr.inria.kairos.sock.dsl.model.sock.Actor#getPeriodTime()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_PeriodTime();

	/**
	 * Returns the meta object for the '{@link fr.inria.kairos.sock.dsl.model.sock.Actor#enterIn() <em>Enter In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enter In</em>' operation.
	 * @see fr.inria.kairos.sock.dsl.model.sock.Actor#enterIn()
	 * @generated
	 */
	EOperation getActor__EnterIn();

	/**
	 * Returns the meta object for the '{@link fr.inria.kairos.sock.dsl.model.sock.Actor#exitOf() <em>Exit Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exit Of</em>' operation.
	 * @see fr.inria.kairos.sock.dsl.model.sock.Actor#exitOf()
	 * @generated
	 */
	EOperation getActor__ExitOf();

	/**
	 * Returns the meta object for the '{@link fr.inria.kairos.sock.dsl.model.sock.Actor#idle() <em>Idle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Idle</em>' operation.
	 * @see fr.inria.kairos.sock.dsl.model.sock.Actor#idle()
	 * @generated
	 */
	EOperation getActor__Idle();

	/**
	 * Returns the meta object for the '{@link fr.inria.kairos.sock.dsl.model.sock.Actor#process() <em>Process</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Process</em>' operation.
	 * @see fr.inria.kairos.sock.dsl.model.sock.Actor#process()
	 * @generated
	 */
	EOperation getActor__Process();

	/**
	 * Returns the meta object for the '{@link fr.inria.kairos.sock.dsl.model.sock.Actor#request() <em>Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Request</em>' operation.
	 * @see fr.inria.kairos.sock.dsl.model.sock.Actor#request()
	 * @generated
	 */
	EOperation getActor__Request();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.sock.dsl.model.sock.Actor#getProcessTime <em>Process Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Time</em>'.
	 * @see fr.inria.kairos.sock.dsl.model.sock.Actor#getProcessTime()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_ProcessTime();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.sock.dsl.model.sock.Actor#getIsPriority <em>Is Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Priority</em>'.
	 * @see fr.inria.kairos.sock.dsl.model.sock.Actor#getIsPriority()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_IsPriority();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SockFactory getSockFactory();

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
		 * The meta object literal for the '{@link fr.inria.kairos.sock.dsl.model.sock.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.sock.dsl.model.sock.impl.NamedElementImpl
		 * @see fr.inria.kairos.sock.dsl.model.sock.impl.SockPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.sock.dsl.model.sock.impl.IotSystemImpl <em>Iot System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.sock.dsl.model.sock.impl.IotSystemImpl
		 * @see fr.inria.kairos.sock.dsl.model.sock.impl.SockPackageImpl#getIotSystem()
		 * @generated
		 */
		EClass IOT_SYSTEM = eINSTANCE.getIotSystem();

		/**
		 * The meta object literal for the '<em><b>Owned Actor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOT_SYSTEM__OWNED_ACTOR = eINSTANCE.getIotSystem_OwnedActor();

		/**
		 * The meta object literal for the '<em><b>Owned Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOT_SYSTEM__OWNED_RESOURCE = eINSTANCE.getIotSystem_OwnedResource();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IOT_SYSTEM___TIME = eINSTANCE.getIotSystem__Time();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.sock.dsl.model.sock.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.sock.dsl.model.sock.impl.ResourceImpl
		 * @see fr.inria.kairos.sock.dsl.model.sock.impl.SockPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__ACTOR = eINSTANCE.getResource_Actor();

		/**
		 * The meta object literal for the '<em><b>Clean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE___CLEAN = eINSTANCE.getResource__Clean();

		/**
		 * The meta object literal for the '<em><b>Idle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE___IDLE = eINSTANCE.getResource__Idle();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.sock.dsl.model.sock.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.sock.dsl.model.sock.impl.ActorImpl
		 * @see fr.inria.kairos.sock.dsl.model.sock.impl.SockPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__RESOURCE = eINSTANCE.getActor_Resource();

		/**
		 * The meta object literal for the '<em><b>Period Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__PERIOD_TIME = eINSTANCE.getActor_PeriodTime();

		/**
		 * The meta object literal for the '<em><b>Enter In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTOR___ENTER_IN = eINSTANCE.getActor__EnterIn();

		/**
		 * The meta object literal for the '<em><b>Exit Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTOR___EXIT_OF = eINSTANCE.getActor__ExitOf();

		/**
		 * The meta object literal for the '<em><b>Idle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTOR___IDLE = eINSTANCE.getActor__Idle();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTOR___PROCESS = eINSTANCE.getActor__Process();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTOR___REQUEST = eINSTANCE.getActor__Request();

		/**
		 * The meta object literal for the '<em><b>Process Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__PROCESS_TIME = eINSTANCE.getActor_ProcessTime();

		/**
		 * The meta object literal for the '<em><b>Is Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__IS_PRIORITY = eINSTANCE.getActor_IsPriority();

	}

} //SockPackage
