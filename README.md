# 🛍️ ShopCraft — End-to-End E-Commerce Web Application

A full-stack E-Commerce platform built with **Spring Boot 3**, **Spring Security**, **Spring Data JPA**, **H2 Database**, and a **Dynamic Responsive Single-Page Interface**. 

ShopCraft offers a shopping experience featuring user registration, BCrypt authentication, catalog filtering, a slide-out cart drawer, and order tracking.

---

## 🌟 Live Demo & Submissions

- **GitHub Repository:** `https://github.com/pavankalyan338/ShopCraft`

---

## 🚀 Key Features

### 🔐 Authentication & Security
- **User Registration & Login:** Secure account creation with email uniqueness checks.
- **BCrypt Encryption:** Hashed password storage using `BCryptPasswordEncoder`.
- **Role-Based Access Control:** Configured security architecture (`USER` and `ADMIN` roles).

### 🛒 Storefront & Catalog Management
- **Dynamic Catalog Loading:** Pre-populated product catalog across multiple categories (Electronics, Mobiles, Audio, Wearables, Accessories, Gaming, Smart Home).
- **Interactive Search & Filtering:** Real-time client-side keyword search and category filtering.
- **Interactive Cart Drawer:** Dynamic slide-out cart supporting instant quantity updates, total calculation, and seamless checkout.

### 📦 Order Management
- **Order Placement API:** Transactional order processing connected to user accounts.
- **Order Tracking System:** Real-time order history tracking per user account.

---

## 🛠️ Tech Stack & Architecture

- **Backend Framework:** Java 17, Spring Boot 3.2.x
- **Security:** Spring Security (BCrypt, Stateless Filters)
- **Persistence & ORM:** Spring Data JPA, Hibernate
- **Database:** H2 In-Memory Database (with `/h2-console` enabled)
- **Frontend UI:** HTML5, Modern CSS3, JavaScript (Fetch API, Async/Await)
- **Containerization & Deployment:** Docker, Render Cloud Platform

---

## 📁 Repository Directory Structure

```text
shopcraft/
├── Dockerfile
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/
    │   │       └── example/
    │   │           └── shopcraft/
    │   │               ├── ShopcraftApplication.java
    │   │               ├── config/
    │   │               │   └── SecurityConfig.java
    │   │               ├── controller/
    │   │               │   ├── AuthController.java
    │   │               │   ├── OrderController.java
    │   │               │   └── ProductController.java
    │   │               ├── model/
    │   │               │   ├── OrderItem.java
    │   │               │   ├── Product.java
    │   │               │   ├── User.java
    │   │               │   └── UserOrder.java
    │   │               ├── repository/
    │   │               │   ├── OrderRepository.java
    │   │               │   ├── ProductRepository.java
    │   │               │   └── UserRepository.java
    │   │               └── service/
    │   │                   └── AuthService.java
    │   └── resources/
    │       ├── application.properties
    │       └── static/
    │           ├── dashboard.html
    │           └── index.html
    └── test/