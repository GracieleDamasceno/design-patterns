package com.example.prototype.domain;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Cryptocurrency {

  private Integer id;
  private SymbolEnum symbol;
  private String name;
  private Integer rank;
  private BigDecimal priceUSD;
  private BigDecimal percentChange24h;
  private BigDecimal percentChange1h;
  private BigDecimal percentChange7d;

  /*
  * Since the clone method from Cloneable class is broken, we use a copy constructor.
  * */
  public Cryptocurrency(Cryptocurrency cryptocurrency) {
    this(cryptocurrency.getId(),
        cryptocurrency.getSymbol(),
        cryptocurrency.getName(),
        cryptocurrency.getRank(),
        cryptocurrency.getPriceUSD(),
        cryptocurrency.getPercentChange24h(),
        cryptocurrency.getPercentChange1h(),
        cryptocurrency.getPercentChange7d());
  }
}