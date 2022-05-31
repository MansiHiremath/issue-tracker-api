package com.deloitte.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.api.entities.Story;

@Repository
public interface StoryDao extends JpaRepository<Story, Long> {

}
