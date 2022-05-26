package com.deloitte.api.services;


import java.util.List;

import com.deloitte.api.entities.Bug;
import com.deloitte.api.response.DefaultResponse;

public interface BugService {

	DefaultResponse createBug(Bug bug);

	DefaultResponse deleteBug(String bugId);

	Bug getBugById(int id);

	List<Bug> getBug();

	Bug updateBug(Bug bug);

}
