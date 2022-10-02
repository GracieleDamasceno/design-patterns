package com.example.prototype.service;

import com.example.prototype.domain.Cryptocurrency;
import com.example.prototype.domain.SymbolEnum;
import java.math.BigDecimal;
import java.util.HashMap;
import javax.annotation.PostConstruct;

public class CryptocurrencyLoader {

  HashMap<String, Cryptocurrency> cryptocurrencyTable = new HashMap<>();

  private Cryptocurrency getCryptocurrencyLoaded(SymbolEnum crypto){
    Cryptocurrency loadedCryptocurrency = cryptocurrencyTable.get(crypto.toString());
    return new Cryptocurrency(loadedCryptocurrency);
  }

  @PostConstruct
  private void loadCryptoInfo1stJanuary2022(){
    Cryptocurrency bitcoin = Cryptocurrency.builder()
        .id("90")
        .name("BITCOIN")
        .symbol(SymbolEnum.BTC)
        .rank(1)
        .volume24(new BigDecimal("24582667004"))
        .priceUSD(new BigDecimal("4768681"))
        .marketCapUSD(new BigDecimal("902104193385"))
        .build();

    Cryptocurrency ethereum = Cryptocurrency.builder()
        .id("80")
        .name("ETHEREUM")
        .symbol(SymbolEnum.ETH)
        .rank(1)
        .volume24(new BigDecimal("9776191466"))
        .priceUSD(new BigDecimal("3769.70"))
        .marketCapUSD(new BigDecimal("448537615143"))
        .build();

    cryptocurrencyTable.put(SymbolEnum.BTC.toString(), bitcoin);
    cryptocurrencyTable.put(SymbolEnum.ETH.toString(), ethereum);
  }

}
