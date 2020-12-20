package com.best.hibernatemvc.university.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="examtype")
public class Examtype implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long examtype_id;
private String exam_name;
@ManyToOne
@JoinColumn(name="exam_id")
private Exam exam;
public Examtype() {
	
}
public long getExamtype_id() {
	return examtype_id;
}
public void setExamtype_id(long examtype_id) {
	this.examtype_id = examtype_id;
}
public String getExam_name() {
	return exam_name;
}
public void setExam_name(String exam_name) {
	this.exam_name = exam_name;
}
public Exam getExam() {
	return exam;
}
public void setExam(Exam exam) {
	this.exam = exam;
}
public Examtype(String exam_name) {
	super();
	this.exam_name = exam_name;
}

}
