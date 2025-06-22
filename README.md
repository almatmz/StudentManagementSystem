# StudentManagementSystem 🎓

This is a Java Spring Boot-based **Student Management System** for efficiently managing student records, attendance, and grades. The project demonstrates strong usage of **Object-Oriented Programming (OOP)**, **SOLID principles**, and modern Java best practices.

---

## 🚀 Features

- ✅ **Student CRUD**: Add, update, delete, and fetch student details.
- 📝 **Attendance Management**: Record and retrieve student attendance.
- 📊 **Gradebook Functionality**: Assign and track grades for students.
- 🔐 **Authorization System**: Professors must authenticate using ID and login before accessing protected resources.
- 🧪 **API Testing with Postman**: Endpoints tested and documented using Postman.
- 💾 **MySQL Integration**: Uses a relational MySQL database with schema for students, professors, attendance, and grades.
- 🌐 **RESTful API Design**: Follows standard REST conventions for clarity and maintainability.
- 🧱 **Layered Architecture**: Clean separation of concerns with Controller → Service → Repository → Model structure.
- ❌ **Global Exception Handling**: Provides structured responses for failed operations or validation errors.

---

## 💡 Technical Highlights

### ✅ SOLID Principles

- **Single Responsibility** – Each class has a clearly defined responsibility.
- **Open/Closed** – Easily extendable without modifying existing code.
- **Liskov Substitution** – Follows polymorphism and abstraction in interfaces and services.
- **Interface Segregation** – Interfaces are designed to be role-specific.
- **Dependency Inversion** – Uses constructor-based dependency injection with Spring.

### 🎯 Design Patterns Used

- **Repository Pattern** – Separates data access logic and abstracts DB operations using Spring Data JPA.
- **Service Layer Pattern** – Business logic is encapsulated in services to decouple it from controllers.
- **Factory Pattern** *(Optional depending on your implementation)* – If you used dynamic object creation logic for DTO or response handling.
- **DTO Pattern** – Clean separation of data exchange objects (DTOs) from internal entity models.
- **Dependency Injection** – Built-in via Spring’s `@Autowired` and constructor injection.

### ⚙️ Java Features Used

- **Generics** – Used in repositories and service layers to create reusable methods and type-safe operations.
- **Lombok (if used)** – Annotations like `@Getter`, `@Setter`, `@AllArgsConstructor`, etc., reduce boilerplate code.
- **Streams & Lambda Expressions** – For cleaner and functional-style data manipulation.
- **Optional<T>** – Safe handling of null values from repository queries.
- **Java Annotations** – Custom and built-in annotations (like `@RestController`, `@Service`, `@RequestMapping`, etc.) used extensively.

---

## 🛠 Technologies

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Postman**
- **Maven**
- *(Optional)* Lombok

---

## 📂 Project Structure

src/main/java/com/almat/stud_ms/studentapp/

├── controller # REST controllers

├── service # Business logic

├── repository # JPA data access

├── model # Entity definitions

└── exception # Custom exception classes

└── resources




