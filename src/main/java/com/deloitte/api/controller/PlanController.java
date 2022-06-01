package com.deloitte.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.api.entities.Plan;
import com.deloitte.api.entities.Story;
import com.deloitte.api.services.PlanService;

@RestController
@RequestMapping("/planService")
public class PlanController {
	@Autowired
	public PlanService planService;
	
	@GetMapping("/getPlan")
	public Plan getPlan() {
		return planService.getPlan();
	}

}
