/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zuglenkung.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.planpro.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.planpro.Verweise.VerweiseFactory;

import org.eclipse.set.model.planpro.Zuglenkung.ZL_Fstr;
import org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungFactory;
import org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Zuglenkung.ZL_Fstr} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ZL_FstrItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZL_FstrItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ZuglenkungPackage.Literals.ZL_FSTR__ID_FSTR_ZUG_RANGIER);
			childrenFeatures.add(ZuglenkungPackage.Literals.ZL_FSTR__IDZL);
			childrenFeatures.add(ZuglenkungPackage.Literals.ZL_FSTR__IDZL_FSTR);
			childrenFeatures.add(ZuglenkungPackage.Literals.ZL_FSTR__ZL_FSTR_ALLG);
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
	 * This returns ZL_Fstr.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ZL_Fstr"));
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
		return getString("_UI_ZL_Fstr_type");
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

		switch (notification.getFeatureID(ZL_Fstr.class)) {
			case ZuglenkungPackage.ZL_FSTR__ID_FSTR_ZUG_RANGIER:
			case ZuglenkungPackage.ZL_FSTR__IDZL:
			case ZuglenkungPackage.ZL_FSTR__IDZL_FSTR:
			case ZuglenkungPackage.ZL_FSTR__ZL_FSTR_ALLG:
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
				(ZuglenkungPackage.Literals.ZL_FSTR__ID_FSTR_ZUG_RANGIER,
				 VerweiseFactory.eINSTANCE.createID_Fstr_Zug_Rangier_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZuglenkungPackage.Literals.ZL_FSTR__IDZL,
				 VerweiseFactory.eINSTANCE.createID_ZL_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZuglenkungPackage.Literals.ZL_FSTR__IDZL_FSTR,
				 VerweiseFactory.eINSTANCE.createID_ZL_Fstr_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZuglenkungPackage.Literals.ZL_FSTR__ZL_FSTR_ALLG,
				 ZuglenkungFactory.eINSTANCE.createZL_Fstr_Allg_AttributeGroup()));
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
