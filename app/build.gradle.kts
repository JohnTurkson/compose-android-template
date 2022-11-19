plugins {
    id("com.johnturkson.android.application")
}

android {
    namespace = "com.johnturkson.template.android"
    
    defaultConfig {
        applicationId = "com.johnturkson.template.android"
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
}
