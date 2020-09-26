package com.sbpa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;

@SpringBootApplication
public class SbpaApplication {

	@Value("classpath:data/continents.json")
	Resource continentsFile;

	public static void main(String[] args) {
		SpringApplication.run(SbpaApplication.class, args);
	}

}
