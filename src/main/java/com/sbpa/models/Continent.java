package com.sbpa.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Continent {
  public String continentId;
  public String continentCode;
  public String continentName;

  public Continent() {
    super();
  }

  public Continent(String continentId, String continentCode, String continentName) {
    this.continentId = continentId;
    this.continentCode = continentCode;
    this.continentName = continentName;
  }

  public String getContinentId() {
    return this.continentId;
  }

  public String getContinentCode() {
    return this.continentCode;
  }

  public String getContinentName() {
    return this.continentName;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Continent)) {
      return false;
    }
    Continent continent = (Continent) o;
    return Objects.equals(continentId, continent.continentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(continentId, continentCode, continentName);
  }

  @Override
  public String toString() {
    return "{" + " continentId:'" + getContinentId() + "'" + ", continentCode:'" + getContinentCode() + "'"
        + ", continentName:'" + getContinentName() + "'" + "}";
  }

}