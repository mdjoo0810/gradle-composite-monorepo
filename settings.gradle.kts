rootProject.name = "monorepo-gradle"

def projectDirs = [
        'shared',
        'services',
]

projectDirs.each {
    file(it).eachDir { dir ->
        includeBuild dir
    }
}
