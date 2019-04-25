# Java First Docker Image

This will build a sample Java application and package it into a Docker image. The final image will be optimized to include only the java runtime environment (JRE).

## Build

```shell
docker build . -t hello-java:latest
```

## RUN

```shell
docker run --rm hello-java:latest
```
