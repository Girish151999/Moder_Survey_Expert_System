package com.SurveyExpertSystem.ModernSurveyExpertSystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SurveyExpertSystem.ModernSurveyExpertSystem.models.Survey;

public interface surveyRepo extends JpaRepository<Survey, String>  {
	@Query("from Survey where employee = (from Employee where empId = ?1) ")
	public List<Survey> findSurveyByEmployeeId(String employeeId);
}
