# Adobe Experience Manager

For this guide you need to install some software: JDK 8, Apache Maven, IntelliJ IDEA

Table of contents
- [Adobe Experience Manager](#adobe-experience-manager)
  - [JDK 8](#jdk-8)
  - [Apache Maven](#apache-maven)
  - [IntelliJ IDEA](#intellij-idea)

## JDK 8

Download and install JDK 8 from [here](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html). You may need an Oracle account.

## Apache Maven

Apache Maven is a software project management, which we are going to use to define the structure of our projects. Download the binary zip from [here](https://maven.apache.org/download.cgi).

Extract the zip under the path `C:\` and browse to `maven\apache-maven-X.X.X\`. There you can find a file named `settings.xml`. You need to replace it with [this file](assets/settings.xml) or copy the file found [here](https://helpx.adobe.com/experience-manager/using/maven_arch13.html).

## IntelliJ IDEA

The IDE we are going to use is IntelliJ IDEA. Download the Community Edition from the [official page](https://www.jetbrains.com/es-es/idea/). If you have a license with Jetbrains you can download the Ultimate version, but it is not necessary.

To begin this guide, go to the [next chapter](maven_project/Readme.md) where we will create a project using maven and push it to ur server instance.

**Guide contents**
- [Maven Project](maven_project/Readme.md)
- [AEM Interface](aem_interface/Readme.md)