pluginManagement {
    includeBuild("build-logic")

    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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
gradle.startParameter.excludedTaskNames.addAll(listOf(":build-logic:convention:testClasses"))
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
rootProject.name = "VPrioulCV"
include(":app")
include(":core:data")
include(":core:designsystem")
include(":core:domain")
include(":core:resources")
include(":core:ui")
include(":feature:home:data")
include(":feature:home:domain")
include(":feature:home:ui")
include(":feature:splash:data")
include(":feature:splash:domain")
include(":feature:splash:ui")
include(":feature:login:data")
include(":feature:login:domain")
include(":feature:login:ui")
include(":feature:hobbies:data")
include(":feature:hobbies:domain")
include(":feature:hobbies:ui")
include(":feature:contact:data")
include(":feature:contact:domain")
include(":feature:contact:ui")
include(":feature:skills:data")
include(":feature:skills:domain")
include(":feature:skills:ui")
include(":feature:education:data")
include(":feature:education:domain")
include(":feature:education:ui")
include(":feature:experience:data")
include(":feature:experience:domain")
include(":feature:experience:ui")
