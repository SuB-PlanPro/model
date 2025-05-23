/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.provider;


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

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSFactory;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Ausgang_AttributeGroup;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Ausgang_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EV_Modul_Ausgang_AttributeGroupItemProvider 
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
	public EV_Modul_Ausgang_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getEV_Modul_Ausgang_AttributeGroup_AusgangNr());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getEV_Modul_Ausgang_AttributeGroup_MaxUnterbrechungszeit());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getEV_Modul_Ausgang_AttributeGroup_Nennleistung());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getEV_Modul_Ausgang_AttributeGroup_SpannungArt());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getEV_Modul_Ausgang_AttributeGroup_SpannungToleranzObere());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getEV_Modul_Ausgang_AttributeGroup_SpannungToleranzUntere());
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
	 * This returns EV_Modul_Ausgang_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EV_Modul_Ausgang_AttributeGroup"));
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
		return getString("_UI_EV_Modul_Ausgang_AttributeGroup_type");
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

		switch (notification.getFeatureID(EV_Modul_Ausgang_AttributeGroup.class)) {
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__AUSGANG_NR:
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__MAX_UNTERBRECHUNGSZEIT:
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__NENNLEISTUNG:
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_ART:
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_TOLERANZ_OBERE:
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_TOLERANZ_UNTERE:
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
				(Balisentechnik_ETCSPackage.eINSTANCE.getEV_Modul_Ausgang_AttributeGroup_AusgangNr(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createAusgang_Nr_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getEV_Modul_Ausgang_AttributeGroup_MaxUnterbrechungszeit(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createMax_Unterbrechungszeit_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getEV_Modul_Ausgang_AttributeGroup_Nennleistung(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createNennleistung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getEV_Modul_Ausgang_AttributeGroup_SpannungArt(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createSpannung_Art_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getEV_Modul_Ausgang_AttributeGroup_SpannungToleranzObere(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createSpannung_Toleranz_Obere_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getEV_Modul_Ausgang_AttributeGroup_SpannungToleranzUntere(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createSpannung_Toleranz_Untere_TypeClass()));
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
