package com.SurveyExpertSystem.ModernSurveyExpertSystem.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SurveyExpertSystem.ModernSurveyExpertSystem.models.Survey;
import com.SurveyExpertSystem.ModernSurveyExpertSystem.services.surveyService;

@RestController
@RequestMapping("survey")
public class Surveycontroller {
	private final surveyService SurveyService;

	@Autowired
    public Surveycontroller(surveyService SurveyService) {
        this.SurveyService = SurveyService;
    }
	
    @GetMapping("/admin/surveys")
    public List<Survey> allSurveys(){
    	return SurveyService.findAllSurveys();
    }
    
    @GetMapping("/employee/{employeeId}")
    public List<Survey> fingSurveyByEmployeeId(@PathVariable("employeeId") String employeeId ){
    	return SurveyService.findSurveyByEmployeeId(employeeId);
    }
    
    @GetMapping("/{surveyId}")
    public Optional<Survey> fingSurveyBySurveyId(@PathVariable("surveyId") String surveyId){
    	return SurveyService.findSurveyById(surveyId);
    }
    
    @PostMapping("/create")
    public Survey createSurvey(@RequestBody Survey survey) {
    	return SurveyService.addSurvey(survey);
    }
    
    @PutMapping("/edit")
    public Survey updateOrSaveSurvey(@RequestBody Survey survey) {
    	return SurveyService.addSurvey(survey);
    }
    
    @DeleteMapping("/delete/{surveyId}")
    public void deleteSurvey(@PathVariable("surveyId") String surveyId) {
    	SurveyService.deleteSurvey(surveyId);
    }
}
