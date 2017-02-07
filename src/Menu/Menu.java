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
	
	private static Scanner scanner;
	private JdbcCourseDao CourseDao;
	private JdbcPoneyDao PoneyDao;
	private JdbcJockeyDao JockeyDao;
	
	public Menu (Scanner scanner) {
		this.scanner = scanner;
		 CourseDao = new JdbcCourseDao(ConnectionManager.getConnection());
		 JockeyDao = new JdbcJockeyDao(ConnectionManager.getConnection());
		 PoneyDao = new JdbcPoneyDao(ConnectionManager.getConnection());
	}

	public static void menuAddCourse() {
		System.out.println("Please enter a date for the race :");
		
		String date = scanner.nextLine();
		
		Course course = new Course(date);
		
		System.out.println("Race start : \" " + course);
	}
	
	public static void menuAddJockey() {
		System.out.println("Please enter a name :");
		
		String date = scanner.nextLine();
		
		Jockey jockey = new Jockey(name);
		Long id = JockeyDao.createJockey(jockey);
		
		System.out.println("Jokey at \" " + name + " \" added into database with id " + id);
	}
	
	public static void menuAddPoney() {
		System.out.println("Please enter a name :");
		
		String date = scanner.nextLine();
		
		Poney poney = new Poney(name);
		Long id = PoneyDao.createPoney(poney);
		
		System.out.println("Poney \" " + name + " \" added into database with id " + id);
	}
}
