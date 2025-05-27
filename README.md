# 🧪 automation-tdd-shiftleft-demo

This project demonstrates how a QA Automation Engineer can apply **TDD (Test-Driven Development)** and **Shift Left Testing** principles using a real-world pipeline.

It simulates a fail-first scenario where a test is executed before the backend feature is implemented — proving that tests guide development rather than follow it.

---

## 🔍 What This Project Shows

- ✅ Test-first development (TDD) from QA perspective
- 📦 CI pipeline that runs the test before and after backend deployment
- 🧪 Simple test validates a `POST /users` endpoint
- 💥 The test fails first, then passes once the feature is available

---

## 📁 Structure

```bash
├── backend/                  # Simple REST API (Java or Node.js)
├── tests/                    # API tests (RestAssured or Newman)
├── .github/workflows/       # GitHub Actions CI pipeline
│   └── tdd.yml
├── README.md
```

---

## 🚀 How the Pipeline Works

1. **Run tests before the backend is live** → test fails ✅
2. **Deploy the backend service** (e.g., Spring Boot / Express)
3. **Re-run the test** → test now passes ✅

> This mimics how automation can lead development, not lag behind it.

---

## 🧱 Technologies

- Java 17 / Gradle or Node.js
- RestAssured or Postman CLI (Newman)
- GitHub Actions CI
- Docker / docker-compose

---

## 🧠 Why This Project Matters

> In real teams, testers often wait for features. But in modern QA:

- **You define the behavior first** (test/data/spec)
- **Dev implements to make the test pass**
- This is TDD applied from QA — and it’s Shift Left in action.

---

## 👤 Author

**Alejandro Bufarini**  
Senior QA Automation Engineer  
[GitHub Portfolio](https://github.com/alejandrobufarini)
