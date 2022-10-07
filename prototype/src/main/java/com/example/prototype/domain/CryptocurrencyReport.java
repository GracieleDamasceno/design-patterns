package com.example.prototype.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CryptocurrencyReport {

  @JsonProperty("cryptocurrency_current_values")
  private Cryptocurrency cryptocurrencyCurrentValues;

  @JsonProperty("cryptocurrency_purchased_values")
  private Cryptocurrency cryptocurrencyPurchaseValues;

  @JsonProperty("rank_variation")
  private Integer rankVariation;

  @JsonProperty("price_usd_variation")
  private BigDecimal priceUSDVariation;

  @JsonProperty("volume24_variation")
  private BigDecimal volume24Variation;

  @JsonProperty("marketcap_usd_variation")
  private BigDecimal marketCapUSDVariation;

}
