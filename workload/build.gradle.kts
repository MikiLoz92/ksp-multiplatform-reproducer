plugins {
    id("com.google.devtools.ksp")
    kotlin("multiplatform")
}

version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
}

kotlin {
    jvm()
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib"))
                implementation(project(":test-processor"))
                configurations["ksp"].dependencies.add(project.dependencies.create(project(":test-processor")))
            }
        }
    }
}

ksp {
    arg("option1", "value1")
    arg("option2", "value2")
}
