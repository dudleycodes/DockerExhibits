# Start a new stage, named "JDK-BUILDER", using a base image
FROM eclipse-temurin:17-jdk as JDK-BUILDER

# Copy or source code into the builder image
COPY Hello.java /usr/src/

# Compile our code
RUN javac -encoding UTF8 /usr/src/Hello.java

# Build a JAR file, setting the entry point to our main class
RUN cd /usr/src/ && \
    jar cfe Hello.jar Hello Hello.class

# Select a base image for our final image
FROM eclipse-temurin:17-jre

# Copy the compiled file from the base image to the final image
COPY --from=JDK-BUILDER /usr/src/Hello.jar /app/Hello.jar

# Set the "current working directory" inside the container (think of it like using the CD command to change directories)
WORKDIR /app

# Set the default command to be executed when container is started from this image
CMD ["java", "-jar", "/app/Hello.jar"]
