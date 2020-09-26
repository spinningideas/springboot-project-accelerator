package com.sbpa.repositories;

import java.io.File;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sbpa.models.Continent;

import org.springframework.core.io.ClassPathResource;

public class ContinentsRepository {

  public List<Continent> GetContinents() {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    List<Continent> continents = Collections.emptyList();
    try {
      File file = new ClassPathResource("data/continents.json").getFile();
      continents = objectMapper.readValue(file, new TypeReference<List<Continent>>() {});
    } catch (Exception e) {
      e.printStackTrace();
    }
    return continents;
  }
 
}
