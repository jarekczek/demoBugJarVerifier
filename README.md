# Steps to reproduce

1. Clone.
1. Set up correct JDK version, for example edit `.gradle/gradle.properties` in your home directory and add:

       org.gradle.java.home=C:/Program Files/Java/jdk-17.0.8-ora
    
1. Build jar:

       gradlew bootJar

1. Launch application using the same JDK (or use `run.bat`), but it's not so important, which JDK was used to build
   the jar. The issue depends on what JDK is running it.

1. If using 17.0.8 you should see:

       error constructing MAC: java.lang.SecurityException: JCE cannot authenticate the provider BC
