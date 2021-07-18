package com.SurveyExpertSystem.ModernSurveyExpertSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SurveyExpertSystem.ModernSurveyExpertSystem.models.Employee;
import com.SurveyExpertSystem.ModernSurveyExpertSystem.models.Login;
import com.SurveyExpertSystem.ModernSurveyExpertSystem.services.employeeService;
import com.SurveyExpertSystem.ModernSurveyExpertSystem.services.loginService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

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
	
	@PutMapping("/changePass")
	public void changePassword (@RequestBody String details) {
		ObjectMapper jacksonObjMapper = new ObjectMapper();
		try {
			JsonNode jsonNode =jacksonObjMapper.readTree(details);
			login.updatePassword(jsonNode.get("email").asText(),
					jsonNode.get("password").asText(),jsonNode.get("newPassword").asText());
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
