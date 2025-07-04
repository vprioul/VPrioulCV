package com.vprioul.cv.convention

import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.withType

internal fun Project.configureDetekt(extension: DetektExtension) = extension.apply {

    tasks.withType<Detekt>().configureEach {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
    tasks.withType<io.gitlab.arturbosch.detekt.DetektCreateBaselineTask>().configureEach {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    extensions.getByType<DetektExtension>().apply {
        buildUponDefaultConfig = true
        allRules = false
        autoCorrect = false
        parallel = true
        config.setFrom("${rootDir}/config/detekt/detekt.yml")
    }
    tasks.withType<Detekt>().configureEach {
        reports {
            html {
                required.set(true)
                outputLocation.set(file("${rootDir}/reports/detekt.html"))
            }
        }
    }

    dependencies.apply {
        add("detektPlugins", libs.findLibrary("detekt-compose").get())
        add("detektPlugins", libs.findLibrary("detekt-formatting").get())
    }
}
