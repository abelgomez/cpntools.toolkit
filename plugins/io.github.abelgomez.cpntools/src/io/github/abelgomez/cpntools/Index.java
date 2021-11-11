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
package io.github.abelgomez.cpntools;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.Index#getWith <em>With</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getIndex()
 * @model
 * @generated
 */
public interface Index extends SimpleColorSet {
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
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getIndex_With()
	 * @model upper="2"
	 * @generated
	 */
	EList<String> getWith();

} // Index
