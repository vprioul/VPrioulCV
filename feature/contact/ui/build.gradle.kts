plugins {
    alias(libs.plugins.feature.ui)
    alias(libs.plugins.secrets)
}

android {
    namespace = "com.vprioul.cv.feature.contact.ui"
}

secrets {
    propertiesFileName = "secrets.properties"
    defaultPropertiesFileName = "secrets.defaults.properties"
}

dependencies {
    implementation(projects.feature.contact.domain)
    //Modules only Domain or Ui
    implementation(projects.core.domain)
}