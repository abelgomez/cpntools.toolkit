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
import io.github.abelgomez.cpntools.Page;

import java.lang.Integer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.impl.BinderImpl#getPosy <em>Posy</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.BinderImpl#getPosx <em>Posx</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.BinderImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.BinderImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.BinderImpl#getCpnet <em>Cpnet</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.BinderImpl#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinderImpl extends MinimalEObjectImpl.Container implements Binder {
	/**
	 * The default value of the '{@link #getPosy() <em>Posy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosy()
	 * @generated
	 * @ordered
	 */
	protected static final int POSY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosy() <em>Posy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosy()
	 * @generated
	 * @ordered
	 */
	protected int posy = POSY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosx() <em>Posx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosx()
	 * @generated
	 * @ordered
	 */
	protected static final int POSX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosx() <em>Posx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosx()
	 * @generated
	 * @ordered
	 */
	protected int posx = POSX_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpntoolsPackage.Literals.BINDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPosy() {
		return posy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosy(int newPosy) {
		int oldPosy = posy;
		posy = newPosy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.BINDER__POSY, oldPosy, posy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPosx() {
		return posx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosx(int newPosx) {
		int oldPosx = posx;
		posx = newPosx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.BINDER__POSX, oldPosx, posx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.BINDER__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.BINDER__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cpnet getCpnet() {
		if (eContainerFeatureID() != CpntoolsPackage.BINDER__CPNET) return null;
		return (Cpnet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCpnet(Cpnet newCpnet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCpnet, CpntoolsPackage.BINDER__CPNET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpnet(Cpnet newCpnet) {
		if (newCpnet != eInternalContainer() || (eContainerFeatureID() != CpntoolsPackage.BINDER__CPNET && newCpnet != null)) {
			if (EcoreUtil.isAncestor(this, newCpnet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCpnet != null)
				msgs = ((InternalEObject)newCpnet).eInverseAdd(this, CpntoolsPackage.CPNET__BINDER, Cpnet.class, msgs);
			msgs = basicSetCpnet(newCpnet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.BINDER__CPNET, newCpnet, newCpnet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentWithInverseEList<Page>(Page.class, this, CpntoolsPackage.BINDER__PAGES, CpntoolsPackage.PAGE__BINDER);
		}
		return pages;
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
			case CpntoolsPackage.BINDER__CPNET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCpnet((Cpnet)otherEnd, msgs);
			case CpntoolsPackage.BINDER__PAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPages()).basicAdd(otherEnd, msgs);
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
			case CpntoolsPackage.BINDER__CPNET:
				return basicSetCpnet(null, msgs);
			case CpntoolsPackage.BINDER__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CpntoolsPackage.BINDER__CPNET:
				return eInternalContainer().eInverseRemove(this, CpntoolsPackage.CPNET__BINDER, Cpnet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CpntoolsPackage.BINDER__POSY:
				return getPosy();
			case CpntoolsPackage.BINDER__POSX:
				return getPosx();
			case CpntoolsPackage.BINDER__WIDTH:
				return getWidth();
			case CpntoolsPackage.BINDER__HEIGHT:
				return getHeight();
			case CpntoolsPackage.BINDER__CPNET:
				return getCpnet();
			case CpntoolsPackage.BINDER__PAGES:
				return getPages();
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
			case CpntoolsPackage.BINDER__POSY:
				setPosy((Integer)newValue);
				return;
			case CpntoolsPackage.BINDER__POSX:
				setPosx((Integer)newValue);
				return;
			case CpntoolsPackage.BINDER__WIDTH:
				setWidth((Integer)newValue);
				return;
			case CpntoolsPackage.BINDER__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case CpntoolsPackage.BINDER__CPNET:
				setCpnet((Cpnet)newValue);
				return;
			case CpntoolsPackage.BINDER__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
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
			case CpntoolsPackage.BINDER__POSY:
				setPosy(POSY_EDEFAULT);
				return;
			case CpntoolsPackage.BINDER__POSX:
				setPosx(POSX_EDEFAULT);
				return;
			case CpntoolsPackage.BINDER__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case CpntoolsPackage.BINDER__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case CpntoolsPackage.BINDER__CPNET:
				setCpnet((Cpnet)null);
				return;
			case CpntoolsPackage.BINDER__PAGES:
				getPages().clear();
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
			case CpntoolsPackage.BINDER__POSY:
				return posy != POSY_EDEFAULT;
			case CpntoolsPackage.BINDER__POSX:
				return posx != POSX_EDEFAULT;
			case CpntoolsPackage.BINDER__WIDTH:
				return width != WIDTH_EDEFAULT;
			case CpntoolsPackage.BINDER__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case CpntoolsPackage.BINDER__CPNET:
				return getCpnet() != null;
			case CpntoolsPackage.BINDER__PAGES:
				return pages != null && !pages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (posy: ");
		result.append(posy);
		result.append(", posx: ");
		result.append(posx);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //BinderImpl
