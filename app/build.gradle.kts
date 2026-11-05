plugins {
id("com.android.application")
id("org.jetbrains.kotlin.android")
id("org.jetbrains.kotlin.plugin.compose")
}

android {
namespace = "com.plasma.databank"
compileSdk = 35

defaultConfig {
    applicationId = "com.plasma.databank"
    minSdk = 23
    targetSdk = 35
    versionCode = 1
    versionName = "1.0"
}

}
