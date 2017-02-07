package Jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Class.Jockey;
import ConnectionMySQL.JockeyDao;

public abstract class JdbcJockeyDao implements JockeyDao{
	
	private Connection connection;

	public JdbcJockeyDao(Connection connection) {
		this.connection = connection;
	}

	@Override
	public Long createJockey(Jockey j) {
		
		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate("INSERT INTO course (id_jockey, firstname, lastname, weight) VALUES ("+j.getId()+","+j.getFirstname()+","+j.getLastname()+","+j.getWeight()+");", Statement.RETURN_GENERATED_KEYS);
			
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
