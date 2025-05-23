// Top-level build file where you can add configuration options common to all sub-projects/modules.
// 项目级 build.gradle.kts
plugins {
    id("com.android.application") version "8.10.0" apply false
    id("com.android.library") version "8.10.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.23" apply false
    id("com.google.devtools.ksp") version "1.9.23-1.0.19" apply false
}

tasks.register("clean", Delete::class) {
    delete(layout.buildDirectory) // 使用新的 layout API 替代已弃用的 buildDir
}
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.11.1") // 更新到最新版本
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")
    }
}