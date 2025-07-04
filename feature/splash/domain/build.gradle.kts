plugins {
    alias(libs.plugins.feature.domain)
}

android {
    namespace = "com.vprioul.cv.feature.splash.domain"
}

dependencies {
    implementation(projects.feature.splash.data)
}