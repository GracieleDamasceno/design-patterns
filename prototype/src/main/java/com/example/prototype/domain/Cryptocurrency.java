package com.example.prototype.domain;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cryptocurrency {

  private String id;

  private CryptocurrencyTypeEnum symbol;

  private String name;

  private Integer rank;

  private BigDecimal priceUSD;

  private BigDecimal volume24;

  private BigDecimal marketCapUSD;

  /*
  * Since the clone method from Cloneable class is broken, we use a copy constructor.
  * */
  public Cryptocurrency(Cryptocurrency cryptocurrency) {
    this(cryptocurrency.getId(),
        cryptocurrency.getSymbol(),
        cryptocurrency.getName(),
        cryptocurrency.getRank(),
        cryptocurrency.getPriceUSD(),
        cryptocurrency.getVolume24(),
        cryptocurrency.getMarketCapUSD());
  }
}