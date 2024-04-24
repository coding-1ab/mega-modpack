import kotlin.io.path.exists

plugins {
    `java-library`
}

tasks {
    register<Copy>("copyMods") {
        dependsOn("build")
        from(project.projectDir)

        gradle.includedBuilds.forEach { build ->
            var path = build.projectDir.toPath()
            if (path.resolve("forge").exists()) {
                path = path.resolve("forge")
            }
            if (path.resolve("Forge").exists()) {
                path = path.resolve("Forge")
            }

            val libs = path.resolve("build").resolve("libs").toFile()
            val files = libs.listFiles() ?: return@forEach

            var hasShadow = false
            files.filter {
                val name = it.name
                hasShadow = hasShadow || name.contains("shadow") || name.contains("all")
                name.endsWith("jar") && !name.contains("source")
            }.filter {
                !hasShadow || it.name.contains("shadow")
            }.forEach { jar ->
                print(jar.path)
                include(jar.path)
            }
        }

        into("../mods")
    }

    named("build") {
        dependsOn(*gradle.includedBuilds.map { build -> build.task(":build") }.toTypedArray())
    }
}
