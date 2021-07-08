package com.SurveyExpertSystem.ModernSurveyExpertSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SurveyExpertSystem.ModernSurveyExpertSystem.models.Survey;
import com.SurveyExpertSystem.ModernSurveyExpertSystem.repositories.surveyRepo;

@Service
public class surveyService {
public surveyRepo SurveyRepo;
	
	@Autowired
	public surveyService(surveyRepo SurveyRepo) {
		this.SurveyRepo = SurveyRepo;
	}
	
	public Survey addSurvey(Survey survey) {
		return SurveyRepo.save(survey);
	}
	
	public List<Survey> findAllSurveys(){
		return SurveyRepo.findAll();
	}
	
	public Optional<Survey> findSurveyById(String surveyId) {
		return SurveyRepo.findById(surveyId);
	}
	
	public List<Survey> findSurveyByEmployeeId(String employeeId) {
		return SurveyRepo.findSurveyByEmployeeId(employeeId);
	}
	
	public Survey updateSurvey(Survey survey) {
		return SurveyRepo.save(survey);
	}
	
	public void deleteSurvey(String surveyId) {
		SurveyRepo.deleteById(surveyId);
	}
}
