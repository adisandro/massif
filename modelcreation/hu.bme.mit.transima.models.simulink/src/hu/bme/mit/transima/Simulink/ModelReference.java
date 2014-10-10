/**
 */
package hu.bme.mit.transima.Simulink;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This EClass represents a #{simulink.SimulinkModel} included as a block in this model.
 * 
 * See @{http://www.mathworks.com/help/simulink/slref/model.html}
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.transima.Simulink.ModelReference#getReferencedModel <em>Referenced Model</em>}</li>
 *   <li>{@link hu.bme.mit.transima.Simulink.ModelReference#getModelRef <em>Model Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.transima.Simulink.SimulinkPackage#getModelReference()
 * @model
 * @generated
 */
public interface ModelReference extends Block {
    /**
     * Returns the value of the '<em><b>Referenced Model</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The value of the reference is computed by finding the model with the same name and qualifier as stored in the modelRef.
     * 
     * b{Validation}
     *  * WARN: Cannot find model specified by model reference.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Referenced Model</em>' reference.
     * @see hu.bme.mit.transima.Simulink.SimulinkPackage#getModelReference_ReferencedModel()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="org.eclipse.viatra2.emf.incquery.derived.feature patternFQN='hu.bme.mit.transima.models.simulink.derived.referencedModel'"
     *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='hu.bme.mit.transima.models.simulink.derived.referencedModel'"
     * @generated
     */
    SimulinkModel getReferencedModel();

    /**
     * Returns the value of the '<em><b>Model Ref</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model Ref</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model Ref</em>' containment reference.
     * @see #setModelRef(IdentifierReference)
     * @see hu.bme.mit.transima.Simulink.SimulinkPackage#getModelReference_ModelRef()
     * @model containment="true"
     * @generated
     */
    IdentifierReference getModelRef();

    /**
     * Sets the value of the '{@link hu.bme.mit.transima.Simulink.ModelReference#getModelRef <em>Model Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model Ref</em>' containment reference.
     * @see #getModelRef()
     * @generated
     */
    void setModelRef(IdentifierReference value);

} // ModelReference
