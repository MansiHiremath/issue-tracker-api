package com.deloitte.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.deloitte.api.entities.Developer;
import com.deloitte.api.entities.Story;
import com.deloitte.api.response.DefaultResponse;

@Service
public interface DeveloperService {

	public List<Developer> getDeveloper();
	
	public DefaultResponse addDeveloper(Developer developer);
	
	public DefaultResponse updateDeveloper(Developer developer);

	public void deleteDeveloper(long developerId);

}
