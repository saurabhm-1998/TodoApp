# TodoApp using SpringBoot

The Restaurant Management System is a web application built using Spring Boot, Spring Data JPA, and MySQL. It provides a user-friendly interface for managing food items, user accounts, and orders in a restaurant. The application supports user registration, authentication, and authorization, allowing different levels of access based on user roles. Users can view food items, place orders, and track their order status. Admin users have additional privileges, such as managing user accounts and food items. The application follows a RESTful API design, ensuring clear communication between the client and server.

## Project

The project is developed using the following frameworks and languages:

Spring Boot: A Java-based framework for building web applications.

Java: The primary programming language used for developing the application


## Data Flow

The data flow in this project follows the typical MVC (Model-View-Controller) pattern, with the following components:

### Controller

The Controller layer receives incoming HTTP requests and handles them appropriately.
It is responsible for handling user interactions and performing the necessary actions based on the request.
The Controller communicates with the Service layer to retrieve data or perform business logic operations.

### Service

The Service layer contains the business logic of the application.
It handles the processing and manipulation of data, as well as any other operations required by the application.
The Service layer interacts with the Repository layer to retrieve or persist data.

### Repository

The Repository layer is responsible for data persistence and retrieval.
In this project, an ArrayList is used as an in-memory database.
The Repository layer provides methods for CRUD operations on the data.
It interacts with the Service layer to fetch or store data.

Database: Stores the data, here arraylist is used to store data.

## Project Summary

The ToDo application is a simple task management system built using Spring Boot. It provides basic functionality to create, read, update, and delete tasks. The application follows the typical Spring Boot architecture with separate layers for Controller, Service, and Repository. It uses an ArrayList as an in-memory database for data storage. The application can be further extended to incorporate features like user authentication, task categories, due dates, etc., based on specific requirements.

