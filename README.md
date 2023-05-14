PRAGMA POWER-UP
In this challenge you are going to design the backend of a system that centralizes the services and orders of a restaurant chain that has different branches in the city.

Built With
Java
Spring
Gradle
MySQL
Getting Started
To get a local copy up and running follow these steps.

Prerequisites
JDK 17 https://jdk.java.net/java-se-ri/17
Gradle https://gradle.org/install/
MySQL https://dev.mysql.com/downloads/installer/
Recommended Tools
IntelliJ Community https://www.jetbrains.com/idea/download/
Postman https://www.postman.com/downloads/
Installation
Clone the repository
Change directory
cd power-up-arquetipo-v3
Create a new database in MySQL called powerup
Update the database connection settings
# src/main/resources/application-dev.yml
spring:
datasource:
url: jdbc:mysql://localhost/plazoleta
username: root
password: <your-password>
After the tables are created execute src/main/resources/data.sql content to populate the database
Open Swagger UI and search the /auth/login endpoint and login with userDni: 123, password: 1234
Usage
Right-click the class PowerUpApplication and choose Run
Open http://localhost:8081/swagger-ui/index.html in your web browser
Tests
Right-click the test folder and choose Run tests with coverage