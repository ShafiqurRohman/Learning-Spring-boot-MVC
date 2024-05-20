# Learning Spring Boot MVC

This is a demo project for learning Spring Boot MVC. It is designed for absolute beginners to understand the basics of Spring Boot, MVC architecture, and how to create a simple CRUD application.

## Project Structure
```
Learning-Spring-boot-MVC/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── learning/
│ │ │ └── Learning/
│ │ │ └── Spring/
│ │ │ └── boot/
│ │ │ └── MVC/
│ │ │ ├── controllers/
│ │ │ │ └── UserController.java
│ │ │ ├── entities/
│ │ │ │ └── User.java
│ │ │ ├── extensions/
│ │ │ │ └── dtos/
│ │ │ │ └── UserDto.java
│ │ │ ├── mappers/
│ │ │ │ └── AutoMapper.java
│ │ │ ├── repositories/
│ │ │ │ ├── implementations/
│ │ │ │ └── interfaces/
│ │ │ │ └── IUserRepository.java
│ │ │ ├── services/
│ │ │ │ ├── implementations/
│ │ │ │ │ └── UserService.java
│ │ │ │ └── interfaces/
│ │ │ │ └── IUserService.java
│ │ │ └── LearningSpringBootMvcApplication.java
│ │ ├── resources/
│ │ │ ├── static/
│ │ │ │ ├── assets/
│ │ │ │ ├── css/
│ │ │ │ └── js/
│ │ │ ├── templates/
│ │ │ │ ├── layout.html
│ │ │ │ ├── users-create.html
│ │ │ │ ├── users-edit.html
│ │ │ │ ├── users-list.html
│ │ │ └── application.properties
│ ├── test/
│ ├── target/
│ ├── .gitignore
│ ├── HELP.md
│ ├── mvnw
│ ├── mvnw.cmd
│ └── pom.xml
└── README.md
```

## Dependencies

The project uses the following dependencies:

- Spring Boot Starter Actuator
- Spring Boot Starter Data JPA
- Spring Boot Starter Security
- Spring Boot Starter Web
- PostgreSQL
- Lombok
- Spring Boot Starter Test
- Spring Boot Starter Thymeleaf
- Spring Security Test
- Springdoc OpenAPI Starter WebMVC UI
- Thymeleaf Extras Spring Security 5
- Thymeleaf Layout Dialect

## Getting Started

### Prerequisites

- Java 17
- Maven
- PostgreSQL

### Setup

1. **Clone the repository:**
    ```sh
    git clone https://github.com/yourusername/Learning-Spring-boot-MVC.git
    cd Learning-Spring-boot-MVC
    ```

2. **Configure the database:**

    Update `src/main/resources/application.properties` with your PostgreSQL database configuration:
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
    ```

3. **Build the project:**
    ```sh
    ./mvnw clean install
    ```

4. **Run the application:**
    ```sh
    ./mvnw spring-boot:run
    ```

5. **Access the application:**

    Open your browser and go to `http://localhost:8081/users`.

## Project Components

### Controllers

- `UserController.java`: Manages user-related HTTP requests (e.g., listing users, creating a new user, editing and deleting users).

### Entities

- `User.java`: Represents the user entity mapped to the `users` table in the database.

### DTOs

- `UserDto.java`: Data Transfer Object for transferring user data between layers.

### Mappers

- `AutoMapper.java`: Provides mapping between `User` and `UserDto`.

### Repositories

- `IUserRepository.java`: Interface for the user repository, extending `JpaRepository` to provide CRUD operations.

### Services

- `IUserService.java`: Interface for user service.
- `UserService.java`: Implementation of `IUserService`, containing business logic for user management.

### Views (Thymeleaf Templates)

- `layout.html`: Base layout for the application.
- `users-create.html`: Form for creating a new user.
- `users-edit.html`: Form for editing an existing user.
- `users-list.html`: View for listing all users.

## API Documentation

This project uses Springdoc OpenAPI for API documentation. You can access the API documentation at:
http://localhost:8081/swagger-ui.html


## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request

## Acknowledgements

- Spring Boot
- Thymeleaf
- PostgreSQL
- Lombok

## Contact

For any questions or feedback, please contact [shafiqur.me@gmail.com].

