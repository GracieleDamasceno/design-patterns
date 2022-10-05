package com.example.prototype.controller;

import com.example.prototype.domain.CryptocurrencyReport;
import com.example.prototype.domain.CryptocurrencyTypeEnum;
import com.example.prototype.service.CryptocurrencyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CryprocurrencyController {
  private final CryptocurrencyService cryptocurrencyService;

  @GetMapping(value = "/crypto/{cryptocurrencyType}")
  public CryptocurrencyReport cryptocurrencyController(@PathVariable CryptocurrencyTypeEnum cryptocurrencyType) {
    return cryptocurrencyService.getCryptocurrencyReport(cryptocurrencyType);
  }
}
