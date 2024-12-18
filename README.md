# Simple Task Manager

The **Simple Task Manager** is a backend-driven application built using Java Spring Boot. It enables users to manage tasks efficiently through CRUD operations implemented with RESTful APIs. The project uses MySQL for data storage and Hibernate for seamless database interaction.

---

## Features
- **Add Tasks**: Create new tasks by submitting details through API endpoints.
- **Update Tasks**: Modify existing tasks to keep them current and relevant.
- **Delete Tasks**: Remove tasks permanently to maintain a clean task database.
- **View Tasks**: Retrieve and display task details for easy tracking and management.

---

## Technologies Used
- **Java Spring Boot**: Framework for building robust and scalable backend applications.
- **Spring Data JPA**: Simplified data access layer with built-in support for ORM.
- **Hibernate**: ORM tool for interacting with the database.
- **MySQL**: Relational database for secure and persistent data storage.

---

## Skills Demonstrated
- **CRUD Operations**: Implemented Create, Read, Update, and Delete functionalities for task management.
- **REST API Development**: Developed RESTful APIs to enable seamless backend interaction.
- **Database Integration**: Utilized MySQL with JPA/Hibernate for efficient data access and persistence.

---

## Installation and Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/simple-task-manager.git

## Navigate to the Project Directory:
  cd simple-task-manager

## Configure MySQL Database:
  spring.datasource.url=jdbc:mysql://localhost:3306/task_manager
  spring.datasource.username=your_username
  spring.datasource.password=your_password
  spring.jpa.hibernate.ddl-auto=update

