# Java Spring Boot in Docker Image

This will build [spring-guide's example application](https://github.com/spring-guides/gs-spring-boot) into a Docker image using multi-stage builds to optimize the final size.

## Build

```shell
docker build . -t java-hello-spring:latest
```

## RUN

```shell
docker run -d --rm -p 8080:8080 java-hello-spring:latest
```
