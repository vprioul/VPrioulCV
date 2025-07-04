plugins {
    alias(libs.plugins.feature.domain)
}

android {
    namespace = "com.vprioul.cv.core.domain"
}

dependencies {
    implementation(projects.core.data)
}