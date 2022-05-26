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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.api.dao.StoryDao;
import com.deloitte.api.entities.Story;
import com.deloitte.api.response.DefaultResponse;
import com.deloitte.api.services.StoryService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/storyService")
public class StoryController {
	/*
	 * @Author:Rubi
	 * 
	 * @CreationDate:
	 * 
	 */
	@Autowired
	public StoryService storyService;
	
	@GetMapping("getAllStories")
	public ResponseEntity<List> getAllStories() {
		try {
			return new ResponseEntity<>(storyService.getStories(), HttpStatus.ACCEPTED);
		} catch (DataIntegrityViolationException e) {
			return new ResponseEntity<>(storyService.getStories(), HttpStatus.BAD_REQUEST);
		}
		
//		DefaultResponse response=storyService.getStories();
//		if (response.getStatus().equalsIgnoreCase("S")) {
//			return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
//		}else {
//		
//		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
	}

	@PostMapping("addStory")
	public ResponseEntity<DefaultResponse> addStory(@RequestBody Story story) {
		
		DefaultResponse response=storyService.addStory(story);
		if (response.getStatus().equalsIgnoreCase("S")) {
			return new ResponseEntity<>(response, HttpStatus.CREATED);
		}else {
		
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/updateStory")
	public ResponseEntity<DefaultResponse> updateStory(@RequestBody Story story) {
		
		DefaultResponse response=storyService.updateStory(story);
		if (response.getStatus().equalsIgnoreCase("S")) {
			return new ResponseEntity<>(response, HttpStatus.CREATED);
		}else {
		
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@DeleteMapping("/deleteStory/{storyId}")
	public ResponseEntity<DefaultResponse> deleteStory(@PathVariable String storyId) {
		DefaultResponse response=storyService.deleteStory(storyId);
		
		if(response.getStatus().equalsIgnoreCase("S"))
			return new ResponseEntity<DefaultResponse>(response,HttpStatus.OK);
		else
			return new ResponseEntity<DefaultResponse>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	   }

			
	
}
