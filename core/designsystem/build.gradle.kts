
plugins {
    alias(libs.plugins.aurora.android.library)
    alias(libs.plugins.aurora.android.library.compose)
    alias(libs.plugins.aurora.paparazzi)
}
android {
    namespace = "com.aurora.bank.core.designsystem"
}

dependencies {
    api(libs.androidx.compose.material3)
    api(libs.androidx.compose.ui)
    api(libs.androidx.compose.ui.graphics)

    testImplementation(libs.junit)
}
