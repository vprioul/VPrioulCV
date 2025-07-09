plugins {
    alias(libs.plugins.feature.domain)
}

android {
    namespace = "com.vprioul.cv.feature.experience.domain"
}

dependencies {
    implementation(projects.core.domain)
}