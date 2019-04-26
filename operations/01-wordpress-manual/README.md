#

## Create a Docker Network that Wordpress and MySQL will use

```shell
docker network create --attachable some-wordpress
```

## Bring up the Database

```shell
docker run --name wordpressdb -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=wordpress -d mysql:5.7
```

## Bring up and Connect Wordpress

```shell
docker run --name wordpressweb -e WORDPRESS_DB_PASSWORD=password -d --link wordpressdb:mysql -p 8080:80 wordpress
```
