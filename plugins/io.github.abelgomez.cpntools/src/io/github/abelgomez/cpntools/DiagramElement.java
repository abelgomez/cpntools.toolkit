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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.DiagramElement#getLineColour <em>Line Colour</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.DiagramElement#isFillFilled <em>Fill Filled</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.DiagramElement#getLineThick <em>Line Thick</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.DiagramElement#getPosx <em>Posx</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.DiagramElement#getLineType <em>Line Type</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.DiagramElement#getPosy <em>Posy</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.DiagramElement#getFillColour <em>Fill Colour</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.DiagramElement#getFillPattern <em>Fill Pattern</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.DiagramElement#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getDiagramElement()
 * @model abstract="true"
 * @generated
 */
public interface DiagramElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Line Colour</b></em>' attribute.
	 * The default value is <code>"Black"</code>.
	 * The literals are from the enumeration {@link io.github.abelgomez.cpntools.Colour16}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Colour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Colour</em>' attribute.
	 * @see io.github.abelgomez.cpntools.Colour16
	 * @see #setLineColour(Colour16)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getDiagramElement_LineColour()
	 * @model default="Black" ordered="false"
	 * @generated
	 */
	Colour16 getLineColour();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.DiagramElement#getLineColour <em>Line Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Colour</em>' attribute.
	 * @see io.github.abelgomez.cpntools.Colour16
	 * @see #getLineColour()
	 * @generated
	 */
	void setLineColour(Colour16 value);

	/**
	 * Returns the value of the '<em><b>Fill Filled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Filled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Filled</em>' attribute.
	 * @see #setFillFilled(boolean)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getDiagramElement_FillFilled()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isFillFilled();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.DiagramElement#isFillFilled <em>Fill Filled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Filled</em>' attribute.
	 * @see #isFillFilled()
	 * @generated
	 */
	void setFillFilled(boolean value);

	/**
	 * Returns the value of the '<em><b>Line Thick</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Thick</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Thick</em>' attribute.
	 * @see #setLineThick(int)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getDiagramElement_LineThick()
	 * @model default="1" ordered="false"
	 * @generated
	 */
	int getLineThick();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.DiagramElement#getLineThick <em>Line Thick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Thick</em>' attribute.
	 * @see #getLineThick()
	 * @generated
	 */
	void setLineThick(int value);

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
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getDiagramElement_Posx()
	 * @model ordered="false"
	 * @generated
	 */
	int getPosx();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.DiagramElement#getPosx <em>Posx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posx</em>' attribute.
	 * @see #getPosx()
	 * @generated
	 */
	void setPosx(int value);

	/**
	 * Returns the value of the '<em><b>Line Type</b></em>' attribute.
	 * The default value is <code>"Solid"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Type</em>' attribute.
	 * @see #setLineType(String)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getDiagramElement_LineType()
	 * @model default="Solid" ordered="false"
	 * @generated
	 */
	String getLineType();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.DiagramElement#getLineType <em>Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Type</em>' attribute.
	 * @see #getLineType()
	 * @generated
	 */
	void setLineType(String value);

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
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getDiagramElement_Posy()
	 * @model ordered="false"
	 * @generated
	 */
	int getPosy();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.DiagramElement#getPosy <em>Posy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posy</em>' attribute.
	 * @see #getPosy()
	 * @generated
	 */
	void setPosy(int value);

	/**
	 * Returns the value of the '<em><b>Fill Colour</b></em>' attribute.
	 * The default value is <code>"White"</code>.
	 * The literals are from the enumeration {@link io.github.abelgomez.cpntools.Colour16}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Colour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Colour</em>' attribute.
	 * @see io.github.abelgomez.cpntools.Colour16
	 * @see #setFillColour(Colour16)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getDiagramElement_FillColour()
	 * @model default="White" ordered="false"
	 * @generated
	 */
	Colour16 getFillColour();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.DiagramElement#getFillColour <em>Fill Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Colour</em>' attribute.
	 * @see io.github.abelgomez.cpntools.Colour16
	 * @see #getFillColour()
	 * @generated
	 */
	void setFillColour(Colour16 value);

	/**
	 * Returns the value of the '<em><b>Fill Pattern</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Pattern</em>' attribute.
	 * @see #setFillPattern(String)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getDiagramElement_FillPattern()
	 * @model default="" ordered="false"
	 * @generated
	 */
	String getFillPattern();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.DiagramElement#getFillPattern <em>Fill Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Pattern</em>' attribute.
	 * @see #getFillPattern()
	 * @generated
	 */
	void setFillPattern(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Group#getGroupElms <em>Group Elms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' container reference.
	 * @see #setGroup(Group)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getDiagramElement_Group()
	 * @see io.github.abelgomez.cpntools.Group#getGroupElms
	 * @model opposite="groupElms" transient="false"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.DiagramElement#getGroup <em>Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' container reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

} // DiagramElement
