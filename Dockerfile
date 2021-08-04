FROM openjdk:11-jdk-slim
VOLUME /tmp
ADD target/demo*.jar /app.jar
CMD ["java","-jar","/app.jar"]
EXPOSE 8080