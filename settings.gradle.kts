pluginManagement {
    val kotlinVersion: String by settings
    val kspVersion: String by settings
    plugins {
        id("com.google.devtools.ksp") version kspVersion
        kotlin("jvm") version kotlinVersion
        kotlin("multiplatform") version kotlinVersion
    }
    repositories {
        gradlePluginPortal()
        google()
    }
}

rootProject.name = "playground"

include(":workload")
include(":test-processor")
