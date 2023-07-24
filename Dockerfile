FROM amazoncorretto:11-alpine-jdk
MAINTAINER MR
COPY target/mr-0.0.1-SNAPSHOT.jar  mr-app.jar
ENTRYPOINT ["java","-jar","/mr-app.jar"]
EXPOSE 8080