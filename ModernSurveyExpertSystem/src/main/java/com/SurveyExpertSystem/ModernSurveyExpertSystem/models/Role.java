package com.SurveyExpertSystem.ModernSurveyExpertSystem.models;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Role {

	@Id
	private String roleId;
	private String description;
	
	@JsonIgnore
	@OneToMany(mappedBy = "role")
	private List<Employee> employee;

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Role(String roleId, String description) {
		super();
		this.roleId = roleId;
		this.description = description;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", description=" + description + "]";
	}
	
	
	
	
}