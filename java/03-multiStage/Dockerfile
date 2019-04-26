# Select image to use as a "builder" image and give it a name
FROM openjdk:11-jdk as JDK-BUILDER

# Copy or source code into the builder image
COPY Hello.java /usr/src/

# Compile our code
RUN javac -encoding UTF8 /usr/src/Hello.java

# Select a base image for our final image
FROM openjdk:11-jre-slim

# Copy the compiled file from the base image to the final image
COPY --from=JDK-BUILDER /usr/src/*.class /app/

# Set the "current working directory" inside the container (think of it like using the CD command to change directories)
WORKDIR /app

# Set the default command to be executed when container is started from this image
CMD ["java", "Hello"]
