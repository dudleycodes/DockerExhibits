# GO Volume Mounting Example

This example uses volume-mounting to create a GO development environment that can be used for the development loop. Your milage will vary with this specific example.

```shell (linux)
docker run -it -v "$(pwd)/src":/src golang /bin/bash
```
