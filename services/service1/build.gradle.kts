plugins {
    alias(libs.plugins.kotlinJvm)
}

group = "com.example.service1"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("com.example:lib1")
    implementation("com.example:lib2")
}