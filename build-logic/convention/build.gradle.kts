import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    `kotlin-dsl`
}
group = "com.vprioul.cv.buildlogic"


java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }
}
dependencies {
    compileOnly(libs.gradle)
    compileOnly(libs.gradle.plugin)
    compileOnly(libs.compose.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.detekt.gradlePlugin)
}

tasks {
    validatePlugins {
        enableStricterValidation = true
        failOnWarning = true
    }
}
/**
 * Register convention plugins so they are available in the build scripts of the application.
 */
gradlePlugin {
    // androidLibrary
    plugins {
        register("androidLibrary") {
            id = "plugin.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidLibraryCompose") {
            id = "plugin.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }

        // android-Application
        register("androidApplication") {
            id = "plugin.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }

        register("androidApplicationCompose") {
            id = "plugin.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }

        register("featureUi") {
            id = "plugin.android.feature.ui"
            implementationClass = "AndroidFeatureUiConventionPlugin"
        }

        register("featureData") {
            id = "plugin.android.feature.data"
            implementationClass = "AndroidFeatureDataConventionPlugin"
        }

        register("featureDomain") {
            id = "plugin.android.feature.domain"
            implementationClass = "AndroidFeatureDomainConventionPlugin"
        }

        //Others
        
        register("detekt") {
            id = "plugin.android.detekt"
            implementationClass = "AndroidDetektConventionPlugin"
        }

        register("flavors") {
            id = "plugin.android.flavors"
            implementationClass = "AndroidApplicationFlavorsConventionPlugin"
        }

// Hilt
register("hilt") {
id = "plugin.android.hilt"
implementationClass = "AndroidHiltConventionPlugin"
}
    }
}
