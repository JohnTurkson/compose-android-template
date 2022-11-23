plugins {
    id("com.johnturkson.android.application")
}

android {
    namespace = "com.johnturkson.template.android"
    
    defaultConfig {
        applicationId = "com.johnturkson.template.android"
        versionCode = 1
        versionName = "1.0.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}
