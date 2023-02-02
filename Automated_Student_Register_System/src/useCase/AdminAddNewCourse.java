package useCase;

import dao.dao;
import dao.daoImpl;

public class AdminAddNewCourse {

	public AdminAddNewCourse() {
		dao daoObj = new daoImpl();
		daoObj.adminAddNewCourse();
	}
	
}
