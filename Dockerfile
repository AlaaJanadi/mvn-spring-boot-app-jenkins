FROM openjdk:17-jdk-alpine

VOLUME /tmp

COPY target/maven-spring-boot-jenkins-1.0.jar app.jar

ENTRYPOINT [ "java" , "-jar" , "/app.jar" ]
