// Top-level build file where you can add configuration options common to all sub-projects/modules.

extra["kotlin_version"] = "1.9.0"
extra["about_libs_version"] = "8.9.4"
extra["nav_version"] = "2.7.2"

buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")
        classpath("com.mikepenz.aboutlibraries.plugin:aboutlibraries-plugin:8.9.4")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.2")
        classpath("pt.jcosta.resourceplaceholders:plugin:0.7")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        //noinspection JcenterRepositoryObsolete
        maven(url = "https://jitpack.io")
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
