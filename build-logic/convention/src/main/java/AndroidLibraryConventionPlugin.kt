import com.android.build.gradle.LibraryExtension
import com.vprioul.cv.convention.configureFlavors
import com.vprioul.cv.convention.configureKotlinAndroid
import com.vprioul.cv.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class AndroidLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
                apply("org.jetbrains.kotlin.android")
                apply("plugin.android.detekt")
            }

            extensions.configure<LibraryExtension> {
                configureKotlinAndroid(this)
                configureFlavors(this)
                buildFeatures {
                    buildConfig = true
                }
                // so resources inside ":core:module1" must be prefixed with "core_module1_"
                /* this.resourcePrefix = buildString {
                     append(path.split("""\W""".toRegex()).drop(1).distinct().joinToString(separator = "_").lowercase())
                     append("_")
                 }*/

            }

            dependencies {
                add("implementation", libs.findLibrary("kotlinx.coroutines.core").get())
                add("implementation", libs.findLibrary("timber").get())
                add("testImplementation", libs.findLibrary("junit").get())
                add("androidTestImplementation", libs.findLibrary("androidx.junit").get())
                add("androidTestImplementation", libs.findLibrary("androidx.espresso.core").get())
            }
        }
    }
}
