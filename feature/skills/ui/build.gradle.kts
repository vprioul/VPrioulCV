plugins {
    alias(libs.plugins.feature.ui)
}

android {
    namespace = "com.vprioul.cv.feature.skills.ui"
}

dependencies {
    implementation(projects.feature.skills.domain)
    //Modules only Domain or Ui
    implementation(projects.core.domain)
}