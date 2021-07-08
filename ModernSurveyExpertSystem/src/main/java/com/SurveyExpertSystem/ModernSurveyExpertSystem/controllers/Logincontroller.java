package com.SurveyExpertSystem.ModernSurveyExpertSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SurveyExpertSystem.ModernSurveyExpertSystem.models.Employee;
import com.SurveyExpertSystem.ModernSurveyExpertSystem.models.Login;
import com.SurveyExpertSystem.ModernSurveyExpertSystem.services.employeeService;
import com.SurveyExpertSystem.ModernSurveyExpertSystem.services.loginService;

@RestController
@RequestMapping("employee")
@CrossOrigin(origins = "*")
public class Logincontroller {
//	private final loginService = LoginService;
	private final loginService login;
	private final employeeService emp;
	
	@Autowired
	public Logincontroller (loginService login, employeeService emp) {
		this.emp = emp;
		this.login = login;
	}
	
	@GetMapping("/login")
	public Employee userVerify(@RequestBody Login details){
		return login.userLogin(details);
	}
}
