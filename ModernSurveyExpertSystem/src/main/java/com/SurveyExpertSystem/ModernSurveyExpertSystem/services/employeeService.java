package com.SurveyExpertSystem.ModernSurveyExpertSystem.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SurveyExpertSystem.ModernSurveyExpertSystem.models.Employee;
import com.SurveyExpertSystem.ModernSurveyExpertSystem.repositories.employeeRepo;

@Service
public class employeeService {
	public final employeeRepo EmployeeRepo;
	private final loginService LoginService;
	
	@Autowired
	public employeeService(employeeRepo EmployeeRepo,loginService LoginService) {
		this.EmployeeRepo = EmployeeRepo;
		this.LoginService = LoginService;
	}
	
	public Employee addEmployee(Employee employee) {
    	LoginService.addAccount(employee);
		return EmployeeRepo.save(employee);
	}
	
	public List<Employee> findAllEmployees() {
		return EmployeeRepo.findAll();
	}
	
	public Employee findEmployeeById(String empId) {
		return EmployeeRepo.findById(empId).orElse(null);
	}
	
	public Employee updateEmployee(Employee employee) {
		LoginService.updateAccount(employee);
		return EmployeeRepo.save(employee);
	}
	
	public void deleteEmployee(String empId) {
		Employee employee = EmployeeRepo.findById(empId).orElse(null);
		LoginService.deleteAccount(employee);
		
	/* No need to explicitly delete the Employee. May be because of CASCADE  */
	//	employeeRepo.deleteById(empId);
	}
}
