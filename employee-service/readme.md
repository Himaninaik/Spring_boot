# Employee Service (Spring Boot)

A simple **Spring Boot REST API** for managing employees.  
This project demonstrates CRUD operations with **Spring Data JPA**, **H2 in-memory database**, and **Spring Security (JWT ready setup)**.

---

## Features

- Add new employees  
- Get all employees  
- Get employee by ID  
- Update employee  
- Delete employee  
- In-memory **H2 Database** (auto-created on startup)  
- Secured endpoints (Spring Security with JWT support)  

---

## Tech Stack

- **Java 17 / 8**  
- **Spring Boot** (Web, Data JPA, Security)  
- **H2 Database** (for testing/demo)  
- **Maven** (build tool)  
- **Lombok** (boilerplate code reduction)  

---

## Endpoints

Base URL: `http://localhost:8082/api/employees`

| Method | Endpoint              | Description            |
|--------|-----------------------|------------------------|
| POST   | `/api/employees`      | Create new employee    |
| GET    | `/api/employees`      | Get all employees      |
| GET    | `/api/employees/{id}` | Get employee by ID     |
| PUT    | `/api/employees/{id}` | Update employee        |
| DELETE | `/api/employees/{id}` | Delete employee        |
| GET    | `/api/employees/test` | Health check endpoint  |

---

## Example Request

**POST** `/api/employees`  
json
{
  "name": "himani",
  "role": "Developer",
  "department": "IT",
  "salary": 30000
}

you should get 
{
  "id": 1,
  "name": "himani",
  "role": "Developer",
  "department": "IT",
  "salary": 30000
}


## to run
mvn spring-boot:run
