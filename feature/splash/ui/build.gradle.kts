plugins {
    alias(libs.plugins.feature.ui)
}

android {
    namespace = "com.vprioul.cv.feature.splash.ui"
}

dependencies {
    implementation(projects.feature.splash.domain)
}