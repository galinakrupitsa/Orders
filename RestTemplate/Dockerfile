FROM openjdk:17
WORKDIR /app
COPY /target/RestTemplate-0.0.1-SNAPSHOT.jar /app/temp.jar
ENTRYPOINT ["java", "-jar", "temp.jar"]