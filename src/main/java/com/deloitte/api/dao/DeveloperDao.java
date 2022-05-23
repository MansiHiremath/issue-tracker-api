package com.deloitte.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.api.entities.Developer;

@Repository
public interface DeveloperDao extends JpaRepository<Developer, Long>  {

}
