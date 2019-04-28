package com.revature.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.models.Cohort;
import com.revature.models.User;

@Service
public interface CohortService {

	List<Cohort> findByTrainer(int trainerId);

	Cohort save(Cohort cohort);

	List<Cohort> findAll();
	
	String joinCohort(User user, String cohortToken) ;
	
	public String disjoinCohort(User user, String cohortToken);

	String addCotrainer(String email, String cohortToken);

	String removeCotrainer(String cohortToken);

	Cohort saveById(int id, Cohort cohort);

	Cohort update(Cohort cohort);
  
}
