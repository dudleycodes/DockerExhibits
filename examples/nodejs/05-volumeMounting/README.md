# Java Volume Mounting Example

This example uses volume-mounting to create a Java development environment that can be used for the development loop. Your milage will vary with this specific example.

```shell
docker run -it --rm -v "$(pwd)/src":/src/ node:latest /bin/bash
```
