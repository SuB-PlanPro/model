/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Nahbedienung.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.planpro.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Element;
import org.eclipse.set.model.planpro.Nahbedienung.NahbedienungFactory;
import org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.planpro.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Element} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NB_Bedien_Anzeige_ElementItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NB_Bedien_Anzeige_ElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(NahbedienungPackage.Literals.NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT);
			childrenFeatures.add(NahbedienungPackage.Literals.NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE);
			childrenFeatures.add(NahbedienungPackage.Literals.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns NB_Bedien_Anzeige_Element.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NB_Bedien_Anzeige_Element"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_NB_Bedien_Anzeige_Element_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(NB_Bedien_Anzeige_Element.class)) {
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT:
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE:
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
			default:
				super.notifyChanged(notification);
				return;
			}
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(NahbedienungPackage.Literals.NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT,
				 VerweiseFactory.eINSTANCE.createID_Bedien_Anzeige_Element_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(NahbedienungPackage.Literals.NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE,
				 VerweiseFactory.eINSTANCE.createID_NB_Zone_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(NahbedienungPackage.Literals.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN,
				 NahbedienungFactory.eINSTANCE.createNB_Bedien_Anzeige_Funktionen_AttributeGroup()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PlanProEditPlugin.INSTANCE;
	}

}
