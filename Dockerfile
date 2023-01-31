
FROM amazonecorretto:17-alpine-jdk

COPY target/prueba-abml-0.0.1-SNAPSHOT.jar app.jar

entrypoint ["java","jar","/app.jar"]

