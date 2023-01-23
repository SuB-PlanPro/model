/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zugnummernmeldeanlage;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.Verweise.ID_ZLV_Bus_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telegramm 85 Alle Fstr Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.Telegramm_85_Alle_Fstr_AttributeGroup#getIDZLVBus <em>IDZLV Bus</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.Telegramm_85_Alle_Fstr_AttributeGroup#getTelegramm85FuerAlleFstr <em>Telegramm85 Fuer Alle Fstr</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getTelegramm_85_Alle_Fstr_AttributeGroup()
 * @model extendedMetaData="name='CTelegramm_85_Alle_Fstr' kind='elementOnly'"
 * @generated
 */
public interface Telegramm_85_Alle_Fstr_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>IDZLV Bus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Verweis wird gefüllt, wenn das Telegramm 85 durchzureichen ist. Verweis auf den ZLV-Bus, auf den das Telegramm durchgereicht wird. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZLV Bus</em>' containment reference.
	 * @see #setIDZLVBus(ID_ZLV_Bus_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getTelegramm_85_Alle_Fstr_AttributeGroup_IDZLVBus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_ZLV_Bus'"
	 * @generated
	 */
	ID_ZLV_Bus_TypeClass getIDZLVBus();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.Telegramm_85_Alle_Fstr_AttributeGroup#getIDZLVBus <em>IDZLV Bus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZLV Bus</em>' containment reference.
	 * @see #getIDZLVBus()
	 * @generated
	 */
	void setIDZLVBus(ID_ZLV_Bus_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Telegramm85 Fuer Alle Fstr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Telegramm 85 (Fahrstraße eingestellt). Die Angabe von Telegrammen ist für die Durchreichfunktion erforderlich. Eine Aufstellung aller verfügbaren Telegramme steht dem LST-Fachplaner nicht zur Verfügung. Es bedarf der Vorgabe des Betreibers, welche Telegramme von wo nach wo durchgereicht werden sollen. Herstellerspezifisch ist anzugeben, ob das Telegramm für einzelne oder für alle Fahrstraßen gesendet werden soll. Zudem sind herstellerspezifische Abhängigkeiten beim Senden von Telegramm 84 und 85 zu beachten. Kann die ZN das Telegramm 85 nur für alle oder keine Fahrstraßen senden, ist dieser Boolean auszuwählen. DB-Regelwerk 819.0731A02 1 (5) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telegramm85 Fuer Alle Fstr</em>' containment reference.
	 * @see #setTelegramm85FuerAlleFstr(Telegramm_85_Fuer_Alle_Fstr_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getTelegramm_85_Alle_Fstr_AttributeGroup_Telegramm85FuerAlleFstr()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Telegramm_85_Fuer_Alle_Fstr'"
	 * @generated
	 */
	Telegramm_85_Fuer_Alle_Fstr_TypeClass getTelegramm85FuerAlleFstr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.Telegramm_85_Alle_Fstr_AttributeGroup#getTelegramm85FuerAlleFstr <em>Telegramm85 Fuer Alle Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telegramm85 Fuer Alle Fstr</em>' containment reference.
	 * @see #getTelegramm85FuerAlleFstr()
	 * @generated
	 */
	void setTelegramm85FuerAlleFstr(Telegramm_85_Fuer_Alle_Fstr_TypeClass value);

} // Telegramm_85_Alle_Fstr_AttributeGroup
