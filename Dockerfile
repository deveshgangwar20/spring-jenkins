FROM openjdk:8
EXPOSE 8080
ADD target/SpringJenkins-0.0.1-SNAPSHOT.jar SpringJenkins-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","SpringJenkins-0.0.1-SNAPSHOT.jar"]