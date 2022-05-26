package com.deloitte.api.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class StoryControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void addStoryTest() {
		String jsonReq = "{\"storyId\":\"\",\"storyTitle\":\"\",\"storyDescription\":\"Story\",\"creationDate\":\"May 25,2022\",\"assignedDeveloper\":\"\",\"storyStatus\":\"critical\"}";
		try {
			mockMvc.perform(MockMvcRequestBuilders.post("/storyService/addStory")
					.accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON).content(jsonReq))
					.andDo(print()).andExpect(status().isCreated());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void updateStoryTest() {
		String jsonReq = "{\"storyId\":\"\",\"storyTitle\":\"\",\"storyDescription\":\"Story\",\"creationDate\":\"May 25,2022\",\"assignedDeveloper\":\"\",\"storyStatus\":\"critical\"}";
		try {
			mockMvc.perform(MockMvcRequestBuilders.post("/storyService/addStory")
					.accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON).content(jsonReq))
					.andDo(print()).andExpect(status().isCreated());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void deleteStoryTest() {
		try {
			mockMvc.perform(
					MockMvcRequestBuilders.delete("/storyService/deleteStory/{storyId}", "0"))
					.andExpect(status().isOk());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
