# Wordpress Using Docker Manually ("The Hard Way")

This example creates two containers, one for MySql and one for Wordpress, and links them together using a bridge network.

## Create a Docker Network that Wordpress and MySQL will use

```shell
docker network create --attachable --driver=bridge wordpress_ex01
```

## Bring up the Database

```shell
docker run -d --name wordpress_ex01_db -e MYSQL_ROOT_PASSWORD=rootPassword -e MYSQL_DATABASE=wordpress -e MYSQL_USER=wordpress -e MYSQL_PASSWORD=wordpress --network="wordpress_ex01" mysql:8 --default-authentication-plugin=mysql_native_password
```

## Bring up Wordpress

```shell
docker run -d --name wordpress_ex01_app -e WORDPRESS_DB_HOST=wordpress_ex01_db -e WORDPRESS_DB_USER=wordpress -e WORDPRESS_DB_PASSWORD=wordpress -e WORDPRESS_DB_NAME=wordpress --network="wordpress_ex01" -p 8080:80 wordpress
```

## Shut It Down

Stop all running containers with a name that starts with "wordpress_ex01_"

```shell
docker container stop $(docker container ls -q --filter name=wordpress_ex01_*)
```

## Clean It All Up

```shell
docker system prune
```
