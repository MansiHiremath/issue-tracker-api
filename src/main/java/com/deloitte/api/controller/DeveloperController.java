package com.deloitte.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.api.entities.Developer;
import com.deloitte.api.services.TrackerService;

@RestController
@RequestMapping("/issue-tracker-api")
public class DeveloperController {

	@Autowired
	public TrackerService trackerService;
	
	@GetMapping("/get")
	public List<Developer> getDeveloper() {
		return trackerService.getDeveloper();
	}
	
	@PostMapping("/add")
	public Developer addDeveloper(@RequestBody Developer developer) {
		return trackerService.addDeveloper(developer);
	}
}
