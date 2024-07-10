rootProject.name = "monorepo-gradle"

val projectDirs = listOf("services", "shared")

projectDirs.forEach { dir ->
    file(dir).listFiles()?.forEach { subDir ->
        if (subDir.isDirectory) {
            println(subDir)
            includeBuild(subDir)
        }
    }
}
