package com.example.factory.service;

import com.example.factory.dto.DeliveryResponseDTO;
import com.example.factory.dto.MessageRequestDTO;
import com.example.factory.interfaces.Notification;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MailLetterNotification implements Notification {

  @Override
  public DeliveryResponseDTO deliverMessage(MessageRequestDTO message) {
    log.info("Mail letter is the selected choice of delivery! The message to send is: " + message);

    return DeliveryResponseDTO.builder()
        .delivered(true)
        .deliveryStatus("Message successfully delivered through mail letter")
        .build();
  }
}
