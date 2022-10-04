package com.example.prototype.domain;

import java.math.BigDecimal;
import lombok.Builder;

@Builder
public class CryptocurrencyReport {

  private Cryptocurrency cryptocurrencyNow;
  private Cryptocurrency cryptocurrencyAtPurchase;
  private Integer variationOfRank;
  private BigDecimal variationOfPriceUSD;
  private BigDecimal variationOfVolume24;
  private BigDecimal variationOfMarketCapUSD;

}
