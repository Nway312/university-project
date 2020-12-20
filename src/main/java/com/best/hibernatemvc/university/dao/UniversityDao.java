package com.best.hibernatemvc.university.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.best.hibernatemvc.university.model.Department;
import com.best.hibernatemvc.university.model.Teacher;
@Repository
public class UniversityDao {
	@Autowired
	SessionFactory sessionFactory;
		public Session getSession() {
			return sessionFactory.getCurrentSession();
			
		}
		public void saveDepartment(Department department) {
			getSession().save(department);
		}
		public void  saveTeacher(Teacher teacher) {
			getSession().save(teacher);
		}
		
}
