plugins {
    alias(libs.plugins.android.application.project)
    alias(libs.plugins.android.application.flavor)
    alias(libs.plugins.android.application.compose)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.secrets)
// Hilt
    alias(libs.plugins.hilt.project)
}

android {
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        debug {

        }
    }
    defaultConfig {
        vectorDrawables {
            useSupportLibrary = true
        }
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            excludes += "/META-INF/INDEX.LIST"
            excludes += "/META-INF/DEPENDENCIES"
        }
    }
}

secrets {
    propertiesFileName = "secrets.properties"
    defaultPropertiesFileName = "secrets.defaults.properties"
}

dependencies {
    implementation(projects.core.designsystem)
    implementation(projects.core.resources)
    implementation(projects.core.data)
    implementation(libs.timber)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.kotlin.reflect)

    //Modules only UI
    implementation(projects.feature.splash.ui)
    implementation(projects.feature.login.ui)
    implementation(projects.feature.hobbies.ui)
    implementation(projects.feature.contact.ui)
    implementation(projects.feature.skills.data)
    implementation(projects.feature.skills.ui)
    implementation(projects.feature.education.ui)
    implementation(projects.feature.experience.data)
    implementation(projects.feature.experience.ui)
    implementation(projects.feature.home.ui)
}