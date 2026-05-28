# agent-demo-payments

Small demo payment service for the **agentic CI remediation** capstone.

- **`main`** intentionally contains **Bug A**: `PaymentService` never initializes `config`, so `mvn test` fails.
- Your agent platform (`agentic-ci-platform`) watches CI, patches this repo, and opens a **draft PR**.
- Mentor answer key: [`docs/GOLDEN_FIX.md`](docs/GOLDEN_FIX.md)

## Local run

```bash
mvn -B test   # fails on main (expected)
```

Requires Java 17+ and Maven.

## CI

GitHub Actions workflow [`.github/workflows/ci.yml`](.github/workflows/ci.yml) runs `mvn -B test` on push/PR to `main`.

## Layout

```
src/main/java/com/demo/payments/
  Config.java
  PaymentService.java    # bug on main
src/test/java/com/demo/payments/
  PaymentServiceTest.java
```
