package com.deloitte.api.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Story {
	@Id
	private long storyId;
	private String storyTitle;
	private String storyDescription;
	private String creationDate;
	private String assignedDeveloper;
	private String storyStatus;
	public Story() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Story(long storyId, String storyTitle, String storyDescription, String creationDate,
			String assignedDeveloper, String storyStatus) {
		super();
		this.storyId = storyId;
		this.storyTitle = storyTitle;
		this.storyDescription = storyDescription;
		this.creationDate = creationDate;
		this.assignedDeveloper = assignedDeveloper;
		this.storyStatus = storyStatus;
	}
	public long getStoryId() {
		return storyId;
	}
	public void setStoryId(long storyId) {
		this.storyId = storyId;
	}
	public String getStoryTitle() {
		return storyTitle;
	}
	public void setStoryTitle(String storyTitle) {
		this.storyTitle = storyTitle;
	}
	public String getStoryDescription() {
		return storyDescription;
	}
	public void setStoryDescription(String storyDescription) {
		this.storyDescription = storyDescription;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getAssignedDeveloper() {
		return assignedDeveloper;
	}
	public void setAssignedDeveloper(String assignedDeveloper) {
		this.assignedDeveloper = assignedDeveloper;
	}
	public String getStoryStatus() {
		return storyStatus;
	}
	public void setStoryStatus(String storyStatus) {
		this.storyStatus = storyStatus;
	}
	
	
}
		