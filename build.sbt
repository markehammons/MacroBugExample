lazy val core = project.settings(
  Compile / scalaSource := baseDirectory.value / "src",
  scalaVersion := "3.1.0"
)
