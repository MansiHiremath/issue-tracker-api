package com.deloitte.issuetrackerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IssueTrackerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssueTrackerApiApplication.class, args);
		System.out.println("Hello");
	}

}
