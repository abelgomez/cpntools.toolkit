package io.github.abelgomez.cpntools.examples.simplejava;

import java.io.IOException;

import io.github.abelgomez.cpntools.Cpnet;
import io.github.abelgomez.cpntools.io.serializer.CpnToolsBuilder;
import io.github.abelgomez.cpntools.io.serializer.SerializationException;

public class SerializeExample {

	public static void main(String[] args) throws SerializationException, IOException {
		Cpnet net = Util.buildSampleNet();
		CpnToolsBuilder builder = new CpnToolsBuilder(net);
		builder.serialize(System.out);
	}
}
