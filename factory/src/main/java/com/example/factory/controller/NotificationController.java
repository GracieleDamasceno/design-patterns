package com.example.factory.controller;

import com.example.factory.dto.DeliveryResponseDTO;
import com.example.factory.dto.MessageRequestDTO;
import com.example.factory.enums.NotificationTypeEnum;
import com.example.factory.service.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class NotificationController {

  private NotificationService notificationService;

  @PostMapping(value = "/message")
  public DeliveryResponseDTO sendMessage(@RequestBody MessageRequestDTO message, @RequestParam NotificationTypeEnum delivery) {
    log.info("Message received. Method of delivery: " + delivery + ". Payload: " + message);

    return notificationService.redirectMessage(message, delivery);
  }
}
