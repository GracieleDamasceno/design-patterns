package com.example.adapter.adapter;

import com.example.adapter.service.LegacyPersonService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ModernizedPersonServiceAdapter extends LegacyPersonService{
    public String getPersonJson() throws JsonProcessingException {
        log.info("Transforming incoming XML data of legacy table to JSON");

        String personXML = getPersonXML();
        JSONObject personJson = XML.toJSONObject(personXML);

        return personJson.toString();
    }
}
