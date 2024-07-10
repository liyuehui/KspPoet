plugins {
    kotlin("jvm") version "2.0.0"
    id("maven-publish")
}



publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.liyuehui"
            artifactId = "KRouter"
            version = "1.3"

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

