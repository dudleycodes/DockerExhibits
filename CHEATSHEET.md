# Docker Cheatsheet

## Containers

| Description                   | Bash                          | Powershell                    |
| :---------------------------- | :---------------------------- | :---------------------------- |
| Kill all running containers   | `docker kill $(docker ps -q)` | `docker kill $(docker ps -q)` |
| Delete all stopped containers | `docker container prune`      | `docker container prune`      |

## Images

| Description       | Bash                             | Powershell                       |
| :---------------- | :------------------------------- | :------------------------------- |
| Delete all images | `docker rmi $(docker images -q)` | `docker rmi $(docker images -q)` |
