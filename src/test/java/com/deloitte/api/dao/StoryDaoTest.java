package com.deloitte.api.dao;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.deloitte.api.entities.Bug;
import com.deloitte.api.entities.Story;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class StoryDaoTest {
	@Mock
	StoryDao storyDao;
	
	@Test
	public void getAllStoriesTest() {
		List<Story> result= storyDao.findAll();
		assertThat(result).isNotNull();
	}

	@Test
	public void addStoryTest() {
		Story story = new Story(0, "Story1", "Data defect", "May 25,2022", "", "critical");
		storyDao.save(story);
		verify(storyDao, times(1)).save(story);
	}
	
	@Test
	public void updateStoryTest() {
		Story story = new Story(0, "Story1", "Data defect", "May 25,2022", "", "critical");
		storyDao.save(story);
		verify(storyDao, times(1)).save(story);
	}

	@Test
	public void deleteStoryTest() {
		Long storyId = 0L;
		storyDao.deleteById(storyId);
		verify(storyDao, times(1)).deleteById(storyId);
	}

}
