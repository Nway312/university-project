package com.best.hibernatemvc.university.model;

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
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long student_id;
private String student_name;
private String rollno;
private String phno;
@OneToMany(mappedBy = "student",targetEntity=Exam.class, cascade = CascadeType.ALL)
private Set<Exam>exam;
@ManyToOne
@JoinColumn(name="grade_id")
private Grade grade;
public Student() {
	
}
public long getStudent_id() {
	return student_id;
}
public void setStudent_id(long student_id) {
	this.student_id = student_id;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
public String getRollno() {
	return rollno;
}
public void setRollno(String rollno) {
	this.rollno = rollno;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
public Set<Exam> getExam() {
	return exam;
}
public void setExam(Set<Exam> exam) {
	this.exam = exam;
}
public Student(String student_name, String rollno, String phno) {
	super();
	this.student_name = student_name;
	this.rollno = rollno;
	this.phno = phno;
}

}
