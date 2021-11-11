/*******************************************************************************
 * Copyright (c) 2021 Abel Gómez.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Abel Gómez (abgolla@gmail.com) - initial API and implementation
 *******************************************************************************/
package io.github.abelgomez.cpntools.impl;

import io.github.abelgomez.cpntools.Binder;
import io.github.abelgomez.cpntools.Cpnet;
import io.github.abelgomez.cpntools.CpntoolsPackage;
import io.github.abelgomez.cpntools.Fusion;
import io.github.abelgomez.cpntools.Globbox;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cpnet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.impl.CpnetImpl#getFusions <em>Fusions</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.CpnetImpl#getGlobbox <em>Globbox</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.CpnetImpl#getBinder <em>Binder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CpnetImpl extends MinimalEObjectImpl.Container implements Cpnet {
	/**
	 * The cached value of the '{@link #getFusions() <em>Fusions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFusions()
	 * @generated
	 * @ordered
	 */
	protected EList<Fusion> fusions;

	/**
	 * The cached value of the '{@link #getGlobbox() <em>Globbox</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobbox()
	 * @generated
	 * @ordered
	 */
	protected Globbox globbox;

	/**
	 * The cached value of the '{@link #getBinder() <em>Binder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinder()
	 * @generated
	 * @ordered
	 */
	protected Binder binder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CpnetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpntoolsPackage.Literals.CPNET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fusion> getFusions() {
		if (fusions == null) {
			fusions = new EObjectContainmentWithInverseEList<Fusion>(Fusion.class, this, CpntoolsPackage.CPNET__FUSIONS, CpntoolsPackage.FUSION__CPNET);
		}
		return fusions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Globbox getGlobbox() {
		return globbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobbox(Globbox newGlobbox, NotificationChain msgs) {
		Globbox oldGlobbox = globbox;
		globbox = newGlobbox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpntoolsPackage.CPNET__GLOBBOX, oldGlobbox, newGlobbox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobbox(Globbox newGlobbox) {
		if (newGlobbox != globbox) {
			NotificationChain msgs = null;
			if (globbox != null)
				msgs = ((InternalEObject)globbox).eInverseRemove(this, CpntoolsPackage.GLOBBOX__CPNET, Globbox.class, msgs);
			if (newGlobbox != null)
				msgs = ((InternalEObject)newGlobbox).eInverseAdd(this, CpntoolsPackage.GLOBBOX__CPNET, Globbox.class, msgs);
			msgs = basicSetGlobbox(newGlobbox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.CPNET__GLOBBOX, newGlobbox, newGlobbox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binder getBinder() {
		return binder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinder(Binder newBinder, NotificationChain msgs) {
		Binder oldBinder = binder;
		binder = newBinder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpntoolsPackage.CPNET__BINDER, oldBinder, newBinder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinder(Binder newBinder) {
		if (newBinder != binder) {
			NotificationChain msgs = null;
			if (binder != null)
				msgs = ((InternalEObject)binder).eInverseRemove(this, CpntoolsPackage.BINDER__CPNET, Binder.class, msgs);
			if (newBinder != null)
				msgs = ((InternalEObject)newBinder).eInverseAdd(this, CpntoolsPackage.BINDER__CPNET, Binder.class, msgs);
			msgs = basicSetBinder(newBinder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.CPNET__BINDER, newBinder, newBinder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpntoolsPackage.CPNET__FUSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFusions()).basicAdd(otherEnd, msgs);
			case CpntoolsPackage.CPNET__GLOBBOX:
				if (globbox != null)
					msgs = ((InternalEObject)globbox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpntoolsPackage.CPNET__GLOBBOX, null, msgs);
				return basicSetGlobbox((Globbox)otherEnd, msgs);
			case CpntoolsPackage.CPNET__BINDER:
				if (binder != null)
					msgs = ((InternalEObject)binder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpntoolsPackage.CPNET__BINDER, null, msgs);
				return basicSetBinder((Binder)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpntoolsPackage.CPNET__FUSIONS:
				return ((InternalEList<?>)getFusions()).basicRemove(otherEnd, msgs);
			case CpntoolsPackage.CPNET__GLOBBOX:
				return basicSetGlobbox(null, msgs);
			case CpntoolsPackage.CPNET__BINDER:
				return basicSetBinder(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CpntoolsPackage.CPNET__FUSIONS:
				return getFusions();
			case CpntoolsPackage.CPNET__GLOBBOX:
				return getGlobbox();
			case CpntoolsPackage.CPNET__BINDER:
				return getBinder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CpntoolsPackage.CPNET__FUSIONS:
				getFusions().clear();
				getFusions().addAll((Collection<? extends Fusion>)newValue);
				return;
			case CpntoolsPackage.CPNET__GLOBBOX:
				setGlobbox((Globbox)newValue);
				return;
			case CpntoolsPackage.CPNET__BINDER:
				setBinder((Binder)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CpntoolsPackage.CPNET__FUSIONS:
				getFusions().clear();
				return;
			case CpntoolsPackage.CPNET__GLOBBOX:
				setGlobbox((Globbox)null);
				return;
			case CpntoolsPackage.CPNET__BINDER:
				setBinder((Binder)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CpntoolsPackage.CPNET__FUSIONS:
				return fusions != null && !fusions.isEmpty();
			case CpntoolsPackage.CPNET__GLOBBOX:
				return globbox != null;
			case CpntoolsPackage.CPNET__BINDER:
				return binder != null;
		}
		return super.eIsSet(featureID);
	}

} //CpnetImpl
