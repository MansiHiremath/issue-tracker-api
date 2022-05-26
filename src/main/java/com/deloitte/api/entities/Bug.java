package com.deloitte.api.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Bug {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long bugId;
	
	@NotBlank
	public String title;
	
	public String description;
	
	public String creationDate;
	
	public String assignedDeveloper;
	
	@NotNull(message = "cannot be null")
	public String priority;
	
	@NotNull
	public String status;
	
	public long getBugId() {
		return bugId;
	}
	public void setBugId(long bugId) {
		this.bugId = bugId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Bug(long bugId, @NotBlank String title, String description, String creationDate, String assignedDeveloper,
			@NotNull(message = "cannot be null") String priority, @NotNull String status) {
		super();
		this.bugId = bugId;
		this.title = title;
		this.description = description;
		this.creationDate = creationDate;
		this.assignedDeveloper = assignedDeveloper;
		this.priority = priority;
		this.status = status;
	}
	
	
	

}
