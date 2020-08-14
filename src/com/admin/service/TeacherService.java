package com.admin.service;

import java.util.List;

import com.admin.exception.BusinessException;
import com.admin.model.Teacher;

public interface TeacherService {

	// CRUD methods for Teacher
	public Teacher createTeacher(Teacher teacher);

	public Teacher getTeacherById(int teacherId) throws BusinessException;

	public List<Teacher> getAllTeachers();

	public Teacher updateTeacher(Teacher teacher);

	public void removeTeacher(int teacherId);
}
