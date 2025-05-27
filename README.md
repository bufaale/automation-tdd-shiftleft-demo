# 🧪 TDD + Shift Left Demo

This project demonstrates how to apply **Test-Driven Development (TDD)** and **Shift Left testing** as a QA Automation Engineer by integrating tests *before* the backend service is available.

## 🔁 Pipeline Workflow (GitHub Actions)

![CI](https://github.com/your-user-name/automation-tdd-shiftleft-demo/actions/workflows/test.yml/badge.svg)

### 🔄 Stages:

1. ✅ **Checkout + Set up JDK 17**
2. 🟥 **Run test before backend is up (expected to fail)** — *TDD Red stage*
3. 🚀 **Start the backend service using Docker Compose**
4. 🟩 **Run test again (now it should pass)** — *TDD Green stage*
5. 🧪 **Run additional assertions (optional)*

---

## ▶️ How to run locally

1. Clone the repository:

```bash
git clone https://github.com/your-user-name/automation-tdd-shiftleft-demo.git
cd automation-tdd-shiftleft-demo
```

2. Run tests:

```bash
./mvnw clean test
```

3. Run the app with Docker:

```bash
docker-compose up --build
```

4. Visit the endpoint (if needed):

```
http://localhost:8080/users
```

---

## 📁 Project Structure

```
.
├── backend/
│   ├── src/main/java/...UserController.java
│   └── pom.xml
├── tests/
│   └── src/UserTest.java
├── .github/workflows/test.yml
├── Dockerfile
├── docker-compose.yml
└── README.md
```

---

## 🛠 Tech Stack

- Java 17
- Spring Boot 3.5
- JUnit 5
- Maven
- GitHub Actions (CI)
- Docker & Docker Compose

---

## 📌 Why this project?

This is a real-world demo of how a QA/SDET can:

- Shift testing left in the SDLC
- Apply TDD for automation flows
- Contribute meaningful CI pipelines from day one