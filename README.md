# SKN Kotlin Color Library

<img width="150px" src="https://firebasestorage.googleapis.com/v0/b/skn-ultimate-project-la437.appspot.com/o/GitHub%20Library%2F10-Kotlin-SKC.svg?alt=media&token=6ff69423-3bcf-4148-a38f-5c3d9dad0099" alt="kotlin" />

> Kotlin

[![Maven Central](https://img.shields.io/maven-central/v/best.skn/skn-kotlin-color)](https://central.sonatype.com/artifact/best.skn/skn-kotlin-color) [![Kdoc](https://javadoc.io/badge2/best.skn/skn-kotlin-color/1.0.0/javadoc.svg)](https://javadoc.io/doc/best.skn/skn-kotlin-color/1.0.0) [![Apache License 2.0](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

&nbsp;

## **_KDocs:_**

### Read the Kdoc: [utils.color](https://javadoc.io/doc/best.skn/skn-kotlin-color/latest/skn-kotlin-color/utils.color/index.html)

&nbsp;

## **_Introduction:_**

### This is a simple Kotlin Library for colored text output in console

### I made this library so that I can use it in all of my java/kotlin projects without writing the same codes over and over again

### The main package of this library holds 16 methods for 8 different colors

&nbsp;

## **_Details:_**

### **`utils.color` package:**

- It doesn't need to be instantiated
- It has 16 methods for 8 different colors
- The colors are:
  - Black
  - Red
  - Green
  - Yellow
  - Blue
  - Purple
  - Cyan
  - White

&nbsp;

## **_Use Case:_**

- Java/Kotlin
- Spring Boot

&nbsp;

## **_Requirements:_**

- 💀 Minimum JDK Version: `21`
- 💀 Minimum Kotlin Version: `1.9.4`

&nbsp;

## **_Usage:_**

### For `Maven`, inside `dependencies` tag of `pom.xml`, copy the following

> ```xml
> <dependency>
>  <groupId>best.skn</groupId>
>  <artifactId>skn-kotlin-color</artifactId>
>  <version>1.0.0</version>
> </dependency>
> ```

### For `Gradle`, inside `dependencies` of `build.gradle.kts`, copy the following

> ```kotlin
> implementation("best.skn:skn-kotlin-color:1.0.0")
> ```

### Inside your Kotlin Code, import the package like this

> ```kotlin
> import best.skn.utils.color.*;
> //or
> import best.skn.utils.color.blue;
> import best.skn.utils.color.green;
> //and so on
> ```

### You can use the use this library like this

> ```kotlin
> val name: String = "SKN".green();
> val email: String = "skn437physx@gmail.com".blue();
> ```

&nbsp;

## **_Dedicated To:_**

- 👩‍🎨`Prodipta Das Logno` & 🧛‍♀️`Atoshi Sarker Prithula`: The two most special ladies of my life. I can't thank them
  enough for always treasuring me a lot. I am lucky that I met with these two amazing ladies. They have two special
  places in my heart and no other girl can ever replace them.
- 💯`My Parents`: The greatest treasures of my life ever.

&nbsp;

## **_License:_**

Copyright (C) 2024 SKN Shukhan

Licensed under the Apache License, Version 2.0
