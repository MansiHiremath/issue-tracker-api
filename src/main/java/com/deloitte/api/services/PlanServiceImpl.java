package com.deloitte.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.api.dao.DeveloperDao;
import com.deloitte.api.dao.PlanDao;
import com.deloitte.api.dao.StoryDao;
import com.deloitte.api.entities.Developer;
import com.deloitte.api.entities.Plan;
import com.deloitte.api.entities.Story;
import com.deloitte.api.response.DefaultResponse;

@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	public PlanDao planDao;
	
	@Autowired
	public DeveloperDao developerDao;
	
	@Autowired
	public StoryDao storyDao;
	@Override
	public Plan getPlan() {

		Developer d=developerDao.getStatusByValue("Unavailable");
		Story s=storyDao.getStoryStatusByValue("critical");
		Plan p=new Plan(1,d.getDeveloperName(), d.getDeveloperStatus(),s.getStoryTitle(),s.getStoryStatus(),s.getCreationDate());
		Plan result = planDao.save(p);
		
		
		return result;
	}

}
