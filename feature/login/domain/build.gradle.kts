plugins {
    alias(libs.plugins.feature.domain)
}

android {
    namespace = "com.vprioul.cv.feature.login.domain"
}

dependencies {
    implementation(projects.feature.login.data)
    //Modules only Data or Domain
}