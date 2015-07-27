organization := "org.moscatocms"

name := "moscato-doctype"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.7"

crossScalaVersions := Seq("2.10.4")

scalacOptions += "-deprecation"

libraryDependencies ++= Seq(
  "io.spray" %%  "spray-json" % "1.3.2"
)