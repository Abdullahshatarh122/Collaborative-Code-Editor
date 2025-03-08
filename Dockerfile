FROM openjdk:21-jdk-slim

RUN apt-get update && apt-get install -y docker.io && rm -rf /var/lib/apt/lists/*



ARG JAR_FILE=target/complier_demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
