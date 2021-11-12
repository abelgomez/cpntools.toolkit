package io.github.abelgomez.cpntools.examples.simplejava;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import io.github.abelgomez.cpntools.Cpnet;
import io.github.abelgomez.cpntools.CpntoolsPackage;
import io.github.abelgomez.cpntools.io.serializer.CpnToolsBuilder;
import io.github.abelgomez.cpntools.io.serializer.SerializationException;

public class LoadModelExample {

	public static void main(String[] args) throws SerializationException, IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(CpntoolsPackage.eNS_URI, CpntoolsPackage.eINSTANCE);

		URI fileUri = URI.createFileURI(args[0]);
		Resource resource = resourceSet.getResource(fileUri, true);
		Cpnet net = (Cpnet) resource.getContents().get(0);

		CpnToolsBuilder builder = new CpnToolsBuilder(net);
		builder.serialize(System.out);
	}

}
