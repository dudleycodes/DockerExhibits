# Java First Docker Image

This will build a sample NodeJS application and package it into a Docker image.

## Build

```shell
docker build . -t nodejs-hello
```

## RUN

```shell
docker run --rm nodejs-hello
```
