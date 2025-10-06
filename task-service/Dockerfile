# Use lightweight Java 17 runtime
FROM eclipse-temurin:17-jre-jammy

# Create app directory inside container
WORKDIR /app

# Copy the JAR file from target folder into container
COPY target/task-service-0.0.1-SNAPSHOT.jar app.jar

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]

