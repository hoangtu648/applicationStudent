package Controller;

import admin.JFrameNewCourse;
import admin.JFrameUpdateCourse;
import entities.Course;
import model.CourseModelInterface;

public class CourseUpdateController implements ControllerCourseInterface {
	private CourseModelInterface model;
	private JFrameUpdateCourse view;

	public CourseUpdateController(CourseModelInterface model) {
		super();
		this.model = model;
		view = new JFrameUpdateCourse(this, model);
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
