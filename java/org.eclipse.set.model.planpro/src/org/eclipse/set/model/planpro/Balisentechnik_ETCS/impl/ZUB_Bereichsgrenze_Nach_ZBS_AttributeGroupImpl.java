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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_ZBS_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZUB Bereichsgrenze Nach ZBS Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_ZBS_AttributeGroupImpl#getBgrenzeNachZBSBedEinstieg <em>Bgrenze Nach ZBS Bed Einstieg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZUB_Bereichsgrenze_Nach_ZBS_AttributeGroupImpl extends EObjectImpl implements ZUB_Bereichsgrenze_Nach_ZBS_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBgrenzeNachZBSBedEinstieg() <em>Bgrenze Nach ZBS Bed Einstieg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgrenzeNachZBSBedEinstieg()
	 * @generated
	 * @ordered
	 */
	protected EList<Bgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup> bgrenzeNachZBSBedEinstieg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZUB_Bereichsgrenze_Nach_ZBS_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_ZBS_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup> getBgrenzeNachZBSBedEinstieg() {
		if (bgrenzeNachZBSBedEinstieg == null) {
			bgrenzeNachZBSBedEinstieg = new EObjectContainmentEList<Bgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup>(Bgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_ZBS_ATTRIBUTE_GROUP__BGRENZE_NACH_ZBS_BED_EINSTIEG);
		}
		return bgrenzeNachZBSBedEinstieg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_ZBS_ATTRIBUTE_GROUP__BGRENZE_NACH_ZBS_BED_EINSTIEG:
				return ((InternalEList<?>)getBgrenzeNachZBSBedEinstieg()).basicRemove(otherEnd, msgs);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_ZBS_ATTRIBUTE_GROUP__BGRENZE_NACH_ZBS_BED_EINSTIEG:
				return getBgrenzeNachZBSBedEinstieg();
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_ZBS_ATTRIBUTE_GROUP__BGRENZE_NACH_ZBS_BED_EINSTIEG:
				getBgrenzeNachZBSBedEinstieg().clear();
				getBgrenzeNachZBSBedEinstieg().addAll((Collection<? extends Bgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup>)newValue);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_ZBS_ATTRIBUTE_GROUP__BGRENZE_NACH_ZBS_BED_EINSTIEG:
				getBgrenzeNachZBSBedEinstieg().clear();
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_ZBS_ATTRIBUTE_GROUP__BGRENZE_NACH_ZBS_BED_EINSTIEG:
				return bgrenzeNachZBSBedEinstieg != null && !bgrenzeNachZBSBedEinstieg.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZUB_Bereichsgrenze_Nach_ZBS_AttributeGroupImpl
