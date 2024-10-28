plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.aptmed"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.aptmed"
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
    buildFeatures {
        viewBinding = true
    }

    }

    dependencies {

        implementation(libs.androidx.core.ktx)
        implementation(libs.androidx.appcompat)
        implementation(libs.material)
        implementation(libs.androidx.activity)
        implementation(libs.androidx.constraintlayout)
        implementation(libs.androidx.tools.core)
        implementation(libs.androidx.recyclerview)
        testImplementation(libs.junit)
        androidTestImplementation(libs.androidx.junit)
        androidTestImplementation(libs.androidx.espresso.core)



        //New dependencies
        implementation(libs.androidx.viewpager2.v110)
        implementation(libs.recyclerview)
        implementation(libs.gson.v288)
        implementation(libs.androidx.security.crypto)
        implementation (libs.android.volley)
        implementation(libs.gson)
        implementation(libs.glide)
        implementation(libs.okhttp)
        implementation(libs.retrofit)
        implementation(libs.converter.gson)
        implementation (libs.androidx.preference.ktx)
        implementation (libs.logging.interceptor)
        implementation (libs.kotlinx.coroutines.core.v160)
        implementation(libs.kotlinx.coroutines.android.v160)

    }