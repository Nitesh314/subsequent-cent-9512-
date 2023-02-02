package useCase;

import dao.dao;
import dao.daoImpl;

public class AdminAllocateStudentsInaBatchUnderaCourse {
	public AdminAllocateStudentsInaBatchUnderaCourse() {
		dao daoObj = new daoImpl();
		daoObj.adminAllocateStudentsInaBatchUnderaCourse();

	}
}
