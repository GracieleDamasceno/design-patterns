package com.example.prototype.domain;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Cryptocurrency implements Cloneable{

  private Integer id;
  private SymbolEnum symbol;
  private String name;
  private Integer rank;
  private BigDecimal priceUSD;
  private BigDecimal percentChange24h;
  private BigDecimal percentChange1h;
  private BigDecimal percentChange7d;

  @Override
  protected Cryptocurrency clone() throws CloneNotSupportedException {
      Cryptocurrency clone = (Cryptocurrency) super.clone();
      clone.rank = this.rank;
      clone.priceUSD = this.priceUSD;
      clone.percentChange1h = this.percentChange1h;
      clone.percentChange24h = this.percentChange24h;
      clone.percentChange7d = this.percentChange7d;
      return clone;
  }
}