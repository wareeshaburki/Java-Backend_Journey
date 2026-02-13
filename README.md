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