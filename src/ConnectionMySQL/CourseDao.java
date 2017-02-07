package ConnectionMySQL;

import Class.Course;

public interface CourseDao {
	
		Long createCourse(Course c);
		void removeCourse(Long id);
}
