# Java Multi-Stage Docker Image Example

This will build a sample Java application and package it into a Docker image.

Multiple stages are used to reduce the size of the final image:

1. A builder stage will be used to compile the code and package it into a distribution-ready JAR (Java ARchive) file.
2. The final stage will start from a JRE (rather than a JDK), and COPY in the relevant artifacts from the first stage.

## Build

```shell
docker build . -t example-java:02
```

## RUN

```shell
docker run --rm example-java:02
```
