package com.example.prototype.dto.in;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
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
