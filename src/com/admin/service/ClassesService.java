package com.admin.service;

import java.util.List;

import com.admin.exception.BusinessException;
import com.admin.model.Classes;

public interface ClassesService {
	
	//CRUD methods for Classes
	public Classes createClasses(Classes classes);
	public Classes getClassesById(int classId) throws BusinessException;
	public List<Classes> getAllClasses();
	public Classes updateClasses (Classes classes);
	public void removeClasses(int classId);

}
