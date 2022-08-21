package com.example.factory.service;

import com.example.factory.enums.NotificationTypeEnum;
import com.example.factory.interfaces.Notification;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Service
public class NotificationService {

  public boolean redirectMessage(String message, NotificationTypeEnum methodOfDelivery) {
    Notification notification = methodOfDelivery.getInstance();
    return notification.deliverMessage(message);
  }
}
