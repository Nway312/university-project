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
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Question implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long question_id;
private String question_name;
private Integer mark;
@ManyToOne
@JoinColumn(name="exam_id")
private Exam exams;
@OneToMany(mappedBy = "question",targetEntity=Answer.class, cascade = CascadeType.ALL)
private Set<Answer>answer;
public Question() {
	
}
public long getQuestion_id() {
	return question_id;
}
public void setQuestion_id(long question_id) {
	this.question_id = question_id;
}
public String getQuestion_name() {
	return question_name;
}
public void setQuestion_name(String question_name) {
	this.question_name = question_name;
}
public Integer getMark() {
	return mark;
}
public void setMark(Integer mark) {
	this.mark = mark;
}


public Exam getExams() {
	return exams;
}
public void setExams(Exam exams) {
	this.exams = exams;
}
public Question(String question_name, Integer mark) {
	super();
	this.question_name = question_name;
	this.mark = mark;
}

}
