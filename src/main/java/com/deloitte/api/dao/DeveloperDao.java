package com.deloitte.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.deloitte.api.entities.Developer;

@Repository
public interface DeveloperDao extends JpaRepository<Developer, Long>  {
	
	@Query(value="Select * from Developer where developer_status=:status", nativeQuery = true)
	public Developer getStatusByValue(@Param("status") String developerStatus);
	

}
