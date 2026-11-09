plugins {
    id("dev.kikugie.stonecutter")
    id("net.fabricmc.fabric-loom-remap") version "1.19.4" apply false
    id("net.fabricmc.fabric-loom") version "1.19.4" apply false
    id("net.neoforged.moddev") version "2.0.148" apply false
}

stonecutter active "26.3-fabric"

tasks.register<Sync>("buildAndCollect") {
    group = "build"
    description = "Builds all targets and collects their mod JARs."
    into(layout.buildDirectory.dir("libs"))
}
