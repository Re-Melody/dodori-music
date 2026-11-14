import java.util.Properties

plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }

val musicProperties = Properties().apply {
    rootProject.file("local.properties").takeIf { it.exists() }?.inputStream()?.use { load(it) }
}
val appleDeveloperToken = providers.environmentVariable("APPLE_MUSIC_DEVELOPER_TOKEN")
    .orElse(musicProperties.getProperty("appleMusic.developerToken", "")).get()
fun quoted(value: String) = "\"" + value.replace("\\", "\\\\").replace("\"", "\\\"")
    .replace("\n", "\\n").replace("\r", "\\r") + "\""

android {
    namespace = "com.musicmap.car"
    compileSdk = 34
    useLibrary("android.car", false)
    defaultConfig {
        applicationId = "com.musicmap.car"
        minSdk = 28
        targetSdk = 34
        versionCode = 2
        versionName = "0.2.0"
        testInstrumentationRunner = "com.musicmap.car.SmokeInstrumentation"
        buildConfigField("String", "APPLE_MUSIC_DEVELOPER_TOKEN", quoted(appleDeveloperToken))
    }
    buildFeatures { buildConfig = true }
    // Release signing reads a keystore that stays outside Git (see README). Without it the release build is unsigned.
    val releaseStore = musicProperties.getProperty("release.storeFile")?.let { rootProject.file(it) }?.takeIf { it.exists() }
    signingConfigs {
        if (releaseStore != null) create("release") {
            storeFile = releaseStore
            storePassword = musicProperties.getProperty("release.storePassword")
            keyAlias = musicProperties.getProperty("release.keyAlias")
            keyPassword = musicProperties.getProperty("release.keyPassword")
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            if (releaseStore != null) signingConfig = signingConfigs.getByName("release")
        }
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
    // MusicKit's native player expects its libraries extracted on install.
    packaging { jniLibs { useLegacyPackaging = true } }
}
dependencies {
    // Apple distributes MusicKit through its signed-in developer download, not Maven Central.
    val musicKit = fileTree("libs/musickit") { include("*.aar", "*.jar") }
    implementation(musicKit)
    if (!musicKit.isEmpty) {
        // Local AARs do not bring their own dependencies; these are the ones Apple's sample app declares.
        implementation("androidx.annotation:annotation:1.7.1")
        implementation("androidx.media:media:1.7.0")
        implementation("androidx.core:core-ktx:1.12.0")
        implementation("androidx.appcompat:appcompat:1.7.0") // themes used by the SDK's sign-in screen
        implementation("com.google.code.gson:gson:2.8.6")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0")
    }
    "pleosImplementation"("ai.pleos.playground:FusedLocation:1.1.3")
    "pleosImplementation"("ai.pleos.playground:Vehicle:2.3.2")
    "pleosImplementation"("ai.pleos.playground:TextToSpeech:3.3.1")
    testImplementation("junit:junit:4.13.2")
}
