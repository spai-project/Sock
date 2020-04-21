/**
 */
package fr.inria.kairos.sock.dsl.model.sock.impl;

import fr.inria.kairos.sock.dsl.model.sock.Actor;
import fr.inria.kairos.sock.dsl.model.sock.Resource;
import fr.inria.kairos.sock.dsl.model.sock.SockPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.sock.dsl.model.sock.impl.ActorImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link fr.inria.kairos.sock.dsl.model.sock.impl.ActorImpl#getIsPriority <em>Is Priority</em>}</li>
 *   <li>{@link fr.inria.kairos.sock.dsl.model.sock.impl.ActorImpl#getProcessTime <em>Process Time</em>}</li>
 *   <li>{@link fr.inria.kairos.sock.dsl.model.sock.impl.ActorImpl#getPeriodTime <em>Period Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends NamedElementImpl implements Actor {
	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

	/**
	 * The default value of the '{@link #getIsPriority() <em>Is Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIsPriority() <em>Is Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPriority()
	 * @generated
	 * @ordered
	 */
	protected int isPriority = IS_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessTime() <em>Process Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessTime()
	 * @generated
	 * @ordered
	 */
	protected static final int PROCESS_TIME_EDEFAULT = 3;

	/**
	 * The cached value of the '{@link #getProcessTime() <em>Process Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessTime()
	 * @generated
	 * @ordered
	 */
	protected int processTime = PROCESS_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriodTime() <em>Period Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodTime()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_TIME_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getPeriodTime() <em>Period Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodTime()
	 * @generated
	 * @ordered
	 */
	protected int periodTime = PERIOD_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SockPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject) resource;
			resource = (Resource) eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SockPackage.ACTOR__RESOURCE, oldResource,
							resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Resource newResource, NotificationChain msgs) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SockPackage.ACTOR__RESOURCE,
					oldResource, newResource);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject) resource).eInverseRemove(this, SockPackage.RESOURCE__ACTOR, Resource.class,
						msgs);
			if (newResource != null)
				msgs = ((InternalEObject) newResource).eInverseAdd(this, SockPackage.RESOURCE__ACTOR, Resource.class,
						msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SockPackage.ACTOR__RESOURCE, newResource,
					newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeriodTime() {
		return periodTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodTime(int newPeriodTime) {
		int oldPeriodTime = periodTime;
		periodTime = newPeriodTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SockPackage.ACTOR__PERIOD_TIME, oldPeriodTime,
					periodTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProcessTime() {
		return processTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessTime(int newProcessTime) {
		int oldProcessTime = processTime;
		processTime = newProcessTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SockPackage.ACTOR__PROCESS_TIME, oldProcessTime,
					processTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIsPriority() {
		return isPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPriority(int newIsPriority) {
		int oldIsPriority = isPriority;
		isPriority = newIsPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SockPackage.ACTOR__IS_PRIORITY, oldIsPriority,
					isPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SockPackage.ACTOR__RESOURCE:
			if (resource != null)
				msgs = ((InternalEObject) resource).eInverseRemove(this, SockPackage.RESOURCE__ACTOR, Resource.class,
						msgs);
			return basicSetResource((Resource) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SockPackage.ACTOR__RESOURCE:
			return basicSetResource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SockPackage.ACTOR__RESOURCE:
			if (resolve)
				return getResource();
			return basicGetResource();
		case SockPackage.ACTOR__IS_PRIORITY:
			return getIsPriority();
		case SockPackage.ACTOR__PROCESS_TIME:
			return getProcessTime();
		case SockPackage.ACTOR__PERIOD_TIME:
			return getPeriodTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SockPackage.ACTOR__RESOURCE:
			setResource((Resource) newValue);
			return;
		case SockPackage.ACTOR__IS_PRIORITY:
			setIsPriority((Integer) newValue);
			return;
		case SockPackage.ACTOR__PROCESS_TIME:
			setProcessTime((Integer) newValue);
			return;
		case SockPackage.ACTOR__PERIOD_TIME:
			setPeriodTime((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SockPackage.ACTOR__RESOURCE:
			setResource((Resource) null);
			return;
		case SockPackage.ACTOR__IS_PRIORITY:
			setIsPriority(IS_PRIORITY_EDEFAULT);
			return;
		case SockPackage.ACTOR__PROCESS_TIME:
			setProcessTime(PROCESS_TIME_EDEFAULT);
			return;
		case SockPackage.ACTOR__PERIOD_TIME:
			setPeriodTime(PERIOD_TIME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SockPackage.ACTOR__RESOURCE:
			return resource != null;
		case SockPackage.ACTOR__IS_PRIORITY:
			return isPriority != IS_PRIORITY_EDEFAULT;
		case SockPackage.ACTOR__PROCESS_TIME:
			return processTime != PROCESS_TIME_EDEFAULT;
		case SockPackage.ACTOR__PERIOD_TIME:
			return periodTime != PERIOD_TIME_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isPriority: ");
		result.append(isPriority);
		result.append(", processTime: ");
		result.append(processTime);
		result.append(", periodTime: ");
		result.append(periodTime);
		result.append(')');
		return result.toString();
	}

} //ActorImpl
