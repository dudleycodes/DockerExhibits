# Start a new stage, named "JDK-BUILDER", using a base image
FROM eclipse-temurin:17-jdk-alpine as JDK-BUILDER

# Install some packages
#   - gcompat is needed for jlink to run on Alpine Linux
#   - binutils is needed for jlink's `--strip-debug` command
RUN apk update && apk add gcompat binutils

# Copy or source code into the builder image
COPY Hello.java /usr/src/

# Compile our code
RUN javac -encoding UTF8 /usr/src/Hello.java

# Build a JAR file, setting the entry point to our main class
RUN cd /usr/src/ && \
    jar cfe Hello.jar Hello Hello.class

# Create a textfile with the list of java runtime dependencies
RUN jdeps \
     --ignore-missing-deps \
     --print-module-deps \
     --multi-release 17 \
     /usr/src/Hello.jar > /usr/src/jre-deps.info

# Use jlink to create a custom JRE, containing only java runtime depenencies needed to run the Hello.jar
RUN jlink \
	--module-path /opt/java/openjdk/jmods \
    --add-modules $(cat /usr/src/jre-deps.info) \
    --no-header-files \
    --no-man-pages \
    --strip-debug \
    --output /jre

# Select a base image for our final image
FROM alpine:3.18

# Copy in our custom-built Java Runtime Environment
COPY --from=JDK-BUILDER /jre /app/jre

# Copy our compiled JAR file
COPY --from=JDK-BUILDER /usr/src/Hello.jar /app.jar

# Set the default command to be executed when container is started from this image
CMD ["/app/jre/bin/java", "-jar", "/app.jar"]
