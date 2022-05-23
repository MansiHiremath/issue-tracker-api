package com.deloitte.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.deloitte.api.entities.Developer;

@Service
public interface TrackerService {

	public List<Developer> getDeveloper();
	
	public Developer addDeveloper(Developer developer);
}
