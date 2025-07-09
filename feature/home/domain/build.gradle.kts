plugins {
    alias(libs.plugins.feature.domain)
}

android {
    namespace = "com.vprioul.cv.feature.home.domain"
}

dependencies {
    implementation(projects.core.domain)
}