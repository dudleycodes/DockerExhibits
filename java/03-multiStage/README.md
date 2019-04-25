# Java Multi Stage Docker Image Example

This will build a sample Java application and package it into a Docker image. The final image will be optimized to include only the java runtime environment (JRE).

## Build

```shell
docker build . -t java-hello:latest
```

## RUN

```shell
docker run --rm java-hello:latest
```
