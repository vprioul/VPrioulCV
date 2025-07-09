plugins {
    alias(libs.plugins.feature.data)
}

android {
    namespace = "com.vprioul.cv.feature.contact.data"
}

dependencies {
    implementation(projects.core.data)
}