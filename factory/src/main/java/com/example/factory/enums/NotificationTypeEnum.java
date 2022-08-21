package com.example.factory.enums;

import com.example.factory.interfaces.Notification;
import com.example.factory.service.CarrierPigeonNotification;
import com.example.factory.service.EmailNotification;
import com.example.factory.service.MailLetterNotification;
import com.example.factory.service.MobilePushNotification;
import com.example.factory.service.SMSNotification;

public enum NotificationTypeEnum {
  CARRIER_PIGEON {
    public CarrierPigeonNotification getInstance(){
      return new CarrierPigeonNotification();
    }
  },
  EMAIL {
    public EmailNotification getInstance(){
      return new EmailNotification();
    }
  },
  MAIL_LETTER {
    public MailLetterNotification getInstance(){
      return new MailLetterNotification();
    }
  },
  MOBILE_PUSH {
    public MobilePushNotification getInstance(){
      return new MobilePushNotification();
    }
  },
  SMS{
    public SMSNotification getInstance(){
      return new SMSNotification();
    }
  };

  public abstract Notification getInstance();

}
