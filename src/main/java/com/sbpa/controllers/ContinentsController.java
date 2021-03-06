package com.sbpa.controllers;

import java.util.List;

import com.sbpa.repositories.ContinentsRepository;
import com.sbpa.models.Continent;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContinentsController {

	@GetMapping("/continents")
	public ResponseEntity<List<Continent>> continents() {
		final var repo = new ContinentsRepository();
		final List<Continent> continents = repo.GetContinents();
		return ResponseEntity.ok(continents);
	}

}