package com.example.prototype.service;

import com.example.prototype.client.CryptocurrencyClient;
import com.example.prototype.domain.Cryptocurrency;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CryptocurrencyService {

  private final CryptocurrencyClient cryptocurrencyClient;
  private static final String BITCOIN_ID = "90";

  public Cryptocurrency getCryptocurrencyValues(){
    return cryptocurrencyClient.getCryptocurrency(BITCOIN_ID).iterator().next();
  }

}
