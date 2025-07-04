plugins {
    alias(libs.plugins.feature.domain)
}

android {
    namespace = "com.vprioul.cv.feature.skills.domain"
}

dependencies {
    implementation(projects.feature.skills.data)
    //Modules only Data or Domain
}