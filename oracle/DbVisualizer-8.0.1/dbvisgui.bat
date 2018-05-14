@echo off

rem Script to launch DbVisualizer by manually invoking Java

rem Please note that it's *not* recommended to launch DbVisualizer
rem with this script. Instead use the "dbvis.exe" launcher.

set DBVIS_HOME=%~dp0
set JAVA_EXEC=java

set CP=%DBVIS_HOME%\resources
set CP=%CP%;%DBVIS_HOME%\lib\alloy.jar
set CP=%CP%;%DBVIS_HOME%\lib\AppleJavaExtensions.jar
set CP=%CP%;%DBVIS_HOME%\lib\batik.jar
set CP=%CP%;%DBVIS_HOME%\lib\commons-lang.jar
set CP=%CP%;%DBVIS_HOME%\lib\dbvis.jar
set CP=%CP%;%DBVIS_HOME%\lib\dom4j.jar
set CP=%CP%;%DBVIS_HOME%\lib\forms.jar
set CP=%CP%;%DBVIS_HOME%\lib\forms-common.jar
set CP=%CP%;%DBVIS_HOME%\lib\graphml.jar
set CP=%CP%;%DBVIS_HOME%\lib\icepdf-core.jar
set CP=%CP%;%DBVIS_HOME%\lib\icepdf-viewer.jar
set CP=%CP%;%DBVIS_HOME%\lib\jai-imageio.jar
set CP=%CP%;%DBVIS_HOME%\lib\jdom.jar
set CP=%CP%;%DBVIS_HOME%\lib\jide.jar
set CP=%CP%;%DBVIS_HOME%\lib\jsch.jar
set CP=%CP%;%DBVIS_HOME%\lib\log4j.jar
set CP=%CP%;%DBVIS_HOME%\lib\ognl.jar
set CP=%CP%;%DBVIS_HOME%\lib\poi.jar
set CP=%CP%;%DBVIS_HOME%\lib\poi-ooxml.jar
set CP=%CP%;%DBVIS_HOME%\lib\poi-ooxml-schemas.jar
set CP=%CP%;%DBVIS_HOME%\lib\vectorgraphics.jar
set CP=%CP%;%DBVIS_HOME%\lib\xmlbeans.jar
set CP=%CP%;%DBVIS_HOME%\lib\yexport.jar
set CP=%CP%;%DBVIS_HOME%\lib\yFiles.jar
set CP=%CP%;%DBVIS_HOME%\lib\ysvg.jar

%JAVA_EXEC% -Xmx256M -cp "%CP%" -Ddbvis.home="%DBVIS_HOME%." com.onseven.dbvis.DbVisualizerGUI %*
