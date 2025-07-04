plugins {
    alias(libs.plugins.feature.domain)
}

android {
    namespace = "com.vprioul.cv.feature.hobbies.domain"
}

dependencies {
    implementation(projects.feature.hobbies.data)
    //Modules only Data or Domain
}