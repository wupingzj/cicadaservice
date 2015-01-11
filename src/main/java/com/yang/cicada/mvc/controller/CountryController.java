package com.yang.cicada.mvc.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yang.cicada.model.entity.Country;

@RestController
public class CountryController {
	@RequestMapping("/countries")
	public List<Country> greeting() {
		List<Country> countries = new LinkedList<Country>();
		Country country = new Country("New Zealand", true, false);
		countries.add(country);

		country = new Country("Australia", true, true);
		countries.add(country);

		country = new Country("Thailand", false, false);
		countries.add(country);

		country = new Country("China", true, true);
		countries.add(country);
		
		country = new Country("USA", false, true);
		countries.add(country);
		
		return countries;
	}
}
