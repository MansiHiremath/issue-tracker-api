package com.deloitte.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.api.dao.StoryDao;
import com.deloitte.api.entities.Story;
import com.deloitte.api.response.DefaultResponse;

@Service
public class StoryServiceImpl implements StoryService {

	@Autowired
	public StoryDao storyDao;

	@Override
	public List<Story> getStories() {
		List<Story> result = null;
		try {
			result = storyDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public DefaultResponse addStory(Story story) {
	
		DefaultResponse response=new DefaultResponse();
		Story storyObj=storyDao.save(story);
		if(storyObj!=null) {
			response.setStatus("Success");
			response.setErrorMsg("No Error");
		}else {
			response.setStatus("No");
			response.setErrorMsg("Error found");
		}
		return response;
	}

	@Override
	public DefaultResponse updateStory(Story story) {
		DefaultResponse response=new DefaultResponse();
		Story storyObj=storyDao.save(story);
		if(storyObj!=null) {
			response.setStatus("Success");
			response.setErrorMsg("No Error");
		}else {
			response.setStatus("No");
			response.setErrorMsg("Error found");
		}
		return response;
	}

	@Override
	public DefaultResponse deleteStory(String storyId) {
//    	   storyDao.deleteById(storyId);
    	   
    	   DefaultResponse response = new DefaultResponse();
   		try {
   			storyDao.deleteById(Long.parseLong(storyId));
   			response.setStatus("S");
   		} catch (Exception e) {
   			response.setStatus("E");
   			response.setErrorMsg("Issue while deleting data");
   		}
   		return response;
	}

}
