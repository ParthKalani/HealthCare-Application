# Healthcare Application

Software Systems Design & Implementation

## 📌 Project Overview

This project is a **Java Swing-based digital collaboration platform** designed to facilitate communication and coordination across multiple enterprises, organizations, and roles. The platform models a real-world ecosystem where collaboration among diverse stakeholders creates greater value than individual efforts.

Key objectives include:

* Designing a robust, multi-enterprise system with interconnected workflows.
* Implementing **role-based authentication**, **data management**, and **reporting** features.
* Providing a user-friendly Swing application that simulates real-time operations and status tracking.
* Demonstrating teamwork, architectural design, and software engineering principles.

---

## 👥 Players in the Ecosystem
![alt text](https://github.com/ParthKalani/AED_Final_Project/blob/jay_branch/LifeSave.jpg)
### Enterprises (4)

1. **Healthcare Enterprise** – Hospitals and clinics
2. **Pharmaceutical Supplier** – Drug and equipment providers
3. **Insurance Enterprise** – Health insurance providers
4. **Logistics Enterprise** – Medical supply chain and transportation services

### Organizations (6)

* Hospital Administration
* Pharmacy Department
* Insurance Claims Department
* Logistics Operations
* Supplier Sales Department
* Emergency Services

### Roles (8)

* Enterprise Admin
* Organization Admin
* Doctor
* Pharmacist
* Insurance Agent
* Logistics Manager
* Patient/User
* System Auditor

---

## 🔑 Features

### 1. **Authentication & Security**

* Role-based login (Admin, Manager, User).
* Secure password storage and validation.
* Access control ensuring users only interact with relevant modules.

### 2. **Work Requests & Workflow Management**

* Multi-enterprise work requests with lifecycle statuses:

  * **Ordered → Pending → Work in Progress → Complete → Canceled**
* Request routing between enterprises and organizations.
* Real-time updates to track progress.

### 3. **Data Management**

* CRUD operations for enterprise-specific data.
* Input validation with proper formats (IDs, dates, emails, etc.).
* Test configuration using **Faker library** for random data population.

### 4. **User Interface (Swing)**

* Intuitive UI with menus, forms, and status panels.
* Dashboard with role-based access.
* Organized data tables for reporting and request tracking.

### 5. **Reporting Module**

* Summarized system-level and organization-level performance reports.
* Metrics such as total requests handled, success rate, pending tasks, etc.
* Export functionality (CSV/Excel).

### 6. **Configuration & Testing**

* Pre-loaded test cases for demo.
* Faker-based random data generation.
* Automated data validation checks.

---

## ⚙️ Advanced Features (Optional)

* **Google Maps API** – Real-time logistics tracking.
* **Email Notifications** – For status updates and account verification.
* **Location Service** – Track supply movement across enterprises.

---

## 🏗️ System Architecture

### UML & Design Artifacts

* **Use Case Diagrams** – Capturing interactions between roles and enterprises.
* **Class Diagrams** – Object model for enterprises, organizations, and requests.
* **Sequence Diagrams** – Flow of work requests between parties.

*(All diagrams are included in `/docs` folder.)*

---

## 🖥️ Technology Stack

* **Programming Language:** Java (Swing for GUI)
* **Database:** MySQL (JDBC Integration)
* **Libraries & Tools:**

  * Faker (test data generation)
  * Apache POI (report export)
  * Google Maps API (advanced feature)
* **Version Control:** GitHub (branch-per-member)

---

## 📂 Repository Structure

```
├── src/                      # Source code  
│   ├── ui/                   # Swing UI components  
│   ├── model/                # Business logic & entity classes  
│   ├── db/                   # Database integration  
│   └── utils/                # Helpers, Faker integration  
├── docs/                     # UML diagrams, design docs  
├── test/                     # Unit and integration tests  
├── README.md                 # Project documentation  
└── config/                   # Test configuration files  
```

---

## 🚀 Installation & Setup

### Prerequisites

* Java 11+
* MySQL (or preferred database)
* Git

### Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/<your-repo>/digital-collaboration-platform.git
   cd digital-collaboration-platform
   ```
2. Import project into **IntelliJ/Eclipse**.
3. Configure database connection in `config/db.properties`.
4. Run `Main.java` to start the Swing application.

---

## 📊 Demo Data

* Use **Faker-based configuration module** to auto-generate demo users, requests, and reports.
* Example test users:

  * `admin1 / Admin@123`
  * `doctor1 / Doc@123`
  * `patient1 / User@123`

---

## 📽️ Presentation

The final solution is demonstrated in a **40-minute live session**, covering:

* Problem statement & ecosystem design.
* Roles & enterprises.
* Live demo of Swing application.
* Technical deep dive into design, implementation, and database.

---
