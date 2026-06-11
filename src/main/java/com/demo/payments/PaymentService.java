package com.demo.payments;

/**
 * In-memory payment charge helper. Bug A on main: {@code config} is never initialized.
 */
public class PaymentService {
  private Config config;

  public int charge(String accountId, int amountCents    ) {
    if (accountId == null || accountId.isBlank() ||  amountCents <= 0) {
      return 400;
    }
    // BUG A: config is null → NPE on next line
    if (config.getApiKey() == null || config.getApiKey().isEmpty() ) {
      return 500;
    }
    return 200;
  }
}
