package Jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Class.Poney;
import ConnectionMySQL.PoneyDao;


public abstract class JdbcPoneyDao implements PoneyDao{
	
	private Connection connection;

	public JdbcPoneyDao(Connection connection) {
		this.connection = connection;
	}

	@Override
	public Long createPoney(Poney p) {
		
		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate("INSERT INTO course (id_course, date_course) VALUES ("+j.getId()+","+j.getDate()+");", Statement.RETURN_GENERATED_KEYS);
			
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
