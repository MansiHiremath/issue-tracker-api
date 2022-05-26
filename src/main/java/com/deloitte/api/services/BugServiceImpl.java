package com.deloitte.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.api.dao.BugDao;
import com.deloitte.api.entities.Bug;
import com.deloitte.api.response.DefaultResponse;

@Service
public class BugServiceImpl implements BugService {
	@Autowired
	BugDao bugDao;

//	@Autowired
//	DefaultResponse response;

	@Override
	public Bug getBugById(int id) {
		return bugDao.findById((long) id).orElse(null);
	
	}
	@Override
	public List<Bug> getBug() {
		return bugDao.findAll();
	}
	@Override
	public Bug updateBug(Bug bug) {
		DefaultResponse response=new DefaultResponse();
		Bug oldBug=null;
		Optional<Bug> optionalbug=bugDao.findById(bug.getBugId());
		if(optionalbug.isPresent()) {
			bugDao.save(bug);
			response.setStatus("S");
		}else {
			response.setStatus("E");
			response.setErrorMsg("Data Not Found for updation");
		}
		return oldBug;
		
		
	}

	@Override
	public DefaultResponse createBug(Bug bug) {
		DefaultResponse response = new DefaultResponse();
		Bug bugObj = bugDao.save(bug);
		if (bugObj != null) {
			response.setStatus("S");
		} else
			response.setStatus("E");
		return response;
	}

	@Override
	public DefaultResponse deleteBug(String bugId) {
		DefaultResponse response = new DefaultResponse();
		try {
			bugDao.deleteById(Long.parseLong(bugId));
			response.setStatus("S");
		} catch (Exception e) {
			response.setStatus("E");
			response.setErrorMsg("Issue while deleting data");
		}
		return response;
	}

}
