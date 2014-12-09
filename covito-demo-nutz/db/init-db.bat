@echo off
echo [INFO] Re-create the schema and provision the sample data.
pause

cd %~dp0
cd ..

set path=%M2_HOME%/bin;%windir%/system32;%path%
call mvn antrun:run -Pinit-db

cd db
pause