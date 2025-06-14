plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.yourapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.yourapp"
        minSdk = 26 // Subimos a 26 para simplificar las notificaciones y servicios
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    //... (el resto de tu build.gradle)
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.core:core-ktx:1.12.0")
    
    // --> ¡Añadir esta dependencia para la ubicación!
    implementation("com.google.android.gms:play-services-location:21.2.0")
}
