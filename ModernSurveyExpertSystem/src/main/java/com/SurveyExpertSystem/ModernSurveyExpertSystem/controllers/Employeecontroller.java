package com.SurveyExpertSystem.ModernSurveyExpertSystem.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SurveyExpertSystem.ModernSurveyExpertSystem.models.Employee;
import com.SurveyExpertSystem.ModernSurveyExpertSystem.services.employeeService;


@RestController
@RequestMapping("employee")
@CrossOrigin(origins = "*")
public class Employeecontroller {
private final employeeService EmployeeService;
	
	@Autowired
	public Employeecontroller(employeeService EmployeeService) {
		this.EmployeeService = EmployeeService;
	}
	
	@GetMapping("/all")
    public ResponseEntity<List<Employee>> allEmployees(){
		List<Employee> employees = EmployeeService.findAllEmployees();
		return new ResponseEntity<>(employees,HttpStatus.OK);
    	
    }
    
    @GetMapping("/find/{employeeId}")
    public ResponseEntity<Employee> fingEmployeeById(@PathVariable("employeeId") String employeeId ){
    	
    	Employee employee = EmployeeService.findEmployeeById(employeeId);
		return new ResponseEntity<>(employee,HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
    
    	Employee newemployee = EmployeeService.addEmployee(employee);
		return new ResponseEntity<>(newemployee,HttpStatus.CREATED);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Employee> updateOrSaveEmployee(@RequestBody Employee employee) {
    	
    	Employee updateemployee = EmployeeService.updateEmployee(employee);
		return new ResponseEntity<>(updateemployee,HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{employeeId}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("employeeId") String employeeId) {
    	
    	EmployeeService.deleteEmployee(employeeId);
		return new ResponseEntity<>(HttpStatus.OK);
    }
}
	
