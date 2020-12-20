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
@Table(name="grade")
public class Grade implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long grade_id;
private String grade_name;
@ManyToOne
@JoinColumn(name="teacher_id")
private Teacher teacher;
@OneToMany(mappedBy = "grade",targetEntity=Student.class, cascade = CascadeType.ALL)
private Set<Student>student;
public Grade() {
	
}
public long getGrade_id() {
	return grade_id;
}
public void setGrade_id(long grade_id) {
	this.grade_id = grade_id;
}
public String getGrade_name() {
	return grade_name;
}
public void setGrade_name(String grade_name) {
	this.grade_name = grade_name;
}
public Teacher getTeacher() {
	return teacher;
}
public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}
public Set<Student> getStudent() {
	return student;
}
public void setStudent(Set<Student> student) {
	this.student = student;
}
public Grade(String grade_name) {
	super();
	this.grade_name = grade_name;
}

}
