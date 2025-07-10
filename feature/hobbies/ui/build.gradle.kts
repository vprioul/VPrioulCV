plugins {
    alias(libs.plugins.feature.ui)
}

android {
    namespace = "com.vprioul.cv.feature.hobbies.ui"
}

dependencies {
    implementation(projects.feature.hobbies.data)
    implementation(projects.core.ui)
    implementation(libs.maps.compose)
    implementation(libs.play.services.maps)
    //Modules only Domain or Ui
}