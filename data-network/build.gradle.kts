import sh.christian.ozone.api.generator.ApiReturnType

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    id("sh.christian.ozone.generator") // TODO
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.pppp.data_network"
    compileSdk = 35

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation("io.ktor:ktor-client-core:3.0.2")
    implementation("io.ktor:ktor-client-cio:3.0.2")
}

dependencies {
    implementation("com.google.dagger:hilt-android:2.51.1")
    kapt("com.google.dagger:hilt-android-compiler:2.51.1")
    lexicons("sh.christian.ozone:lexicons:0.3.0")
    implementation ("com.squareup.retrofit2:retrofit:2.11.0")

}

lexicons {
    namespace.set("org.screech")

    generateApi("ScreechClient") {
        packageName.set("org.screech")
        returnType.set(ApiReturnType.Result)
        suspending.set(true)
        exclude("""app\.bsky\.unspecced\..*""")
        withKtorImplementation("ScreechClientApi")
    }
}
kapt {
    correctErrorTypes = true
}

tasks.named("generateLexicons").configure { dependsOn("kaptGenerateStubsDebugKotlin") }
