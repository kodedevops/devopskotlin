# Use a base image with OpenJDK 17 (since Spring Boot 3 supports Java 17)
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the jar file to the container
COPY build/libs/*.jar /app/devopskotlin.jar


# Expose the port that the application will run on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app/devopskotlin.jar"]
