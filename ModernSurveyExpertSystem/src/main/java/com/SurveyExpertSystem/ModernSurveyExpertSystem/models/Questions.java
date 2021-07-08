package com.SurveyExpertSystem.ModernSurveyExpertSystem.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Questions {
	@Id
	private String questionId;
	private String statement;
	private String answerType;
	private String options;
	private String required;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Survey survey;
	
	@OneToMany(mappedBy = "question")
	private List<Response> responses;
	

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", statement=" + statement + ", answerType=" + answerType
				+ ", options=" + options + ", required=" + required + ", survey=" + survey + "]";
	}

	public Questions(String questionId, String statement, String answerType, String options, String required,
			Survey survey) {
		super();
		this.questionId = questionId;
		this.statement = statement;
		this.answerType = answerType;
		this.options = options;
		this.required = required;
		this.survey = survey;
	}

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String getAnswerType() {
		return answerType;
	}

	public void setAnswerType(String answerType) {
		this.answerType = answerType;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public String getRequired() {
		return required;
	}

	public void setRequired(String required) {
		this.required = required;
	}

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}
	
}





