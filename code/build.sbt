import play.PlayJava

organization := "com.feth"

name := "play-easymail"

scalaVersion := "2.11.5"

crossScalaVersions := Seq("2.10.4", "2.11.5")

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-mailer" % "3.0.0-SNAPSHOT"
)

lazy val root = (project in file(".")).enablePlugins(PlayJava)
