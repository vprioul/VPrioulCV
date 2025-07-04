plugins {
    alias(libs.plugins.android.library.project)
    alias(libs.plugins.android.library.compose)
    alias(libs.plugins.hilt.project)
}

android {
    namespace = "com.vprioul.cv.core.ui"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.designsystem)
    implementation(projects.core.resources)
}