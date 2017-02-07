package Class;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Poney {

	private int id;
	private String name;
	private double weight;
	
	
	public Poney() {
		super();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public Long createPlace(Poney p) {
		
		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate("INSERT INTO poney (name, weight) VALUES ('"+p.getName()+"');", Statement.RETURN_GENERATED_KEYS);
			
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
