package com.example.prototype.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

public class CryptocurrencyDTO {

  @JsonProperty("rank")
  private Integer rank;

  @JsonProperty("price_usd")
  private BigDecimal priceUSD;

  @JsonProperty("volume24")
  private BigDecimal volume24;

  @JsonProperty("market_cap_usd")
  private BigDecimal marketCapUSD;

}
