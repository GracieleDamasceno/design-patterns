package com.example.prototype.controller;

import com.example.prototype.domain.Cryptocurrency;
import com.example.prototype.service.CryptocurrencyService;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CryprocurrencyController {
  private final CryptocurrencyService cryptocurrencyService;

  @GetMapping(value = "/cryptograph")
  public List<Cryptocurrency> cryptocurrencyController(){

    List<Cryptocurrency> historicCrypto = new ArrayList<>();
    historicCrypto.add(new Cryptocurrency(cryptocurrencyService.getCryptocurrencyValues()));

    return historicCrypto;
  }
}
