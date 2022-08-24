package com.example.factory.service;

import com.example.factory.dto.DeliveryResponseDTO;
import com.example.factory.dto.MessageRequestDTO;
import com.example.factory.enums.NotificationTypeEnum;
import com.example.factory.interfaces.Notification;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Service
public class NotificationService {

  public DeliveryResponseDTO redirectMessage(MessageRequestDTO message, NotificationTypeEnum methodOfDelivery){

    Notification notification = methodOfDelivery.getInstance();
    return notification.deliverMessage(message);
  }
}
