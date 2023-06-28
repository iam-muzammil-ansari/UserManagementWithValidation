# User Management With Validation
# User Management System

## Table of Contents
- [Frameworks and Language Used](#frameworks-and-language-used)

- [Data Flow](#data-flow)

  - [Controller](#controller)
  - [Services](#services)
  - [Repoitory](#repository)
  - [Database Design](#database-design)

- [Validation Annotations](#validation-annotations)

  - [Model (User.java)](#model-userjava)
  - [Controller (UserController.java)](#controller-usercontrollerjava)
  - [Service (UserService.java)](#service-userservicejava)
  - [Repository (UserRepo.java)](#repository-userrepojava)

- [Data Structure Used](#data-structure-used)

- [Project Summary](#project-summary)

- [Getting Started](#getting-started)

- [Testing Endpoints](#testing-endpoints)

- [License](#license)


___

## Frameworks and Language Used
- Spring Boot
- Java
- MVC
- Dependencies :- 
  - Spring Web
  - Lombok
  - Validation

## Data Flow

### Controller
- UserController handles HTTP requests and interacts with the UserService.
- It contains endpoints for retrieving, adding, updating, and deleting users.
- It validates the incoming data using validation annotations from the model.

### Services
- UserService handles the business logic of the application.
- It communicates with the UserRepository for CRUD operations on user data.

### Repository
- UserRepo is responsible for managing the list of users.
- It provides methods to retrieve the list of users.

### Database Design
- The application uses an in-memory list to store user data.
- There is no persistent database involved in this implementation.

## Validation Annotations

The following validation annotations are used in the code:

### Model (User.java)

- `@NotEmpty`: Validates that a field is not empty.
- `@NotNull`: Validates that a field is not null.
- `@Pattern`: Validates that a field matches a specified regular expression.
- `@Email`: Validates that a field is a valid email address.

### Controller (UserController.java)

- `@Valid`: Applies validation rules to the request body or request parameters.
- `@RequestBody`: Binds the request body to a method parameter.

### Service (UserService.java)

- `@Validated`: Enables method parameter validation.

### Repository (UserRepo.java)

- `@Validated`: Enables method parameter validation.

## Data Structure Used
- List: Used to store the collection of User objects.

## Project Summary
The User Management System is a Spring Boot application that allows managing user information. The application follows the MVC (Model-View-Controller) design pattern, where the model represents the User class, the controller handles user-related requests, and the service layer performs business logic operations.

The User model contains attributes such as username, date of birth, email, phone number, date, and time. It also includes validation annotations to ensure the data integrity and enforce specific constraints.

The UserController provides RESTful endpoints for performing CRUD operations on users. It validates the incoming data using the validation annotations defined in the User model.

The UserService class implements the business logic of the application, such as retrieving all users, adding a new user, updating user information, and deleting a user. It communicates with the UserRepository to access the user data.

Validation is an essential aspect of the application, ensuring that the user data is valid and meets the specified criteria. The application uses validation annotations such as @NotEmpty, @NotNull, @Pattern, and @Email to validate the user inputs.

## Getting Started
1. Clone the repository. 
```bash
https://github.com/ayaan097/UserManagementWithValidation.git
```
2. Open the project in your preferred IDE.
3. Build and run the application.
4. Access the endpoints using a tool like Postman or a web browser.

## Testing Endpoints
1. Use an API testing tool like Postman.
2. Send HTTP requests to the following endpoints:
   - GET `/users/getUser/{userId}`: Retrieves a user by ID.
   - GET `/users/getAllUsers`: Retrieves all users.
   - POST `/users/addUser`: Adds a new user.
   - PUT `/users/updateUserInfo/{userId}`: Updates user information.
   - DELETE `/users/deleteUser/{userId}`: Deletes a user.

## License
This project is Not licensed.
