# Select the base image
FROM openjdk:11-jdk

# Copy in our source file
COPY Hello.java /src/

# Compile the code
RUN javac -encoding UTF8 /src/Hello.java

# Set the "current working directory" inside the container (think of it like using the CD command to change directories)
WORKDIR /src/

# Set the default command to be executed when container is started from this image
CMD ["java", "Hello"]
