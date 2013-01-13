@echo off
mvn clean install -Dmaven.test.skip=true
call D:\Program Files\apache-tomcat-6.0.36\run.bat