package com.example.factory.service;

import com.example.factory.interfaces.Notification;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MobilePushNotification implements Notification {

  @Override
  public boolean deliverMessage(String message) {
    log.info("Mobile Push is the selected choice of delivery! The message to send is: " + message);
    return false;
  }
}
