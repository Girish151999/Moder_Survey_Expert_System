package com.SurveyExpertSystem.ModernSurveyExpertSystem.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Survey {
	@Id
	private String surveyId;
	private String type;
	private String title;
	private String description;
	private Date startDate;
	private Date endDate;
	
	@ManyToOne
	private Employee employee;
	
	@OneToMany(mappedBy = "survey")
	private List<Questions> questions;

	@Override
	public String toString() {
		return "Survey [surveyId=" + surveyId + ", type=" + type + ", title=" + title + ", description=" + description
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", employee=" + employee + "]";
	}
	
	public Survey(String surveyId, String type, String title, String description, Date startDate, Date endDate,
			Employee employee) {
		super();
		this.surveyId = surveyId;
		this.type = type;
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.employee = employee;
	}
	
	public Survey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(String surveyId) {
		this.surveyId = surveyId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
