#  Student Management System (Spring Boot)

This is a **Spring Boot Student Management System** built as part of an assignment.  
It performs full **CRUD (Create, Read, Update, Delete)** operations on Student data, connects to a **MySQL database**, and uses **Spring Boot best practices** like layered architecture, validation, and exception handling.

---

 Features
- Create, Read, Update, Delete (CRUD) students
- Validations:
  - Name cannot be blank
  - Age must be positive
  - Grade must follow format like A, A+, B, C-
- MySQL database integration using Spring Data JPA
- Global exception handling
- RESTful APIs tested with Postman

##  Tech Stack
- Java 17
- Spring Boot 3.
- Spring Web
- Spring Data JPA
- MySQL Database
- Lombok
- Maven
- Postman (for testing)



---

 Setup Instructions

1. Clone the repository
bash
git clone https://github.com/yourusername/studentmanagement.git
cd studentmanagement

2. Configure MySQL
Create a database in MySQL:
sql
CREATE DATABASE student_db;
```
3. Update `application.properties`
properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

 4. Build & Run

mvn clean install
mvn spring-boot:run
```

If successful, app runs at:  
 http://localhost:8080

---

 API Endpoints

 Create Student
POST /students
Body (JSON):
json
{
  "name": "himani",
  "age": 22,
  "grade": "A+",
  "address": "honavar"
}


---

 Get All Students
GET /students  
Response:
json
[
  {
    "id": 1,
    "name": "himani",
    "age": 22,
    "grade": "A+",
    "address": "honavar"
  }
]


 Get Student By ID
GET ' /students/{id} '
Example: /students/1

---

 Update Student
PUT'/students/{id}'
Body:
json
{
  "name": "John Smith",
  "age": 21,
  "grade": "A",
  "address": "California"
}


---

 Delete Student
DELETE* '/students/{id}'  
Response:
json
"Student with ID 1 deleted successfully"


---

Testing with Postman
1. Install [Postman](https://www.postman.com/downloads/).
2. Open app and create a **New Collection**.
3. Add requests for:
   - POST '/students`
   - GET '/students'
   - GET '/students/{id}'
   - PUT '/students/{id}'
   - DELETE '/students/{id}'
4. Send requests → check responses from backend.






