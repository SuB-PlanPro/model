/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PZB.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.set.model.planpro.PZB.util.PZBAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PZBItemProviderAdapterFactory extends PZBAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PZBItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.GUE_Abstand_Abweichend_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GUE_Abstand_Abweichend_TypeClassItemProvider guE_Abstand_Abweichend_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.GUE_Abstand_Abweichend_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGUE_Abstand_Abweichend_TypeClassAdapter() {
		if (guE_Abstand_Abweichend_TypeClassItemProvider == null) {
			guE_Abstand_Abweichend_TypeClassItemProvider = new GUE_Abstand_Abweichend_TypeClassItemProvider(this);
		}

		return guE_Abstand_Abweichend_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.GUE_Anordnung_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GUE_Anordnung_TypeClassItemProvider guE_Anordnung_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.GUE_Anordnung_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGUE_Anordnung_TypeClassAdapter() {
		if (guE_Anordnung_TypeClassItemProvider == null) {
			guE_Anordnung_TypeClassItemProvider = new GUE_Anordnung_TypeClassItemProvider(this);
		}

		return guE_Anordnung_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.GUE_Bauart_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GUE_Bauart_TypeClassItemProvider guE_Bauart_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.GUE_Bauart_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGUE_Bauart_TypeClassAdapter() {
		if (guE_Bauart_TypeClassItemProvider == null) {
			guE_Bauart_TypeClassItemProvider = new GUE_Bauart_TypeClassItemProvider(this);
		}

		return guE_Bauart_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.GUE_Energieversorgung_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GUE_Energieversorgung_TypeClassItemProvider guE_Energieversorgung_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.GUE_Energieversorgung_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGUE_Energieversorgung_TypeClassAdapter() {
		if (guE_Energieversorgung_TypeClassItemProvider == null) {
			guE_Energieversorgung_TypeClassItemProvider = new GUE_Energieversorgung_TypeClassItemProvider(this);
		}

		return guE_Energieversorgung_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.GUE_Messstrecke_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GUE_Messstrecke_TypeClassItemProvider guE_Messstrecke_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.GUE_Messstrecke_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGUE_Messstrecke_TypeClassAdapter() {
		if (guE_Messstrecke_TypeClassItemProvider == null) {
			guE_Messstrecke_TypeClassItemProvider = new GUE_Messstrecke_TypeClassItemProvider(this);
		}

		return guE_Messstrecke_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.INA_Gefahrstelle_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected INA_Gefahrstelle_AttributeGroupItemProvider inA_Gefahrstelle_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.INA_Gefahrstelle_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createINA_Gefahrstelle_AttributeGroupAdapter() {
		if (inA_Gefahrstelle_AttributeGroupItemProvider == null) {
			inA_Gefahrstelle_AttributeGroupItemProvider = new INA_Gefahrstelle_AttributeGroupItemProvider(this);
		}

		return inA_Gefahrstelle_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.Messfehler_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Messfehler_TypeClassItemProvider messfehler_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.Messfehler_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessfehler_TypeClassAdapter() {
		if (messfehler_TypeClassItemProvider == null) {
			messfehler_TypeClassItemProvider = new Messfehler_TypeClassItemProvider(this);
		}

		return messfehler_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.Prioritaet_Gefahrstelle_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Prioritaet_Gefahrstelle_TypeClassItemProvider prioritaet_Gefahrstelle_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.Prioritaet_Gefahrstelle_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrioritaet_Gefahrstelle_TypeClassAdapter() {
		if (prioritaet_Gefahrstelle_TypeClassItemProvider == null) {
			prioritaet_Gefahrstelle_TypeClassItemProvider = new Prioritaet_Gefahrstelle_TypeClassItemProvider(this);
		}

		return prioritaet_Gefahrstelle_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.Pruefgeschwindigkeit_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pruefgeschwindigkeit_TypeClassItemProvider pruefgeschwindigkeit_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.Pruefgeschwindigkeit_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPruefgeschwindigkeit_TypeClassAdapter() {
		if (pruefgeschwindigkeit_TypeClassItemProvider == null) {
			pruefgeschwindigkeit_TypeClassItemProvider = new Pruefgeschwindigkeit_TypeClassItemProvider(this);
		}

		return pruefgeschwindigkeit_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.Pruefzeit_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pruefzeit_TypeClassItemProvider pruefzeit_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.Pruefzeit_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPruefzeit_TypeClassAdapter() {
		if (pruefzeit_TypeClassItemProvider == null) {
			pruefzeit_TypeClassItemProvider = new Pruefzeit_TypeClassItemProvider(this);
		}

		return pruefzeit_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.PZB_Abstand_GM_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Abstand_GM_TypeClassItemProvider pzB_Abstand_GM_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.PZB_Abstand_GM_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPZB_Abstand_GM_TypeClassAdapter() {
		if (pzB_Abstand_GM_TypeClassItemProvider == null) {
			pzB_Abstand_GM_TypeClassItemProvider = new PZB_Abstand_GM_TypeClassItemProvider(this);
		}

		return pzB_Abstand_GM_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.PZB_Art_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Art_TypeClassItemProvider pzB_Art_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.PZB_Art_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPZB_Art_TypeClassAdapter() {
		if (pzB_Art_TypeClassItemProvider == null) {
			pzB_Art_TypeClassItemProvider = new PZB_Art_TypeClassItemProvider(this);
		}

		return pzB_Art_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.PZB_Element} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_ElementItemProvider pzB_ElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.PZB_Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPZB_ElementAdapter() {
		if (pzB_ElementItemProvider == null) {
			pzB_ElementItemProvider = new PZB_ElementItemProvider(this);
		}

		return pzB_ElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.PZB_Element_GM_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Element_GM_AttributeGroupItemProvider pzB_Element_GM_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.PZB_Element_GM_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPZB_Element_GM_AttributeGroupAdapter() {
		if (pzB_Element_GM_AttributeGroupItemProvider == null) {
			pzB_Element_GM_AttributeGroupItemProvider = new PZB_Element_GM_AttributeGroupItemProvider(this);
		}

		return pzB_Element_GM_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Element_GUE_AttributeGroupItemProvider pzB_Element_GUE_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPZB_Element_GUE_AttributeGroupAdapter() {
		if (pzB_Element_GUE_AttributeGroupItemProvider == null) {
			pzB_Element_GUE_AttributeGroupItemProvider = new PZB_Element_GUE_AttributeGroupItemProvider(this);
		}

		return pzB_Element_GUE_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Element_ZuordnungItemProvider pzB_Element_ZuordnungItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPZB_Element_ZuordnungAdapter() {
		if (pzB_Element_ZuordnungItemProvider == null) {
			pzB_Element_ZuordnungItemProvider = new PZB_Element_ZuordnungItemProvider(this);
		}

		return pzB_Element_ZuordnungItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_BP_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Element_Zuordnung_BP_AttributeGroupItemProvider pzB_Element_Zuordnung_BP_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_BP_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPZB_Element_Zuordnung_BP_AttributeGroupAdapter() {
		if (pzB_Element_Zuordnung_BP_AttributeGroupItemProvider == null) {
			pzB_Element_Zuordnung_BP_AttributeGroupItemProvider = new PZB_Element_Zuordnung_BP_AttributeGroupItemProvider(this);
		}

		return pzB_Element_Zuordnung_BP_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_Fstr_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Element_Zuordnung_Fstr_AttributeGroupItemProvider pzB_Element_Zuordnung_Fstr_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_Fstr_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPZB_Element_Zuordnung_Fstr_AttributeGroupAdapter() {
		if (pzB_Element_Zuordnung_Fstr_AttributeGroupItemProvider == null) {
			pzB_Element_Zuordnung_Fstr_AttributeGroupItemProvider = new PZB_Element_Zuordnung_Fstr_AttributeGroupItemProvider(this);
		}

		return pzB_Element_Zuordnung_Fstr_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_INA_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Element_Zuordnung_INA_AttributeGroupItemProvider pzB_Element_Zuordnung_INA_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_INA_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPZB_Element_Zuordnung_INA_AttributeGroupAdapter() {
		if (pzB_Element_Zuordnung_INA_AttributeGroupItemProvider == null) {
			pzB_Element_Zuordnung_INA_AttributeGroupItemProvider = new PZB_Element_Zuordnung_INA_AttributeGroupItemProvider(this);
		}

		return pzB_Element_Zuordnung_INA_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.PZB_INA_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_INA_TypeClassItemProvider pzB_INA_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.PZB_INA_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPZB_INA_TypeClassAdapter() {
		if (pzB_INA_TypeClassItemProvider == null) {
			pzB_INA_TypeClassItemProvider = new PZB_INA_TypeClassItemProvider(this);
		}

		return pzB_INA_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.PZB_Zuordnung_Signal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Zuordnung_SignalItemProvider pzB_Zuordnung_SignalItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.PZB_Zuordnung_Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPZB_Zuordnung_SignalAdapter() {
		if (pzB_Zuordnung_SignalItemProvider == null) {
			pzB_Zuordnung_SignalItemProvider = new PZB_Zuordnung_SignalItemProvider(this);
		}

		return pzB_Zuordnung_SignalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.Wirksamkeit_Fstr_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Wirksamkeit_Fstr_TypeClassItemProvider wirksamkeit_Fstr_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.Wirksamkeit_Fstr_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWirksamkeit_Fstr_TypeClassAdapter() {
		if (wirksamkeit_Fstr_TypeClassItemProvider == null) {
			wirksamkeit_Fstr_TypeClassItemProvider = new Wirksamkeit_Fstr_TypeClassItemProvider(this);
		}

		return wirksamkeit_Fstr_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.PZB.Wirksamkeit_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Wirksamkeit_TypeClassItemProvider wirksamkeit_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.PZB.Wirksamkeit_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWirksamkeit_TypeClassAdapter() {
		if (wirksamkeit_TypeClassItemProvider == null) {
			wirksamkeit_TypeClassItemProvider = new Wirksamkeit_TypeClassItemProvider(this);
		}

		return wirksamkeit_TypeClassItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (guE_Abstand_Abweichend_TypeClassItemProvider != null) guE_Abstand_Abweichend_TypeClassItemProvider.dispose();
		if (guE_Anordnung_TypeClassItemProvider != null) guE_Anordnung_TypeClassItemProvider.dispose();
		if (guE_Bauart_TypeClassItemProvider != null) guE_Bauart_TypeClassItemProvider.dispose();
		if (guE_Energieversorgung_TypeClassItemProvider != null) guE_Energieversorgung_TypeClassItemProvider.dispose();
		if (guE_Messstrecke_TypeClassItemProvider != null) guE_Messstrecke_TypeClassItemProvider.dispose();
		if (inA_Gefahrstelle_AttributeGroupItemProvider != null) inA_Gefahrstelle_AttributeGroupItemProvider.dispose();
		if (messfehler_TypeClassItemProvider != null) messfehler_TypeClassItemProvider.dispose();
		if (prioritaet_Gefahrstelle_TypeClassItemProvider != null) prioritaet_Gefahrstelle_TypeClassItemProvider.dispose();
		if (pruefgeschwindigkeit_TypeClassItemProvider != null) pruefgeschwindigkeit_TypeClassItemProvider.dispose();
		if (pruefzeit_TypeClassItemProvider != null) pruefzeit_TypeClassItemProvider.dispose();
		if (pzB_Abstand_GM_TypeClassItemProvider != null) pzB_Abstand_GM_TypeClassItemProvider.dispose();
		if (pzB_Art_TypeClassItemProvider != null) pzB_Art_TypeClassItemProvider.dispose();
		if (pzB_ElementItemProvider != null) pzB_ElementItemProvider.dispose();
		if (pzB_Element_GM_AttributeGroupItemProvider != null) pzB_Element_GM_AttributeGroupItemProvider.dispose();
		if (pzB_Element_GUE_AttributeGroupItemProvider != null) pzB_Element_GUE_AttributeGroupItemProvider.dispose();
		if (pzB_Element_ZuordnungItemProvider != null) pzB_Element_ZuordnungItemProvider.dispose();
		if (pzB_Element_Zuordnung_BP_AttributeGroupItemProvider != null) pzB_Element_Zuordnung_BP_AttributeGroupItemProvider.dispose();
		if (pzB_Element_Zuordnung_Fstr_AttributeGroupItemProvider != null) pzB_Element_Zuordnung_Fstr_AttributeGroupItemProvider.dispose();
		if (pzB_Element_Zuordnung_INA_AttributeGroupItemProvider != null) pzB_Element_Zuordnung_INA_AttributeGroupItemProvider.dispose();
		if (pzB_INA_TypeClassItemProvider != null) pzB_INA_TypeClassItemProvider.dispose();
		if (pzB_Zuordnung_SignalItemProvider != null) pzB_Zuordnung_SignalItemProvider.dispose();
		if (wirksamkeit_Fstr_TypeClassItemProvider != null) wirksamkeit_Fstr_TypeClassItemProvider.dispose();
		if (wirksamkeit_TypeClassItemProvider != null) wirksamkeit_TypeClassItemProvider.dispose();
	}

}
