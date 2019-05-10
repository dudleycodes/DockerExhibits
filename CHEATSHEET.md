# Docker Cheatsheet

## Working with Images

Access commands for working with images via `docker image`; to see a list of all image commands use `docker image --help`.

| Description                   | Bash                                  | Powershell                            |
| :---------------------------- | :------------------------------------ | :------------------------------------ |
| Build an image with tag "abc" | `docker image build . -tag abc`       | `docker image build . -tag abc`       |
| Delete an image               | `docker image rm <name>`              | `docker image rm <image-name>`        |
| Delete *all* images           | `docker image rm $(docker images -q)` | `docker image rm $(docker images -q)` |
| Delete all untagged images    | `docker image prune`                  | `docker image prune`                  |
| Download image from registry  | `docker image pull <name>`            | `docker image pull <image-name>`      |
| List all images               | `docker image ls`                     | `docker image ls`                     |

## Running Containers from Images

`Docker run` executes a command inside a container created from an image; to see a list of all options when running a container use `docker run --help`.

| Description                                     | Bash / Powershell                                        |
| :---------------------------------------------- | :------------------------------------------------------- |
| Run a container in the background               | `docker run -d <image-name>`                             |
| Run a container that accepts command-line input | `docker run -it <image-name>`                            |
| Run a container with port mapping               | `docker run -d -p 8080:80 <image-name>`                  |
| Run a container with a mounted volume           | `docker run -v /local/path:/container/path <image-name>` |

## Working with Containers

Access commands for working with containers via `docker container`; to see a list of all container commands use `docker container --help`.

| Description                   | Bash                                    | Powershell                              | Notes                                     |
| :---------------------------- | :-------------------------------------- | :-------------------------------------- | :---------------------------------------- |
| See running containers        | `docker container ls`                   | `docker container ls`                   |                                           |
| See *all* containers          | `docker container ls -a`                | `docker container ls -a`                | Shows running and stopped containers      |
| Stop a running container      | `docker container stop <container-id>`  | `docker container stop <container-id>`  |                                           |
| Stop all running containers   | `docker container stop $(docker ps -q)` | `docker container stop $(docker ps -q)` | Nicely ask all running containers to stop |
| Kill all running containers   | `docker container kill $(docker ps -q)` | `docker container kill $(docker ps -q)` | *Forcefully* stop all running containers  |
| Delete all stopped containers | `docker container prune`                | `docker container prune`                |                                           |
