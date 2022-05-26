package com.deloitte.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.deloitte.api.dao.DeveloperDao;
import com.deloitte.api.entities.Developer;
import com.deloitte.api.response.DefaultResponse;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

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
	public DefaultResponse addDeveloper(Developer developer) {

		DefaultResponse response = new DefaultResponse();
		Developer developerObj = developerDao.save(developer);
		if (developerObj != null) {
			response.setStatus("Success");
			response.setErrorMsg("No Error");
		} else {
			response.setStatus("No");
			response.setErrorMsg("Error found");
		}
		return response;
	}

	@Override
	public DefaultResponse updateDeveloper(@RequestBody Developer developer) {

		DefaultResponse response = new DefaultResponse();
		Developer developerObj = developerDao.save(developer);
		if (developerObj != null) {
			response.setStatus("Success");
			response.setErrorMsg("No Error");
		} else {
			response.setStatus("No");
			response.setErrorMsg("Error found");
		}
		return response;
	}

	@Override
	public void deleteDeveloper(long developerId) {
		developerDao.deleteById(developerId);
	}

}
