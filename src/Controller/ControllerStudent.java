package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import student.JPanelMainStudent;

public class ControllerStudent implements ActionListener {
	private JPanelMainStudent view;

	public ControllerStudent(JPanelMainStudent view) {
		super();
		this.view = view;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if (src.equalsIgnoreCase("Profile       ")) {
			view.viewProfile();
		} else if (src.equalsIgnoreCase("Courses     ")) {
			view.viewCourse();
		} else if (src.equalsIgnoreCase("My Course")) {
			view.viewMyCourse();
		} else if (src.equalsIgnoreCase("Tuition       ")) {
			view.viewTuition();
		} else if (src.equalsIgnoreCase("Score          ")) {
			view.viewScore();
		}
	}
}
