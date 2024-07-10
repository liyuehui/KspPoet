plugins {
    kotlin("jvm") version "2.0.0"
}

group = "com.superman.poet"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":poetlib"))
}

kotlin {
    jvmToolchain(11)
}