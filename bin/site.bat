@echo off
echo [INFO] create project reports.
cd %~dp0
cd ..
call mvn clean site -Dmaven.test.skip=true  

pause