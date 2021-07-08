package com.SurveyExpertSystem.ModernSurveyExpertSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SurveyExpertSystem.ModernSurveyExpertSystem.models.Questions;
import com.SurveyExpertSystem.ModernSurveyExpertSystem.repositories.questionsRepo;

@Service
public class questionsService {
	public questionsRepo questionRepo;
	public surveyService SurveyService;
	
	@Autowired
	public questionsService(questionsRepo questionRepo, surveyService SurveyService) {
		this.questionRepo = questionRepo;
		this.SurveyService = SurveyService;
	}
	
	public Questions addQuestion(String surveyId,Questions question) {
		question.setSurvey(SurveyService.findSurveyById(surveyId).orElse(null));
		return questionRepo.save(question);
	}
	
	public List<Questions> findQuestionsBySurveyId(String surveyId){
		return questionRepo.findBySurvey(SurveyService.findSurveyById(surveyId));
	}
	
	public Questions findQuestoinById(String questionId) {
		return questionRepo.findById(questionId).orElse(null);
	}
	
	public Questions updateQuestion(Questions question) {
		return questionRepo.save(question);
	}
	
	public void deleteQuestion(String questionId) {
		questionRepo.deleteById(questionId);
	}
}





