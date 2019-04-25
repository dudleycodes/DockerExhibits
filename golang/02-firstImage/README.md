# Go First Docker Image

This will build a sample go application and package it into a Docker image. The final image will be large as it will include the entire golang tool chain.

## Build

```shell
docker build . -t go-hello:sdk
```

## RUN

```shell
docker run --rm go-hello:sdk
```
