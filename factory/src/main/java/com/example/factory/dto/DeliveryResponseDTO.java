package com.example.factory.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class DeliveryResponseDTO {

  private String deliveryStatus;
  private boolean delivered;

}

