package com.example.factory.service;

import com.example.factory.dto.DeliveryResponseDTO;
import com.example.factory.dto.MessageRequestDTO;
import com.example.factory.interfaces.Notification;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CarrierPigeonNotification implements Notification {

  @Override
  public DeliveryResponseDTO deliverMessage(MessageRequestDTO message) {
    log.info("Carrier Pigeon is the selected choice of delivery! The message to send is: " + message);

    return DeliveryResponseDTO.builder()
        .delivered(false)
        .deliveryStatus("Delivery method not yet supported!")
        .build();
  }
}