/*******************************************************************************
 * Copyright (c) 2017 Abel G�mez.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Abel G�mez (abgolla@gmail.com) - initial API and implementation
 *******************************************************************************/
package io.github.abelgomez.cpntools;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerated</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.Enumerated#getWith <em>With</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getEnumerated()
 * @model
 * @generated
 */
public interface Enumerated extends SimpleColorSet {
	/**
	 * Returns the value of the '<em><b>With</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With</em>' attribute list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getEnumerated_With()
	 * @model
	 * @generated
	 */
	EList<String> getWith();

} // Enumerated
