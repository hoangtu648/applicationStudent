package TestDriver;

import Controller.ControllerCourseInterface;
import Controller.ControllerScoreInterface;
import Controller.CourseController;
import Controller.ScoreController;
import entities.Course;
import model.CourseModel;
import model.CourseModelInterface;
import model.ScoreModel;
import model.ScoreModelInterface;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseModelInterface model = new CourseModel();
		ControllerCourseInterface controller = new CourseController(model);
		
//		ScoreModelInterface model2 = new ScoreModel();
//		ControllerScoreInterface controller2 = new ScoreController(model2);
		
		
	}

}
