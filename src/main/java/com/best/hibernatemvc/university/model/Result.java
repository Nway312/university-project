package com.best.hibernatemvc.university.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="result")
public class Result implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long result_id;
private String result_name;
private int totalmark;
@OneToOne
@JoinColumn(name="answer_id")
private Answer answer;
public Result() {
	
}

public long getResult_id() {
	return result_id;
}

public void setResult_id(long result_id) {
	this.result_id = result_id;
}

public String getResult_name() {
	return result_name;
}

public void setResult_name(String result_name) {
	this.result_name = result_name;
}

public int getTotalmark() {
	return totalmark;
}

public void setTotalmark(int totalmark) {
	this.totalmark = totalmark;
}

public Answer getAnswer() {
	return answer;
}

public void setAnswer(Answer answer) {
	this.answer = answer;
}


}
