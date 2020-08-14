package com.admin.service.Impl;

import java.util.List;

import com.admin.DAO.ClassesDAO;
import com.admin.DAO.Impl.ClassesDAOImpl;
import com.admin.exception.BusinessException;
import com.admin.model.Classes;
import com.admin.service.ClassesService;

public class ClassesServiceImpl implements ClassesService {

	private ClassesDAO dao = new ClassesDAOImpl();

	@Override
	public Classes createClasses(Classes classes) {

		return dao.createClasses(classes);

	}

	@Override
	public Classes getClassesById(int classId) throws BusinessException {

		if (classId <= 0) {
			throw new BusinessException("The classId cannot be Zero or Negative. Please supply the right classId.");
		}
		Classes classes = dao.getClassesById(classId);
		if (classes == null) {
			throw new BusinessException(
					"The class with classId '" + classId + "' does not exist. Please supply the right classId");
		}
		return classes;
	}

	@Override
	public List<Classes> getAllClasses() {

		return dao.getAllClasses();
	}

	@Override
	public Classes updateClasses(Classes classes) {

		return dao.updateClasses(classes);

	}

	@Override
	public void removeClasses(int classId) {

		dao.removeClasses(classId);

	}
}
