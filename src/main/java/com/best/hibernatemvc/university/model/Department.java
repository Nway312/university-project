package com.best.hibernatemvc.university.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="department")
public class Department implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long department_id;
private String department_name;
@OneToMany(mappedBy = "department",targetEntity=Teacher.class, cascade = CascadeType.ALL)
private Set<Teacher>teacher;
public Department() {
	
}
public long getDepartment_id() {
	return department_id;
}
public void setDepartment_id(long department_id) {
	this.department_id = department_id;
}
public String getDepartment_name() {
	return department_name;
}
public void setDepartment_name(String department_name) {
	this.department_name = department_name;
}
public Set<Teacher> getTeacher() {
	return teacher;
}
public void setTeacher(Set<Teacher> teacher) {
	this.teacher = teacher;
}
public Department(String department_name) {
	super();
	this.department_name = department_name;
}

}
