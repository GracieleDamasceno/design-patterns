package com.example.factory.service;

import com.example.factory.interfaces.Notification;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SMSNotification implements Notification {

  @Override
  public boolean deliverMessage(String message) {
    log.info("SMS is the selected choice of delivery! The message to send is: " + message);
    return false;
  }
}
