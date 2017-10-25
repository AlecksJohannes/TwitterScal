name := "finatraTest"

version := "0.1"

scalaVersion := "2.12.4"

lazy val versions = new {
  val finatraThrift = "2.13.0"
  val finatraHttp = "2.13.0"

}

libraryDependencies += "com.twitter" %% "finatra-thrift" % versions.finatraThrift

libraryDependencies += "com.twitter" %% "finatra-http" % versions.finatraHttp
        