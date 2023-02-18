package com.example.adapter.controller;

import com.example.adapter.adapter.ModernizedPersonAdapter;
import com.example.adapter.service.LegacyPersonService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class PersonController {
    private LegacyPersonService legacyPersonService;
    private ModernizedPersonAdapter modernizedPersonAdapter;

    @GetMapping(value = "/person")
    public String getPersonLegacy() {
        // Already using the XML data to propagate a Person object to many legacy applications.
        // The dinosaurs created this method before us! It cannot be changed easily.
        log.info("Received a legacy request to retrieve a Person...");
        return legacyPersonService.getPersonXML();
    }

    @GetMapping(value = "/v1/person")
    public String getPersonModernized() {
        // We implemented a new version of our application.
        // Just like that, we can control the desired output - in this case, json.
        log.info("Received a modernized request to retrieve a Person...");
        return modernizedPersonAdapter.getPersonJson();
    }
}
