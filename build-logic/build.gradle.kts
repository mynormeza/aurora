// build-logic's own root project exists solely to format the files that live
// here rather than inside :convention — settings.gradle.kts and this file.
// :convention's kotlinGradle target is relative to build-logic/convention/,
// so it can never reach one directory up.
plugins {
    alias(libs.plugins.spotless)
}

spotless {
    kotlinGradle {
        target("*.gradle.kts")
        ktlint(libs.versions.ktlint.get())
    }
}
