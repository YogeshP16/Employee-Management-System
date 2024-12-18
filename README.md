# Project Overview

**Workforce Administration Tool**


The Workforce Administration Tool built using Spring Boot and Thymeleaf is a web-based application that allows managers to manage and keep track of employee information. The system includes a login page to ensure secure access, a dashboard displaying the employee list, and the ability to add, update, and delete employee data.

The system uses the Spring Boot framework to provide a simple, lightweight, and scalable application, with Thymeleaf as the template engine for building user interfaces. The application uses a Model-View-Controller (MVC) architecture to separate the data, presentation, and control logic, which makes the code maintainable, testable, and reusable.

The employee management system stores employee data in a database and retrieves it using Spring Data JPA. The application implements basic CRUD (Create, Read, Update, Delete) operations, allowing managers to add new employees, view existing employee information, update employee data, and delete employees from the system.

# Requirements:

* Spring Tool Suite IDE.
* JDK 8.
* Maven 2.5.
* MYSQL Database.

# HOW TO RUN THIS PROJECT?# FROM THE IDE:

* Open the project in an IDE like Eclipse STS.
* You can run the DBScript provided in MySQL to create database 
* Check your database connection in src/main/resources/application.properties file and change the user name & password. Creating database is necessary since hibernate-     update option is used : "spring.jpa.hibernate.ddl-auto = update").
* Hit "Run As Java Application" in the IDE
* Check if localhost server has started.
* Open Google chrome.
* Hit url : "http://localhost:8080/
