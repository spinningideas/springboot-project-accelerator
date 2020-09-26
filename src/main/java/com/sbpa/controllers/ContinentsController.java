package com.sbpa.controllers;

import java.util.List;

import com.sbpa.repositories.ContinentsRepository;
import com.sbpa.models.Continent;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContinentsController {

	@GetMapping("/continents")
	public ResponseEntity<List<Continent>> continents(@RequestParam(value = "name", defaultValue = "World") String name) {
		//List<Continent> continents = new ArrayList<>();
		//continents.add(new Continent("1", "NA","North America"));
		//continents.add(new Continent("2", "EU", "Europe"));
		ContinentsRepository repo = new ContinentsRepository();
		List<Continent> continents = repo.GetContinents();
		return ResponseEntity.ok(continents);
	}
}