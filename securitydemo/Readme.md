## This project is a simple Employee Management System built using Spring Boot 3 and Spring Security.
It demonstrates:

User Authentication

Role-based Authorization

JWT (JSON Web Token) authentication

Securing REST APIs with Spring Security


## Technology Stack

Java 17

Spring Boot 3.x

Spring Security 6

Spring Data JPA

H2 Database (in-memory)

JWT (JJWT library)

Maven

## To run 
mvn spring-boot:run

http://localhost:8080


Username	Password	Role
admin	admin123	ADMIN
user	user123	USER

## To login

{
  "username": "admin",
  "password": "admin123"
}

use token for all secured endponits

endpoints are:
1. POST /api/login :Login and get JWT token
2. GET /api/profile
Accessible by USER and ADMIN.
Returns: "This is your profile!"
3. GET /api/employees
Accessible by ADMIN only.
Returns list of employees.
4. POST /api/employees
Accessible by ADMIN only.
Body:

{
  "name": "himani",
  "role": "Developer"
}
5. DELETE /api/employees/{id}
Accessible by ADMIN only.
Deletes employee by ID.