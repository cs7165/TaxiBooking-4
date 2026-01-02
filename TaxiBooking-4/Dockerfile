# Stage 1: Build the Spring Boot application
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Runtime image
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
EXPOSE 8081
COPY --from=build /app/target/TaxiBooking-4-0.0.1-SNAPSHOT.jar TaxiBooking-4.jar
ENTRYPOINT ["java", "-jar", "TaxiBooking-4.jar"]
