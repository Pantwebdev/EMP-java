# Employee Management System

A simple Java Spring Boot + PostgreSQL application created for Git, Maven, Jenkins and Ansible CI/CD practice.

## Requirements

- Java 17
- Maven 3.9+
- PostgreSQL 15/16 OR Docker
- Git

## Run PostgreSQL with Docker

```bash
docker compose up -d
```

This creates:
- Database: employee_db
- User: postgres
- Password: postgres
- Port: 5432

## Run application

```bash
mvn clean test
mvn spring-boot:run
```

Open:

http://localhost:8080

## Build JAR

```bash
mvn clean package
java -jar target/employee-management-1.0.0.jar
```

## Database

You do NOT need to manually create the employees table. Hibernate/JPA creates/updates it using:

spring.jpa.hibernate.ddl-auto=update

The database itself must exist. Docker Compose creates it automatically.

## DevOps roadmap

1. Run application locally
2. Push project to GitHub
3. Create Jenkins pipeline
4. Maven build/test/package
5. Install Java/Tomcat using Ansible
6. Deploy application using Ansible
7. Move PostgreSQL to AWS RDS
8. Deploy application on AWS EC2
9. Add Nginx
10. Add full CI/CD pipeline
11. Set Webhook
