@echo off

rem Script to launch the command line interface for DbVisualizer

set DBVIS_HOME=%~dp0
set JAVA_EXEC=java

set CP=%DBVIS_HOME%\resources
set CP=%CP%;%DBVIS_HOME%\lib\*

%JAVA_EXEC% -Xmx512M -cp "%CP%" -Djava.awt.headless=true -Ddbvis.home="%DBVIS_HOME%." com.onseven.dbvis.DbVisualizerCmd %*
