package com.deloitte.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.api.entities.Developer;
import com.deloitte.api.services.DeveloperService;

@RestController
@RequestMapping("/developerService")
public class DeveloperController {

	/*
	 * @Author:Atul
	 * 
	 * @CreationDate:
	 * 
	 */
	@Autowired
	public DeveloperService developerService;

	@GetMapping("/getAllDevelopers")
	public List<Developer> getAllDevelopers() {
		return developerService.getDeveloper();
	}

	@PostMapping("/addDeveloper")
	public Developer addDeveloper(@RequestBody Developer developer) {
		return developerService.addDeveloper(developer);
	}

}
