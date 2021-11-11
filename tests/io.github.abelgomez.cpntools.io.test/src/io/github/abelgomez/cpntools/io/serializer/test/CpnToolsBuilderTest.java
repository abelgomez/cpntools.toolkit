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
package io.github.abelgomez.cpntools.io.serializer.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.junit.Test;

import io.github.abelgomez.cpntools.Annot;
import io.github.abelgomez.cpntools.Arc;
import io.github.abelgomez.cpntools.Binder;
import io.github.abelgomez.cpntools.Cpnet;
import io.github.abelgomez.cpntools.CpntoolsFactory;
import io.github.abelgomez.cpntools.Enumerated;
import io.github.abelgomez.cpntools.Globbox;
import io.github.abelgomez.cpntools.Orientation;
import io.github.abelgomez.cpntools.Page;
import io.github.abelgomez.cpntools.Place;
import io.github.abelgomez.cpntools.Trans;
import io.github.abelgomez.cpntools.io.serializer.CpnToolsBuilder;
import io.github.abelgomez.cpntools.io.serializer.SerializationException;

/**
 *
 * Simple class that demonstrates how the {@link CpnToolsBuilder} class is used
 * to serialize a {@link Cpnet}
 * 
 * @author Abel G�mez (agomezlla@uoc.edu)
 *
 */
public class CpnToolsBuilderTest {

	private static final String TEST_FILE = "test.cpn";

	@Test
	public void test() throws FileNotFoundException, SerializationException {
		Cpnet net = buildSampleNet();
		CpnToolsBuilder builder = new CpnToolsBuilder(net);
		builder.serialize(System.out);
		builder.serialize(new FileOutputStream(new File(TEST_FILE)));
	}

	private Cpnet buildSampleNet() {
		Cpnet net = CpntoolsFactory.eINSTANCE.createCpnet();
		Page page = CpntoolsFactory.eINSTANCE.createPage();
		Globbox globbox = CpntoolsFactory.eINSTANCE.createGlobbox();
		Binder binder = CpntoolsFactory.eINSTANCE.createBinder();
		page.setName("Page");
		binder.setPosx(150);
		binder.setPosy(30);
		binder.setWidth(500);
		binder.setHeight(500);
		binder.getPages().add(page);
		net.setGlobbox(globbox);
		net.setBinder(binder);

		Enumerated enumerated = CpntoolsFactory.eINSTANCE.createEnumerated();
		globbox.getDeclarations().add(enumerated);

		enumerated.setColorSetType("Type");
		Place place = CpntoolsFactory.eINSTANCE.createPlace();
		place.setType(enumerated);

		Trans trans = CpntoolsFactory.eINSTANCE.createTrans();
		trans.setText("Text");

		Annot annot = CpntoolsFactory.eINSTANCE.createAnnot();
		annot.setText("Annot");

		Arc arc = CpntoolsFactory.eINSTANCE.createArc();
		arc.setPlace(place);
		arc.setTrans(trans);
		arc.setOrientation(Orientation.PTO_T);
		arc.setAnnot(annot);

		page.getPlaces().add(place);
		page.getTranss().add(trans);
		page.getArcs().add(arc);

		page.layout(500, 500, 5000);
		return net;
	}

}
