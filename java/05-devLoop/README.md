# Java "Development Loop" Environment Using Docker

This is an example of a developer loop for a command line interface application written in Java.  Your milage will vary.

```shell (linux)
docker run -it -v "$(pwd)/src":/src openjdk:11-jdk /bin/bash
```
