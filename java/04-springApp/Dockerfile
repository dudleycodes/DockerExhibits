FROM gradle:jdk11 as GRADLE-BUILDER

COPY --chown=gradle ./springboot-sample-app/complete /home/source/java

WORKDIR /home/source/java

USER gradle

RUN gradle clean build

FROM openjdk:11-jre-slim

COPY --from=GRADLE-BUILDER /home/source/java/build/libs/gs-spring-boot-0.1.0.jar /home/application/java/gs-spring-boot-0.1.0.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "/home/application/java/gs-spring-boot-0.1.0.jar"]
