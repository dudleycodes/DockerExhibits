FROM openjdk:11-jdk

COPY *.java /usr/src/hello/

WORKDIR /usr/src/hello

RUN javac -encoding UTF8 Hello.java

CMD ["java", "Hello"]
