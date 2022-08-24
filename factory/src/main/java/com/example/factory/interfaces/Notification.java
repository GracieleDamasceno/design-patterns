package com.example.factory.interfaces;

import com.example.factory.dto.DeliveryResponseDTO;
import com.example.factory.dto.MessageRequestDTO;

public interface Notification {

  DeliveryResponseDTO deliverMessage(MessageRequestDTO message);

}
