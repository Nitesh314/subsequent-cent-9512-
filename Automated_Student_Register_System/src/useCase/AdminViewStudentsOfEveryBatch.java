package useCase;

import dao.dao;
import dao.daoImpl;

public class AdminViewStudentsOfEveryBatch {
	public AdminViewStudentsOfEveryBatch() {
		dao daoObj = new daoImpl();
		daoObj.adminViewStudentsOfEveryBatch();

	}
}
