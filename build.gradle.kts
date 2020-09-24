import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
}
repositories {
    jcenter()
}
dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.4.2")
}
tasks.withType<KotlinCompile> {
    val javaVersion = JavaVersion.VERSION_1_8.toString()
    sourceCompatibility = javaVersion
    targetCompatibility = javaVersion
    kotlinOptions {
        jvmTarget = javaVersion
    }
}
tasks.test {
    useJUnitPlatform()
    enableAssertions = true
}
