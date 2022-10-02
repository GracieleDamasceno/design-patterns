package com.example.prototype.service;

import com.example.prototype.client.CryptocurrencyClient;
import com.example.prototype.dto.CryptocurrencyDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CryptocurrencyService {

  private final CryptocurrencyClient cryptocurrencyClient;

  public CryptocurrencyDTO getCryptocurrencyValues(String idCryptocurrency){
    return cryptocurrencyClient.getCryptocurrency(idCryptocurrency).iterator().next();
  }

}
