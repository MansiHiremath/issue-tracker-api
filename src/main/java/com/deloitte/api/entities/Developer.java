package com.deloitte.api.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Developer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long developerId;
	private String developerName;
	private String developerStatus;
	
	public Developer(long developerId, String developerName, String developerStatus) {
		super();
		this.developerId = developerId;
		this.developerName = developerName;
		this.developerStatus = developerStatus;
	}

	public Developer() {
		super();
	}

	public long getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(long developerId) {
		this.developerId = developerId;
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
	

}
