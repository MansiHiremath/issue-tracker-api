package com.deloitte.api.services;

import com.deloitte.api.entities.Bug;
import com.deloitte.api.response.DefaultResponse;

public interface BugService {

	DefaultResponse createBug(Bug bug);

	DefaultResponse deleteBug(String bugId);

}
