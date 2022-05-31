package com.deloitte.api.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.deloitte.api.dao.BugDao;
import com.deloitte.api.entities.Bug;
import com.deloitte.api.response.DefaultResponse;
import com.deloitte.api.services.BugService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BugServiceTest {
	@Mock
	BugService bugService;

	@Test
	public void createBugTest() {
		Bug bug=new Bug(0,"Bug1","Data defect","May 23,2022","","critical","New");
		bugService.createBug(bug);
		verify(bugService, times(1)).createBug(bug);

	}
	@Test
	public void GetallbugsTest() {
		
		bugService.getBug();
		verify(bugService, times(1)).getBug();
	}
	@Test
	public void updatebugsTest() {
		Bug bug=new Bug(0,"Bug1","Data defect","May 23,2022","","critical","New");
		bugService.updateBug(bug);
		verify(bugService, times(1)).updateBug(bug);
	}
	
	@Test
	public void deleteBugTest() {
		String bugId="0";
		bugService.deleteBug(bugId);
		verify(bugService, times(1)).deleteBug(bugId);
	}
	
}
