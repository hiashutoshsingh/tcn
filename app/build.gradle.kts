import com.android.build.api.dsl.Packaging

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.tcndemo"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.tcndemo"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }

    packaging {
        resources {
            excludes += "kotlin/internal/internal.kotlin_builtins"
            excludes += "kotlin/reflect/reflect.kotlin_builtins"
            excludes += "kotlin/kotlin.kotlin_builtins"
        }
    }


//    sourceSets {
//        getByName("main") {
//            java.srcDirs("src/main/kotlin")
//            jniLibs.srcDirs("src/main/java")
//            aidl.srcDirs("src/main/aidl")
//        }
//    }
}

//repositories {
//    flatDir {w
//       dir("libs")
//    }
//}

dependencies {

    implementation(files("libs/tcn_liftboard-release.aar"))
    implementation("androidx.multidex:multidex:2.0.1")
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}