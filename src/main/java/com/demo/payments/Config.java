package com.demo.payments;

public class Config {
  private final String apiKey;

  public Config(String apiKey) {
    this.apiKey = apiKey;
  }

  public String getApiKey() {
    return apiKey;
  }
}
