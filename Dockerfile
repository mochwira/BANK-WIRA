# define base docker image
#FROM openjdk:11
#FROM java:8
#ADD target/databank-0.0.1-SNAPSHOT.jar databank.jar
#EXPOSE 8082
#ENTRYPOINT ["java", "-jar", "databank.jar"]

#ini baru

FROM maven:3.8.2-jdk-8

WORKDIR /databank
COPY . .
RUN mvn clean install

CMD mvn spring-boot:run
