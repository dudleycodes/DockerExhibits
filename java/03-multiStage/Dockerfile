FROM openjdk:11-jdk as JDK-BUILDER

COPY *.java /usr/src/

RUN javac -encoding UTF8 /usr/src/Hello.java

FROM openjdk:11-jre-slim

COPY --from=JDK-BUILDER /usr/src/*.class /app/

WORKDIR /app

CMD ["java", "Hello"]
