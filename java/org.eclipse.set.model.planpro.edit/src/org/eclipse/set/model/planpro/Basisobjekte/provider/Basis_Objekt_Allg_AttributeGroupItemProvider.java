/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Basisobjekte.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Basisobjekte.BasisobjekteFactory;
import org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.planpro.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt_Allg_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Basis_Objekt_Allg_AttributeGroupItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt_Allg_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BasisobjektePackage.Literals.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__BESTANDSSCHUTZ);
			childrenFeatures.add(BasisobjektePackage.Literals.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__OBJEKTZUSTAND_BESONDERS);
			childrenFeatures.add(BasisobjektePackage.Literals.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__DATUM_REGELWERK);
			childrenFeatures.add(BasisobjektePackage.Literals.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__ID_ANHANG_REGELWERK_BESONDERS);
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
	 * This returns Basis_Objekt_Allg_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Basis_Objekt_Allg_AttributeGroup"));
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
		return getString("_UI_Basis_Objekt_Allg_AttributeGroup_type");
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

		switch (notification.getFeatureID(Basis_Objekt_Allg_AttributeGroup.class)) {
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__BESTANDSSCHUTZ:
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__OBJEKTZUSTAND_BESONDERS:
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__DATUM_REGELWERK:
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__ID_ANHANG_REGELWERK_BESONDERS:
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
				(BasisobjektePackage.Literals.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__BESTANDSSCHUTZ,
				 BasisobjekteFactory.eINSTANCE.createBestandsschutz_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BasisobjektePackage.Literals.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__OBJEKTZUSTAND_BESONDERS,
				 BasisobjekteFactory.eINSTANCE.createObjektzustand_Besonders_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BasisobjektePackage.Literals.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__DATUM_REGELWERK,
				 BasisobjekteFactory.eINSTANCE.createDatum_Regelwerk_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BasisobjektePackage.Literals.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__ID_ANHANG_REGELWERK_BESONDERS,
				 VerweiseFactory.eINSTANCE.createID_Anhang_TypeClass()));
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
