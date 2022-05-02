
name := """ebean-backend"""

version := "1.0-SNAPSHOT"

lazy val `root` = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

resolvers ++= Seq(
  "Typesafe" at "http://repo.typesafe.com/typesafe/releases/",
  "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"
)

scalaVersion := "2.11.8"

//libraryDependencies += guice
libraryDependencies += filters
libraryDependencies += evolutions
libraryDependencies += jdbc
libraryDependencies ++= Seq(
  javaWs
)
libraryDependencies += ws
// https://mvnrepository.com/artifact/javax.json/javax.json-api
libraryDependencies += "javax.json" % "javax.json-api" % "1.1.4"
libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.11"
libraryDependencies ++= Seq(javaWs , specs2 % Test )
