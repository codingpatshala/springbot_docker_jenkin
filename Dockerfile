FROM openjdk:17-jdk-alpine
WORKDIR /opt
ENV PORT 8080
EXPOSE 8080
COPY build/libs/pubsuboktasecurity-0.0.1.jar /opt/pubsuboktasecurity-0.0.1.jar
ENTRYPOINT  exec java $JAVA_OPTS -jar pubsuboktasecurity-0.0.1.jar