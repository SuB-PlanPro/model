/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.Verweise.ID_LEU_Anlage_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEU Steuernde Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Steuernde_AttributeGroup#getIDLEUAnlage <em>IDLEU Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Steuernde_AttributeGroup#getLEUAusgangNr <em>LEU Ausgang Nr</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Steuernde_AttributeGroup()
 * @model extendedMetaData="name='CLEU_Steuernde' kind='elementOnly'"
 * @generated
 */
public interface LEU_Steuernde_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>IDLEU Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die steuernde LEU-Anlage. Anmerkung: Balisen eines Datenpunkts können nicht mehreren LEU zugeordnet sein. Es ist nur möglich, eine zusammengefasste LEU mit zusammengefasster E/A-Logik aus mehreren LEU-Modulen zu bilden und die Balisen des DP verschiedenen LEU-Modulen zuzuordnen.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDLEU Anlage</em>' containment reference.
	 * @see #setIDLEUAnlage(ID_LEU_Anlage_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Steuernde_AttributeGroup_IDLEUAnlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_LEU_Anlage'"
	 * @generated
	 */
	ID_LEU_Anlage_TypeClass getIDLEUAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Steuernde_AttributeGroup#getIDLEUAnlage <em>IDLEU Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDLEU Anlage</em>' containment reference.
	 * @see #getIDLEUAnlage()
	 * @generated
	 */
	void setIDLEUAnlage(ID_LEU_Anlage_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LEU Ausgang Nr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Ausgang_Nr_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Planerisch vergebene Nummer des genutzten LEU-Ausgangs für die Ansteuerung der Balisen des Datenpunkts. \nBei Verwendung in Datenpunkt: Angabe des für diesen DP genutzen LEU-Ausgangs im Sinne einer Referenz. Mehrere Ausgänge werden bei DP mit mehreren gesteuerten Balisen benötigt.\nBei Verwendung in LEU_Anlage: Definition des LEU-Ausgangs für die entsprechendes LEU-Anlage. Die Port-Nr. muss in Bezug auf die LEU-Anlage eindeutig sein.\nBei Verwendung in LEU_Modul: Zuordnung des LEU-Ausgangs zu einem LEU-Modul. Weiterhin wird dem LEU-Ausgang vom Hersteller eine Portnummer zugeordnet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LEU Ausgang Nr</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Steuernde_AttributeGroup_LEUAusgangNr()
	 * @model containment="true" required="true" upper="16"
	 *        extendedMetaData="kind='element' name='LEU_Ausgang_Nr'"
	 * @generated
	 */
	EList<LEU_Ausgang_Nr_TypeClass> getLEUAusgangNr();

} // LEU_Steuernde_AttributeGroup
