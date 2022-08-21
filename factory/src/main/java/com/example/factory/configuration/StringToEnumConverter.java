package com.example.factory.configuration;

import com.example.factory.enums.NotificationTypeEnum;
import org.springframework.core.convert.converter.Converter;

public class StringToEnumConverter implements Converter<String, NotificationTypeEnum> {

  @Override
  public NotificationTypeEnum convert(String source) {
    return NotificationTypeEnum.valueOf(source.toUpperCase());
  }
}