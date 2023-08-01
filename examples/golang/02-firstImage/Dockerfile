# Select the base image
FROM golang:latest

# Copy in our source file
COPY hello.go /src/hello.go

# Compile the code
RUN go build -o /app/hello /src/hello.go

# Set the default command to be executed when container is started from this image
CMD ["/app/hello"]
