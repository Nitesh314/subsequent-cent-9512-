package useCase;

import dao.dao;
import dao.daoImpl;

public class AdminUpdateTotalSeatsOfaBatch {
	public AdminUpdateTotalSeatsOfaBatch() {
		dao daoObj = new daoImpl();
		daoObj.adminUpdateTotalSeatsOfaBatch();

	}
}
