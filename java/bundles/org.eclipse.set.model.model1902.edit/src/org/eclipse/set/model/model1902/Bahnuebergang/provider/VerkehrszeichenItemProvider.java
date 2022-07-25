/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangFactory;
import org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen;

import org.eclipse.set.model.model1902.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.model.model1902.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.model1902.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VerkehrszeichenItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerkehrszeichenItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getVerkehrszeichen_Bezeichnung());
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getVerkehrszeichen_IDBUEAnlage());
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getVerkehrszeichen_IDUnterbringung());
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getVerkehrszeichen_VerkehrszeichenAllg());
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getVerkehrszeichen_VerkehrszeichenAndreaskreuz());
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getVerkehrszeichen_VerkehrszeichenLz());
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getVerkehrszeichen_VzSperrstrecke());
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
	 * This returns Verkehrszeichen.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Verkehrszeichen"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Verkehrszeichen_type");
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

		switch (notification.getFeatureID(Verkehrszeichen.class)) {
			case BahnuebergangPackage.VERKEHRSZEICHEN__BEZEICHNUNG:
			case BahnuebergangPackage.VERKEHRSZEICHEN__IDBUE_ANLAGE:
			case BahnuebergangPackage.VERKEHRSZEICHEN__ID_UNTERBRINGUNG:
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ALLG:
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ANDREASKREUZ:
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_LZ:
			case BahnuebergangPackage.VERKEHRSZEICHEN__VZ_SPERRSTRECKE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
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
				(BahnuebergangPackage.eINSTANCE.getVerkehrszeichen_Bezeichnung(),
				 BahnuebergangFactory.eINSTANCE.createVerkehrszeichen_Bezeichnung_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BahnuebergangPackage.eINSTANCE.getVerkehrszeichen_IDBUEAnlage(),
				 VerweiseFactory.eINSTANCE.createID_BUE_Anlage_ohne_Proxy_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BahnuebergangPackage.eINSTANCE.getVerkehrszeichen_IDUnterbringung(),
				 VerweiseFactory.eINSTANCE.createID_Unterbringung_ohne_Proxy_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BahnuebergangPackage.eINSTANCE.getVerkehrszeichen_VerkehrszeichenAllg(),
				 BahnuebergangFactory.eINSTANCE.createVerkehrszeichen_Allg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BahnuebergangPackage.eINSTANCE.getVerkehrszeichen_VerkehrszeichenAndreaskreuz(),
				 BahnuebergangFactory.eINSTANCE.createVerkehrszeichen_Andreaskreuz_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BahnuebergangPackage.eINSTANCE.getVerkehrszeichen_VerkehrszeichenLz(),
				 BahnuebergangFactory.eINSTANCE.createVerkehrszeichen_Lz_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BahnuebergangPackage.eINSTANCE.getVerkehrszeichen_VzSperrstrecke(),
				 BahnuebergangFactory.eINSTANCE.createVz_Sperrstrecke_AttributeGroup()));
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
