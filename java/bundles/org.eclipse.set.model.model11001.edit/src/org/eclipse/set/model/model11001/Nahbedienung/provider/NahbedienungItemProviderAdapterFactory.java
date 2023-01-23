/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Nahbedienung.provider;

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

import org.eclipse.set.model.model11001.Nahbedienung.util.NahbedienungAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NahbedienungItemProviderAdapterFactory extends NahbedienungAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public NahbedienungItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.AWU_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AWU_TypeClassItemProvider awU_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.AWU_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAWU_TypeClassAdapter() {
		if (awU_TypeClassItemProvider == null) {
			awU_TypeClassItemProvider = new AWU_TypeClassItemProvider(this);
		}

		return awU_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.Bezeichnung_NB_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bezeichnung_NB_TypeClassItemProvider bezeichnung_NB_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.Bezeichnung_NB_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBezeichnung_NB_TypeClassAdapter() {
		if (bezeichnung_NB_TypeClassItemProvider == null) {
			bezeichnung_NB_TypeClassItemProvider = new Bezeichnung_NB_TypeClassItemProvider(this);
		}

		return bezeichnung_NB_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.Bezeichnung_NB_Zone_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bezeichnung_NB_Zone_TypeClassItemProvider bezeichnung_NB_Zone_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.Bezeichnung_NB_Zone_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBezeichnung_NB_Zone_TypeClassAdapter() {
		if (bezeichnung_NB_Zone_TypeClassItemProvider == null) {
			bezeichnung_NB_Zone_TypeClassItemProvider = new Bezeichnung_NB_Zone_TypeClassItemProvider(this);
		}

		return bezeichnung_NB_Zone_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.F_ST_Z_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected F_ST_Z_TypeClassItemProvider f_ST_Z_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.F_ST_Z_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createF_ST_Z_TypeClassAdapter() {
		if (f_ST_Z_TypeClassItemProvider == null) {
			f_ST_Z_TypeClassItemProvider = new F_ST_Z_TypeClassItemProvider(this);
		}

		return f_ST_Z_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.FA_FAE_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FA_FAE_TypeClassItemProvider fA_FAE_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.FA_FAE_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFA_FAE_TypeClassAdapter() {
		if (fA_FAE_TypeClassItemProvider == null) {
			fA_FAE_TypeClassItemProvider = new FA_FAE_TypeClassItemProvider(this);
		}

		return fA_FAE_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.Freie_Stellbarkeit_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Freie_Stellbarkeit_TypeClassItemProvider freie_Stellbarkeit_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.Freie_Stellbarkeit_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFreie_Stellbarkeit_TypeClassAdapter() {
		if (freie_Stellbarkeit_TypeClassItemProvider == null) {
			freie_Stellbarkeit_TypeClassItemProvider = new Freie_Stellbarkeit_TypeClassItemProvider(this);
		}

		return freie_Stellbarkeit_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.Kennzahl_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Kennzahl_TypeClassItemProvider kennzahl_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.Kennzahl_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKennzahl_TypeClassAdapter() {
		if (kennzahl_TypeClassItemProvider == null) {
			kennzahl_TypeClassItemProvider = new Kennzahl_TypeClassItemProvider(this);
		}

		return kennzahl_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.NB} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NBItemProvider nbItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.NB}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNBAdapter() {
		if (nbItemProvider == null) {
			nbItemProvider = new NBItemProvider(this);
		}

		return nbItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Art_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Art_TypeClassItemProvider nB_Art_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Art_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNB_Art_TypeClassAdapter() {
		if (nB_Art_TypeClassItemProvider == null) {
			nB_Art_TypeClassItemProvider = new NB_Art_TypeClassItemProvider(this);
		}

		return nB_Art_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Bedien_Anzeige_Element} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Bedien_Anzeige_ElementItemProvider nB_Bedien_Anzeige_ElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Bedien_Anzeige_Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNB_Bedien_Anzeige_ElementAdapter() {
		if (nB_Bedien_Anzeige_ElementItemProvider == null) {
			nB_Bedien_Anzeige_ElementItemProvider = new NB_Bedien_Anzeige_ElementItemProvider(this);
		}

		return nB_Bedien_Anzeige_ElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Bedien_Anzeige_Funktionen_AttributeGroupItemProvider nB_Bedien_Anzeige_Funktionen_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNB_Bedien_Anzeige_Funktionen_AttributeGroupAdapter() {
		if (nB_Bedien_Anzeige_Funktionen_AttributeGroupItemProvider == null) {
			nB_Bedien_Anzeige_Funktionen_AttributeGroupItemProvider = new NB_Bedien_Anzeige_Funktionen_AttributeGroupItemProvider(this);
		}

		return nB_Bedien_Anzeige_Funktionen_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Bezeichnung_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Bezeichnung_AttributeGroupItemProvider nB_Bezeichnung_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Bezeichnung_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNB_Bezeichnung_AttributeGroupAdapter() {
		if (nB_Bezeichnung_AttributeGroupItemProvider == null) {
			nB_Bezeichnung_AttributeGroupItemProvider = new NB_Bezeichnung_AttributeGroupItemProvider(this);
		}

		return nB_Bezeichnung_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Funktionalitaet_NB_R_AttributeGroupItemProvider nB_Funktionalitaet_NB_R_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNB_Funktionalitaet_NB_R_AttributeGroupAdapter() {
		if (nB_Funktionalitaet_NB_R_AttributeGroupItemProvider == null) {
			nB_Funktionalitaet_NB_R_AttributeGroupItemProvider = new NB_Funktionalitaet_NB_R_AttributeGroupItemProvider(this);
		}

		return nB_Funktionalitaet_NB_R_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Grenze_Art_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Grenze_Art_TypeClassItemProvider nB_Grenze_Art_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Grenze_Art_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNB_Grenze_Art_TypeClassAdapter() {
		if (nB_Grenze_Art_TypeClassItemProvider == null) {
			nB_Grenze_Art_TypeClassItemProvider = new NB_Grenze_Art_TypeClassItemProvider(this);
		}

		return nB_Grenze_Art_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Rueckgabevoraussetzung_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Rueckgabevoraussetzung_TypeClassItemProvider nB_Rueckgabevoraussetzung_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Rueckgabevoraussetzung_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNB_Rueckgabevoraussetzung_TypeClassAdapter() {
		if (nB_Rueckgabevoraussetzung_TypeClassItemProvider == null) {
			nB_Rueckgabevoraussetzung_TypeClassItemProvider = new NB_Rueckgabevoraussetzung_TypeClassItemProvider(this);
		}

		return nB_Rueckgabevoraussetzung_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Verhaeltnis_Besonders_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Verhaeltnis_Besonders_TypeClassItemProvider nB_Verhaeltnis_Besonders_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Verhaeltnis_Besonders_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNB_Verhaeltnis_Besonders_TypeClassAdapter() {
		if (nB_Verhaeltnis_Besonders_TypeClassItemProvider == null) {
			nB_Verhaeltnis_Besonders_TypeClassItemProvider = new NB_Verhaeltnis_Besonders_TypeClassItemProvider(this);
		}

		return nB_Verhaeltnis_Besonders_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_ZoneItemProvider nB_ZoneItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNB_ZoneAdapter() {
		if (nB_ZoneItemProvider == null) {
			nB_ZoneItemProvider = new NB_ZoneItemProvider(this);
		}

		return nB_ZoneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Allg_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Zone_Allg_AttributeGroupItemProvider nB_Zone_Allg_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Allg_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNB_Zone_Allg_AttributeGroupAdapter() {
		if (nB_Zone_Allg_AttributeGroupItemProvider == null) {
			nB_Zone_Allg_AttributeGroupItemProvider = new NB_Zone_Allg_AttributeGroupItemProvider(this);
		}

		return nB_Zone_Allg_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Allg_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Zone_Allg_TypeClassItemProvider nB_Zone_Allg_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Allg_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNB_Zone_Allg_TypeClassAdapter() {
		if (nB_Zone_Allg_TypeClassItemProvider == null) {
			nB_Zone_Allg_TypeClassItemProvider = new NB_Zone_Allg_TypeClassItemProvider(this);
		}

		return nB_Zone_Allg_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Bezeichnung_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Zone_Bezeichnung_AttributeGroupItemProvider nB_Zone_Bezeichnung_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Bezeichnung_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNB_Zone_Bezeichnung_AttributeGroupAdapter() {
		if (nB_Zone_Bezeichnung_AttributeGroupItemProvider == null) {
			nB_Zone_Bezeichnung_AttributeGroupItemProvider = new NB_Zone_Bezeichnung_AttributeGroupItemProvider(this);
		}

		return nB_Zone_Bezeichnung_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Element} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Zone_ElementItemProvider nB_Zone_ElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNB_Zone_ElementAdapter() {
		if (nB_Zone_ElementItemProvider == null) {
			nB_Zone_ElementItemProvider = new NB_Zone_ElementItemProvider(this);
		}

		return nB_Zone_ElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Zone_Element_Allg_AttributeGroupItemProvider nB_Zone_Element_Allg_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNB_Zone_Element_Allg_AttributeGroupAdapter() {
		if (nB_Zone_Element_Allg_AttributeGroupItemProvider == null) {
			nB_Zone_Element_Allg_AttributeGroupItemProvider = new NB_Zone_Element_Allg_AttributeGroupItemProvider(this);
		}

		return nB_Zone_Element_Allg_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Grenze} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Zone_GrenzeItemProvider nB_Zone_GrenzeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Grenze}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNB_Zone_GrenzeAdapter() {
		if (nB_Zone_GrenzeItemProvider == null) {
			nB_Zone_GrenzeItemProvider = new NB_Zone_GrenzeItemProvider(this);
		}

		return nB_Zone_GrenzeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Reihenfolgezwang_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Zone_Reihenfolgezwang_AttributeGroupItemProvider nB_Zone_Reihenfolgezwang_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Reihenfolgezwang_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNB_Zone_Reihenfolgezwang_AttributeGroupAdapter() {
		if (nB_Zone_Reihenfolgezwang_AttributeGroupItemProvider == null) {
			nB_Zone_Reihenfolgezwang_AttributeGroupItemProvider = new NB_Zone_Reihenfolgezwang_AttributeGroupItemProvider(this);
		}

		return nB_Zone_Reihenfolgezwang_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.Rang_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Rang_TypeClassItemProvider rang_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.Rang_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRang_TypeClassAdapter() {
		if (rang_TypeClassItemProvider == null) {
			rang_TypeClassItemProvider = new Rang_TypeClassItemProvider(this);
		}

		return rang_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.SBUE_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SBUE_TypeClassItemProvider sbuE_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.SBUE_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSBUE_TypeClassAdapter() {
		if (sbuE_TypeClassItemProvider == null) {
			sbuE_TypeClassItemProvider = new SBUE_TypeClassItemProvider(this);
		}

		return sbuE_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.SLE_SLS_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SLE_SLS_TypeClassItemProvider slE_SLS_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.SLE_SLS_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSLE_SLS_TypeClassAdapter() {
		if (slE_SLS_TypeClassItemProvider == null) {
			slE_SLS_TypeClassItemProvider = new SLE_SLS_TypeClassItemProvider(this);
		}

		return slE_SLS_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.Taste_ANF_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Taste_ANF_TypeClassItemProvider taste_ANF_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.Taste_ANF_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaste_ANF_TypeClassAdapter() {
		if (taste_ANF_TypeClassItemProvider == null) {
			taste_ANF_TypeClassItemProvider = new Taste_ANF_TypeClassItemProvider(this);
		}

		return taste_ANF_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.Taste_FGT_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Taste_FGT_TypeClassItemProvider taste_FGT_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.Taste_FGT_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaste_FGT_TypeClassAdapter() {
		if (taste_FGT_TypeClassItemProvider == null) {
			taste_FGT_TypeClassItemProvider = new Taste_FGT_TypeClassItemProvider(this);
		}

		return taste_FGT_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.Taste_WGT_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Taste_WGT_TypeClassItemProvider taste_WGT_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.Taste_WGT_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaste_WGT_TypeClassAdapter() {
		if (taste_WGT_TypeClassItemProvider == null) {
			taste_WGT_TypeClassItemProvider = new Taste_WGT_TypeClassItemProvider(this);
		}

		return taste_WGT_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.W_Gsp_Lage_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected W_Gsp_Lage_TypeClassItemProvider w_Gsp_Lage_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.W_Gsp_Lage_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createW_Gsp_Lage_TypeClassAdapter() {
		if (w_Gsp_Lage_TypeClassItemProvider == null) {
			w_Gsp_Lage_TypeClassItemProvider = new W_Gsp_Lage_TypeClassItemProvider(this);
		}

		return w_Gsp_Lage_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.WHU_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WHU_TypeClassItemProvider whU_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.WHU_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWHU_TypeClassAdapter() {
		if (whU_TypeClassItemProvider == null) {
			whU_TypeClassItemProvider = new WHU_TypeClassItemProvider(this);
		}

		return whU_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Nahbedienung.WUS_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WUS_TypeClassItemProvider wuS_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Nahbedienung.WUS_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWUS_TypeClassAdapter() {
		if (wuS_TypeClassItemProvider == null) {
			wuS_TypeClassItemProvider = new WUS_TypeClassItemProvider(this);
		}

		return wuS_TypeClassItemProvider;
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
		if (awU_TypeClassItemProvider != null) awU_TypeClassItemProvider.dispose();
		if (bezeichnung_NB_TypeClassItemProvider != null) bezeichnung_NB_TypeClassItemProvider.dispose();
		if (bezeichnung_NB_Zone_TypeClassItemProvider != null) bezeichnung_NB_Zone_TypeClassItemProvider.dispose();
		if (f_ST_Z_TypeClassItemProvider != null) f_ST_Z_TypeClassItemProvider.dispose();
		if (fA_FAE_TypeClassItemProvider != null) fA_FAE_TypeClassItemProvider.dispose();
		if (freie_Stellbarkeit_TypeClassItemProvider != null) freie_Stellbarkeit_TypeClassItemProvider.dispose();
		if (kennzahl_TypeClassItemProvider != null) kennzahl_TypeClassItemProvider.dispose();
		if (nbItemProvider != null) nbItemProvider.dispose();
		if (nB_Art_TypeClassItemProvider != null) nB_Art_TypeClassItemProvider.dispose();
		if (nB_Bedien_Anzeige_ElementItemProvider != null) nB_Bedien_Anzeige_ElementItemProvider.dispose();
		if (nB_Bedien_Anzeige_Funktionen_AttributeGroupItemProvider != null) nB_Bedien_Anzeige_Funktionen_AttributeGroupItemProvider.dispose();
		if (nB_Bezeichnung_AttributeGroupItemProvider != null) nB_Bezeichnung_AttributeGroupItemProvider.dispose();
		if (nB_Funktionalitaet_NB_R_AttributeGroupItemProvider != null) nB_Funktionalitaet_NB_R_AttributeGroupItemProvider.dispose();
		if (nB_Grenze_Art_TypeClassItemProvider != null) nB_Grenze_Art_TypeClassItemProvider.dispose();
		if (nB_Rueckgabevoraussetzung_TypeClassItemProvider != null) nB_Rueckgabevoraussetzung_TypeClassItemProvider.dispose();
		if (nB_Verhaeltnis_Besonders_TypeClassItemProvider != null) nB_Verhaeltnis_Besonders_TypeClassItemProvider.dispose();
		if (nB_ZoneItemProvider != null) nB_ZoneItemProvider.dispose();
		if (nB_Zone_Allg_AttributeGroupItemProvider != null) nB_Zone_Allg_AttributeGroupItemProvider.dispose();
		if (nB_Zone_Allg_TypeClassItemProvider != null) nB_Zone_Allg_TypeClassItemProvider.dispose();
		if (nB_Zone_Bezeichnung_AttributeGroupItemProvider != null) nB_Zone_Bezeichnung_AttributeGroupItemProvider.dispose();
		if (nB_Zone_ElementItemProvider != null) nB_Zone_ElementItemProvider.dispose();
		if (nB_Zone_Element_Allg_AttributeGroupItemProvider != null) nB_Zone_Element_Allg_AttributeGroupItemProvider.dispose();
		if (nB_Zone_GrenzeItemProvider != null) nB_Zone_GrenzeItemProvider.dispose();
		if (nB_Zone_Reihenfolgezwang_AttributeGroupItemProvider != null) nB_Zone_Reihenfolgezwang_AttributeGroupItemProvider.dispose();
		if (rang_TypeClassItemProvider != null) rang_TypeClassItemProvider.dispose();
		if (sbuE_TypeClassItemProvider != null) sbuE_TypeClassItemProvider.dispose();
		if (slE_SLS_TypeClassItemProvider != null) slE_SLS_TypeClassItemProvider.dispose();
		if (taste_ANF_TypeClassItemProvider != null) taste_ANF_TypeClassItemProvider.dispose();
		if (taste_FGT_TypeClassItemProvider != null) taste_FGT_TypeClassItemProvider.dispose();
		if (taste_WGT_TypeClassItemProvider != null) taste_WGT_TypeClassItemProvider.dispose();
		if (w_Gsp_Lage_TypeClassItemProvider != null) w_Gsp_Lage_TypeClassItemProvider.dispose();
		if (whU_TypeClassItemProvider != null) whU_TypeClassItemProvider.dispose();
		if (wuS_TypeClassItemProvider != null) wuS_TypeClassItemProvider.dispose();
	}

}
