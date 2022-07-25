/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Datenpunkt_Link;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.GNT_Merkmale_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Link_Distanz_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZBS_Merkmale_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Ziel_DP_Ausrichtung_TypeClass;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_Datenpunkt_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Fachtelegramm_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datenpunkt Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Datenpunkt_LinkImpl#getIDDPLinkStart <em>IDDP Link Start</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Datenpunkt_LinkImpl#getIDDPLinkZiel <em>IDDP Link Ziel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Datenpunkt_LinkImpl#getIDFachtelegramm <em>ID Fachtelegramm</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Datenpunkt_LinkImpl#getLinkDistanz <em>Link Distanz</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Datenpunkt_LinkImpl#getZielDPAusrichtung <em>Ziel DP Ausrichtung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Datenpunkt_LinkImpl#getGNTMerkmale <em>GNT Merkmale</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Datenpunkt_LinkImpl#getZBSMerkmale <em>ZBS Merkmale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Datenpunkt_LinkImpl extends Basis_ObjektImpl implements Datenpunkt_Link {
	/**
	 * The cached value of the '{@link #getIDDPLinkStart() <em>IDDP Link Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDDPLinkStart()
	 * @generated
	 * @ordered
	 */
	protected ID_Datenpunkt_TypeClass iDDPLinkStart;

	/**
	 * The cached value of the '{@link #getIDDPLinkZiel() <em>IDDP Link Ziel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDDPLinkZiel()
	 * @generated
	 * @ordered
	 */
	protected ID_Datenpunkt_TypeClass iDDPLinkZiel;

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
	 * The cached value of the '{@link #getLinkDistanz() <em>Link Distanz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkDistanz()
	 * @generated
	 * @ordered
	 */
	protected Link_Distanz_TypeClass linkDistanz;

	/**
	 * The cached value of the '{@link #getZielDPAusrichtung() <em>Ziel DP Ausrichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZielDPAusrichtung()
	 * @generated
	 * @ordered
	 */
	protected Ziel_DP_Ausrichtung_TypeClass zielDPAusrichtung;

	/**
	 * The cached value of the '{@link #getGNTMerkmale() <em>GNT Merkmale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGNTMerkmale()
	 * @generated
	 * @ordered
	 */
	protected GNT_Merkmale_AttributeGroup gNTMerkmale;

	/**
	 * The cached value of the '{@link #getZBSMerkmale() <em>ZBS Merkmale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZBSMerkmale()
	 * @generated
	 * @ordered
	 */
	protected ZBS_Merkmale_AttributeGroup zBSMerkmale;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Datenpunkt_LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Link();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Datenpunkt_TypeClass getIDDPLinkStart() {
		return iDDPLinkStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDDPLinkStart(ID_Datenpunkt_TypeClass newIDDPLinkStart, NotificationChain msgs) {
		ID_Datenpunkt_TypeClass oldIDDPLinkStart = iDDPLinkStart;
		iDDPLinkStart = newIDDPLinkStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_LINK__IDDP_LINK_START, oldIDDPLinkStart, newIDDPLinkStart);
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
	public void setIDDPLinkStart(ID_Datenpunkt_TypeClass newIDDPLinkStart) {
		if (newIDDPLinkStart != iDDPLinkStart) {
			NotificationChain msgs = null;
			if (iDDPLinkStart != null)
				msgs = ((InternalEObject)iDDPLinkStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_LINK__IDDP_LINK_START, null, msgs);
			if (newIDDPLinkStart != null)
				msgs = ((InternalEObject)newIDDPLinkStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_LINK__IDDP_LINK_START, null, msgs);
			msgs = basicSetIDDPLinkStart(newIDDPLinkStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_LINK__IDDP_LINK_START, newIDDPLinkStart, newIDDPLinkStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Datenpunkt_TypeClass getIDDPLinkZiel() {
		return iDDPLinkZiel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDDPLinkZiel(ID_Datenpunkt_TypeClass newIDDPLinkZiel, NotificationChain msgs) {
		ID_Datenpunkt_TypeClass oldIDDPLinkZiel = iDDPLinkZiel;
		iDDPLinkZiel = newIDDPLinkZiel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_LINK__IDDP_LINK_ZIEL, oldIDDPLinkZiel, newIDDPLinkZiel);
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
	public void setIDDPLinkZiel(ID_Datenpunkt_TypeClass newIDDPLinkZiel) {
		if (newIDDPLinkZiel != iDDPLinkZiel) {
			NotificationChain msgs = null;
			if (iDDPLinkZiel != null)
				msgs = ((InternalEObject)iDDPLinkZiel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_LINK__IDDP_LINK_ZIEL, null, msgs);
			if (newIDDPLinkZiel != null)
				msgs = ((InternalEObject)newIDDPLinkZiel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_LINK__IDDP_LINK_ZIEL, null, msgs);
			msgs = basicSetIDDPLinkZiel(newIDDPLinkZiel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_LINK__IDDP_LINK_ZIEL, newIDDPLinkZiel, newIDDPLinkZiel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Fachtelegramm_TypeClass> getIDFachtelegramm() {
		if (iDFachtelegramm == null) {
			iDFachtelegramm = new EObjectContainmentEList<ID_Fachtelegramm_TypeClass>(ID_Fachtelegramm_TypeClass.class, this, Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ID_FACHTELEGRAMM);
		}
		return iDFachtelegramm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link_Distanz_TypeClass getLinkDistanz() {
		return linkDistanz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkDistanz(Link_Distanz_TypeClass newLinkDistanz, NotificationChain msgs) {
		Link_Distanz_TypeClass oldLinkDistanz = linkDistanz;
		linkDistanz = newLinkDistanz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_LINK__LINK_DISTANZ, oldLinkDistanz, newLinkDistanz);
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
	public void setLinkDistanz(Link_Distanz_TypeClass newLinkDistanz) {
		if (newLinkDistanz != linkDistanz) {
			NotificationChain msgs = null;
			if (linkDistanz != null)
				msgs = ((InternalEObject)linkDistanz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_LINK__LINK_DISTANZ, null, msgs);
			if (newLinkDistanz != null)
				msgs = ((InternalEObject)newLinkDistanz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_LINK__LINK_DISTANZ, null, msgs);
			msgs = basicSetLinkDistanz(newLinkDistanz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_LINK__LINK_DISTANZ, newLinkDistanz, newLinkDistanz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ziel_DP_Ausrichtung_TypeClass getZielDPAusrichtung() {
		return zielDPAusrichtung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZielDPAusrichtung(Ziel_DP_Ausrichtung_TypeClass newZielDPAusrichtung, NotificationChain msgs) {
		Ziel_DP_Ausrichtung_TypeClass oldZielDPAusrichtung = zielDPAusrichtung;
		zielDPAusrichtung = newZielDPAusrichtung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ZIEL_DP_AUSRICHTUNG, oldZielDPAusrichtung, newZielDPAusrichtung);
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
	public void setZielDPAusrichtung(Ziel_DP_Ausrichtung_TypeClass newZielDPAusrichtung) {
		if (newZielDPAusrichtung != zielDPAusrichtung) {
			NotificationChain msgs = null;
			if (zielDPAusrichtung != null)
				msgs = ((InternalEObject)zielDPAusrichtung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ZIEL_DP_AUSRICHTUNG, null, msgs);
			if (newZielDPAusrichtung != null)
				msgs = ((InternalEObject)newZielDPAusrichtung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ZIEL_DP_AUSRICHTUNG, null, msgs);
			msgs = basicSetZielDPAusrichtung(newZielDPAusrichtung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ZIEL_DP_AUSRICHTUNG, newZielDPAusrichtung, newZielDPAusrichtung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GNT_Merkmale_AttributeGroup getGNTMerkmale() {
		return gNTMerkmale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGNTMerkmale(GNT_Merkmale_AttributeGroup newGNTMerkmale, NotificationChain msgs) {
		GNT_Merkmale_AttributeGroup oldGNTMerkmale = gNTMerkmale;
		gNTMerkmale = newGNTMerkmale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_LINK__GNT_MERKMALE, oldGNTMerkmale, newGNTMerkmale);
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
	public void setGNTMerkmale(GNT_Merkmale_AttributeGroup newGNTMerkmale) {
		if (newGNTMerkmale != gNTMerkmale) {
			NotificationChain msgs = null;
			if (gNTMerkmale != null)
				msgs = ((InternalEObject)gNTMerkmale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_LINK__GNT_MERKMALE, null, msgs);
			if (newGNTMerkmale != null)
				msgs = ((InternalEObject)newGNTMerkmale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_LINK__GNT_MERKMALE, null, msgs);
			msgs = basicSetGNTMerkmale(newGNTMerkmale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_LINK__GNT_MERKMALE, newGNTMerkmale, newGNTMerkmale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_Merkmale_AttributeGroup getZBSMerkmale() {
		return zBSMerkmale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZBSMerkmale(ZBS_Merkmale_AttributeGroup newZBSMerkmale, NotificationChain msgs) {
		ZBS_Merkmale_AttributeGroup oldZBSMerkmale = zBSMerkmale;
		zBSMerkmale = newZBSMerkmale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ZBS_MERKMALE, oldZBSMerkmale, newZBSMerkmale);
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
	public void setZBSMerkmale(ZBS_Merkmale_AttributeGroup newZBSMerkmale) {
		if (newZBSMerkmale != zBSMerkmale) {
			NotificationChain msgs = null;
			if (zBSMerkmale != null)
				msgs = ((InternalEObject)zBSMerkmale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ZBS_MERKMALE, null, msgs);
			if (newZBSMerkmale != null)
				msgs = ((InternalEObject)newZBSMerkmale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ZBS_MERKMALE, null, msgs);
			msgs = basicSetZBSMerkmale(newZBSMerkmale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ZBS_MERKMALE, newZBSMerkmale, newZBSMerkmale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__IDDP_LINK_START:
				return basicSetIDDPLinkStart(null, msgs);
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__IDDP_LINK_ZIEL:
				return basicSetIDDPLinkZiel(null, msgs);
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ID_FACHTELEGRAMM:
				return ((InternalEList<?>)getIDFachtelegramm()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__LINK_DISTANZ:
				return basicSetLinkDistanz(null, msgs);
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ZIEL_DP_AUSRICHTUNG:
				return basicSetZielDPAusrichtung(null, msgs);
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__GNT_MERKMALE:
				return basicSetGNTMerkmale(null, msgs);
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ZBS_MERKMALE:
				return basicSetZBSMerkmale(null, msgs);
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
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__IDDP_LINK_START:
				return getIDDPLinkStart();
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__IDDP_LINK_ZIEL:
				return getIDDPLinkZiel();
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ID_FACHTELEGRAMM:
				return getIDFachtelegramm();
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__LINK_DISTANZ:
				return getLinkDistanz();
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ZIEL_DP_AUSRICHTUNG:
				return getZielDPAusrichtung();
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__GNT_MERKMALE:
				return getGNTMerkmale();
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ZBS_MERKMALE:
				return getZBSMerkmale();
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
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__IDDP_LINK_START:
				setIDDPLinkStart((ID_Datenpunkt_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__IDDP_LINK_ZIEL:
				setIDDPLinkZiel((ID_Datenpunkt_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ID_FACHTELEGRAMM:
				getIDFachtelegramm().clear();
				getIDFachtelegramm().addAll((Collection<? extends ID_Fachtelegramm_TypeClass>)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__LINK_DISTANZ:
				setLinkDistanz((Link_Distanz_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ZIEL_DP_AUSRICHTUNG:
				setZielDPAusrichtung((Ziel_DP_Ausrichtung_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__GNT_MERKMALE:
				setGNTMerkmale((GNT_Merkmale_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ZBS_MERKMALE:
				setZBSMerkmale((ZBS_Merkmale_AttributeGroup)newValue);
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
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__IDDP_LINK_START:
				setIDDPLinkStart((ID_Datenpunkt_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__IDDP_LINK_ZIEL:
				setIDDPLinkZiel((ID_Datenpunkt_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ID_FACHTELEGRAMM:
				getIDFachtelegramm().clear();
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__LINK_DISTANZ:
				setLinkDistanz((Link_Distanz_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ZIEL_DP_AUSRICHTUNG:
				setZielDPAusrichtung((Ziel_DP_Ausrichtung_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__GNT_MERKMALE:
				setGNTMerkmale((GNT_Merkmale_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ZBS_MERKMALE:
				setZBSMerkmale((ZBS_Merkmale_AttributeGroup)null);
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
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__IDDP_LINK_START:
				return iDDPLinkStart != null;
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__IDDP_LINK_ZIEL:
				return iDDPLinkZiel != null;
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ID_FACHTELEGRAMM:
				return iDFachtelegramm != null && !iDFachtelegramm.isEmpty();
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__LINK_DISTANZ:
				return linkDistanz != null;
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ZIEL_DP_AUSRICHTUNG:
				return zielDPAusrichtung != null;
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__GNT_MERKMALE:
				return gNTMerkmale != null;
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ZBS_MERKMALE:
				return zBSMerkmale != null;
		}
		return super.eIsSet(featureID);
	}

} //Datenpunkt_LinkImpl
