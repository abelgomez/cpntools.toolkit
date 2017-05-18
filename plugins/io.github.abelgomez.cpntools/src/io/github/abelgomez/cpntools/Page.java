/*******************************************************************************
 * Copyright (c) 2017 Abel Gómez.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Abel Gómez (abgolla@gmail.com) - initial API and implementation
 *******************************************************************************/
package io.github.abelgomez.cpntools;

import java.lang.Integer;
import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.Page#getGroup <em>Group</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Page#getPlaces <em>Places</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Page#getAuxiliarys <em>Auxiliarys</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Page#getName <em>Name</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Page#getTranss <em>Transs</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Page#getArcs <em>Arcs</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Page#getBinder <em>Binder</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.cpntools.Group}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Group#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPage_Group()
	 * @see io.github.abelgomez.cpntools.Group#getPage
	 * @model opposite="page" containment="true" ordered="false"
	 * @generated
	 */
	EList<Group> getGroup();

	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.cpntools.Place}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Place#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPage_Places()
	 * @see io.github.abelgomez.cpntools.Place#getPage
	 * @model opposite="page" containment="true" ordered="false"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Auxiliarys</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.cpntools.Auxiliary}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Auxiliary#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliarys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliarys</em>' containment reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPage_Auxiliarys()
	 * @see io.github.abelgomez.cpntools.Auxiliary#getPage
	 * @model opposite="page" containment="true" ordered="false"
	 * @generated
	 */
	EList<Auxiliary> getAuxiliarys();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPage_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Page#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transs</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.cpntools.Trans}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Trans#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transs</em>' containment reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPage_Transs()
	 * @see io.github.abelgomez.cpntools.Trans#getPage
	 * @model opposite="page" containment="true"
	 * @generated
	 */
	EList<Trans> getTranss();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.cpntools.Arc}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Arc#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPage_Arcs()
	 * @see io.github.abelgomez.cpntools.Arc#getPage
	 * @model opposite="page" containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Binder</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Binder#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binder</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binder</em>' container reference.
	 * @see #setBinder(Binder)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPage_Binder()
	 * @see io.github.abelgomez.cpntools.Binder#getPages
	 * @model opposite="pages" transient="false"
	 * @generated
	 */
	Binder getBinder();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Page#getBinder <em>Binder</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binder</em>' container reference.
	 * @see #getBinder()
	 * @generated
	 */
	void setBinder(Binder value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='DirectedSparseGraph<DiagramElement, Arc> graph = new DirectedSparseGraph<DiagramElement, Arc>();\r\n\r\nfor (Arc arc : this.getArcs()) {\r\n\tgraph.addVertex(arc.getPlace());\r\n\tgraph.addVertex(arc.getTrans());\r\n\r\n\tPair<DiagramElement> pair = null;\r\n\tif (arc.getOrientation() == Orientation.TTO_P) {\r\n\t\tpair = new Pair<DiagramElement>(arc.getTrans(), arc.getPlace());\r\n\t} else {\r\n\t\tpair = new Pair<DiagramElement>(arc.getPlace(), arc.getTrans());\r\n\t}\r\n\tgraph.addEdge(arc, pair);\r\n}\r\n\r\nKKLayout<DiagramElement, Arc> layout = new KKLayout<DiagramElement, Arc>(graph);\r\nlayout.setSize(new Dimension(width, height));\r\nlayout.setLengthFactor(1.5);\r\nlayout.initialize();\r\n\r\nlayout.setMaxIterations(steps);\r\n\r\nwhile (!layout.done()) {\r\n\tlayout.step();\r\n}\r\n\r\nfor (DiagramElement element : graph.getVertices()) {\r\n\tint x = (int) layout.getX(element) - (width / 2);\r\n\tint y = (int) layout.getY(element) - (height / 2);\r\n\r\n\telement.setPosx(x);\r\n\telement.setPosy(y);\r\n\t\r\n\tif (element instanceof Trans) {\r\n\t\tTrans trans = (Trans) element;\r\n\t\tif (trans.getCond() != null) {\r\n\t\t\ttrans.getCond().setPosx(x - 40);\r\n\t\t\ttrans.getCond().setPosy(y + 30);\r\n\t\t}\r\n\t\tif (trans.getPriority() != null) {\r\n\t\t\ttrans.getPriority().setPosx(x - 40);\r\n\t\t\ttrans.getPriority().setPosy(y - 30);\r\n\t\t}\r\n\t\tif (trans.getTime() != null) {\r\n\t\t\ttrans.getTime().setPosx(x + 40);\r\n\t\t\ttrans.getTime().setPosy(y - 30);\r\n\t\t}\r\n\t}\r\n}\r\n\r\nfor (Arc arc : this.getArcs()) {\r\n\t// We must retrieve the edges in this cumbersome way since some arcs may \r\n\t// be omitted because they contain the same source and target nodes\r\n\tArc edge = null;\r\n\tif (arc.getOrientation() == Orientation.TTO_P) {\r\n\t\tedge = graph.findEdge(arc.getTrans(), arc.getPlace());\r\n\t} else {\r\n\t\tedge = graph.findEdge(arc.getPlace(), arc.getTrans());\r\n\t};\r\n\tDiagramElement source = graph.getSource(edge);\r\n\tDiagramElement target = graph.getDest(edge);\r\n\r\n\tint sourceX = (int) layout.getX(source) - (width / 2);\r\n\tint sourceY = (int) layout.getY(source) - (height / 2);\r\n\tint targetX = (int) layout.getX(target) - (width / 2);\r\n\tint targetY = (int) layout.getY(target) - (height / 2);\r\n\r\n\tif (arc.getAnnot() != null) {\r\n\t\tdouble pos = ThreadLocalRandom.current().nextDouble(0.35, 0.65); \r\n\t\tarc.getAnnot().setPosx(sourceX + (int) ((targetX - sourceX) * pos));\r\n\t\tarc.getAnnot().setPosy(sourceY + (int) ((targetY - sourceY) * pos));\r\n\t}\r\n}'"
	 * @generated
	 */
	void layout(Integer width, Integer height, Integer steps);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='int width = new Float(getBinder().getWidth() * 0.9).intValue();\r\nint height = new Float(getBinder().getHeight() * 0.9).intValue();\r\nlayout(width, height, 5000);'"
	 * @generated
	 */
	void layout();

} // Page
