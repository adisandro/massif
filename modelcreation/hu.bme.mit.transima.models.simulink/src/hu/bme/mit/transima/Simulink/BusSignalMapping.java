/**
 */
package hu.bme.mit.transima.Simulink;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Signal Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This EClass represents a signal mapping entry in the #{simulink.BusSelector} to define which signals are selected from a bus.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.transima.Simulink.BusSignalMapping#getSelector <em>Selector</em>}</li>
 *   <li>{@link hu.bme.mit.transima.Simulink.BusSignalMapping#getMappingFrom <em>Mapping From</em>}</li>
 *   <li>{@link hu.bme.mit.transima.Simulink.BusSignalMapping#getMappingTo <em>Mapping To</em>}</li>
 *   <li>{@link hu.bme.mit.transima.Simulink.BusSignalMapping#getMappingPath <em>Mapping Path</em>}</li>
 *   <li>{@link hu.bme.mit.transima.Simulink.BusSignalMapping#isIncomplete <em>Incomplete</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.transima.Simulink.SimulinkPackage#getBusSignalMapping()
 * @model
 * @generated
 */
public interface BusSignalMapping extends EObject {
    /**
     * Returns the value of the '<em><b>Selector</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link hu.bme.mit.transima.Simulink.BusSelector#getMappings <em>Mappings</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selector</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selector</em>' container reference.
     * @see #setSelector(BusSelector)
     * @see hu.bme.mit.transima.Simulink.SimulinkPackage#getBusSignalMapping_Selector()
     * @see hu.bme.mit.transima.Simulink.BusSelector#getMappings
     * @model opposite="mappings" transient="false"
     * @generated
     */
    BusSelector getSelector();

    /**
     * Sets the value of the '{@link hu.bme.mit.transima.Simulink.BusSignalMapping#getSelector <em>Selector</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selector</em>' container reference.
     * @see #getSelector()
     * @generated
     */
    void setSelector(BusSelector value);

    /**
     * Returns the value of the '<em><b>Mapping From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * b{Validation}
     *  * ERROR: Selected port is not an outport of a signal bundled in the bus
     *  * ERROR: Multiple mappings from the same outport
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mapping From</em>' reference.
     * @see #setMappingFrom(OutPort)
     * @see hu.bme.mit.transima.Simulink.SimulinkPackage#getBusSignalMapping_MappingFrom()
     * @model
     * @generated
     */
    OutPort getMappingFrom();

    /**
     * Sets the value of the '{@link hu.bme.mit.transima.Simulink.BusSignalMapping#getMappingFrom <em>Mapping From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mapping From</em>' reference.
     * @see #getMappingFrom()
     * @generated
     */
    void setMappingFrom(OutPort value);

    /**
     * Returns the value of the '<em><b>Mapping To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * b{Validation}
     *  * ERROR: Selected port is not an outport of selector
     *  * ERROR: Multiple mappings to the same outport
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mapping To</em>' reference.
     * @see #setMappingTo(OutPort)
     * @see hu.bme.mit.transima.Simulink.SimulinkPackage#getBusSignalMapping_MappingTo()
     * @model
     * @generated
     */
    OutPort getMappingTo();

    /**
     * Sets the value of the '{@link hu.bme.mit.transima.Simulink.BusSignalMapping#getMappingTo <em>Mapping To</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mapping To</em>' reference.
     * @see #getMappingTo()
     * @generated
     */
    void setMappingTo(OutPort value);

    /**
     * Returns the value of the '<em><b>Mapping Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mapping Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mapping Path</em>' attribute.
     * @see #setMappingPath(String)
     * @see hu.bme.mit.transima.Simulink.SimulinkPackage#getBusSignalMapping_MappingPath()
     * @model
     * @generated
     */
    String getMappingPath();

    /**
     * Sets the value of the '{@link hu.bme.mit.transima.Simulink.BusSignalMapping#getMappingPath <em>Mapping Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mapping Path</em>' attribute.
     * @see #getMappingPath()
     * @generated
     */
    void setMappingPath(String value);

    /**
     * Returns the value of the '<em><b>Incomplete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A true value indicates that the mappingFrom OutPort is not the real source of the selected signal, when the actual source is not part of the model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Incomplete</em>' attribute.
     * @see #setIncomplete(boolean)
     * @see hu.bme.mit.transima.Simulink.SimulinkPackage#getBusSignalMapping_Incomplete()
     * @model
     * @generated
     */
    boolean isIncomplete();

    /**
     * Sets the value of the '{@link hu.bme.mit.transima.Simulink.BusSignalMapping#isIncomplete <em>Incomplete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Incomplete</em>' attribute.
     * @see #isIncomplete()
     * @generated
     */
    void setIncomplete(boolean value);

} // BusSignalMapping
