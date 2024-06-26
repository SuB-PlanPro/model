/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESG Spezifische Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup#getETCSPaketnummer <em>ETCS Paketnummer</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup#getETCSParErlaeuterung <em>ETCS Par Erlaeuterung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup#getETCSParametername <em>ETCS Parametername</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup#getETCSParameterwert <em>ETCS Parameterwert</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup#getRekursion2Nr <em>Rekursion2 Nr</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup#getRekursionNr <em>Rekursion Nr</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getESG_Spezifische_Merkmale_AttributeGroup()
 * @model extendedMetaData="name='CESG_Spezifische_Merkmale' kind='elementOnly'"
 * @generated
 */
public interface ESG_Spezifische_Merkmale_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ETCS Paketnummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Paketnummer gemäß Dokument \"Telegramme für Regelbremsweg xxxx m\".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ETCS Paketnummer</em>' containment reference.
	 * @see #setETCSPaketnummer(ETCS_Paketnummer_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getESG_Spezifische_Merkmale_AttributeGroup_ETCSPaketnummer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ETCS_Paketnummer'"
	 * @generated
	 */
	ETCS_Paketnummer_TypeClass getETCSPaketnummer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup#getETCSPaketnummer <em>ETCS Paketnummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCS Paketnummer</em>' containment reference.
	 * @see #getETCSPaketnummer()
	 * @generated
	 */
	void setETCSPaketnummer(ETCS_Paketnummer_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ETCS Par Erlaeuterung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erläuterung des unter ETCS_Parametername definierten Parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ETCS Par Erlaeuterung</em>' containment reference.
	 * @see #setETCSParErlaeuterung(ETCS_Par_Erlaeuterung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getESG_Spezifische_Merkmale_AttributeGroup_ETCSParErlaeuterung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ETCS_Par_Erlaeuterung'"
	 * @generated
	 */
	ETCS_Par_Erlaeuterung_TypeClass getETCSParErlaeuterung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup#getETCSParErlaeuterung <em>ETCS Par Erlaeuterung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCS Par Erlaeuterung</em>' containment reference.
	 * @see #getETCSParErlaeuterung()
	 * @generated
	 */
	void setETCSParErlaeuterung(ETCS_Par_Erlaeuterung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ETCS Parametername</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parametername gemäß Dokument \"Telegramme für Regelbremsweg xxxx m\". Wenn mehrere Parameter gleichen Namens im Paket auftauchen können (z. B. in Aufzählungen mit N_ITER), wird die Ordnungsnummer des individuellen Parameters in Klammern angegeben. Vgl. Subset 026-7. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ETCS Parametername</em>' containment reference.
	 * @see #setETCSParametername(ETCS_Parametername_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getESG_Spezifische_Merkmale_AttributeGroup_ETCSParametername()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ETCS_Parametername'"
	 * @generated
	 */
	ETCS_Parametername_TypeClass getETCSParametername();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup#getETCSParametername <em>ETCS Parametername</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCS Parametername</em>' containment reference.
	 * @see #getETCSParametername()
	 * @generated
	 */
	void setETCSParametername(ETCS_Parametername_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ETCS Parameterwert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wert des unter ETCS_Parametername definierten Parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ETCS Parameterwert</em>' containment reference.
	 * @see #setETCSParameterwert(ETCS_Parameterwert_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getESG_Spezifische_Merkmale_AttributeGroup_ETCSParameterwert()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ETCS_Parameterwert'"
	 * @generated
	 */
	ETCS_Parameterwert_TypeClass getETCSParameterwert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup#getETCSParameterwert <em>ETCS Parameterwert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCS Parameterwert</em>' containment reference.
	 * @see #getETCSParameterwert()
	 * @generated
	 */
	void setETCSParameterwert(ETCS_Parameterwert_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Rekursion2 Nr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nummer der Rekursion in der zweiten Rekursionsebene bei rekursiv vorkommenden Paket-Parametern (N_ITER).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rekursion2 Nr</em>' containment reference.
	 * @see #setRekursion2Nr(Rekursion_2_Nr_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getESG_Spezifische_Merkmale_AttributeGroup_Rekursion2Nr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Rekursion_2_Nr'"
	 * @generated
	 */
	Rekursion_2_Nr_TypeClass getRekursion2Nr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup#getRekursion2Nr <em>Rekursion2 Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rekursion2 Nr</em>' containment reference.
	 * @see #getRekursion2Nr()
	 * @generated
	 */
	void setRekursion2Nr(Rekursion_2_Nr_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Rekursion Nr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nummer der Rekursion bei rekursiv vorkommenden Paket-Parametern (N_ITER).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rekursion Nr</em>' containment reference.
	 * @see #setRekursionNr(Rekursion_Nr_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getESG_Spezifische_Merkmale_AttributeGroup_RekursionNr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Rekursion_Nr'"
	 * @generated
	 */
	Rekursion_Nr_TypeClass getRekursionNr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup#getRekursionNr <em>Rekursion Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rekursion Nr</em>' containment reference.
	 * @see #getRekursionNr()
	 * @generated
	 */
	void setRekursionNr(Rekursion_Nr_TypeClass value);

} // ESG_Spezifische_Merkmale_AttributeGroup
