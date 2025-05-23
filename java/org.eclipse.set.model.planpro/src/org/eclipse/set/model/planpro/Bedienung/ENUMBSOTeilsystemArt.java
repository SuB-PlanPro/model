/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMBSO Teilsystem Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getENUMBSOTeilsystemArt()
 * @model extendedMetaData="name='ENUMBSO_Teilsystem_Art'"
 * @generated
 */
public enum ENUMBSOTeilsystemArt implements Enumerator {
	/**
	 * The '<em><b>ENUMBSO Teilsystem Art iBS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMBSO_TEILSYSTEM_ART_IBS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMBSO_TEILSYSTEM_ART_IBS(0, "ENUMBSO_Teilsystem_Art_iBS", "iBS"),

	/**
	 * The '<em><b>ENUMBSO Teilsystem Art Transfernetz Bedienung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMBSO_TEILSYSTEM_ART_TRANSFERNETZ_BEDIENUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMBSO_TEILSYSTEM_ART_TRANSFERNETZ_BEDIENUNG(1, "ENUMBSO_Teilsystem_Art_Transfernetz_Bedienung", "Transfernetz Bedienung");

	/**
	 * The '<em><b>ENUMBSO Teilsystem Art iBS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMBSO_TEILSYSTEM_ART_IBS
	 * @model name="ENUMBSO_Teilsystem_Art_iBS" literal="iBS"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMBSO_TEILSYSTEM_ART_IBS_VALUE = 0;

	/**
	 * The '<em><b>ENUMBSO Teilsystem Art Transfernetz Bedienung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMBSO_TEILSYSTEM_ART_TRANSFERNETZ_BEDIENUNG
	 * @model name="ENUMBSO_Teilsystem_Art_Transfernetz_Bedienung" literal="Transfernetz Bedienung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMBSO_TEILSYSTEM_ART_TRANSFERNETZ_BEDIENUNG_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUMBSO Teilsystem Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMBSOTeilsystemArt[] VALUES_ARRAY =
		new ENUMBSOTeilsystemArt[] {
			ENUMBSO_TEILSYSTEM_ART_IBS,
			ENUMBSO_TEILSYSTEM_ART_TRANSFERNETZ_BEDIENUNG,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMBSO Teilsystem Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMBSOTeilsystemArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMBSO Teilsystem Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBSOTeilsystemArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBSOTeilsystemArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMBSO Teilsystem Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBSOTeilsystemArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBSOTeilsystemArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMBSO Teilsystem Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBSOTeilsystemArt get(int value) {
		switch (value) {
			case ENUMBSO_TEILSYSTEM_ART_IBS_VALUE: return ENUMBSO_TEILSYSTEM_ART_IBS;
			case ENUMBSO_TEILSYSTEM_ART_TRANSFERNETZ_BEDIENUNG_VALUE: return ENUMBSO_TEILSYSTEM_ART_TRANSFERNETZ_BEDIENUNG;
			default: return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ENUMBSOTeilsystemArt(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ENUMBSOTeilsystemArt
