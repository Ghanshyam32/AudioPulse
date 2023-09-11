pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google() // For Google's Maven repository
        mavenCentral() // For Maven Central repository
        //noinspection JcenterRepositoryObsolete
        jcenter()
//        maven {url 'https://www.jitpack.io'}
    }
}

rootProject.name = "Spotify Clone"
include(":app")
