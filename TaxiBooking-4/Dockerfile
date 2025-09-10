# Stage 1: Build the Spring Boot application using a Maven image
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the source code to the container
COPY . .

# Package the application, skipping tests to speed up the build
RUN mvn clean package -DskipTests

# Stage 2: Create the final, lightweight image
FROM eclipse-temurin:17-jre-alpine

# Set the working directory for the final image
WORKDIR /app

# Expose the port that your Spring Boot application runs on
EXPOSE 8080

# Copy the executable JAR from the 'build' stage
COPY --from=build /app/target/TaxiBooking-4-0.0.1-SNAPSHOT.jar TaxiBooking-4.jar

# Define the command to run the application when the container starts
ENTRYPOINT ["java", "-jar", "TaxiBooking-4.jar"]
