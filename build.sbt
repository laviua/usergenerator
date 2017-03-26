name := "usergenerator"

organization := "sample"

version := "1.0"

crossScalaVersions := Seq("2.12.0", "2.11.8", "2.10.6")

scalaVersion := "2.12.0"

libraryDependencies := {
    CrossVersion.partialVersion(scalaVersion.value) match {
        // if Scala 2.12+ is used, use scala-swing 2.x
        case Some((2, scalaMajor)) if scalaMajor >= 12 =>
            libraryDependencies.value ++ Seq(
                "org.scala-lang.modules" %% "scala-xml" % "1.0.6",
                "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4",
                "org.scala-lang.modules" %% "scala-swing" % "2.0.0-M2")
        case Some((2, scalaMajor)) if scalaMajor >= 11 =>
            libraryDependencies.value ++ Seq(
                "org.scala-lang.modules" %% "scala-xml" % "1.0.6",
                "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4",
                "org.scala-lang.modules" %% "scala-swing" % "1.0.2")
        case _ =>
            // or just libraryDependencies.value if you don't depend on scala-swing
            libraryDependencies.value :+ "org.scala-lang" % "scala-swing" % scalaVersion.value
    }
}

libraryDependencies += "junit" % "junit" % "4.12" % "test"