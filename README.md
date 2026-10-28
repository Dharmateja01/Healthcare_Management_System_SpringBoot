# Healthcare Management System (HMS)

A **Healthcare Management System** built using Java and Spring Boot. This project is intended to provide a foundation for developing a web-based application to manage healthcare-related information and operations.

## 🚀 Tech Stack

- **Backend:** Java, Spring Boot
- **Database:** MySQL
- **Database Integration:** Spring Data JPA, Spring Data JDBC, JDBC
- **Web Framework:** Spring Boot Web
- **Validation:** Spring Boot Validation
- **Build Tool:** Maven
- **Development Tools:** IntelliJ IDEA, Git, GitHub

## 📁 Project Structure

```text
HMS/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/Healthmanagement/HMS/
│   │   │       └── HmsApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       ├── templates/
│   │       └── application.properties
│   └── test/
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## ⚙️ Prerequisites

Before running the project, ensure you have:

- Java Development Kit (JDK) compatible with the project configuration
- Maven
- MySQL Server
- An IDE such as IntelliJ IDEA or Eclipse

## 🛠️ Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/Dharmateja01/Healthcare_Management_System_SpringBoot.git
```

### 2. Open the Project

Open the project in IntelliJ IDEA or your preferred Java IDE and allow Maven to download the required dependencies.

### 3. Configure the Database

Create a MySQL database and configure your database connection settings in:

`src/main/resources/application.properties`

Example configuration:

```properties
spring.application.name=HMS

spring.datasource.url=jdbc:mysql://localhost:3306/healthcare_db
spring.datasource.username=YOUR_MYSQL_USERNAME
spring.datasource.password=YOUR_MYSQL_PASSWORD
```

Update the database name and credentials according to your local MySQL configuration. Add any further JPA settings required by your implementation.

### 4. Run the Application

Using the Maven wrapper on Windows:

```bash
mvnw.cmd spring-boot:run
```

Alternatively, run `HmsApplication.java` from your IDE.

## 🎯 Project Objective

The objective of this project is to build a maintainable healthcare management application using Java, Spring Boot, and MySQL, while applying backend development and database integration concepts.

## 📌 Project Status

**In Development**

The project is being developed incrementally. Application modules and functionality will be documented here as they are implemented.

## 👨‍💻 Author

**Dharma Teja**

GitHub: [@Dharmateja01](https://github.com/Dharmateja01)
