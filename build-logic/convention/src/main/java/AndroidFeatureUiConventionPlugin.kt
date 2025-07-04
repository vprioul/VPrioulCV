import com.vprioul.cv.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidFeatureUiConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("plugin.android.library")
                apply("plugin.android.library.compose")
                apply("org.jetbrains.kotlin.plugin.serialization")

// Hilt
apply("plugin.android.hilt")
            }
            dependencies {
                add("implementation", project(":core:designsystem"))
                add("implementation", project(":core:resources"))
                add("implementation", project(":core:ui"))
                add("implementation", libs.findLibrary("kotlinx.serialization.json").orElse(null))
                add("implementation", libs.findLibrary("androidx-appcompat").orElse(null))
                add("implementation", libs.findLibrary("androidx-core-ktx").orElse(null))
                add("implementation", libs.findLibrary("junit").orElse(null))
                add("implementation", libs.findLibrary("androidx-espresso-core").orElse(null))
                add("testImplementation", libs.findLibrary("junit").orElse(null))
                add("androidTestImplementation", libs.findLibrary("androidx-junit").orElse(null))
                add("androidTestImplementation", libs.findLibrary("androidx-espresso-core").orElse(null))
            }
        }
    }
}
