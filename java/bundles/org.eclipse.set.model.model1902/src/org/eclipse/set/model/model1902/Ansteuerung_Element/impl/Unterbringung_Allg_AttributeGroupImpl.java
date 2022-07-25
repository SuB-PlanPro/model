/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ansteuerung_Element.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Hersteller_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Unterbringung_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Unterbringung_Art_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Unterbringung_Befestigung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unterbringung Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.Unterbringung_Allg_AttributeGroupImpl#getHersteller <em>Hersteller</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.Unterbringung_Allg_AttributeGroupImpl#getUnterbringungArt <em>Unterbringung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.Unterbringung_Allg_AttributeGroupImpl#getUnterbringungBefestigung <em>Unterbringung Befestigung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Unterbringung_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Unterbringung_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getHersteller() <em>Hersteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHersteller()
	 * @generated
	 * @ordered
	 */
	protected Hersteller_TypeClass hersteller;

	/**
	 * The cached value of the '{@link #getUnterbringungArt() <em>Unterbringung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnterbringungArt()
	 * @generated
	 * @ordered
	 */
	protected Unterbringung_Art_TypeClass unterbringungArt;

	/**
	 * The cached value of the '{@link #getUnterbringungBefestigung() <em>Unterbringung Befestigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnterbringungBefestigung()
	 * @generated
	 * @ordered
	 */
	protected Unterbringung_Befestigung_TypeClass unterbringungBefestigung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Unterbringung_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hersteller_TypeClass getHersteller() {
		return hersteller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHersteller(Hersteller_TypeClass newHersteller, NotificationChain msgs) {
		Hersteller_TypeClass oldHersteller = hersteller;
		hersteller = newHersteller;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__HERSTELLER, oldHersteller, newHersteller);
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
	public void setHersteller(Hersteller_TypeClass newHersteller) {
		if (newHersteller != hersteller) {
			NotificationChain msgs = null;
			if (hersteller != null)
				msgs = ((InternalEObject)hersteller).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__HERSTELLER, null, msgs);
			if (newHersteller != null)
				msgs = ((InternalEObject)newHersteller).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__HERSTELLER, null, msgs);
			msgs = basicSetHersteller(newHersteller, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__HERSTELLER, newHersteller, newHersteller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unterbringung_Art_TypeClass getUnterbringungArt() {
		return unterbringungArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnterbringungArt(Unterbringung_Art_TypeClass newUnterbringungArt, NotificationChain msgs) {
		Unterbringung_Art_TypeClass oldUnterbringungArt = unterbringungArt;
		unterbringungArt = newUnterbringungArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__UNTERBRINGUNG_ART, oldUnterbringungArt, newUnterbringungArt);
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
	public void setUnterbringungArt(Unterbringung_Art_TypeClass newUnterbringungArt) {
		if (newUnterbringungArt != unterbringungArt) {
			NotificationChain msgs = null;
			if (unterbringungArt != null)
				msgs = ((InternalEObject)unterbringungArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__UNTERBRINGUNG_ART, null, msgs);
			if (newUnterbringungArt != null)
				msgs = ((InternalEObject)newUnterbringungArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__UNTERBRINGUNG_ART, null, msgs);
			msgs = basicSetUnterbringungArt(newUnterbringungArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__UNTERBRINGUNG_ART, newUnterbringungArt, newUnterbringungArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unterbringung_Befestigung_TypeClass getUnterbringungBefestigung() {
		return unterbringungBefestigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnterbringungBefestigung(Unterbringung_Befestigung_TypeClass newUnterbringungBefestigung, NotificationChain msgs) {
		Unterbringung_Befestigung_TypeClass oldUnterbringungBefestigung = unterbringungBefestigung;
		unterbringungBefestigung = newUnterbringungBefestigung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__UNTERBRINGUNG_BEFESTIGUNG, oldUnterbringungBefestigung, newUnterbringungBefestigung);
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
	public void setUnterbringungBefestigung(Unterbringung_Befestigung_TypeClass newUnterbringungBefestigung) {
		if (newUnterbringungBefestigung != unterbringungBefestigung) {
			NotificationChain msgs = null;
			if (unterbringungBefestigung != null)
				msgs = ((InternalEObject)unterbringungBefestigung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__UNTERBRINGUNG_BEFESTIGUNG, null, msgs);
			if (newUnterbringungBefestigung != null)
				msgs = ((InternalEObject)newUnterbringungBefestigung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__UNTERBRINGUNG_BEFESTIGUNG, null, msgs);
			msgs = basicSetUnterbringungBefestigung(newUnterbringungBefestigung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__UNTERBRINGUNG_BEFESTIGUNG, newUnterbringungBefestigung, newUnterbringungBefestigung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return basicSetHersteller(null, msgs);
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__UNTERBRINGUNG_ART:
				return basicSetUnterbringungArt(null, msgs);
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__UNTERBRINGUNG_BEFESTIGUNG:
				return basicSetUnterbringungBefestigung(null, msgs);
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
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return getHersteller();
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__UNTERBRINGUNG_ART:
				return getUnterbringungArt();
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__UNTERBRINGUNG_BEFESTIGUNG:
				return getUnterbringungBefestigung();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				setHersteller((Hersteller_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__UNTERBRINGUNG_ART:
				setUnterbringungArt((Unterbringung_Art_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__UNTERBRINGUNG_BEFESTIGUNG:
				setUnterbringungBefestigung((Unterbringung_Befestigung_TypeClass)newValue);
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
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				setHersteller((Hersteller_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__UNTERBRINGUNG_ART:
				setUnterbringungArt((Unterbringung_Art_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__UNTERBRINGUNG_BEFESTIGUNG:
				setUnterbringungBefestigung((Unterbringung_Befestigung_TypeClass)null);
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
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return hersteller != null;
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__UNTERBRINGUNG_ART:
				return unterbringungArt != null;
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__UNTERBRINGUNG_BEFESTIGUNG:
				return unterbringungBefestigung != null;
		}
		return super.eIsSet(featureID);
	}

} //Unterbringung_Allg_AttributeGroupImpl
