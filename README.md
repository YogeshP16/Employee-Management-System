# Project Overview
Employee management system using Spring Boot, Thymeleaf, MYSQL database. 
EMS is CRUD based web application with the following features:
* Get all the employees
* Add a new employee
* update an employee
* delete an employee

# Requirements:

* Spring Tool Suite IDE.
* JDK 8.
* Maven 2.5.
* MYSQL Database.

# Showcase
![Screenshot (2)](https://user-images.githubusercontent.com/121794280/222221073-83a4de37-71a6-4eed-9d64-bc8670c69b36.png)

![Screenshot (4)](https://user-images.githubusercontent.com/121794280/222221101-6466f1b1-6caf-4e98-9d2d-b2d00aef19d3.png)

# HOW TO RUN THIS PROJECT?# FROM THE IDE:

* Open the project in an IDE like Eclipse STS.
* You can run the DBScript provided in MySQL to create database 
* Check your database connection in src/main/resources/application.properties file and change the user name & password. Creating database is necessary since hibernate-     update option is used : "spring.jpa.hibernate.ddl-auto = update").
* Hit "Run As Java Application" in the IDE
* Check if localhost server has started.
* Open Google chrome.
* Hit url : "http://localhost:8080/
