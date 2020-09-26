package com.sbpa.controllers;

import java.util.List;

import com.sbpa.repositories.CountriesRepository;
import com.sbpa.models.Country;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountriesController {

	@GetMapping("/countries/{continentCode}")
	public ResponseEntity<List<Country>> countries(@PathVariable String continentCode) {
		CountriesRepository repo = new CountriesRepository();
		List<Country> continents = repo.GetCountries(continentCode);
		return ResponseEntity.ok(continents);
	}
}