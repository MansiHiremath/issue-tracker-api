package com.deloitte.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.deloitte.api.entities.Developer;
import com.deloitte.api.entities.Plan;

@Repository
public interface PlanDao extends JpaRepository<Plan, Long>{


}
