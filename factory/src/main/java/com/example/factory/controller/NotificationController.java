package com.example.factory.controller;

import com.example.factory.enums.NotificationTypeEnum;
import com.example.factory.service.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class NotificationController {

  private NotificationService notificationService;

  @PostMapping
  public boolean sendMessage(@RequestParam String message, @RequestParam NotificationTypeEnum methodOfDelivery){
    log.info("Message received. Method of delivery: " + methodOfDelivery + " Payload: " + message);

    return notificationService.redirectMessage(message, methodOfDelivery);

  }
}
