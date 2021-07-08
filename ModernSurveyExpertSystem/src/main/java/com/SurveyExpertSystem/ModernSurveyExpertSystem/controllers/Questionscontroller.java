package com.SurveyExpertSystem.ModernSurveyExpertSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SurveyExpertSystem.ModernSurveyExpertSystem.models.Questions;
import com.SurveyExpertSystem.ModernSurveyExpertSystem.services.questionsService;

import java.util.List;


@RestController
@RequestMapping("/questions")
public class Questionscontroller {
private final questionsService questionService;
	
	@Autowired
	public Questionscontroller(questionsService questionService) {
		this.questionService = questionService;
	}
	
	@GetMapping("/survey/{surveyId}/view")
    public List<Questions> findQuestionsBySurveyId(@PathVariable("surveyId") String surveyId){
    	return questionService.findQuestionsBySurveyId(surveyId);
    }
	
	@PostMapping("/survey/{surveyId}/add-question")
	public Questions addQuestion(@PathVariable("surveyId") String surveyId, @RequestBody Questions question){
    	return questionService.addQuestion(surveyId, question);
    }
	
	@PutMapping("/survey/{surveyId}/edit-question")
	public Questions editQuestion(@RequestBody Questions question){
    	return questionService.updateQuestion(question);
    }
	
	@DeleteMapping("/survey/{surveyId}/delete-question/{quesId}")
	public void deleteQuestion(String quesId){
		questionService.deleteQuestion(quesId);
    }
}










