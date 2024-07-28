val scala3Version = "3.4.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Template-for-Scala3-Projects",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test
  )
