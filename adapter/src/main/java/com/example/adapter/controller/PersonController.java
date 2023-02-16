package com.example.adapter.controller;

import com.example.adapter.service.LegacyPersonService;
import com.example.adapter.adapter.ModernizedPersonServiceAdapter;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@AllArgsConstructor
public class PersonController {
    private LegacyPersonService legacyPersonService;
    private ModernizedPersonServiceAdapter modernizedPersonAdapter;

    @GetMapping(value = "/person")
    public String getPersonLegacy() throws JsonProcessingException {
        log.info("Received a legacy request to retrieve a Person...");
        return legacyPersonService.getPersonXML();
    }

    @GetMapping(value = "/v1/person")
    public String getPersonModernized() throws JsonProcessingException {
        log.info("Received a modernized request to retrieve a Person...");
        return modernizedPersonAdapter.getPersonJson();
    }
}
