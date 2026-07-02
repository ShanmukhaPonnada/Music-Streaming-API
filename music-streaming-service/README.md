# Music Streaming Service – Spring Boot REST API

## Project Overview
The **Music Streaming Service Backend** is a high-performance, RESTful API built with **Spring Boot** and **Java 25**. This project serves as a comprehensive example of modern backend development, featuring a layered architecture, complex JPA relationships, and environment-specific configurations. It is designed for managing digital music libraries including users, artists, albums, songs, and playlists.

---

## Architecture
The application follows a **Layered Architecture** to ensure high maintainability, clean code, and separation of concerns.



* **Controller Layer:** Handles incoming HTTP requests and maps them to specific endpoints.
* **Service Layer:** Contains the core business logic and processes data before persistence.
* **Repository Layer:** Manages data access using Spring Data JPA and custom JPQL queries.
* **Database Layer:** Supports H2 (In-memory) for development and MySQL for production.

---

## Tech Stack
* **Language:** Java 25
* **Framework:** Spring Boot (Web, Data JPA, Actuator)
* **Persistence:** Hibernate ORM
* **Databases:** H2 (Dev) & MySQL (Prod)
* **Utilities:** Lombok, Maven, Spring Profiles
* **Testing:** Postman (API Testing)

---

## Entity Design & Relationships
The system utilizes a relational database schema with complex mappings to ensure data integrity.



| Relationship | Type | Description |
| :--- | :--- | :--- |
| **Artist → Album** | One-to-Many | One artist can have multiple albums. |
| **Album → Song** | One-to-Many | One album contains multiple songs. |
| **User → Playlist** | One-to-Many | A user can create many personal playlists. |
| **Playlist ↔ Song** | Many-to-Many | Songs can belong to many playlists, and vice-versa. |

---

## API Endpoints
All responses are returned in **JSON** format.

### User Management
* `POST /users` – Create a user
* `GET /users` – Get all users
* `GET /users/{id}` – Get user details
* `PUT /users/{id}` – Update user profile
* `DELETE /users/{id}` – Remove user

### Artist & Music Catalog
* `GET /artists` / `POST /artists` – Manage creators
* `GET /albums` / `POST /albums` – Manage collections
* `GET /songs` – Retrieve all tracks
* `GET /songs/{id}` – Fetch specific song metadata

### Playlist Operations
* `POST /playlists` – Create a new list
* `PUT /playlists/{id}` – Update playlist (add/remove songs)
* `GET /playlists` – Retrieve all curated lists

---

## Configuration & Profiles
The application manages different environments using **Spring Profiles**.

### **Development Profile (`dev`)**
* **Database:** H2 In-Memory.
* **H2 Console:** `http://localhost:8080/h2-console`
* **Credentials:** JDBC URL: `jdbc:h2:mem:testdb` | User: `sa` | Pass: (empty)

### **Production Profile (`prod`)**
* **Database:** MySQL.
* **Setup:** Requires a MySQL instance; Hibernate handles schema generation automatically.

### **Monitoring**
* `/actuator/health` – Check system status.
* `/actuator/metrics` – View performance data.

---

## Implementation Notes
* **Clean Code:** Used **Lombok** to eliminate boilerplate code (Getters, Setters, Constructors).
* **Custom Queries:** Implemented JPQL for advanced filtering (e.g., fetching songs by genre).
* **Metadata:** Used `@Embedded` objects for `PlaylistMeta` to keep the database schema organized.
* **Headless API:** This is a pure backend service; accessing the root URL (`/`) will result in a 404/White Label error.

---

**Author:** Ponnada V V Naga Shanmukha 
**Role:** Aspiring Full Stack Developer  
**Focus:** Spring Boot, Java, & Scalable REST APIs
