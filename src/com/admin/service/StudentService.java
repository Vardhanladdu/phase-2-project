package com.admin.service;

import java.util.List;

import com.admin.exception.BusinessException;
import com.admin.model.Student;

public interface StudentService {


	//CRUD methods for Student
		public Student createStudent(Student student);
		public Student getStudentById(int studentId) throws BusinessException;
		public List<Student> getAllStudents();
		public Student updateStudent(Student student);
		public void removeStudent(int studentId);
	
}
