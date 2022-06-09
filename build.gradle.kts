// the plugins block lets us define which gradle plugins we want to use
plugins {
  // base java plugin tells gradle we want to use java in our project
  java
  // application plugin lets us run the main method via gradle task "run"
  application
}

// repositories define the places from which we want to download libraries
repositories {
  mavenCentral()
  maven("https://s01.oss.sonatype.org/content/repositories/snapshots")
}

// dependencies define which libraries we want to download and include in our project
dependencies {
  implementation("org.sourcegrade:fopbot:0.3.0")
}

// configure the application plugin, tell gradle where to look for our main method
// to run the project, use the gradle task "run"
// this may be done via your IDE or in the command line as either:
// Unix, Powershell: "./gradlew run"
// CMD: "gradlew run"
application {
  mainClass.set("fopbot_playground.Main")
}
