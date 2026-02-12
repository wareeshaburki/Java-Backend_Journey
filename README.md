# 🚀 Java Backend Journey 

Welcome to my Java Full-Stack development journey. This repository tracks my progress from basics to enterprise-grade microservices, targeting a high-end backend role by August 2026.

---

## 📅 Phase 1: Spring Boot Core (February)

### Day 1: REST API Foundations (Feb 12, 2026)
Today, I successfully set up the Spring Boot environment and built my first set of REST endpoints.

#### ✅ Tasks Completed:
- **Environment Setup:** Configured IntelliJ IDEA with JDK 17 and Maven.
- **Spring Initializr:** Generated a project with `Spring Web` dependency.
- **REST Controllers:** Created `@RestController` with multiple `@GetMapping` endpoints.
- **Data Handling:** Implemented Java Models (`User`, `Project`) to return JSON data.
- **Service Layer:** Implemented the **Service Pattern** using `@Service` and `@Autowired` for Dependency Injection.
- **In-Memory Storage:** Used `ArrayList` to manage a list of projects dynamically.
- **CRUD Operations:**
    - `GET /projects-list`: Fetch all projects.
    - `POST /add-project-to-list`: Add a new project via Postman (JSON).
    - `DELETE /delete-project/{id}`: Practice with `@PathVariable`.

#### 🛠️ Tools Used:
- **Java 17**
- **Spring Boot 3.x**
- **Postman** (For API Testing)
- **Git/GitHub**

---

## 🛠 How to Run
1. Clone the repository.
2. Open the `demo` folder in IntelliJ IDEA.
3. Run the `DemoApplication.java` file.
4. Access the API at `http://localhost:8080/hello`.

---

## 📈 Next Milestone
- **Spring Data JPA & H2 Database:** Moving from temporary `ArrayList` to persistent database storage.