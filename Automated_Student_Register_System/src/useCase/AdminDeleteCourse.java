package useCase;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import bean.Course;
import dao.dao;
import dao.daoImpl;
import exceptions.CourseException;

public class AdminDeleteCourse {
	public AdminDeleteCourse() throws SQLException, CourseException {
		Scanner sc = new Scanner(System.in);
		dao daoObj = new daoImpl();
		List<Course> lisOfCourses = daoObj.getListOfCourses();
		System.out.println("List of courses-");
		lisOfCourses.forEach(c ->{
			System.out.println(c.getCname());
		});
		System.out.println("Enter course name to delete:");
		String cName = sc.next();
		daoObj.adminDeleteCourse(cName);
	}


}
