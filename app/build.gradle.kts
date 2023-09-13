plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id ("com.google.dagger.hilt.android")
}

android {
    namespace = "com.ghanshyam.spotifyclone"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ghanshyam.spotifyclone"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation ("androidx.core:core-ktx:1.10.1")
    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("com.google.android.material:material:1.9.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")

    //ssp and sdp
    implementation ("com.intuit.sdp:sdp-android:1.1.0")
    implementation ("com.intuit.ssp:ssp-android:1.1.0")

    // Firebase
    implementation (platform("com.google.firebase:firebase-bom:32.2.0"))
    implementation ("com.google.firebase:firebase-auth-ktx")

    // Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")

    // ViewModel and LiveData
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")

    // Navigation Component
    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.2")
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.2")

    // Glide
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    implementation("com.google.android.gms:play-services-auth:20.7.0")
    kapt ("com.github.bumptech.glide:compiler:4.16.0")

    // Activity KTX for viewModels()
    implementation ("androidx.activity:activity-ktx:1.7.2")

    // Dagger - Hilt
    implementation ("com.google.dagger:hilt-android:2.48")
    kapt ("com.google.dagger:hilt-android-compiler:2.48")
//    implementation ("androidx.hilt:hilt-lifecycle-viewmodel:2.48")
//    implementation ("androidx.hilt:hilt-lifecycle-runtime:2.48")
    kapt ("androidx.hilt:hilt-compiler:2.48")

    // Timber
    implementation ("com.jakewharton.timber:timber:5.0.0")

    // Firestore
    implementation ("com.google.firebase:firebase-firestore:24.7.1")

    // Firebase Storage
    implementation ("com.google.firebase:firebase-storage-ktx:20.2.1")

    // ExoPlayer
    api ("com.google.android.exoplayer:exoplayer-core:2.19.1")
    api ("com.google.android.exoplayer:extension-mediasession:2.19.1")
    api ("com.google.android.exoplayer:exoplayer-ui:2.19.1")
    implementation ("androidx.media3:media3-session:1.1.1")
}
