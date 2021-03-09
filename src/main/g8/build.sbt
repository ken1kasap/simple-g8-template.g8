
lazy val root = (project in file(".")).
  settings(
    organization := "$organization$",
    scalaVersion := "$scala_version$",
    version      := "$project_version$"
    name := "$name$",
    libraryDependencies ++= Seq(
      "ch.qos.logback"             %  "logback-classic" % "1.2.3",
      "com.typesafe.scala-logging" %% "scala-logging"   % "3.9.2",
      "org.scalatest"              %% "scalatest"       % "3.2.2"  % Test
    )
  )
