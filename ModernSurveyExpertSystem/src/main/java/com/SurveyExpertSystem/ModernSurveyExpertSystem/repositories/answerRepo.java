package com.SurveyExpertSystem.ModernSurveyExpertSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SurveyExpertSystem.ModernSurveyExpertSystem.models.Answers;

public interface answerRepo extends JpaRepository<Answers,String>{

}
