#Development Prozess
# Einen einzelnen Microservice Starten
 mvn clean install
# Einen einzelnen Microservice Testen
 mvn clean test 
# Einen einzelnen SpringBoot Microservice Starten
  cd Path_to_your_Application
  mvn spring-boot:run 
# Mehere SpringBoot Microserivice Starten
mvn spring-boot:run
für jeden microservice portnumber muss konfiguert werden.
# Swagger-UI Testen
swagger ui URL muss angegebenen werden
Eingabe muss angegeben werden und response kann getestet werden
# Git
git checkout -b [branchname]
git commit -m "message"
git pullrequest(4 Augen Prinzip)
git push  
# Jenkins Starten
start CI/CD Server
run jenkins job 
# Sonar Starten   
man kann result Auf Sonarqube sehen (TestAbdeckung und andere dinge)
mvn sonar:sonar -Dsonar.host.url=http://localhost:9000
-Dsonar.login=the-generated-token  
# Docker Bauen und Starten
docker build -t image_name .	
docker run -d --name container_name image_name
# Beschreibung wie mehrere Services mit UI Service zusammenarbeiten :
Priorisierung die Services,
   zb starten die unabhangige Backend Services und dann abhangige Backend Services und dann FE Services.  
# Curl Rest API Testen
curl -X POST [options] [URL]
Die option -X gibt an welche Http Anforderungsmethod bei der Kommunikation mit dem Remote Server verwendet wird  .
# Postman Starten
Geben Sie die URL zusammen mit Anforderung Method und der Konfiguration an
# Openshift Starten  
In local  environment kann man mit minishift microservice deployieren.

