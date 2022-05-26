package com.deloitte.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.api.entities.Developer;
import com.deloitte.api.response.DefaultResponse;
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
	@Autowired
	public DefaultResponse defaultResponse;

	@GetMapping("/getAllDevelopers")
	public ResponseEntity<List> getAllDevelopers() {
		try {
			return new ResponseEntity<>(developerService.getDeveloper(), HttpStatus.ACCEPTED);
		} catch (DataIntegrityViolationException e) {
			return new ResponseEntity<>(developerService.getDeveloper(), HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/addDeveloper")
	public ResponseEntity<DefaultResponse> addDeveloper(@RequestBody Developer developer) {
	
		DefaultResponse response=developerService.addDeveloper(developer);
		if (response.getStatus().equalsIgnoreCase("S")) {
			return new ResponseEntity<>(response, HttpStatus.CREATED);
		}else {
		
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/updateDeveloper")
	public ResponseEntity<DefaultResponse> updateDeveloper(@RequestBody Developer developer) {
		
		DefaultResponse response=developerService.updateDeveloper(developer);
		if (response.getStatus().equalsIgnoreCase("S")) {
			return new ResponseEntity<>(response, HttpStatus.CREATED);
		}else {
		
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/deleteDeveloper/{developerId}")
	public ResponseEntity<HttpStatus> deleteDeveloper(@PathVariable long developerId) {
		
	try {
		developerService.deleteDeveloper(developerId);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}catch (Exception e) {
        return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	}
}
