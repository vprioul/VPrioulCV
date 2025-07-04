import com.vprioul.cv.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidFeatureDomainConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("plugin.android.library")
                
// Hilt
apply("plugin.android.hilt")
            }
            dependencies {
                add("implementation", project(":core:resources"))
                add("implementation", libs.findLibrary("junit").orElse(null))
                add("implementation", libs.findLibrary("androidx-espresso-core").orElse(null))
                add("testImplementation", libs.findLibrary("junit").orElse(null))
                add("androidTestImplementation", libs.findLibrary("androidx-junit").orElse(null))
                add("androidTestImplementation", libs.findLibrary("androidx-espresso-core").orElse(null))
            }
        }
    }
}
