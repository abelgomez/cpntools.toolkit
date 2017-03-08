/**
 * Copyright (c) 2016 Abel Gómez.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Abel Gómez - initial API and implementation
 */
package io.github.abelgomez.cpntools;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.Binder#getPosy <em>Posy</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Binder#getPosx <em>Posx</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Binder#getWidth <em>Width</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Binder#getHeight <em>Height</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Binder#getCpnet <em>Cpnet</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Binder#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getBinder()
 * @model
 * @generated
 */
public interface Binder extends EObject {
	/**
	 * Returns the value of the '<em><b>Posy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posy</em>' attribute.
	 * @see #setPosy(int)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getBinder_Posy()
	 * @model
	 * @generated
	 */
	int getPosy();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Binder#getPosy <em>Posy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posy</em>' attribute.
	 * @see #getPosy()
	 * @generated
	 */
	void setPosy(int value);

	/**
	 * Returns the value of the '<em><b>Posx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posx</em>' attribute.
	 * @see #setPosx(int)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getBinder_Posx()
	 * @model
	 * @generated
	 */
	int getPosx();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Binder#getPosx <em>Posx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posx</em>' attribute.
	 * @see #getPosx()
	 * @generated
	 */
	void setPosx(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getBinder_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Binder#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getBinder_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Binder#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Cpnet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Cpnet#getBinder <em>Binder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpnet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpnet</em>' container reference.
	 * @see #setCpnet(Cpnet)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getBinder_Cpnet()
	 * @see io.github.abelgomez.cpntools.Cpnet#getBinder
	 * @model opposite="binder" transient="false"
	 * @generated
	 */
	Cpnet getCpnet();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Binder#getCpnet <em>Cpnet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpnet</em>' container reference.
	 * @see #getCpnet()
	 * @generated
	 */
	void setCpnet(Cpnet value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.cpntools.Page}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Page#getBinder <em>Binder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getBinder_Pages()
	 * @see io.github.abelgomez.cpntools.Page#getBinder
	 * @model opposite="binder" containment="true"
	 * @generated
	 */
	EList<Page> getPages();

} // Binder
