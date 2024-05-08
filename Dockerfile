FROM openjdk:17-jdk-alpine
LABEL authors="coryh"
COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar /D387_sample_code-0.0.2-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/D387_sample_code-0.0.2-SNAPSHOT.jar"]