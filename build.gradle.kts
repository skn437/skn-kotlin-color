import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.dokka.gradle.DokkaTask

plugins {
  kotlin("jvm") version "2.0.0"
  id("org.jetbrains.dokka") version "1.9.20"
  id("com.vanniktech.maven.publish") version "0.28.0"
}

group = "best.skn"
version = "1.0.1"

repositories {
  mavenCentral()
}

dependencies {
  testImplementation(kotlin("test"))
}

tasks.test {
  useJUnitPlatform()
}

kotlin {
  jvmToolchain(21)
}

fun dokkaMd(): Array<String> {
  val path: String = "./.dokka"
  var extension: String = ".md"

  val fileNames: Array<String> = arrayOf("module", "utils_color")

  fileNames.forEachIndexed { index, element ->
    if (index != 0) extension = ".package.md"

    fileNames[index] = "$path/$element$extension"
  }

  return fileNames
}

tasks.withType<DokkaTask>().configureEach {
  dokkaSourceSets {
    named("main") {
      includes.from(*dokkaMd())
    }
  }
}

mavenPublishing {
  coordinates(
    groupId = "$group",
    artifactId = project.name,
    version = "$version",
  )

  pom {
    name = "SKN Kotlin Color"
    description = "A Simple Color Library For Kotlin"
    inceptionYear = "2024"

    url = "https://github.com/skn437/skn-kotlin-color"

    properties =
      mapOf(
        "java.version" to "21",
        "kotlin.version" to "1.9.24",
      )

    licenses {
      license {
        name = "The Apache License, Version 2.0"
        url = "http://www.apache.org/licenses/LICENSE-2.0.txt"
      }
    }

    developers {
      developer {
        id = "skn437"
        name = "SKN Shukhan"
        email = "skn437physx@gmail.com"
        organization = "best.skn"
        organizationUrl = "https://www.skn.best"
      }
    }

    scm {
      connection = "scm:git:git://github.com/skn437/skn-kotlin-color.git"
      developerConnection = "scm:git:ssh://github.com:skn437/skn-kotlin-color.git"
      url = "http://github.com/skn437/skn-kotlin-color/tree/master"
    }
  }

  publishToMavenCentral(
    SonatypeHost.CENTRAL_PORTAL,
  )

  signAllPublications()
}
