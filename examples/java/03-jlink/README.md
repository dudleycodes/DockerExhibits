# Java `jlink` ad Multistage Docker Image Example

This will build a sample Java application and package it into a Docker image.

Multiple stages are used to reduce the size of the final image:

1. A builder will be used to:
    a. compile the code and package it into a distribution-ready JAR (Java ARchive) file.
    b. create a custom and trimmed down JRE (Java Runtime Environment), capable of running out application.
2. The final stage will start from a minimal image (rather than a JRE), and COPY in custom JRE along with the JAR file from the first stage.

## Build

```shell
docker build . -t example-java:03
```

## RUN

```shell
docker run --rm example-java:03
```
