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
@Table(name="teacher")
public class Teacher implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long teacher_id;
private String teacher_name;
@ManyToOne
@JoinColumn(name="department_id")
private Department department;
@OneToMany(mappedBy = "teacher",targetEntity=Exam.class, cascade = CascadeType.ALL)
private Set<Exam>exam;
@OneToMany(mappedBy = "teacher",targetEntity=Grade.class, cascade = CascadeType.ALL)
private Set<Grade>grade;
public Teacher() {
	
}
public long getTeacher_id() {
	return teacher_id;
}
public void setTeacher_id(long teacher_id) {
	this.teacher_id = teacher_id;
}
public String getTeacher_name() {
	return teacher_name;
}
public void setTeacher_name(String teacher_name) {
	this.teacher_name = teacher_name;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
public Teacher(String teacher_name) {
	super();
	this.teacher_name = teacher_name;
}
public Set<Exam> getExam() {
	return exam;
}
public void setExam(Set<Exam> exam) {
	this.exam = exam;
}
public Set<Grade> getGrade() {
	return grade;
}
public void setGrade(Set<Grade> grade) {
	this.grade = grade;
}


}
