package com.SurveyExpertSystem.ModernSurveyExpertSystem.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SurveyExpertSystem.ModernSurveyExpertSystem.models.Questions;
import com.SurveyExpertSystem.ModernSurveyExpertSystem.models.Survey;


public interface questionsRepo extends JpaRepository<Questions, String>{
	public List<Questions> findBySurvey(Optional<Survey> survey);
}
