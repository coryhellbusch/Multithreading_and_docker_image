FROM ubuntu:latest
LABEL authors="coryh"
COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","/app.jar"]