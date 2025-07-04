import com.vprioul.cv.convention.configureDetekt
import com.vprioul.cv.convention.libs
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AndroidDetektConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply(
                libs.findLibrary("detekt-gradlePlugin").get().get().group.toString()
            )
            val extension = extensions.getByType<DetektExtension>()
            configureDetekt(extension)
        }
    }
}

