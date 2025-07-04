plugins {
    alias(libs.plugins.feature.ui)
}

android {
    namespace = "com.vprioul.cv.feature.home.ui"
}

dependencies {
    implementation(projects.feature.home.domain)
    implementation(projects.core.domain)
}