package com.deloitte.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.deloitte.api.dao.DeveloperDao;
import com.deloitte.api.entities.Developer;

@Service
@Component
public class DeveloperServiceImpl implements DeveloperService {
	
	@Autowired
	public DeveloperDao developerDao;
	
	@Override
	public List<Developer> getDeveloper() {
		List<Developer> result = null;
		try {
			result = developerDao.findAll();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public Developer addDeveloper(Developer developer) {
		Developer result = null;
		try {
			developerDao.save(developer);
			return developer;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
