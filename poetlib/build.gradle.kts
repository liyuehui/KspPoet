plugins {
    kotlin("jvm") version "2.0.0"
    id("maven-publish")
}


group = "com.superman.poet"
version = "1.0"

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.liyuehui"
            artifactId = "KRouter"
            version = "1.0"

            from(components["java"])
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

