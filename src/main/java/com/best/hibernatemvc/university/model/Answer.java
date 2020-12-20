package com.best.hibernatemvc.university.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="answer")
public class Answer implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long answer_id;
	private String answer_name;
	private boolean status;
	@ManyToOne
	@JoinColumn(name="question_id")
	private Question question;
	@OneToOne(mappedBy="answer",cascade=CascadeType.ALL)
	private Result result;
	public Answer() {
		
	}
	
	public long getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(long answer_id) {
		this.answer_id = answer_id;
	}
	public String getAnswer_name() {
		return answer_name;
	}
	public void setAnswer_name(String answer_name) {
		this.answer_name = answer_name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Answer(String answer_name, boolean status) {
		super();
		this.answer_name = answer_name;
		this.status = status;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	
	
	
}
