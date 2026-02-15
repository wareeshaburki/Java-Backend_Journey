# 🚀 Java Backend Journey 

Welcome to my Java Full-Stack development journey. This repository tracks my progress from basics to enterprise-grade microservices, targeting a high-end backend role by August 2026.

---

## 📅 Progress Log

### Day 1: REST API Foundations (Feb 12, 2026)
Built the initial architecture using the Controller-Service pattern.
- **REST Controllers:** Created `@RestController` with `@GetMapping`, `@PostMapping`, and `@DeleteMapping`.
- **Dependency Injection:** Used `@Service` and `@Autowired`.
- **In-Memory Storage:** Managed projects using `ArrayList`.

### Day 2: Database Persistence & JPA (Feb 13, 2026)
Moved from volatile memory to persistent storage.
- **Database Integration:** Integrated **H2 In-Memory Database**.
- **Spring Data JPA:** Implemented `JpaRepository` interface for automated CRUD logic.
- **ORM Mapping:** Converted Java POJOs into Database Entities using `@Entity`.
- **Automatic ID Generation:** Configured `@GeneratedValue(strategy = GenerationType.IDENTITY)`.

### Day 3: Exception Handling & Validation (Feb 14, 2026)
Focused on making the API robust and production-grade.
- **Custom Exceptions:** Developed `ResourceNotFoundException` for precise 404 error reporting.
- **Jakarta Bean Validation:** Applied `@NotBlank` and `@Size` constraints to the Project model to ensure data quality.
- **Global Error Management:** Implemented `@ControllerAdvice` to handle exceptions globally and provide standardized JSON error responses.
- **Postman Testing:** Verified 400 Bad Request and 404 Not Found scenarios.

### Day 4: MySQL Integration & Data Persistence (Feb 15, 2026)
Moved from in-memory storage to a persistent relational database.
- **MySQL Integration:** Configured `application.properties` to connect the Spring Boot application with a local MySQL instance.
- **Automated Schema Generation:** Leveraged Hibernate's `ddl-auto: update` to automatically synchronize Java entities with MySQL tables.
- **Custom Query Methods:** Implemented derived query methods in the Repository layer (e.g., `findByTitle`) to fetch specific data without writing manual SQL.
- **Persistence Verification:** Confirmed that data remains intact in MySQL Workbench even after application restarts.

---

## 🛠️ Tech Stack
- **Language:** Java 17
- **Framework:** Spring Boot 3.x
- **ORM:** Spring Data JPA (Hibernate)
- **Database:** H2 (In-memory)
- **API Testing:** Postman

---

## 🚀 How to Run & Explore
1. **Clone the repository.**
2. **Open in IntelliJ IDEA** and let Maven download dependencies.
3. **Run `DemoApplication.java`.**
4. **Test APIs:** Use Postman to hit `http://localhost:8080/projects-list`.
5. **View Database:** Access the H2 Console at `http://localhost:8080/h2-console` 
   - **JDBC URL:** `jdbc:h2:mem:testdb`
   - **User:** `sa` | **Password:** (blank)

---

## 📈 Next Milestone
- **Exception Handling:** Adding `@ControllerAdvice` for professional error responses.
- **MySQL Integration:** Moving from H2 to a permanent MySQL disk-based database.