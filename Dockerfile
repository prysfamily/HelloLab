FROM openjdk:latest
ADD target/hello-lab-0.0.1-SNAPSHOT.jar open.jar
ENTRYPOINT ["java","-jar","open.jar"]
EXPOSE 1011