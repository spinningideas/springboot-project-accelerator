package com.sbpa.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
  public String countryId;
  public String countryName;
  public String countryCode;
  public String countryCode3;
  public String capital;
  public String continentCode;
  public int area;
  public int population;
  public double latitude;
  public double longitude;
  public String currencyCode;
  public String currencyName;
  public String languages;

  public Country() {
    super();
  }

  public Country(String countryId, String countryName, String countryCode, String countryCode3, String capital,
      String continentCode, int area, int population, double latitude, double longitude, String currencyCode,
      String currencyName, String languages) {
    this.countryId = countryId;
    this.countryName = countryName;
    this.countryCode = countryCode;
    this.countryCode3 = countryCode3;
    this.capital = capital;
    this.continentCode = continentCode;
    this.area = area;
    this.population = population;
    this.latitude = latitude;
    this.longitude = longitude;
    this.currencyCode = currencyCode;
    this.currencyName = currencyName;
    this.languages = languages;
  }

  public String getCountryId() {
    return this.countryId;
  }

  public String getCountryName() {
    return this.countryName;
  }

  public String getCountryCode() {
    return this.countryCode;
  }

  public String getCountryCode3() {
    return this.countryCode3;
  }

  public String getCapital() {
    return this.capital;
  }

  public String getContinentCode() {
    return this.continentCode;
  }

  public int getArea() {
    return this.area;
  }

  public int getPopulation() {
    return this.population;
  }

  public double getLatitude() {
    return this.latitude;
  }

  public double getLongitude() {
    return this.longitude;
  }

  public String getCurrencyCode() {
    return this.currencyCode;
  }

  public String getCurrencyName() {
    return this.currencyName;
  }

  public String getLanguages() {
    return this.languages;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Country)) {
      return false;
    }
    Country country = (Country) o;
    return Objects.equals(countryId, country.countryId) && Objects.equals(countryName, country.countryName)
        && Objects.equals(countryCode, country.countryCode) && Objects.equals(countryCode3, country.countryCode3)
        && Objects.equals(capital, country.capital) && Objects.equals(continentCode, country.continentCode)
        && area == country.area && population == country.population && Objects.equals(latitude, country.latitude)
        && Objects.equals(longitude, country.longitude) && Objects.equals(currencyCode, country.currencyCode)
        && Objects.equals(currencyName, country.currencyName) && Objects.equals(languages, country.languages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryId, countryName, countryCode, countryCode3, capital, continentCode, area, population,
        latitude, longitude, currencyCode, currencyName, languages);
  }

  @Override
  public String toString() {
    return "{" + " countryId:'" + getCountryId() + "'" + ", countryName:'" + getCountryName() + "'" + ", countryCode:'"
        + getCountryCode() + "'" + ", countryCode3:'" + getCountryCode3() + "'" + ", capital:'" + getCapital() + "'"
        + ", continentCode:'" + getContinentCode() + "'" + ", area:'" + getArea() + "'" + ", population:'"
        + getPopulation() + "'" + ", latitude:'" + getLatitude() + "'" + ", longitude:'" + getLongitude() + "'"
        + ", currencyCode:'" + getCurrencyCode() + "'" + ", currencyName:'" + getCurrencyName() + "'" + ", languages:'"
        + getLanguages() + "'" + "}";
  }

}