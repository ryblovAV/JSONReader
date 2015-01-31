name := "JSONReader"

version := "1.0"

scalaVersion := "2.11.5"

resolvers += "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "org.clapper" %% "grizzled-slf4j" % "1.0.2",
  "junit" % "junit" % "4.11",
  "org.slf4j" % "slf4j-simple" % "1.6.4",
  "org.scalatest" % "scalatest_2.10" % "2.0.M7",
  "com.typesafe.play" %% "play-json" % "2.3.4"
)