# SpringBoot-MySQL-REST-API
REST API for a simple Library application using Spring Boot, Mysql, and JPA.

## Requirements
- Java - 1.8.x
- Maven - 3.x.x
- MySQL - 5.x.x

## Steps for Installation

### 1. Clone the project

### `git clone https://github.com/adityaraj95/SpringBoot-MySQL-REST-API.git`

### 2. Setting up the Database

Create a new database named "library"
### `create database library`

Import the present sql file from root directory of the project into the new created database.

### 3. Change mysql username and password as per your installation

- open `src/main/resources/application.yml` from the root directory
- change username and password of the database according to your setup

### 4. Build and run the app using Maven

 `mvn pakage`
 `java -jar target/LibraryApplication-1.0.0.jar`
 
 Alternatively you can directly run the application using -
 
 `mvn spring-boot:run`
 
 ### The app will start at [localhost:8080/rest/books/all](http://localhost:8080/rest/books/all)
