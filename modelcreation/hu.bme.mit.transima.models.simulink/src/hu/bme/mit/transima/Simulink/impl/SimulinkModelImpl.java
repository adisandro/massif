/**
 */
package hu.bme.mit.transima.Simulink.impl;

import hu.bme.mit.transima.Simulink.Block;
import hu.bme.mit.transima.Simulink.SimulinkModel;
import hu.bme.mit.transima.Simulink.SimulinkPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.transima.Simulink.impl.SimulinkModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link hu.bme.mit.transima.Simulink.impl.SimulinkModelImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link hu.bme.mit.transima.Simulink.impl.SimulinkModelImpl#getFile <em>File</em>}</li>
 *   <li>{@link hu.bme.mit.transima.Simulink.impl.SimulinkModelImpl#isLibrary <em>Library</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimulinkModelImpl extends SimulinkElementImpl implements SimulinkModel {
    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final String VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected String version = VERSION_EDEFAULT;

    /**
     * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContains()
     * @generated
     * @ordered
     */
    protected EList<Block> contains;

    /**
     * The default value of the '{@link #getFile() <em>File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFile()
     * @generated
     * @ordered
     */
    protected static final String FILE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFile()
     * @generated
     * @ordered
     */
    protected String file = FILE_EDEFAULT;

    /**
     * The default value of the '{@link #isLibrary() <em>Library</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isLibrary()
     * @generated
     * @ordered
     */
	protected static final boolean LIBRARY_EDEFAULT = false;

				/**
     * The cached value of the '{@link #isLibrary() <em>Library</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isLibrary()
     * @generated
     * @ordered
     */
	protected boolean library = LIBRARY_EDEFAULT;

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SimulinkModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SimulinkPackage.Literals.SIMULINK_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(String newVersion) {
        String oldVersion = version;
        version = newVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.SIMULINK_MODEL__VERSION, oldVersion, version));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Block> getContains() {
        if (contains == null) {
            contains = new EObjectContainmentEList<Block>(Block.class, this, SimulinkPackage.SIMULINK_MODEL__CONTAINS);
        }
        return contains;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFile() {
        return file;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFile(String newFile) {
        String oldFile = file;
        file = newFile;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.SIMULINK_MODEL__FILE, oldFile, file));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isLibrary() {
        return library;
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLibrary(boolean newLibrary) {
        boolean oldLibrary = library;
        library = newLibrary;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.SIMULINK_MODEL__LIBRARY, oldLibrary, library));
    }

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SimulinkPackage.SIMULINK_MODEL__CONTAINS:
                return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
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
            case SimulinkPackage.SIMULINK_MODEL__VERSION:
                return getVersion();
            case SimulinkPackage.SIMULINK_MODEL__CONTAINS:
                return getContains();
            case SimulinkPackage.SIMULINK_MODEL__FILE:
                return getFile();
            case SimulinkPackage.SIMULINK_MODEL__LIBRARY:
                return isLibrary();
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
            case SimulinkPackage.SIMULINK_MODEL__VERSION:
                setVersion((String)newValue);
                return;
            case SimulinkPackage.SIMULINK_MODEL__CONTAINS:
                getContains().clear();
                getContains().addAll((Collection<? extends Block>)newValue);
                return;
            case SimulinkPackage.SIMULINK_MODEL__FILE:
                setFile((String)newValue);
                return;
            case SimulinkPackage.SIMULINK_MODEL__LIBRARY:
                setLibrary((Boolean)newValue);
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
            case SimulinkPackage.SIMULINK_MODEL__VERSION:
                setVersion(VERSION_EDEFAULT);
                return;
            case SimulinkPackage.SIMULINK_MODEL__CONTAINS:
                getContains().clear();
                return;
            case SimulinkPackage.SIMULINK_MODEL__FILE:
                setFile(FILE_EDEFAULT);
                return;
            case SimulinkPackage.SIMULINK_MODEL__LIBRARY:
                setLibrary(LIBRARY_EDEFAULT);
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
            case SimulinkPackage.SIMULINK_MODEL__VERSION:
                return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
            case SimulinkPackage.SIMULINK_MODEL__CONTAINS:
                return contains != null && !contains.isEmpty();
            case SimulinkPackage.SIMULINK_MODEL__FILE:
                return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
            case SimulinkPackage.SIMULINK_MODEL__LIBRARY:
                return library != LIBRARY_EDEFAULT;
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
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (version: ");
        result.append(version);
        result.append(", file: ");
        result.append(file);
        result.append(", library: ");
        result.append(library);
        result.append(')');
        return result.toString();
    }

} //SimulinkModelImpl
