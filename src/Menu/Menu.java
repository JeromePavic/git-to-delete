package Menu;

import java.util.Scanner;
import ConnectionMySQL.ConnectionManager;
import Jdbc.JdbcCourseDao;
import Jdbc.JdbcJockeyDao;
import Jdbc.JdbcPoneyDao;
import Class.Course;
import Class.Jockey;
import Class.Poney;

public class Menu {
	
	private Scanner scanner;
	private JdbcCourseDao CourseDao;
	private JdbcPoneyDao PoneyDao;
	private JdbcJockeyDao JockeyDao;
	
	public Menu (Scanner scanner) {
		this.scanner = scanner;
		JdbcCourseDao CourseDao = new JdbcCourseDao(ConnectionManager.getConnection());
		JdbcJockeyDao JockeyDao = new JdbcJockeyDao(ConnectionManager.getConnection());
	}

	public void menuAddPlace() {
		System.out.println("Please enter a name :");
		
		String date = scanner.nextLine();
		
		Course course = new Course(date);
		Long id = CourseDao.createCourse(course);
		
		System.out.println("Course at \" " + date + " \" added into database with id " + id);
	}
	
}
