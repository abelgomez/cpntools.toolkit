# CPN Tools toolkit

This repository contains the necessary plug-ins to create CPN Tools files from EMF. In addition, it provides capabilities to layout and serialize the EMF-compatible Petri nets into the "normative" CPN Tools XML format.

## Installing the *CPN Tools toolkit*

In Eclipse, go to `Help -> Install New Software...` and use https://abelgomez.github.io/cpntools.toolkit/updates/ as the URL for the update site.

The *CPN Tools toolkit* requires [Eclipse Neon](https://eclipse.org/neon/) (4.6) or higher. 

## Repository contents

### Plug-in Projects

#### [io.github.abelgomez.cpntools](plugins/io.github.abelgomez.cpntools/README.md)

EMF [metamodel](plugins/io.github.abelgomez.cpntools/model/cpntools.pdf) for the [CPN Tools](http://cpntools.org/) tool. The metamodel resembles the structure of the normative XML used by CPN Tools to persist Petri nets.

#### [io.github.abelgomez.cpntools.io](plugins/io.github.abelgomez.cpntools.io)

Plug-in containing the classes to serialize EMF-compatible Petri nets to the normative CPN Tools XML format.

#### [io.github.abelgomez.cpntools.io.test](plugins/io.github.abelgomez.cpntools.io.test)

Test plug-in containing some sample code demonstrating how the serialization is invoked.

### Feature Projects

#### [io.github.abelgomez.cpntools.feature](features/io.github.abelgomez.cpntools.feature)

Feature for the CPN Tools metamodels and I/O utilities. Included plugins are:

* io.github.abelgomez.cpntools
* io.github.abelgomez.cpntools.io

#### [io.github.abelgomez.cpntools.sdk.feature](features/io.github.abelgomez.cpntools.sdk.feature)

Feature for the SDK. Includes all the previous features, plus EMF SDK and the additional test plugin:

* io.github.abelgomez.cpntools.io.test

