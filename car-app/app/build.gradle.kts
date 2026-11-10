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
        versionCode = 1
        versionName = "0.1.0"
        testInstrumentationRunner = "com.musicmap.car.SmokeInstrumentation"
        buildConfigField("String", "APPLE_MUSIC_DEVELOPER_TOKEN", quoted(appleDeveloperToken))
    }
    buildFeatures { buildConfig = true }
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
    // Apple distributes MusicKit through its signed-in developer download, not Maven Central.
    implementation(fileTree("libs/musickit") { include("*.aar", "*.jar") })
    "pleosImplementation"("ai.pleos.playground:FusedLocation:1.1.3")
    testImplementation("junit:junit:4.13.2")
}
