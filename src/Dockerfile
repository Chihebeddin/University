FROM openjdk:8
#FROM maven:3.6.0-jdk-8 AS build
#COPY src /home/app/src
#COPY pom.xml /home/app
#RUN mvn -f /home/app/pom.xml -B -DskipTests clean package

#FROM openjdk:8
#COPY --from-build /home/app/target/*-snapshot.jar /usr/local/lib/universite.jar
EXPOSE 8080
ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT ["java", "-jar", "spring-boot-docker.jar"]