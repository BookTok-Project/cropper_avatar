plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
  id("org.jetbrains.kotlin.plugin.parcelize")
}

// Licensee plugin removed - not needed for library build

android {
  namespace = "com.canhub.cropper"

  compileSdk = 36

  defaultConfig {
    minSdk = 21
  }

  buildFeatures {
    viewBinding = true
    dataBinding = false
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }

  kotlin {
    compilerOptions {
      jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11)
      freeCompilerArgs.add("-Xannotation-default-target=param-property")
    }
  }

  testOptions {
    unitTests.isIncludeAndroidResources = true
  }
}


dependencies {
  // Use available versions that are confirmed to exist in repositories
  implementation("androidx.core:core-ktx:1.17.0") // From booktok-android
  implementation("androidx.activity:activity-ktx:1.10.1") // Available version
  implementation("androidx.appcompat:appcompat:1.7.0") // Try this version
  implementation("androidx.exifinterface:exifinterface:1.3.7") // Try this version
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.10.2") // From booktok-android
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2") // From booktok-android
}
