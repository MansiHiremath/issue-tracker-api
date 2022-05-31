package com.deloitte.api.dao;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.deloitte.api.entities.Bug;


@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BugDaoTest {
@Mock
BugDao bugDao;

@Test
public void createBugTest() {
	Bug bug=new Bug(0,"Bug1","Data defect","May 23,2022","","critical","New");
	bugDao.save(bug);
	verify(bugDao, times(1)).save(bug);
}
@Test
public void GetallbugsTest() {
	 List<Bug> result=bugDao.findAll();
	 assertThat(result).isNotNull();
	
}
@Test
public void updatebugsTest() {
	Bug bug=new Bug(0,"Bug1","Data defect","May 23,2022","","critical","New");
	bugDao.save(bug);
	verify(bugDao, times(1)).save(bug);
}
	
@Test
public void deleteBugTest() {
	Long bugId=0L;
	bugDao.deleteById(bugId);
	verify(bugDao, times(1)).deleteById(bugId);
}
}



