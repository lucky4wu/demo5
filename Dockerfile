FROM eclipse-temurin
ARG JAR_FILE=build/lib/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "/app.jar"]