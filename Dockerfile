FROM eclipse-temurin:17-jdk-focal
EXPOSE 9090
ADD target/springboot-docker-jenkins-0.0.1-SNAPSHOT.jar job1.jar
ENTRYPOINT ["java","-jar","/job1.jar"]
