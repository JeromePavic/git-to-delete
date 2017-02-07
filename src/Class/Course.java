package Class;

public class Course {

	private int id;
	private String date;
	
	public Course() {
		super();
	}
	
	
	public Course(String date) {
		super();
		this.date = date;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}


}
