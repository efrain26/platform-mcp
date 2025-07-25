plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.com.github.johnrengelman)
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.23"

    application

}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use the Kotlin JUnit 5 integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")

    // Use the JUnit 5 integration.
//    testImplementation(libs.junit.jupiter.engine)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // This dependency is used by the application.
    implementation(libs.guava)
    implementation(libs.modelcontextprotocol)
    implementation(libs.slf4j)
    implementation(libs.ktor.client.content.negotiation)
    implementation(libs.ktor.serialization.kotlinx)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

application {
    // Define the main class for the application.
    mainClass = "com.efradev.platform.mcp.AppKt"

}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}

// Configuración para el JAR ejecutable (Shadow JAR)
tasks.named<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar>("shadowJar") {
    archiveBaseName.set("platform-mcp-server")
    archiveVersion.set("1.0.0")
    archiveClassifier.set("")
    // El resultado será: platform-mcp-server-1.0.0.jar
}

// Configuración para el JAR regular (opcional)
tasks.named<Jar>("jar") {
    archiveBaseName.set("platform-mcp-server")
    archiveVersion.set("1.0.0")
    // El resultado será: platform-mcp-server-1.0.0.jar
}
