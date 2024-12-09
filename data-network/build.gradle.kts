import sh.christian.ozone.api.generator.ApiReturnType

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    id("sh.christian.ozone.generator") // TODO
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
}

dependencies {
    lexicons("sh.christian.ozone:lexicons:0.3.0") // TODO
}

lexicons {
    namespace.set("org.screech")

    generateApi("ScreechClient") {
        packageName.set("org.screech")
        returnType.set(ApiReturnType.Result)
        suspending.set(true)
        exclude("""app\.bsky\.unspecced\..*""")
    }
}
