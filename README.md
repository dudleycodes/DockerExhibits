# Docker Exhibits

Materials for demonstrating Docker to newcomers

## Examples

| Technology                             | Description |
| :------------------------------------- | ----------- |
| **[Java](./examples/java/)**           | Java programming language. |
| &nbsp;&nbsp;&nbsp;├─ 01-firstImage     | Compile a Java application and package in a Docker image. |
| &nbsp;&nbsp;&nbsp;├─ 02-multiStage     | Use multi-stage builds to compile a Java application and package in a smaller Docker image. |
| &nbsp;&nbsp;&nbsp;└─ 03-jlink          | Use multi-stage builds and Java's `jlink` utility to a size-optimized Docker image. |
| **[Go](./examples/golang/)**           | Go programming language. |
| **[WordPress](./examples/wordpress/)** | Web content management system. |
| &nbsp;&nbsp;&nbsp;├─ 01-manual         | Use Docker from a command line to manually spin up a WordPress instance. |
| &nbsp;&nbsp;&nbsp;└─ 02-compose        | Use 'Docker Compose' to spin up a WordPress instance. |
