set projectLocation=%~dp0
cd %ProjectPath%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\resources\TestRunner.xml