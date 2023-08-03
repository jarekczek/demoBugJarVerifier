"C:\Program Files\Java\jdk-19\bin\java.exe" ^
  -jar build\libs\demoBugJarVerifier-0.0.1-SNAPSHOT.jar
  
goto kon

  -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=7778 ^

:kon
