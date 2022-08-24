package com.example.factory.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.factory.dto.DeliveryResponseDTO;
import com.example.factory.dto.MessageRequestDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class NotificationControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Autowired
  private ObjectMapper mapper;

  @Test
  void should_redirectToCorrectTypeMessage_when_receivedMessageRequest() throws Exception {
    String messageRequest = mapper.writeValueAsString(new MessageRequestDTO("My first message is, of course: Hello World!"));
    String expectedResponse = mapper.writeValueAsString(new DeliveryResponseDTO("Message successfully delivered through SMS", true));

    mockMvc.perform(post("/message")
            .contentType(MediaType.APPLICATION_JSON)
            .param("delivery", "SMS")
            .content(messageRequest))
        .andExpect(status().isOk())
        .andExpect(content().json(expectedResponse));
  }
}