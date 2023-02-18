package com.example.adapter.adapter;

import com.example.adapter.service.LegacyPersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.XML;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ModernizedPersonAdapter implements PersonOutputAdapter {
    private final LegacyPersonService legacyPersonService;

    @Override
    public String getPersonJson() {
        log.info("Adapting incoming XML data of legacy table to JSON");
        String personXML = legacyPersonService.getPersonXML();
        return XML.toJSONObject(personXML).toString();
    }
}
