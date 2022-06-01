package com.deloitte.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.deloitte.api.entities.Developer;
import com.deloitte.api.entities.Story;

@Repository
public interface StoryDao extends JpaRepository<Story, Long> {
	
	@Query(value="Select * from Story where story_status=:status", nativeQuery = true)
	public Story getStoryStatusByValue(@Param("status") String storyStatus);
	


}
