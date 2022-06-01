package com.deloitte.api.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long planId;
	private String developerName;
	private String developerStatus;
	private String storyTitle;
	private String storyStatus;
	private String creationDate;
	public Plan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plan(long planId, String developerName, String developerStatus, String storyTitle, String storyStatus,
			String creationDate) {
		super();
		this.planId = planId;
		this.developerName = developerName;
		this.developerStatus = developerStatus;
		this.storyTitle = storyTitle;
		this.storyStatus = storyStatus;
		this.creationDate = creationDate;
	}
	public long getPlanId() {
		return planId;
	}
	public void setPlanId(long planId) {
		this.planId = planId;
	}
	public String getDeveloperName() {
		return developerName;
	}
	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}
	public String getDeveloperStatus() {
		return developerStatus;
	}
	public void setDeveloperStatus(String developerStatus) {
		this.developerStatus = developerStatus;
	}
	public String getStoryTitle() {
		return storyTitle;
	}
	public void setStoryTitle(String storyTitle) {
		this.storyTitle = storyTitle;
	}
	public String getStoryStatus() {
		return storyStatus;
	}
	public void setStoryStatus(String storyStatus) {
		this.storyStatus = storyStatus;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	
	
	
}
