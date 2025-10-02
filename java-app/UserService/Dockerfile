# Use official Eclipse Temurin JDK 21 base image
FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy your JAR file into the container
COPY target/*.jar app.jar

# Expose Spring Boot default port
EXPOSE 10000

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]