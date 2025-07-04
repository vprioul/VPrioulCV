plugins {
    alias(libs.plugins.feature.domain)
}

android {
    namespace = "com.vprioul.cv.feature.experience.domain"
}

dependencies {
    implementation(projects.feature.experience.data)
    //Modules only Data or Domain
    implementation(projects.core.domain)
}