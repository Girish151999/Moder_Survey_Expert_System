package com.SurveyExpertSystem.ModernSurveyExpertSystem.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SurveyExpertSystem.ModernSurveyExpertSystem.exception.UserNotFound;
import com.SurveyExpertSystem.ModernSurveyExpertSystem.models.Employee;
import com.SurveyExpertSystem.ModernSurveyExpertSystem.models.Login;
import com.SurveyExpertSystem.ModernSurveyExpertSystem.repositories.loginRepo;

@Service
public class loginService {
	public final loginRepo LoginRepo;
	public Login account = new Login();
	
	@Autowired
	public loginService(loginRepo LoginRepo) {
		this.LoginRepo = LoginRepo;
	}
	
	public void addAccount(Employee employee) {
		account.setLoginId(UUID.randomUUID().toString());
    	account.setEmail(employee.getEmail());
    	account.setPassword("abc@123");
    	account.setEmployee(employee);
		LoginRepo.save(account);
	}
	
//	public Login findAccountById(String loginId) {
//		return loginRepo.findById(loginId).orElse(null);
//	}
	
	public Employee userLogin(Login details) throws UserNotFound {
		Login temp = LoginRepo.findByEmail(details.getEmail());
		System.out.println(temp);
		if( temp!=null &&details.getPassword().equals(temp.getPassword())) {
			return temp.getEmployee();
		}
		else if(temp!=null) {
			throw new UserNotFound("Invalid credentials");
		}
		else {
			throw new UserNotFound("User not in database");
		}
		
	}
	
	public void updateAccount(Employee employee) {
		account = LoginRepo.findByEmployee(employee);
    	account.setEmail(employee.getEmail());
		LoginRepo.save(account);
	}
	
	public void deleteAccount(Employee employee) {
		account = LoginRepo.findByEmployee(employee);
		LoginRepo.delete(account);
	}
	
}
