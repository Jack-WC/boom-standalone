// // sbt build file

// lazy val commonSettings = Seq(
//   organization := "edu.berkeley.cs",
//   name := "boom-template",
//   version := "1.3",
//   scalaVersion := "2.13.10",
//   traceLevel := 15,
//   scalacOptions ++= Seq("-deprecation","-unchecked","-Xsource:2.11"),
//   libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % "test",
//   libraryDependencies += "org.json4s" %% "json4s-native" % "3.6.1",
//   libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value,
//   addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full),
//    resolvers ++= Seq(
//      Resolver.sonatypeRepo("snapshots"),
//      Resolver.sonatypeRepo("releases"),
//      Resolver.mavenLocal))

// // setup dependency tree
// lazy val rocketchip = RootProject(file("rocket-chip"))
// lazy val testchip = (project in file("testchipip")).settings(commonSettings).dependsOn(rocketchip)
// lazy val boom = (project in file("riscv-boom")).settings(commonSettings).dependsOn(rocketchip, testchip)

// // by default SBT sets the root project to ".", instead set the root to boom
// onLoad in Global ~= (_ andThen ("project boom" :: _))

// 使用 ThisBuild 确保所有子项目（包括 RootProject）尽量对齐版本
ThisBuild / scalaVersion := "2.13.10"
ThisBuild / semanticdbVersion := "4.7.8"
val chiselVersion = "3.5.6"

lazy val commonSettings = Seq(
  organization := "edu.berkeley.cs",
  name := "boom-template",
  version := "1.3",
  // 移除这里的变量定义，统一使用 ThisBuild 
  traceLevel := 15,
  // 修改：Scala 2.13 不再需要 -Xsource:2.11，且建议添加 -Xsource:3 以平滑过渡
  scalacOptions ++= Seq("-deprecation", "-unchecked"),

  libraryDependencies += "edu.berkeley.cs" %% "chisel3" % chiselVersion,
  addCompilerPlugin("edu.berkeley.cs" %% "chisel3-plugin" % chiselVersion cross CrossVersion.full),

  libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % "test",
  libraryDependencies += "org.json4s" %% "json4s-native" % "3.6.12",
  // libraryDependencies += "org.json4s" %% "json4s-native" % "3.6.1",
  libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value,

  // 关键修改 1：Scala 2.13 已经内置了宏支持，不再使用 macro-paradise 插件
  // 而是开启 -Ymacro-annotations 编译选项
  scalacOptions += "-Ymacro-annotations",

  resolvers ++= Seq(
    Resolver.sonatypeRepo("snapshots"),
    Resolver.sonatypeRepo("releases"),
    Resolver.mavenLocal)
)

// setup dependency tree
// 关键修改 2：对于 RootProject，最好强制其使用当前的 scalaVersion
lazy val rocketchip = RootProject(file("rocket-chip"))

lazy val sifive_blocks = (project in file("rocket-chip-blocks"))
  .dependsOn(rocketchip)
  // .settings(libraryDependencies ++= rocketLibDeps.value)
  .settings(commonSettings)

lazy val testchipip = (project in file("testchipip"))
  .dependsOn(rocketchip, sifive_blocks)
  // .settings(libraryDependencies ++= rocketLibDeps.value)
  .settings(commonSettings)

lazy val boom = (project in file("riscv-boom"))
  .settings(commonSettings)
  .dependsOn(rocketchip, testchipip)

// 修正语法：新版 sbt 建议使用 / 语法
Global / onLoad ~= (_ andThen ("project boom" :: _))