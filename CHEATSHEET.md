# Docker Cheatsheet

## Working with Containers

| Description                   | Bash                          | Powershell                    | Notes                                               |
| :---------------------------- | :---------------------------- | :---------------------------- | :-------------------------------------------------- |
| See all running containers    | `docker container ls`         | `docker container ls`         |                                                     |
| See *all* containers          | `docker container ls -a`      | `docker container ls -a`      | Will show running and stopped containers            |
| Stop all running containers   | `docker stop $(docker ps -q)` | `docker stop $(docker ps -q)` | This will nicely ask all running containers to stop |
| Kill all running containers   | `docker kill $(docker ps -q)` | `docker kill $(docker ps -q)` | This will *forcefully* stop all running containers  |
| Delete all stopped containers | `docker container prune`      | `docker container prune`      |                                                     |

## Working with Images

| Description                | Bash                             | Powershell                       |
| :------------------------- | :------------------------------- | :------------------------------- |
| Delete all images          | `docker rmi $(docker images -q)` | `docker rmi $(docker images -q)` |
| Delete all untagged images | `docker image prune`             | `docker image prune`             |
