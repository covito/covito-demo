@echo off
echo [INFO] Back up db data.
pause

cd %~dp0
cd ..

set path=%M2_HOME%/bin;%windir%/system32;%path%
call mvn antrun:run -Pback-db

cd db
pause