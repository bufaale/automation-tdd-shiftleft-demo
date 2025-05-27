# 🧪 TDD + Shift Left Demo

This project demonstrates how to apply **Test-Driven Development (TDD)** and **Shift Left testing** as a QA Automation Engineer by integrating tests *before* the backend service is available.

## 🔁 Pipeline Workflow (GitHub Actions)

![CI](https://github.com/your-user-name/automation-tdd-shiftleft-demo/actions/workflows/test.yml/badge.svg)

### 🔄 Stages:

1. ✅ **Checkout + Set up JDK 17**
2. 🟥 **Run test before backend is up (expected to fail)** — *TDD Red stage*
3. 🚀 **Start the backend service with Spring Boot**
4. 🟩 **Run test again (now it should pass)** — *TDD Green stage*
5. 🧪 **Run additional assertions to verify service status** — *Post-Green Verify stage*
6. 📦 **Build backend artifact only if all tests pass**

> This pipeline simulates the TDD cycle (Red ➝ Green ➝ Refactor) and validates the idea of **“testing before coding”**.

---

## ▶️ How to run locally

1. Clone the repository:

```bash
git clone https://github.com/your-user-name/automation-tdd-shiftleft-demo.git
cd automation-tdd-shiftleft-demo
```

2. Run tests manually:

```bash
cd backend
mvn clean test
```

3. Run the app:

```bash
mvn spring-boot:run
```

4. Visit the endpoint:

```
http://localhost:8080/users
```

---

## 📁 Project Structure

```
.
├── backend/
│   ├── src/
│   │   ├── main/java/com/portfolio/backend/UserController.java
│   │   └── test/java/com/portfolio/backend/UserTest.java
│   │   └── test/java/com/portfolio/backend/UserGreenTest.java
│   └── pom.xml
├── .github/workflows/test.yml
├── Dockerfile
├── docker-compose.yml
└── README.md
```

---

## 🛠 Tech Stack

- Java 17
- Spring Boot 3.2+
- JUnit 5
- RestAssured
- Maven Wrapper
- GitHub Actions (CI)
- Docker & Docker Compose

---

## 📌 Why this project?

This is a real-world demo of how a QA/SDET can:

- 🚦 Shift testing left in the SDLC
- 🧪 Apply TDD for backend automation flows
- 🤝 Contribute meaningful CI pipelines from day one
- 🔴 Use fail-first testing strategies to validate dev readiness