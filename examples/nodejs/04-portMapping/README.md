# Java Spring Boot in Docker Image

This will build [spring-guide's example application](https://github.com/spring-guides/gs-spring-boot) into a Docker image using multi-stage builds to optimize the final size.

## Build

```shell
docker build . -t nodejs-hello-http
```

## RUN

```shell
docker run -d --rm -p 3000:3000 nodejs-hello-http
```
