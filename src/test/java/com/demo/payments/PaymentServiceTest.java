package com.demo.payments;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PaymentServiceTest {

  @Test
  void shouldReturn200WhenChargeSucceeds() {
    PaymentService service = new PaymentService();
    int status = service.charge("acct-1", 1000);
    assertEquals(200, status);
  }
}
