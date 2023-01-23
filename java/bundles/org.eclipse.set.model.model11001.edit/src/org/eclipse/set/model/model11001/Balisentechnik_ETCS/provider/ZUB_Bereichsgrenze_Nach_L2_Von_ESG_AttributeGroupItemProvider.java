/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS.provider;


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

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSFactory;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup;

import org.eclipse.set.model.model11001.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.model11001.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupItemProvider 
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
	public ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup_AbstandDatenpunktEHEMFolgesignal());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup_AbstandDatenpunktEPTPI());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup_AbstandDatenpunktTPIFolgesignal());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup_IDFachtelegramm());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup_IDFolgesignal());
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
	 * This returns ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup_type");
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

		switch (notification.getFeatureID(ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup.class)) {
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EHEM_FOLGESIGNAL:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EPTPI:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FACHTELEGRAMM:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FOLGESIGNAL:
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
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup_AbstandDatenpunktEHEMFolgesignal(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createAbstand_Datenpunkt_EH_EM_Folgesignal_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup_AbstandDatenpunktEPTPI(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createAbstand_Datenpunkt_EP_TPI_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup_AbstandDatenpunktTPIFolgesignal(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createAbstand_Datenpunkt_TPI_Folgesignal_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup_IDFachtelegramm(),
				 VerweiseFactory.eINSTANCE.createID_Fachtelegramm_ohne_Proxy_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup_IDFolgesignal(),
				 VerweiseFactory.eINSTANCE.createID_Signal_TypeClass()));
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
