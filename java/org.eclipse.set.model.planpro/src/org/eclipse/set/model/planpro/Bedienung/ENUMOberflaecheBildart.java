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
 * A representation of the literals of the enumeration '<em><b>ENUM Oberflaeche Bildart</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getENUMOberflaecheBildart()
 * @model extendedMetaData="name='ENUMOberflaeche_Bildart'"
 * @generated
 */
public enum ENUMOberflaecheBildart implements Enumerator {
	/**
	 * The '<em><b>ENUM Oberflaeche Bildart BERUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_OBERFLAECHE_BILDART_BERUE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_OBERFLAECHE_BILDART_BERUE(0, "ENUMOberflaeche_Bildart_BERUE", "BERUE"),

	/**
	 * The '<em><b>ENUM Oberflaeche Bildart Lupe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_OBERFLAECHE_BILDART_LUPE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_OBERFLAECHE_BILDART_LUPE(1, "ENUMOberflaeche_Bildart_Lupe", "Lupe"),

	/**
	 * The '<em><b>ENUM Oberflaeche Bildart sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_OBERFLAECHE_BILDART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_OBERFLAECHE_BILDART_SONSTIGE(2, "ENUMOberflaeche_Bildart_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Oberflaeche Bildart BERUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_OBERFLAECHE_BILDART_BERUE
	 * @model name="ENUMOberflaeche_Bildart_BERUE" literal="BERUE"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_OBERFLAECHE_BILDART_BERUE_VALUE = 0;

	/**
	 * The '<em><b>ENUM Oberflaeche Bildart Lupe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_OBERFLAECHE_BILDART_LUPE
	 * @model name="ENUMOberflaeche_Bildart_Lupe" literal="Lupe"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_OBERFLAECHE_BILDART_LUPE_VALUE = 1;

	/**
	 * The '<em><b>ENUM Oberflaeche Bildart sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_OBERFLAECHE_BILDART_SONSTIGE
	 * @model name="ENUMOberflaeche_Bildart_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_OBERFLAECHE_BILDART_SONSTIGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Oberflaeche Bildart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMOberflaecheBildart[] VALUES_ARRAY =
		new ENUMOberflaecheBildart[] {
			ENUM_OBERFLAECHE_BILDART_BERUE,
			ENUM_OBERFLAECHE_BILDART_LUPE,
			ENUM_OBERFLAECHE_BILDART_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Oberflaeche Bildart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMOberflaecheBildart> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Oberflaeche Bildart</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMOberflaecheBildart get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMOberflaecheBildart result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Oberflaeche Bildart</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMOberflaecheBildart getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMOberflaecheBildart result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Oberflaeche Bildart</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMOberflaecheBildart get(int value) {
		switch (value) {
			case ENUM_OBERFLAECHE_BILDART_BERUE_VALUE: return ENUM_OBERFLAECHE_BILDART_BERUE;
			case ENUM_OBERFLAECHE_BILDART_LUPE_VALUE: return ENUM_OBERFLAECHE_BILDART_LUPE;
			case ENUM_OBERFLAECHE_BILDART_SONSTIGE_VALUE: return ENUM_OBERFLAECHE_BILDART_SONSTIGE;
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
	private ENUMOberflaecheBildart(int value, String name, String literal) {
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
	
} //ENUMOberflaecheBildart
