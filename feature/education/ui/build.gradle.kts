plugins {
    alias(libs.plugins.feature.ui)
}

android {
    namespace = "com.vprioul.cv.feature.education.ui"
}

dependencies {
    implementation(projects.feature.education.domain)
    //Modules only Domain or Ui
    implementation(projects.core.domain)
}