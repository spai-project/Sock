/**
 */
package fr.inria.kairos.sock.dsl.model.sock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.sock.dsl.model.sock.Actor#getResource <em>Resource</em>}</li>
 *   <li>{@link fr.inria.kairos.sock.dsl.model.sock.Actor#getIsPriority <em>Is Priority</em>}</li>
 *   <li>{@link fr.inria.kairos.sock.dsl.model.sock.Actor#getProcessTime <em>Process Time</em>}</li>
 *   <li>{@link fr.inria.kairos.sock.dsl.model.sock.Actor#getPeriodTime <em>Period Time</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.sock.dsl.model.sock.SockPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.kairos.sock.dsl.model.sock.Resource#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see fr.inria.kairos.sock.dsl.model.sock.SockPackage#getActor_Resource()
	 * @see fr.inria.kairos.sock.dsl.model.sock.Resource#getActor
	 * @model opposite="actor"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.sock.dsl.model.sock.Actor#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Period Time</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Time</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Time</em>' attribute.
	 * @see #setPeriodTime(int)
	 * @see fr.inria.kairos.sock.dsl.model.sock.SockPackage#getActor_PeriodTime()
	 * @model default="10"
	 * @generated
	 */
	int getPeriodTime();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.sock.dsl.model.sock.Actor#getPeriodTime <em>Period Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Time</em>' attribute.
	 * @see #getPeriodTime()
	 * @generated
	 */
	void setPeriodTime(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enterIn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void exitOf();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void idle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void process();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void request();

	/**
	 * Returns the value of the '<em><b>Process Time</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Time</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Time</em>' attribute.
	 * @see #setProcessTime(int)
	 * @see fr.inria.kairos.sock.dsl.model.sock.SockPackage#getActor_ProcessTime()
	 * @model default="3"
	 * @generated
	 */
	int getProcessTime();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.sock.dsl.model.sock.Actor#getProcessTime <em>Process Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Time</em>' attribute.
	 * @see #getProcessTime()
	 * @generated
	 */
	void setProcessTime(int value);

	/**
	 * Returns the value of the '<em><b>Is Priority</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Priority</em>' attribute.
	 * @see #setIsPriority(int)
	 * @see fr.inria.kairos.sock.dsl.model.sock.SockPackage#getActor_IsPriority()
	 * @model default="0"
	 * @generated
	 */
	int getIsPriority();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.sock.dsl.model.sock.Actor#getIsPriority <em>Is Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Priority</em>' attribute.
	 * @see #getIsPriority()
	 * @generated
	 */
	void setIsPriority(int value);

} // Actor
