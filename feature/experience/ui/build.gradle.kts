plugins {
    alias(libs.plugins.feature.ui)
}

android {
    namespace = "com.vprioul.cv.feature.experience.ui"
}

dependencies {
    implementation(projects.feature.experience.domain)
    //Modules only Domain or Ui
    implementation(projects.core.domain)
}