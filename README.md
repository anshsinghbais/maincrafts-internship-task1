Here is your complete, updated `README.md` text. It updates the timeline to reflect the **7–10 days per task** format while showing completion by July 18, followed by post-internship refinements and documentation updates in August.

---

### Copy & Paste into `README.md`:

```markdown
# Full-Stack Contact Management & Admin Dashboard System

A full-stack web application developed during the **Summer Internship Program** at **Maincrafts Technology**. The system provides a responsive user-facing contact portal and an administrative dashboard to manage and view incoming inquiries in real time.

---

## 📌 Project Overview

This project was developed progressively across 3 structured milestones (taking approximately 7–10 days per task):
1. **Task 1 (Phase 1):** Responsive Frontend UI design with form handling connected to a Spring Boot backend controller.
2. **Task 2 (Phase 2):** Relational database integration using MySQL and Spring Data JPA for persistent record storage.
3. **Task 3 (Phase 3):** Development of REST API retrieval endpoints and a dynamic Admin Dashboard interface.

---

## 🛠️ Tech Stack

* **Frontend:** HTML5, CSS3, JavaScript (Fetch API)
* **Backend:** Java, Spring Boot, Spring Data JPA, Hibernate
* **Database:** MySQL
* **Build Tool:** Apache Maven
* **Version Control:** Git & GitHub

---

## 📋 Task Breakdown & Milestones

### 🔹 Task 1: Responsive Landing Page & Backend Controller (~7–10 Days)
* Designed an interactive contact form (`index.html`) capturing `Name`, `Email`, and `Message`.
* Set up a Spring Boot application with a `@RestController` listening for incoming `POST` requests.
* Integrated JSON payload handling via `@RequestBody` and verified data flow.

### 🔹 Task 2: MySQL Database Persistence with Spring Data JPA (~7–10 Days)
* Configured `application.properties` for local MySQL database connectivity.
* Created the `Contact` entity (`@Entity`) with automatic ID generation (`GenerationType.IDENTITY`).
* Implemented `ContactRepository` extending `JpaRepository` to enable direct database operations without manual SQL queries.

### 🔹 Task 3: REST API Endpoints & Admin Dashboard (~7–10 Days)
* Implemented a `GET /api/contacts` endpoint to fetch all stored database entries as a JSON collection.
* Developed an administrative dashboard view (`contacts.html`) using modern styling.
* Used asynchronous JavaScript (`fetch()`) to retrieve data from the backend and populate records dynamically inside an HTML data table.

---

## 🏗️ System Architecture & Data Flow


```

[ User Form (index.html) ]
│  (POST /api/submit - JSON)
▼
[ Spring Boot Controller (ContactController) ]
│  (repo.save())
▼
[ Spring Data JPA / Hibernate ]
│  (SQL INSERT)
▼
[ MySQL Database (contacts table) ]
│
│  (repo.findAll() via GET /api/contacts)
▼
[ Admin Dashboard (contacts.html) ] ──▶ Dynamic HTML Table Render

```

---

## 🚀 Getting Started

### 1. Prerequisites
* Java JDK 17 or higher
* MySQL Server (running on `localhost:3306`)
* Apache Maven

### 2. Database Configuration
Ensure MySQL has a database created:
```sql
CREATE DATABASE maincrafts_db;

```

Update `src/main/resources/application.properties` with your credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/maincrafts_db?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=YOUR_MYSQL_PASSWORD
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

```

### 3. Running the Application

Clone the repository and run using Maven:

```bash
git clone [https://github.com/anshsinghbais/maincrafts-internship-task1.git](https://github.com/anshsinghbais/maincrafts-internship-task1.git)
cd maincrafts-internship-task1
mvn spring-boot:run

```

* **Contact Form UI:** Open `http://localhost:8080/index.html` in your browser.
* **Admin Dashboard:** Open `http://localhost:8080/contacts.html` to view submitted records.

---

## 📅 Project Timeline & Milestones

| Milestone | Duration / Phase | Completion Date | Status | Description |
| --- | --- | --- | --- | --- |
| **Task 1** | Days 1–9 | July 01, 2026 | Completed | Form UI design & Spring Boot POST handler |
| **Task 2** | Days 10–19 | July 10, 2026 | Completed | MySQL schema mapping & JPA persistence |
| **Task 3** | Days 20–28 | July 18, 2026 | Completed | REST API retrieval & Admin table dashboard |
| **Refinements** | Post-Review | August 2026 | Completed | Code cleanup, optimization & documentation |

---

## 👨‍💻 Author

* **Developer:** Ansh Singh Bais
* **Intern ID:** MT6651
* **Role:** Java Full Stack Developer
* **Organization:** Maincrafts Technology
