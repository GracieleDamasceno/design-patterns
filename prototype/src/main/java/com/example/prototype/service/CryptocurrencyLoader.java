package com.example.prototype.service;

import com.example.prototype.domain.Cryptocurrency;
import com.example.prototype.domain.CryptocurrencyTypesEnum;
import java.math.BigDecimal;
import java.util.HashMap;
import javax.annotation.PostConstruct;

public class CryptocurrencyLoader {

  HashMap<String, Cryptocurrency> cryptocurrencyTable = new HashMap<>();

  public Cryptocurrency getCryptocurrencyLoaded(CryptocurrencyTypesEnum crypto){
    Cryptocurrency loadedCryptocurrency = cryptocurrencyTable.get(crypto.getId());
    return new Cryptocurrency(loadedCryptocurrency);
  }

  @PostConstruct
  private void loadCryptoInfo1stJanuary2022(){
    Cryptocurrency bitcoin = Cryptocurrency.builder()
        .id(CryptocurrencyTypesEnum.BTC.getId())
        .name("BITCOIN")
        .symbol(CryptocurrencyTypesEnum.BTC)
        .rank(1)
        .volume24(new BigDecimal("24582667004"))
        .priceUSD(new BigDecimal("47686.81"))
        .marketCapUSD(new BigDecimal("902104193385"))
        .build();

    Cryptocurrency ethereum = Cryptocurrency.builder()
        .id(CryptocurrencyTypesEnum.ETH.getId())
        .name("ETHEREUM")
        .symbol(CryptocurrencyTypesEnum.ETH)
        .rank(1)
        .volume24(new BigDecimal("9776191466"))
        .priceUSD(new BigDecimal("3769.70"))
        .marketCapUSD(new BigDecimal("448537615143"))
        .build();

    cryptocurrencyTable.put(CryptocurrencyTypesEnum.BTC.getId(), bitcoin);
    cryptocurrencyTable.put(CryptocurrencyTypesEnum.ETH.getId(), ethereum);
  }

}
