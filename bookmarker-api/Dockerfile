FROM eclipse-temurin:17-jdk-focal

ADD target/*.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/app.jar" ]
