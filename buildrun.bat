@echo off
call %~dp0\gradlew.bat bootJar
if errorlevel 1 goto kon
call %~dp0\run.bat
:kon
