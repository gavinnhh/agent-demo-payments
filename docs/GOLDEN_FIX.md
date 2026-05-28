# Golden fix — Bug A

## Problem

`PaymentService.config` is never initialized. `charge()` calls `config.getApiKey()` and throws `NullPointerException`.

## Fix (choose one)

**Option A — initialize in the service (recommended for agent patch):**

In `src/main/java/com/demo/payments/PaymentService.java`, set config in the constructor:

```java
public PaymentService() {
  this.config = new Config("demo-api-key");
}
```

**Option B — initialize in the test:**

In `PaymentServiceTest`, add `@BeforeEach` that injects config via a package-visible setter or test-only constructor.

## Verify

```bash
mvn -B test
```

Expected: `BUILD SUCCESS`, `PaymentServiceTest.shouldReturn200WhenChargeSucceeds` passes.
