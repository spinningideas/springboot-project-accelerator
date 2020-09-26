package com.sbpa.repositories;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.sbpa.models.Country;

import org.springframework.core.io.ClassPathResource;

public class CountriesRepository {
  public List<Country> GetCountries(String continentCode) {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    List<Country> countries = Collections.emptyList();
    List<Country> countriesResult = new ArrayList<Country>();
    try {
      File file = new ClassPathResource("data/countries.json").getFile();
      countries = objectMapper.readValue(file, new TypeReference<List<Country>>() {});
      
      for (Country c: countries) {
        if (c.continentCode.equals(continentCode)) {
          countriesResult.add(c);
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return countriesResult;
  }
}
