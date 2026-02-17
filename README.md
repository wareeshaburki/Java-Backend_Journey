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
- **Spring Data JPA:** Implemented `JpaRepository` interface for automated CRUD logic.
- **ORM Mapping:** Converted Java POJOs into Database Entities using `@Entity`.
- **Automatic ID Generation:** Configured `@GeneratedValue(strategy = GenerationType.IDENTITY)`.

### Day 3: Exception Handling & Validation (Feb 14, 2026)
Focused on making the API robust and production-grade.
- **Custom Exceptions:** Developed `ResourceNotFoundException` for precise 404 error reporting.
- **Jakarta Bean Validation:** Applied `@NotBlank` and `@Size` constraints to ensure data quality.
- **Global Error Management:** Implemented `@ControllerAdvice` for standardized JSON error responses.

### Day 4: MySQL Integration & Data Persistence (Feb 15, 2026)
Transitioned from in-memory storage to a permanent relational database.
- **MySQL Integration:** Configured application properties for local MySQL instance connection.
- **Automated Schema Generation:** Leveraged Hibernate's `ddl-auto: update` for automatic synchronization.
- **Derived Query Methods:** Implemented custom repository methods like `findByTitle()` without manual SQL.

### Day 5: API Documentation with Swagger/OpenAPI (Feb 15, 2026)
Enhanced project transparency by implementing professional, interactive API documentation.
- **Swagger UI Integration:** Integrated `springdoc-openapi` for a real-time API console.
- **Debugging:** Resolved complex `NoSuchMethodError` by aligning library versions between Spring Boot 3.4 and OpenAPI 2.8.4.
- **Operation Summaries:** Added `@Operation` annotations to document endpoint functionality.

### Day 6: DTO Pattern & Model Mapping (Feb 16, 2026)
Refactored architecture to decouple the Database Layer from the API Layer.
- **DTO Implementation:** Created Data Transfer Objects (DTOs) to prevent leaking sensitive database structures.
- **Java Streams & Lambda:** Utilized `.stream()` and `.map()` for modern, functional data transformation.
- **ModelMapper Automation:** Integrated the `ModelMapper` library to automate Entity-to-DTO conversion.

### Day 7: Spring Security & API Locking (Feb 17, 2026)
Implemented a robust security layer to protect sensitive data and management endpoints.
- **Basic Authentication:** Integrated Spring Security to protect POST and DELETE operations while keeping GET requests public.
- **Security Filter Chain:** Custom-configured the `SecurityFilterChain` bean to handle URL-based authorization.
- **Swagger Security Integration:** Enhanced OpenAPI definitions with `SecurityScheme`, enabling "Padlock" icons and authorization headers directly within the Swagger UI.

---

## 🛠️ Tech Stack
- **Language:** Java 17
- **Framework:** Spring Boot 3.x
- **Security:** Spring Security (Basic Auth)
- **ORM:** Spring Data JPA (Hibernate)
- **Database:** MySQL (Production), H2 (Testing)
- **Mapping:** ModelMapper
- **Documentation:** Swagger UI / OpenAPI 3
- **API Testing:** Postman

---

## 🚀 How to Run & Explore
1. **Clone the repository.**
2. **Database Setup:** - Ensure MySQL is running and create a schema named `portfolio_db`.
   - Update `src/main/resources/application.properties` with your MySQL `username` and `password`.
3. **Open in IntelliJ IDEA** and let Maven download dependencies.
4. **Run `DemoApplication.java`.**
5. **Interactive API Docs:**
   - Open: `http://localhost:8080/swagger-ui/index.html`
   - Use the **Authorize** button (Credentials: `admin` / `wareesha123`) to test protected endpoints.

---

## 📈 Next Milestone
**Database-Backed Security & JWT:** Moving users from properties files to a MySQL database and implementing JSON Web Tokens (JWT) for stateless, modern authentication.