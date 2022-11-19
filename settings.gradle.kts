pluginManagement {
    plugins {
        id("com.johnturkson.android.application") version "1.0.0-SNAPSHOT"
    }
    
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven {
            url = uri("https://maven.pkg.github.com/JohnTurkson/packages")
            credentials {
                val githubUsername: String? by settings
                val githubToken: String? by settings
                username = githubUsername ?: System.getenv("GITHUB_USERNAME")
                password = githubToken ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://maven.pkg.github.com/JohnTurkson/packages")
            credentials {
                val githubUsername: String? by settings
                val githubToken: String? by settings
                username = githubUsername ?: System.getenv("GITHUB_USERNAME")
                password = githubToken ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
}

rootProject.name = "template"
include(":app")
