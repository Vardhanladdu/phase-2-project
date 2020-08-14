package com.admin.service.Impl;

import java.util.List;

import com.admin.DAO.TeacherDAO;
import com.admin.DAO.Impl.TeacherDAOImpl;
import com.admin.exception.BusinessException;
import com.admin.model.Teacher;
import com.admin.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {

	private TeacherDAO dao = new TeacherDAOImpl();

	@Override
	public Teacher createTeacher(Teacher teacher) {

		return dao.createTeacher(teacher);
	}

	@Override
	public Teacher getTeacherById(int teacherId) throws BusinessException {
		if (teacherId <= 0) {
			throw new BusinessException("The teacherId cannot be Zero or Negative. Please supply the right teacherId.");
		}
		Teacher teacher = dao.getTeacherById(teacherId);
		if (teacher == null) {
			throw new BusinessException(
					"The teacher with teacherId '" + teacherId + "' does not exist. Please supply the right teacherId");
		}
		return teacher;
	}

	@Override
	public List<Teacher> getAllTeachers() {

		return dao.getAllTeachers();
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {

		return dao.updateTeacher(teacher);
	}

	@Override
	public void removeTeacher(int teacherId) {

		dao.removeTeacher(teacherId);

	}

}
