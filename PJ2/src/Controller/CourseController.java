package Controller;

import java.util.List;

import admin.JFrameNewCourse;
import entities.Course;
import model.CourseModelInterface;

public class CourseController implements ControllerCourseInterface {
	private CourseModelInterface model;
	private JFrameNewCourse view;


	public CourseController(CourseModelInterface model) {
		super();
		this.model = model;
		view = new JFrameNewCourse(this, model);
		view.initJFrame();
	}


	@Override
	public void setCourse() {
		// TODO Auto-generated method stub

	}


	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		model.addCourse(course);
	}


	@Override
	public void updateCourse() {
		// TODO Auto-generated method stub
		model.updateCourse();
	}

}
