package com.example.prototype.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
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

  private SymbolEnum symbol;

  private String name;

  private Integer rank;

  @JsonProperty("price_usd")
  private BigDecimal priceUSD;

  @JsonProperty("percent_change_24h")
  private BigDecimal percentChange24h;

  @JsonProperty("percent_change_1h")
  private BigDecimal percentChange1h;

  @JsonProperty("percent_change_7d")
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