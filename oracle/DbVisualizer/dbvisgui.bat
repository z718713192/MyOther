@echo off

rem Script to launch DbVisualizer by manually invoking Java

rem Please note that it's *not* recommended to launch DbVisualizer
rem with this script. Instead use the "dbvis.exe" launcher.

set DBVIS_HOME=%~dp0
set JAVA_EXEC=java

set CP=%DBVIS_HOME%\resources
set CP=%CP%;%DBVIS_HOME%\lib\*

%JAVA_EXEC% -Xmx512M -XX:MaxPermSize=192m -splash:"%DBVIS_HOME%\resources\splash-animated.gif" -cp "%CP%" -Ddbvis.home="%DBVIS_HOME%." com.onseven.dbvis.DbVisualizerGUI %*
