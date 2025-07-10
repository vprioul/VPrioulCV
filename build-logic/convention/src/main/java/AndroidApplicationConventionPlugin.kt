import com.android.build.api.dsl.ApplicationExtension
import com.vprioul.cv.convention.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
                apply("plugin.android.detekt")
            }

            extensions.configure<ApplicationExtension> {
                configureKotlinAndroid(this)
                buildFeatures {
                    buildConfig = true
                }
                namespace = "com.vprioul.cv.VPrioulCV"

                defaultConfig.targetSdk = 35
                compileSdk = 35
                @Suppress("UnstableApiUsage")
                testOptions.animationsDisabled = true
                defaultConfig {
                    minSdk = 24
                    applicationId = "com.vprioul.cv.VPrioulCV"
                    targetSdk = 35
                    versionCode = 1
                    versionName = "1.0"
                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

                }
            }
        }
    }

}
