plugins {
    alias(libs.plugins.feature.data)
}

android {
    namespace = "com.vprioul.cv.feature.skills.data"
}

dependencies {
    implementation("com.google.code.gson:gson:2.10.1")
}