package com.deloitte.api.service;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.deloitte.api.entities.Bug;
import com.deloitte.api.entities.Story;
import com.deloitte.api.services.StoryService;


@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class StoryServiceTest {
	@Mock
	StoryService storyService;
	
	@Test
	public void getAllStoriesTest() {
		storyService.getStories();
		verify(storyService, times(1)).getStories();
	}
	

	@Test
	public void addStoryTest() {
		Story story=new Story(0,"Story1","Data defect","May 25,2022","","critical");
		storyService.addStory(story);
		verify(storyService, times(1)).addStory(story);

	}
	
	@Test
	public void updateStoryTest() {
		Story story=new Story(0,"Story1","Data defect","May 25,2022","","critical");
		storyService.addStory(story);
		verify(storyService, times(1)).addStory(story);
	}
	
	@Test
	public void deleteStoryTest() {
		String storyId="0";
		storyService.deleteStory(storyId);
		verify(storyService, times(1)).deleteStory(storyId);
	}

}
