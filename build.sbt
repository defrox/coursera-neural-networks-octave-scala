name := "coursera-neural-networks-octave-scala"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "com.diffplug.matsim" % "matfilerw" % "3.0.1",
  "com.github.fommil.netlib" % "all" % "1.1.2",
  "org.scalanlp" %% "breeze" % "0.13.2",
  "org.scalanlp" %% "breeze-viz" % "0.13.2",
  "com.typesafe" % "config" % "1.3.1",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "org.slf4j" % "slf4j-simple" % "1.7.25",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)


scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-Xlint:missing-interpolator",
  "-Ywarn-unused",
  "-Ywarn-dead-code",
  "-language:_",
  "-encoding", "UTF-8"
)