package model;

import entities.Course;
import entities.CourseObserver;

public interface CourseModelInterface {
	void addCourse(Course course);
	
	void updateCourse();
	
	void registerObserver(CourseObserver o);
	
	void removeObserver(CourseObserver o);

	void notifyObserver();
}
