package com.deloitte.api.services;

import java.util.List;

import com.deloitte.api.entities.Story;
import com.deloitte.api.response.DefaultResponse;

public interface StoryService {

	public List<Story> getStories();

	public DefaultResponse addStory(Story story);

	public DefaultResponse updateStory(Story story);

	public DefaultResponse deleteStory(String storyId); 

}
