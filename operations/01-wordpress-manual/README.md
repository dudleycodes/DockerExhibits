# Wordpress Using Docker Manually ("The Hard Way")

This example creates two containers, one for MySql and one for Wordpress, and links them together using a bridge network.

## Create a Docker Network that Wordpress and MySQL will use

```shell
docker network create --attachable --driver=bridge wordpress_hardway
```

## Bring up the Database

```shell
docker run -d --rm --name wordpress_db -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=wordpress --network="wordpress_hardway" mysql:8 --default-authentication-plugin=mysql_native_password
```

## Bring up Wordpress

```shell
docker run -d --rm --name wordpress_web -e WORDPRESS_DB_PASSWORD=password -e WORDPRESS_DB_HOST=wordpress_db:3306 --network="wordpress_hardway" -p 8080:80 wordpress
```

## Clean It All Up

```shell
docker system prune
```
