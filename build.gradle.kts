plugins {
    id("java")
}

group = "de.danzel34"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "de.danzel34.sortalgorythm.Main"
    }
}