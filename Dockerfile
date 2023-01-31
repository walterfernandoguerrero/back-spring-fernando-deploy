
FROM amazoncorretto:15-alpine-jdk

COPY target/prueba-abml-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT entrypoint ["java","-jar","/app.jar"]

