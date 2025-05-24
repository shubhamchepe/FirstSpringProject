# 📚 Spring Boot Course API

A simple REST API built using Spring Boot to manage courses. This project uses an in-memory list to simulate CRUD operations without a database. Ideal for learning and demonstrating Spring Boot fundamentals.

---

## 🔧 Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Maven

---

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Maven

## 📁 Project Structure

```text
src
└── main
    ├── java
    │   └── com.firstspringproject.firstspringproject
    │       ├── controller
    │       │   └── MyController.java
    │       ├── entities
    │       │   └── Course.java
    │       └── services
    │           ├── CourseService.java
    │           └── CourseServiceImpl.java
    └── resources
        └── application.properties
```

---

## 📌 Notes

- This app does **not** use a database — the course list is stored in memory.
- All data is reset when the app restarts.
- You can extend this to use Spring Data JPA and a database later.

---

## 📄 License

MIT License

---

## 👤 Author

Shubham Chepe  
[GitHub: @shubhamchepe](https://github.com/shubhamchepe)

### Clone the repository

```bash
git clone https://github.com/shubhamchepe/FirstSpringProject.git
cd spring-boot-course-api
