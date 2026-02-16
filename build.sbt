ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.3.7"

lazy val root = (project in file("."))
  .settings(
    name := "Scala",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-effect" % "3.5.3"
    ),
    // -Wnonunit-statement is great for catching bugs in IO programs!
    scalacOptions += "-Wnonunit-statement"
  )