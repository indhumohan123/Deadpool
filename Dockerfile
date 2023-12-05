FROM openJjdk:17-alphine
ADD target/Example.jar Example.jar
ENTRYPOINT ["java","-jar","Example.jar"]
EXPOSE 8080
