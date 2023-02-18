package com.example.adapter.service;

import com.example.adapter.domain.Person;
import com.example.adapter.domain.PersonOutput;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
@Slf4j
@Service
@RequiredArgsConstructor
public class LegacyPersonService implements PersonOutput {
    private final XmlMapper xmlMapper;

    public String getPersonXML() {
        // Let's pretend that we did a hiper-mega connection to our legacy database.
        log.info("Retrieving data from legacy table");

        Person person = Person.builder()
                .age(25)
                .name("John Titor")
                .dateOfBirth(LocalDate.of(1998, 01, 01))
                .nationality("USA")
                .address("7862 W Irlo Bronson Memorial Hwy Kissimmee, FL 34747")
                .email("john.titor@mail.com")
                .build();

        try {
            return xmlMapper.writeValueAsString(person);
        } catch (JsonProcessingException e) {
            log.info("Failure while converting data to XML.");
            throw new RuntimeException(e);
        }
    }
}
