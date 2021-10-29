FROM adoptopenjdk/openjdk15:ubi
VOLUME /tmp
COPY target/sampleproject-0.0.1-SNAPSHOT.jar sampleproject-0.0.1-SNAPSHOT.jar
EXPOSE 9999
ENTRYPOINT ["java", "-jar", "/sampleproject-0.0.1-SNAPSHOT.jar"]