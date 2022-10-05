package com.example.prototype.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CryptocurrencyTypeEnum {
  BTC("90"),
  ETH ("80");

  private final String id;
}
