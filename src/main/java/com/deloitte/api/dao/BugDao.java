package com.deloitte.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.api.entities.Bug;

@Repository
public interface BugDao extends JpaRepository<Bug, Long>{

}
