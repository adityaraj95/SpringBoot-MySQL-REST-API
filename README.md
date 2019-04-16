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

 Open the root directory in InteliJ/Eclipse or any IDE you like
 Open `\src\main\java\com.ac968.Library\LibraryApplication` and run the application
 
 ### The app will start at [http://localhost:8080/rest/books/all](http://localhost:8080/rest/books/all)
 
 # Functionalities of the REST API
 
 The following Screenshots are the working of the REST API using POSTMAN ( REST API CLIENT)
 
 ### `GET /rest/books/all`
 
 ![GET DEMO](https://github.com/adityaraj95/SpringBoot-MySQL-REST-API/blob/master/src/test/java/com/ac968/Library/GET.PNG)
 
 
### `POST /rest/books/load`

 ![POST DEMO](https://github.com/adityaraj95/SpringBoot-MySQL-REST-API/blob/master/src/test/java/com/ac968/Library/POST.PNG)
 
### `DELETE /rest/books/{Barcode}`

 ![DELETE DEMO](https://github.com/adityaraj95/SpringBoot-MySQL-REST-API/blob/master/src/test/java/com/ac968/Library/DELETE.PNG)
 
### GET AFTER DELETE REQUEST
 
![AFTER DELETE](https://github.com/adityaraj95/SpringBoot-MySQL-REST-API/blob/master/src/test/java/com/ac968/Library/GET_AFTERDELETE.PNG)
 
 
 # Testing
 
 You can test the project using [POSTMAN](https://www.getpostman.com/) or any other rest client.
