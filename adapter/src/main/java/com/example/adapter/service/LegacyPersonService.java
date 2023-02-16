package com.example.adapter.service;

import com.example.adapter.domain.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
@Slf4j
@Service
public class LegacyPersonService {

    @Autowired
    private XmlMapper xmlMapper;

    public String getPersonXML() throws JsonProcessingException {
        // Let's pretend that we did a hiper-mega conection to our legacy database.
        log.info("Retrieving data from legacy table");

        Person person = Person.builder()
                .age(25)
                .name("John Titor")
                .dateOfBirth(LocalDate.of(1998, 01, 01))
                .nationality("USA")
                .address("7862 W Irlo Bronson Memorial Hwy Kissimmee, FL 34747")
                .email("john.titor@mail.com")
                .build();

        return xmlMapper.writeValueAsString(person);
    }
}
