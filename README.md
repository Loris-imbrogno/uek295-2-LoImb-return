# Environment Setup Guide

Welcome to my development setup guide for the project hosted at [uek295-2-LoImb-return](https://github.com/Loris-imbrogno/uek295-2-LoImb-return). Here, i will guide you through setting up the development environment for this Spring Boot project with a PostgreSQL backend database, all orchestrated with Docker.

## Downloads/Preparation

To run the code, you need the following programs:

- IntelliJ or VS Code (other IDEs are also possible)
- Java Extensions
- Gradle
- Docker
- Postman

## Installation

### 1. Clone Repository

Clone the repository using Git commands or download the project as a zip:

```
git clone https://github.com/Loris-imbrogno/uek295-2-LoImb-return
```

### 2. Create Docker Container

Open Docker and create a container named "uek295db" with the following command in your command prompt:

```
docker run -d -p 5432:5432 -e POSTGRES_PASSWORD=postgres --name uek295db postgres
```

### 3. Start Program

Navigate to the project directory and run the Spring Boot application with Gradle:

```
bash gradle bootRun
```

### 4. Test Endpoints

Open Postman or your browser and navigate to http://localhost:8080/returns/ to test the endpoints, such as `/returns` or a specific address with `/returns/1`. You can also use the provided test collection in Postman to perform CRUD operations, add new addresses, etc.

### 5. Useful Data

Upon starting the backend, some values are stored in the database. You can view the database in your command prompt or explore the `data.sql` file located in `src/main/resources`. Two users with different roles and authorities are available for testing:

- **Admin**
  - Username: admin
  - Password: 12345678

- **User**
  - Username: user
  - Password: 12345678

- **Loris**
  - Username: loris
  - Password: 12345678

### To view your API documentation from Swagger, navigate to http://localhost:8080/swagger-ui/index.html#/ in your web browser.
