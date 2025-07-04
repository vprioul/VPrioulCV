import com.vprioul.cv.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidFeatureDataConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("plugin.android.library")
                apply("org.jetbrains.kotlin.plugin.serialization")
                
// Hilt
apply("plugin.android.hilt")
            }

            dependencies {
                add("implementation", project(":core:resources"))
                add("implementation", libs.findLibrary("kotlinx.serialization.json").get())
            }
        }
    }
}
