buildscript {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
    }
    dependencies {
    }

}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.android.library.project) apply false
    alias(libs.plugins.compose) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.android.library.compose) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.sonarqube) apply false
    alias(libs.plugins.detekt)
    alias(libs.plugins.android.detekt) apply false
    alias(libs.plugins.secrets) apply false

// Hilt
    alias(libs.plugins.hilt) apply false
}
allprojects {
    tasks.whenTaskAdded {
        if (name == "compileDemoDebugKotlin" || name == "compileProdDebugKotlin") {
            //dependsOn(tasks.detekt)
            //mustRunAfter(tasks.detekt)
        }
    }
}