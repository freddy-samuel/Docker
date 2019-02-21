FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/ekyc-docker-0.0.1-SNAPSHOT.jar KYCApp.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /KYCApp.jar" ]