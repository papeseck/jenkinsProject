FROM openjdk:17-jdk-slim
LABEL maintainer="Pape Seck diabel1208@gmail.com"
EXPOSE 8080
ADD target/jenkinsProject.jar jenkinsProject.jar
ENTRYPOINT ["java", "-jar", "jenkinsProject.jar"]