package com.SurveyExpertSystem.ModernSurveyExpertSystem.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.SurveyExpertSystem.ModernSurveyExpertSystem.models.Employee;
import com.SurveyExpertSystem.ModernSurveyExpertSystem.models.Login;

public interface loginRepo extends JpaRepository<Login, String> {

	public Login findByEmployee(Employee employee);
	public Login findByEmail(String email);
}
