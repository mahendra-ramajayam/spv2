logLevel := Level.Warn

addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.6")

libraryDependencies += "com.trueaccord.scalapb" %% "compilerplugin" % "0.6.0-pre2"

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.4")