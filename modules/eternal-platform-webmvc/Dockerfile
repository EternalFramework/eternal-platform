FROM docker.1ms.run/bellsoft/liberica-openjre-debian:21.0.8
WORKDIR /app
COPY target/eternal-platform-servlet-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
EXPOSE 25666