package com.deloitte.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.api.entities.Bug;
import com.deloitte.api.response.DefaultResponse;
import com.deloitte.api.services.BugService;

@RestController
@RequestMapping("/bugService")
public class BugController {
	/* @Author:Mansi */

	@Autowired
	BugService bugService;
	
	@PostMapping("/createBug")
	public ResponseEntity<DefaultResponse> createBug(@RequestBody Bug bug){
		DefaultResponse response=bugService.createBug(bug);
		if(response.getStatus().equalsIgnoreCase("S"))
			return new ResponseEntity<DefaultResponse>(response,HttpStatus.CREATED);
		else
			return new ResponseEntity<DefaultResponse>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@DeleteMapping("/deleteBug/{id}")
	public ResponseEntity<DefaultResponse> deleteBug(@PathVariable(value = "id") String bugId){
		DefaultResponse response=bugService.deleteBug(bugId);
		if(response.getStatus().equalsIgnoreCase("S"))
			return new ResponseEntity<DefaultResponse>(response,HttpStatus.OK);
		else
			return new ResponseEntity<DefaultResponse>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	
}
