
FROM eclipse-temurin:21-jdk-jammy


WORKDIR /app


COPY target/*.war app.war


EXPOSE 8888

ENTRYPOINT ["java", "-jar", "app.war"]