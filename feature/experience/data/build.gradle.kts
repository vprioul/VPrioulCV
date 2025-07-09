plugins {
    alias(libs.plugins.feature.data)
}

android {
    namespace = "com.vprioul.cv.feature.experience.data"
}

dependencies {
    implementation(projects.core.data)
    implementation(projects.feature.experience.domain)
}