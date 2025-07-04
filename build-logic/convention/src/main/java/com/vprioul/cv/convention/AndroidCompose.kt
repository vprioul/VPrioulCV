package com.vprioul.cv.convention

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureAndroidCompose(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
) {
    commonExtension.apply {
        buildFeatures {
            compose = true
        }
        composeOptions {
            kotlinCompilerExtensionVersion = libs.findVersion("androidxComposeCompiler").get().toString()
        }
        dependencies {
            val bom = libs.findLibrary("compose.bom").get()
            add("implementation", platform(bom))
            add("androidTestImplementation", platform(bom))
            add("implementation", libs.findLibrary("compose.ui.tooling.preview").orElse(null))
            add("implementation", libs.findLibrary("compose.ui.graphics").orElse(null))
            add("implementation", libs.findLibrary("compose.material3").orElse(null))
            add("implementation", libs.findLibrary("compose.icon").orElse(null))
            add("implementation", libs.findLibrary("compose.icon.extended").orElse(null))
            add("implementation", libs.findLibrary("androidx.activity.compose").orElse(null))
            add("debugImplementation", libs.findLibrary("ui.tooling").orElse(null))
            add("implementation", libs.findLibrary("androidx-navigation-compose").orElse(null))
            add("implementation", libs.findLibrary("androidx.navigation.runtime.ktx").orElse(null))
            add("implementation", libs.findLibrary("compose.ui.fonts").orElse(null))
            add("implementation", libs.findLibrary("collection.immutable").orElse(null))
        }
    }
}
