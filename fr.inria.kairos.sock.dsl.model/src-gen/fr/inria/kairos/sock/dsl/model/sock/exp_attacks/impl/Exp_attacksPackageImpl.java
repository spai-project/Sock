/**
 */
package fr.inria.kairos.sock.dsl.model.sock.exp_attacks.impl;

import fr.inria.kairos.sock.dsl.model.sock.SockPackage;

import fr.inria.kairos.sock.dsl.model.sock.exp_attacks.Exp_attacksFactory;
import fr.inria.kairos.sock.dsl.model.sock.exp_attacks.Exp_attacksPackage;
import fr.inria.kairos.sock.dsl.model.sock.exp_attacks.MaliciousActor;

import fr.inria.kairos.sock.dsl.model.sock.impl.SockPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Exp_attacksPackageImpl extends EPackageImpl implements Exp_attacksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maliciousActorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.inria.kairos.sock.dsl.model.sock.exp_attacks.Exp_attacksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Exp_attacksPackageImpl() {
		super(eNS_URI, Exp_attacksFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Exp_attacksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Exp_attacksPackage init() {
		if (isInited)
			return (Exp_attacksPackage) EPackage.Registry.INSTANCE.getEPackage(Exp_attacksPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredExp_attacksPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Exp_attacksPackageImpl theExp_attacksPackage = registeredExp_attacksPackage instanceof Exp_attacksPackageImpl
				? (Exp_attacksPackageImpl) registeredExp_attacksPackage
				: new Exp_attacksPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SockPackage.eNS_URI);
		SockPackageImpl theSockPackage = (SockPackageImpl) (registeredPackage instanceof SockPackageImpl
				? registeredPackage
				: SockPackage.eINSTANCE);

		// Create package meta-data objects
		theExp_attacksPackage.createPackageContents();
		theSockPackage.createPackageContents();

		// Initialize created meta-data
		theExp_attacksPackage.initializePackageContents();
		theSockPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExp_attacksPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Exp_attacksPackage.eNS_URI, theExp_attacksPackage);
		return theExp_attacksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaliciousActor() {
		return maliciousActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exp_attacksFactory getExp_attacksFactory() {
		return (Exp_attacksFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		maliciousActorEClass = createEClass(MALICIOUS_ACTOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SockPackage theSockPackage = (SockPackage) EPackage.Registry.INSTANCE.getEPackage(SockPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		maliciousActorEClass.getESuperTypes().add(theSockPackage.getActor());

		// Initialize classes, features, and operations; add parameters
		initEClass(maliciousActorEClass, MaliciousActor.class, "MaliciousActor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //Exp_attacksPackageImpl
