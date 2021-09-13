FROM openjdk:8-jdk-alpine
LABEL maintainer="@mochwira"
VOLUME /databank
ADD databank/target/databank-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar","/app.jar"]

#ini baru

#FROM maven:3.8.2-jdk-8
#
#WORKDIR /databank
#COPY . .
#RUN mvn clean install
#
#CMD mvn spring-boot:run
