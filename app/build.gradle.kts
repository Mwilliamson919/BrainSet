plugins {
    id("com.android.application")
}

android {
    namespace = "com.brainset.ocr"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.brainset.ocr"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //Fire-Base mlkit to recognize text in images/videos
    implementation ("com.google.android.gms:play-services-mlkit-text-recognition:19.0.0")

    //Image loading and caching library for Android focused on smooth scrolling (Advanced Image Viewer)
    implementation ("com.github.bumptech.glide:glide:4.16.0")
}