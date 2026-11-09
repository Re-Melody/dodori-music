plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }

android {
    namespace = "com.musicmap.car"
    compileSdk = 34
    useLibrary("android.car", false)
    defaultConfig {
        applicationId = "com.musicmap.car"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "0.1.0"
        testInstrumentationRunner = "com.musicmap.car.SmokeInstrumentation"
    }
    flavorDimensions += "platform"
    productFlavors {
        create("standard") { dimension = "platform" }
        create("pleos") { dimension = "platform" }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}
dependencies {
    "pleosImplementation"("ai.pleos.playground:FusedLocation:1.1.3")
    testImplementation("junit:junit:4.13.2")
}
