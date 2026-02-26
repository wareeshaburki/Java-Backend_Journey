# 🚀 Java Backend Journey

Welcome to my Java Full-Stack development journey. This repository tracks my progress from basics to enterprise-grade microservices, targeting a high-end backend role by August 2026.

---

## 📅 Progress Log

### Day 1 - Day 8: Foundations to Security
*(Foundations, JPA, MySQL, Swagger, DTOs, and Spring Security Basics completed)*

### Day 9: Database-Backed Security (Feb 20, 2026)
Transitioned from hardcoded users to **Dynamic Database Authentication**.
- **Custom UserDetailsService:** Implemented the bridge between Spring Security and the MySQL `User` table.
- **Password Hashing:** Integrated `BCryptPasswordEncoder` for secure credential storage.

### Day 10: Stateless Auth with JWT (Feb 26, 2026)
Advanced the security architecture by implementing **JSON Web Tokens (JWT)**.
- **JWT Utility Layer:** Developed a `JWTUtils` class to handle secure token generation, parsing, and validation using `io.jsonwebtoken`.
- **Custom Security Filter:** Built a `JwtAuthenticationFilter` (extending `OncePerRequestFilter`) to intercept requests, validate Bearer tokens, and establish the security context.
- **Stateless Configuration:** Refactored `SecurityConfig` to disable sessions (`SessionCreationPolicy.STATELESS`) and integrated the custom JWT filter into the Spring Security Filter Chain.
- **Enhanced OpenAPI:** Configured Swagger to support **Bearer Token Authentication**, enabling professional API testing with "Padlock" authorization.

---

## 🛠️ Tech Stack
- **Language:** Java 17
- **Framework:** Spring Boot 3.x
- **Security:** Spring Security, **JWT (JJWT)**, BCrypt
- **ORM:** Spring Data JPA (Hibernate)
- **Database:** MySQL
- **Mapping:** ModelMapper / Lombok
- **Documentation:** Swagger UI / OpenAPI 3 (with Bearer Auth support)

---

## 🚀 How to Run & Explore
1. **Clone the repository.**
2. **Database Setup:** - Create a MySQL schema named `portfolio_db`.
   - Update `src/main/resources/application.properties` with your credentials.
3. **Run `DemoApplication.java`.**
4. **Onboarding & Authentication:**
   - Use the `/auth/register-user` endpoint to create a user.
   - *Upcoming:* Use the `/auth/login` endpoint to receive your JWT token.
5. **Interactive API Docs:**
   - Open: `http://localhost:8080/swagger-ui/index.html`
   - Click **Authorize**, enter your token as a `Bearer <token>`, and access protected resources statelessly.

---

## 📈 Next Milestone
**The Authentication Manager:** Completing the Login flow, handling authentication exceptions, and finalizing the end-to-end JWT handshake.