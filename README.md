# 🚀 Java Backend Journey

Welcome to my Java Full-Stack development journey. This repository tracks my progress from basics to enterprise-grade microservices, targeting a high-end backend role by August 2026.

---

## 📅 Progress Log

### Day 1: REST API Foundations (Feb 12, 2026)
Built the initial architecture using the Controller-Service pattern.
- **REST Controllers:** Created `@RestController` with `@GetMapping`, `@PostMapping`, and `@DeleteMapping`.
- **Dependency Injection:** Used `@Service` and `@Autowired`.

### Day 2: Database Persistence & JPA (Feb 13, 2026)
Moved from volatile memory to persistent storage using Spring Data JPA.

### Day 3: Exception Handling & Validation (Feb 14, 2026)
Focused on making the API robust with `@ControllerAdvice` and Jakarta Bean Validation.

### Day 4: MySQL Integration (Feb 15, 2026)
Transitioned to a permanent relational database with automated schema generation.

### Day 5: API Documentation with Swagger/OpenAPI (Feb 15, 2026)
Integrated `springdoc-openapi` for real-time API testing and documentation.

### Day 6: DTO Pattern & Model Mapping (Feb 16, 2026)
Decoupled the Database Layer from the API Layer using DTOs and `ModelMapper`.

### Day 7: Spring Security Foundations (Feb 17, 2026)
Implemented Basic Authentication and URL-based authorization for sensitive endpoints.

### Day 8: The Mastery Speed-Run (Feb 19, 2026)
**Challenge Day:** Rebuilt a complete "Campus Cafe Management System" from scratch in 3 hours.
- Verified mastery of project structuring, global error handling, and security configuration without external guides.
- Successfully debugged complex MySQL connection and Git refspec errors.

### Day 9: Database-Backed Security (Feb 20, 2026)
Transitioned from hardcoded users to **Dynamic Database Authentication**.
- **Custom UserDetailsService:** Implemented the bridge between Spring Security and the MySQL `User` table.
- **Password Hashing:** Integrated `BCryptPasswordEncoder` to ensure zero plain-text passwords in the database.
- **Auth Flow:** Created a `/auth/register` endpoint to dynamically onboard new users with encrypted credentials.

---

## 🛠️ Tech Stack
- **Language:** Java 17
- **Framework:** Spring Boot 3.x
- **Security:** Spring Security (BCrypt, Custom UserDetailsService)
- **ORM:** Spring Data JPA (Hibernate)
- **Database:** MySQL
- **Mapping:** ModelMapper / Lombok
- **Documentation:** Swagger UI / OpenAPI 3

---

## 🚀 How to Run & Explore
1. **Clone the repository.**
2. **Database Setup:** - Create a MySQL schema named `portfolio_db`.
   - Update `src/main/resources/application.properties` with your credentials.
3. **Run `DemoApplication.java`.**
4. **Onboarding:**
   - Use the `/auth/register-user` endpoint to create your own account.
5. **Interactive API Docs:**
   - Open: `http://localhost:8080/swagger-ui/index.html`
   - Use the **Authorize** button with your newly created credentials to unlock protected routes.

---

## 📈 Next Milestone
**JWT (JSON Web Tokens):** Moving to stateless authentication, implementing Token Filters, and building a secure Token Utility class for modern frontend-backend communication.