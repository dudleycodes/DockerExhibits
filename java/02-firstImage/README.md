# Java First Docker Image

This will build a sample Java application and package it into a Docker image. The final image will be large as it will include the entire Java JDK which is not ideal for production application.

## Build

```shell
docker build . -t java-hello:jdk
```

## RUN

```shell
docker run --rm java-hello:jdk
```
