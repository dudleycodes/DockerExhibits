# Go Multi Stage Docker Image Example

This will build a sample go application and package it into a Docker image. The final image will be optimized using multiple build stages.ß

## Build

```shell
docker build . -t go-hello:latest
```

## RUN

```shell
docker run --rm go-hello:latest
```
