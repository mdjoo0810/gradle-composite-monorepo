rootProject.name = "service1"

includeBuild("../../shared/lib1")
includeBuild("../../shared/lib2")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../../gradle/libs.versions.toml"))
        }
    }
}