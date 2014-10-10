/**
 */
package hu.bme.mit.transima.FunctionalArchitecture;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.transima.FunctionalArchitecture.FunctionalArchitectureModelPackage
 * @generated
 */
public interface FunctionalArchitectureModelFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    FunctionalArchitectureModelFactory eINSTANCE = hu.bme.mit.transima.FunctionalArchitecture.impl.FunctionalArchitectureModelFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Function</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Function</em>'.
     * @generated
     */
    Function createFunction();

    /**
     * Returns a new object of class '<em>Information Link</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Information Link</em>'.
     * @generated
     */
    InformationLink createInformationLink();

    /**
     * Returns a new object of class '<em>Functional Architecture Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Functional Architecture Model</em>'.
     * @generated
     */
    FunctionalArchitectureModel createFunctionalArchitectureModel();

    /**
     * Returns a new object of class '<em>FAM Sensor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>FAM Sensor</em>'.
     * @generated
     */
    FAMSensor createFAMSensor();

    /**
     * Returns a new object of class '<em>FAM Actuator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>FAM Actuator</em>'.
     * @generated
     */
    FAMActuator createFAMActuator();

    /**
     * Returns a new object of class '<em>FAM Terminator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>FAM Terminator</em>'.
     * @generated
     */
    FAMTerminator createFAMTerminator();

    /**
     * Returns a new object of class '<em>Functional Interface</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Functional Interface</em>'.
     * @generated
     */
    FunctionalInterface createFunctionalInterface();

    /**
     * Returns a new object of class '<em>Functional Input</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Functional Input</em>'.
     * @generated
     */
    FunctionalInput createFunctionalInput();

    /**
     * Returns a new object of class '<em>Functional Output</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Functional Output</em>'.
     * @generated
     */
    FunctionalOutput createFunctionalOutput();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    FunctionalArchitectureModelPackage getFunctionalArchitectureModelPackage();

} //FunctionalArchitectureModelFactory
