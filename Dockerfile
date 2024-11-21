FROM bellsoft/liberica-openjdk-alpine 
WORKDIR /home/selenium-docker
ADD target/docker-resources 	./
ENTRYPOINT java -cp "libs/*" org.testng.TestNG testng1.xml