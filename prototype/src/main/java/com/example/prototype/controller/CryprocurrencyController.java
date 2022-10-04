package com.example.prototype.controller;

import com.example.prototype.service.CryptocurrencyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CryprocurrencyController {
  private final CryptocurrencyService cryptocurrencyService;

  @GetMapping(value = "/crypto")
  public void cryptocurrencyController() {

  }
}
