package com.SurveyExpertSystem.ModernSurveyExpertSystem.repositories;

import com.SurveyExpertSystem.ModernSurveyExpertSystem.models.Employee;


import org.springframework.data.jpa.repository.JpaRepository;


public interface employeeRepo extends JpaRepository<Employee, String>{
//	Query Method here.
	
}
