# Use official OpenJDK base image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the packaged JAR file into the container
COPY target/backend-1.0.0.jar app.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
