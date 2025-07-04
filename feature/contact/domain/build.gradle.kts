plugins {
    alias(libs.plugins.feature.domain)
}

android {
    namespace = "com.vprioul.cv.feature.contact.domain"
}

dependencies {
    implementation(projects.feature.contact.data)
    //Modules only Data or Domain
    implementation(projects.core.domain)
}