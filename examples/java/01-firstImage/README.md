# Simple Java Docker Image

This will build a sample Java application and package in a Docker image.

The final image will be large as it will include our source code and the entire Java JDK. This is not ideal for production environments.

## Build

```shell
docker build . -t example-java:01
```

## RUN

```shell
docker run --rm example-java:01
```
