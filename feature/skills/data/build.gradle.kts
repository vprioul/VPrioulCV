plugins {
    alias(libs.plugins.feature.data)
}

android {
    namespace = "com.vprioul.cv.feature.skills.data"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.feature.skills.domain)
}