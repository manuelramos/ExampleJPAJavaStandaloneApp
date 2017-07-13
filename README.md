# ExampleJPAJavaStandaloneApp
Example of jpa implementation in a java standalone application.

### Installation
Login into your mysql server and create a new database called jpa_demo

```sh
$ mysql -u root -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 3
Server version: 5.7.18 MySQL Community Server (GPL)

Copyright (c) 2000, 2017, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> CREATE DATABASE jpa_demo;
mysql> quit;
```

### Clone the repository

```sh
$ git clone https://github.com/manuelramos/ExampleJPAJavaStandaloneApp.git
```

### Configure the app with your mysql credentials.
Modify the file `ExampleJPAJavaStandaloneApp/src/main/resources/META-INF/persistence.xml` and configure credentials in the following properties.

```xml
<property name="javax.persistence.jdbc.user" value="YOUR_MYSQL_USER"/>
<property name="javax.persistence.jdbc.password" value="YOUR_MYSQL_PASSWORD"/> 
```

### Clone the repository
Build the app and run it.

```sh
$ cd ExampleJPAJavaStandaloneApp
$ mvn clean package
$ java -jar target/ExampleJPAJavaStandaloneApp-0.0.1-SNAPSHOT-jar-with-dependencies.jar
```
