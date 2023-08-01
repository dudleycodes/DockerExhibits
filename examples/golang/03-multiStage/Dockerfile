# Select image to use as a "builder" image and give it a name
FROM golang:latest as GOLANG-BUILDER

# Copy or source code into the builder image
COPY hello.go /src/hello.go

# Compile our code
RUN go build -o /app/hello /src/hello.go

# Select a base image for our final image
FROM alpine

# Copy the compiled file from the base image to the final image
COPY --from=GOLANG-BUILDER /app/hello /app/hello

# Set the default command to be executed when container is started from this image
CMD ["/app/hello"]
