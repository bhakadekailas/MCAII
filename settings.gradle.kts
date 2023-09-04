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
        google()
        mavenCentral()
    }
}

rootProject.name = "MCAII"
include(":app")
include(":app:activitylifecycle")
include(":app:viewgroups")
include(":app:calculatordemo")
include(":app:views")
include(":app:constraintdemo")
