package com.admin.DAO;

import java.util.List;

import com.admin.model.Classes;

public interface ClassesDAO {

//	//CRUD methods for Classes
	public Classes createClasses(Classes classes);

	public Classes getClassesById(int classId);

	public List<Classes> getAllClasses();

	public Classes updateClasses(Classes classes);

	public void removeClasses(int classId);
}
