package com.SurveyExpertSystem.ModernSurveyExpertSystem.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Response {
	@Id
	private String responseId;
	private String answer;
	
	@ManyToOne
	private Employee employee;
	
	@ManyToOne
	private Questions question;

	
	@Override
	public String toString() {
		return "Response [responseId=" + responseId + ", answer=" + answer + ", employee=" + employee + ", question="
				+ question + "]";
	}

	public Response(String responseId, String answer, Employee employee, Questions question) {
		super();
		this.responseId = responseId;
		this.answer = answer;
		this.employee = employee;
		this.question = question;
	}

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getResponseId() {
		return responseId;
	}

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Questions getQuestion() {
		return question;
	}

	public void setQuestion(Questions question) {
		this.question = question;
	}
}
