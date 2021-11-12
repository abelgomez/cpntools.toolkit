# Example of a simple Java program

## Instructions

To use the CPN Tools Toolkit in jor Java program, simply add the following repository and dependencies to your `pom.xml` file:

```xml
<repositories>
    <repository>
        <id>local-maven-repo</id>
        <url>https://abelgomez.github.io/cpntools.toolkit/repository/</url>
    </repository>
    <!-- Other repositories (if needed)... -->
</repositories>
<!- ... -->
<dependencies>
    <dependency>
        <groupId>io.github.abelgomez.cpntools</groupId>
        <artifactId>io.github.abelgomez.cpntools</artifactId>
        <version>0.5.0-SNAPSHOT</version>
    </dependency>
    <dependency>
        <groupId>io.github.abelgomez.cpntools</groupId>
        <artifactId>io.github.abelgomez.cpntools.io</artifactId>
        <version>0.5.0-SNAPSHOT</version>
    </dependency>
    <!-- Other dependencies (if needed)... -->
</dependencies>
```

See a full example in the [`pom.xml`](pom.xml) file.

## Building and running the example project

To compile the example run

```bash
mvn clean verify
```

To execute the example program, run:

```bash
java -cp "target/*;target/lib/*" io.github.abelgomez.cpntools.examples.simplejava.App
```

An otuput similar to the following should appear in stdout:

```xml
<?xml version="1.0" encoding="ISO-8859-1" standalone="no"?>
<!DOCTYPE workspaceElements PUBLIC "-//CPN//DTD CPNXML 1.0//EN" "http://cpntools.org/DTD/6/cpn.dtd">
<workspaceElements>
  <generator format="6" tool="CPN Tools" version="4.0.1"/>
  <cpnet>
    <globbox/>
    <page id="ID756460329">
      <pageattr name="Page"/>
      <place id="ID1753925900">
        <posattr x="95.000000" y="-162.000000"/>
        <fillattr colour="White" filled="false" pattern=""/>
        <lineattr colour="Black" thick="1" type="Solid"/>
        <textattr bold="false" colour="Black"/>
        <text/>
        <ellipse h="40" w="60"/>
        <token x="-10.0" y="0.0"/>
        <marking x="0.0" y="0.0"/>
        <type id="ID1442248840">
          <posattr x="125.0" y="-182.0"/>
          <fillattr colour="White" filled="false" pattern=""/>
          <lineattr colour="Black" thick="1" type="Solid"/>
          <textattr bold="false" colour="Black"/>
          <text tool="CPN Tools" version="4.0.1"/>
        </type>
      </place>
      <trans explicit="false" id="ID2009809814">
        <posattr x="-96.000000" y="161.000000"/>
        <fillattr colour="White" filled="false" pattern=""/>
        <lineattr colour="Black" thick="1" type="Solid"/>
        <textattr bold="false" colour="Black"/>
        <text>Text</text>
        <box h="40" w="60"/>
        <binding x="7.2" y="-3.0"/>
      </trans>
      <arc id="ID1714444502" order="0" orientation="PtoT">
        <posattr x="0.000000" y="0.000000"/>
        <fillattr colour="White" filled="false" pattern=""/>
        <lineattr colour="Black" thick="1" type="Solid"/>
        <textattr bold="false" colour="Black"/>
        <arrowattr currentcyckle="2" headsize="0.0"/>
        <transend idref="ID2009809814"/>
        <placeend idref="ID1753925900"/>
        <annot id="ID1149850895">
          <posattr x="15.000000" y="-27.000000"/>
          <fillattr colour="White" filled="false" pattern=""/>
          <lineattr colour="Black" thick="1" type="Solid"/>
          <textattr bold="false" colour="Black"/>
          <text tool="CPN Tools" version="4.0.1">Annot</text>
        </annot>
      </arc>
    </page>
    <instances>
      <instance id="ID1894609793" page="ID756460329"/>
    </instances>
    <binders>
      <cpnbinder height="500" id="ID121635196" width="500" x="150" y="30">
        <sheets>
          <cpnsheet id="ID1628937196" instance="ID1894609793" zoom="1.0"/>
        </sheets>
      </cpnbinder>
    </binders>
  </cpnet>
</workspaceElements>
```