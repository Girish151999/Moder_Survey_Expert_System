package com.SurveyExpertSystem.ModernSurveyExpertSystem.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Employee")
public class Employee implements Serializable{
	@Id

//	@GeneratedValue
//	@Column(name = "Emp_Id",
//			updatable = false)
	private String empId;
	
//	@Column(name = "Name",
//			nullable = false,
//			columnDefinition = "TEXT",
//			unique = true)
	private String name;
	
//	@Column(name = "Email",
//			nullable = false,
//			columnDefinition = "TEXT")
	private String email;
	
//	@Column(name = "Mobile",
//			nullable = false)
	private String mobile;
	
//	@Column(name = "Address",
//			columnDefinition = "TEXT")
	private String address;
	
	
	@ManyToOne
	private Role role;
	
	@OneToOne(mappedBy = "employee")
	private Login login;
	
	@OneToMany(mappedBy = "employee")
	private List<Survey> surveys;
	
	@OneToMany(mappedBy = "employee")
	private List<Response> responses;
	
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", address="
				+ address + ", role=" + role + "]";
	}

	public Employee(String empId, String name, String email, String mobile, String address, Role role) {
		super();
		this.empId = empId;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.role = role;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
