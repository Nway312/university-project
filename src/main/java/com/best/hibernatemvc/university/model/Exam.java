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
@Table(name="exam")
public class Exam implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long exam_id;
private String exam_name;
@ManyToOne
@JoinColumn(name="teacher_id")
private Teacher teacher;
@OneToMany(mappedBy = "exam",targetEntity=Examtype.class, cascade = CascadeType.ALL)
private Set<Examtype>examtype;
@ManyToOne
@JoinColumn(name="student_id")
private Student student;
@OneToMany(mappedBy = "exams",targetEntity=Question.class, cascade = CascadeType.ALL)
private Set<Question>question;
public Exam() {
	
}
public long getExam_id() {
	return exam_id;
}
public void setExam_id(long exam_id) {
	this.exam_id = exam_id;
}
public String getExam_name() {
	return exam_name;
}
public void setExam_name(String exam_name) {
	this.exam_name = exam_name;
}
public Teacher getTeacher() {
	return teacher;
}
public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}
public Exam(String exam_name) {
	super();
	this.exam_name = exam_name;
}
public Set<Examtype> getExamtype() {
	return examtype;
}
public void setExamtype(Set<Examtype> examtype) {
	this.examtype = examtype;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
public Set<Question> getQuestion() {
	return question;
}
public void setQuestion(Set<Question> question) {
	this.question = question;
}

}
