FROM eclipse-temurin:21

LABEL maintainer="dev.hitesh.uk@gmail.com"

ENV SPRING_PROFILES_ACTIVE=docker

WORKDIR /app

COPY target/ems-backend-0.0.1-SNAPSHOT.jar /app/ems-backend.jar

ENTRYPOINT ["java", "-jar", "ems-backend.jar"]