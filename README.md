# 0World2Create

0World2Create keeps the world selection screen open when you enter Singleplayer with no saved worlds. You can still create a world using **Create New World**.

## Installation

Place the JAR for your Minecraft version and loader in the client's `mods` directory.

| Minecraft | Loaders | Java |
| --- | --- | --- |
| 1.21.11 | Fabric, NeoForge | 21 |
| 26.1.2, 26.2, 26.3 | Fabric, NeoForge | 25 |

## Building from source

Run `sh ./gradlew buildAndCollect` with JDK 25. On Windows, use `./gradlew.bat buildAndCollect`. Gradle uses a Java 21 toolchain for the 1.21.11 targets and writes the installable JARs to `build/libs/`.

To build one target, run its `build` task, for example `sh ./gradlew :26.3-fabric:build`. Its JAR is under `versions/26.3-fabric/build/libs/`.
