plugins {
    alias(libs.plugins.feature.data)
}

android {
    namespace = "com.vprioul.cv.feature.hobbies.data"
}

dependencies {
    implementation(libs.play.services.maps)
}