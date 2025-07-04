plugins {
    alias(libs.plugins.feature.domain)
}

android {
    namespace = "com.vprioul.cv.feature.education.domain"
}

dependencies {
    implementation(projects.feature.education.data)
    //Modules only Data or Domain
}