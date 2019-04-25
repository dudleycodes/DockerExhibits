# GO GIN-Gonic in Docker Image

This will build [gin gonic's example "basic" application](https://github.com/gin-gonic/examples) into a Docker image using multi-stage builds to optimize the final size.

## Build

```shell
docker build . -t go-hello-gonic:latest
```

## RUN

```shell
docker run -d --rm -p 8080:8080 go-hello-gonic:latest
```
