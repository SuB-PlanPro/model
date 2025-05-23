/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Telegramm_ESG_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_System_Version_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.SRS_Version_TypeClass;

import org.eclipse.set.model.planpro.Verweise.ID_FT_Anschaltbedingung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DP Telegramm ESG Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DP_Telegramm_ESG_AttributeGroupImpl#getETCSSystemVersion <em>ETCS System Version</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DP_Telegramm_ESG_AttributeGroupImpl#getIDFachtelegramm <em>ID Fachtelegramm</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DP_Telegramm_ESG_AttributeGroupImpl#getIDFTAnschaltbedingungGeplant <em>IDFT Anschaltbedingung Geplant</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DP_Telegramm_ESG_AttributeGroupImpl#getIDFTAnschaltbedingungRealisiert <em>IDFT Anschaltbedingung Realisiert</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DP_Telegramm_ESG_AttributeGroupImpl#getSRSVersion <em>SRS Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DP_Telegramm_ESG_AttributeGroupImpl extends EObjectImpl implements DP_Telegramm_ESG_AttributeGroup {
	/**
	 * The cached value of the '{@link #getETCSSystemVersion() <em>ETCS System Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected ETCS_System_Version_TypeClass eTCSSystemVersion;

	/**
	 * The cached value of the '{@link #getIDFachtelegramm() <em>ID Fachtelegramm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFachtelegramm()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Fachtelegramm_TypeClass> iDFachtelegramm;

	/**
	 * The cached value of the '{@link #getIDFTAnschaltbedingungGeplant() <em>IDFT Anschaltbedingung Geplant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFTAnschaltbedingungGeplant()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_FT_Anschaltbedingung_TypeClass> iDFTAnschaltbedingungGeplant;

	/**
	 * The cached value of the '{@link #getIDFTAnschaltbedingungRealisiert() <em>IDFT Anschaltbedingung Realisiert</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFTAnschaltbedingungRealisiert()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_FT_Anschaltbedingung_TypeClass> iDFTAnschaltbedingungRealisiert;

	/**
	 * The cached value of the '{@link #getSRSVersion() <em>SRS Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSRSVersion()
	 * @generated
	 * @ordered
	 */
	protected SRS_Version_TypeClass sRSVersion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DP_Telegramm_ESG_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getDP_Telegramm_ESG_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_System_Version_TypeClass getETCSSystemVersion() {
		return eTCSSystemVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETCSSystemVersion(ETCS_System_Version_TypeClass newETCSSystemVersion, NotificationChain msgs) {
		ETCS_System_Version_TypeClass oldETCSSystemVersion = eTCSSystemVersion;
		eTCSSystemVersion = newETCSSystemVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__ETCS_SYSTEM_VERSION, oldETCSSystemVersion, newETCSSystemVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setETCSSystemVersion(ETCS_System_Version_TypeClass newETCSSystemVersion) {
		if (newETCSSystemVersion != eTCSSystemVersion) {
			NotificationChain msgs = null;
			if (eTCSSystemVersion != null)
				msgs = ((InternalEObject)eTCSSystemVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__ETCS_SYSTEM_VERSION, null, msgs);
			if (newETCSSystemVersion != null)
				msgs = ((InternalEObject)newETCSSystemVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__ETCS_SYSTEM_VERSION, null, msgs);
			msgs = basicSetETCSSystemVersion(newETCSSystemVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__ETCS_SYSTEM_VERSION, newETCSSystemVersion, newETCSSystemVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Fachtelegramm_TypeClass> getIDFachtelegramm() {
		if (iDFachtelegramm == null) {
			iDFachtelegramm = new EObjectContainmentEList<ID_Fachtelegramm_TypeClass>(ID_Fachtelegramm_TypeClass.class, this, Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__ID_FACHTELEGRAMM);
		}
		return iDFachtelegramm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_FT_Anschaltbedingung_TypeClass> getIDFTAnschaltbedingungGeplant() {
		if (iDFTAnschaltbedingungGeplant == null) {
			iDFTAnschaltbedingungGeplant = new EObjectContainmentEList<ID_FT_Anschaltbedingung_TypeClass>(ID_FT_Anschaltbedingung_TypeClass.class, this, Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__IDFT_ANSCHALTBEDINGUNG_GEPLANT);
		}
		return iDFTAnschaltbedingungGeplant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_FT_Anschaltbedingung_TypeClass> getIDFTAnschaltbedingungRealisiert() {
		if (iDFTAnschaltbedingungRealisiert == null) {
			iDFTAnschaltbedingungRealisiert = new EObjectContainmentEList<ID_FT_Anschaltbedingung_TypeClass>(ID_FT_Anschaltbedingung_TypeClass.class, this, Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__IDFT_ANSCHALTBEDINGUNG_REALISIERT);
		}
		return iDFTAnschaltbedingungRealisiert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SRS_Version_TypeClass getSRSVersion() {
		return sRSVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSRSVersion(SRS_Version_TypeClass newSRSVersion, NotificationChain msgs) {
		SRS_Version_TypeClass oldSRSVersion = sRSVersion;
		sRSVersion = newSRSVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__SRS_VERSION, oldSRSVersion, newSRSVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSRSVersion(SRS_Version_TypeClass newSRSVersion) {
		if (newSRSVersion != sRSVersion) {
			NotificationChain msgs = null;
			if (sRSVersion != null)
				msgs = ((InternalEObject)sRSVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__SRS_VERSION, null, msgs);
			if (newSRSVersion != null)
				msgs = ((InternalEObject)newSRSVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__SRS_VERSION, null, msgs);
			msgs = basicSetSRSVersion(newSRSVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__SRS_VERSION, newSRSVersion, newSRSVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__ETCS_SYSTEM_VERSION:
				return basicSetETCSSystemVersion(null, msgs);
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__ID_FACHTELEGRAMM:
				return ((InternalEList<?>)getIDFachtelegramm()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__IDFT_ANSCHALTBEDINGUNG_GEPLANT:
				return ((InternalEList<?>)getIDFTAnschaltbedingungGeplant()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__IDFT_ANSCHALTBEDINGUNG_REALISIERT:
				return ((InternalEList<?>)getIDFTAnschaltbedingungRealisiert()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__SRS_VERSION:
				return basicSetSRSVersion(null, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__ETCS_SYSTEM_VERSION:
				return getETCSSystemVersion();
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__ID_FACHTELEGRAMM:
				return getIDFachtelegramm();
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__IDFT_ANSCHALTBEDINGUNG_GEPLANT:
				return getIDFTAnschaltbedingungGeplant();
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__IDFT_ANSCHALTBEDINGUNG_REALISIERT:
				return getIDFTAnschaltbedingungRealisiert();
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__SRS_VERSION:
				return getSRSVersion();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
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
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__ETCS_SYSTEM_VERSION:
				setETCSSystemVersion((ETCS_System_Version_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__ID_FACHTELEGRAMM:
				getIDFachtelegramm().clear();
				getIDFachtelegramm().addAll((Collection<? extends ID_Fachtelegramm_TypeClass>)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__IDFT_ANSCHALTBEDINGUNG_GEPLANT:
				getIDFTAnschaltbedingungGeplant().clear();
				getIDFTAnschaltbedingungGeplant().addAll((Collection<? extends ID_FT_Anschaltbedingung_TypeClass>)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__IDFT_ANSCHALTBEDINGUNG_REALISIERT:
				getIDFTAnschaltbedingungRealisiert().clear();
				getIDFTAnschaltbedingungRealisiert().addAll((Collection<? extends ID_FT_Anschaltbedingung_TypeClass>)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__SRS_VERSION:
				setSRSVersion((SRS_Version_TypeClass)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__ETCS_SYSTEM_VERSION:
				setETCSSystemVersion((ETCS_System_Version_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__ID_FACHTELEGRAMM:
				getIDFachtelegramm().clear();
				return;
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__IDFT_ANSCHALTBEDINGUNG_GEPLANT:
				getIDFTAnschaltbedingungGeplant().clear();
				return;
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__IDFT_ANSCHALTBEDINGUNG_REALISIERT:
				getIDFTAnschaltbedingungRealisiert().clear();
				return;
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__SRS_VERSION:
				setSRSVersion((SRS_Version_TypeClass)null);
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__ETCS_SYSTEM_VERSION:
				return eTCSSystemVersion != null;
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__ID_FACHTELEGRAMM:
				return iDFachtelegramm != null && !iDFachtelegramm.isEmpty();
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__IDFT_ANSCHALTBEDINGUNG_GEPLANT:
				return iDFTAnschaltbedingungGeplant != null && !iDFTAnschaltbedingungGeplant.isEmpty();
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__IDFT_ANSCHALTBEDINGUNG_REALISIERT:
				return iDFTAnschaltbedingungRealisiert != null && !iDFTAnschaltbedingungRealisiert.isEmpty();
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP__SRS_VERSION:
				return sRSVersion != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //DP_Telegramm_ESG_AttributeGroupImpl
