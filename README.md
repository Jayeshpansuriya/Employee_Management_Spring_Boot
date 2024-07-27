# Employee Management System
# Overview
The Employee Management System is a Java-based application that allows users to manage a list of employees. This application supports CRUD (Create, Read, Update, Delete) operations on employee data. The project is built using Object-Oriented Programming (OOP) concepts and integrates various technologies and libraries for a robust and efficient system.

# Features
* Add a new employee
* Edit the profile of an existing employee
* Delete an employee
* View employee details
* Technologies Used
* Java
* Spring Boot
* Postman
* JavaScript
* Node.js
* JDBC
* MySQL
* JSON
* HTML
* CSS
* Tailwind CSS
  
# Libraries and Tools
* Jakarta
* XMLFile
* Hibernate
* URLPat
* Lombok
* JPA
* Bin Library
* BULL (Bean Utils Light)
* Maven
* Spring Web
* Spring MVC
* Spring Boot Plugin
* OIC Image
* Data JPA
* Web Server
* Navigation Method in JS
* Prerequisites
* Java Development Kit (JDK) 11 or higher
* Apache Maven 3.6.3 or higher
* MySQL 8.0 or higher
* Node.js 14.x or higher
* Postman for API testing
* Installation
* Clone the Repository:

bash
Copy code
git clone https://github.com/yourusername/employee-management-system.git
cd employee-management-system
Configure the Database:

Create a MySQL database named employee_db.

Update the database configuration in src/main/resources/application.properties:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
Build the Project:

bash
Copy code
mvn clean install
Run the Application:

bash
Copy code
mvn spring-boot:run
Usage
Access the Application:

Open your web browser and navigate to http://localhost:8080.

# API Endpoints:

Use Postman or any other API client to interact with the backend. The following endpoints are available:

# Add New Employee:

 
Copy code
POST /api/employees
Body: {
  "name": "John Doe",
  "email": "john.doe@example.com",
  "phone": "1234567890"
}
Get All Employees:

bash
Copy code
GET /api/employees
Get Employee by ID:

bash
Copy code
GET /api/employees/{id}
Update Employee:

bash
Copy code
PUT /api/employees/{id}
Body: {
  "name": "John Doe",
  "email": "john.doe@example.com",
  "phone": "1234567890"
}

 # Delete Employee:

bash
Copy code
DELETE /api/employees/{id}
Frontend
The frontend is built using HTML, CSS, and Tailwind CSS.
Use any modern browser to access the frontend UI.
Ensure the backend server is running to interact with the APIs.
License
This project is licensed under the MIT License. See the LICENSE file for details.

# Contributors
* Jayesh Dineshbhai Pansuriya
  
# Acknowledgements
Thanks to the Spring Boot community for providing an excellent framework.
Special thanks to all the open-source contributors for their valuable libraries and tools.
