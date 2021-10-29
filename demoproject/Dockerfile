FROM adoptopenjdk/openjdk15:ubi
VOLUME /tmp
COPY target/demoproject-0.0.1-SNAPSHOT.jar demoproject-0.0.1-SNAPSHOT.jar
EXPOSE 9999
ENTRYPOINT ["java", "-jar", "/demoproject-0.0.1-SNAPSHOT.jar"]