package com.SurveyExpertSystem.ModernSurveyExpertSystem.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answers {
	@Id
	private String answerId;
	private String value;
	
	public Answers() {
		super();
		}
	
	public Answers(String answerId, String value) {
		super();
		this.answerId = answerId;
		this.value = value;
	}
	public String getAnswerId() {
		return answerId;
	}
	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Answers [answerId=" + answerId + ", value=" + value + "]";
	}
	
}
