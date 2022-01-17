buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        val libs = project.extensions.getByType<VersionCatalogsExtension>().named("libs") as org.gradle.accessors.dm.LibrariesForLibs
        classpath(libs.android.plugin.lib)
        classpath(libs.kotlin.plugin.lib)
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}