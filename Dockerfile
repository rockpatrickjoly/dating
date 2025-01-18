# Start with a base image with JDK 21
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the built jar file
COPY target/*.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the Spring Boot application
CMD ["java", "-jar", "app.jar"]

