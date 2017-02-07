package Jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Class.Course;
import ConnectionMySQL.CourseDao;

public abstract class JdbcCourseDao implements CourseDao{

	private Connection connection;
	
	public JdbcCourseDao(Connection connection) {
		this.connection = connection;
	}

	@Override
	public Long createCourse(Course c) {
		
		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate("INSERT INTO course (id_course, date_course) VALUES ("+c.getId()+","+c.getDate()+");", Statement.RETURN_GENERATED_KEYS);
			
			ResultSet rs = statement.getGeneratedKeys();

			if (rs.next()) {
				return new Long(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}


