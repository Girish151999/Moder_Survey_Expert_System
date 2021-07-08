package com.SurveyExpertSystem.ModernSurveyExpertSystem.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Login {
	
	@Id
	private String loginId;
	private String email;
	
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Employee employee;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", email=" + email + ", password=" + password + ", employee=" + employee
				+ "]";
	}

	public Login(String loginId, String email, String password, Employee employee) {
		super();
		this.loginId = loginId;
		this.email = email;
		this.password = password;
		this.employee = employee;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
