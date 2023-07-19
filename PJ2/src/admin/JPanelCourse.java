package admin;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controller.ControllerCourseInterface;
import Controller.CourseController;
import entities.Course;
import entities.CourseObserver;
import entities.Manager;
import entities.Student;
import model.CourseModel;
import model.CourseModelInterface;
import model.ManagerModel;
import model.StudentModel;
import model.TeacherModel;

import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;

public class JPanelCourse extends JPanel{
	private JLabel lblNewLabel;
	private JTable jtableCourse;
	private JList jlistStudent;
	private int courseID;
	private JButton jbuttonCreateNewCourse;


	/**
	 * Create the panel.
	 */
	public JPanelCourse() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		JPanel panel = new JPanel();
		add(panel);

		lblNewLabel = new JLabel("Courses");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 719, 318);
		panel_2.add(scrollPane);

		jtableCourse = new JTable();
		jtableCourse.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jtableCourse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jtableCourse_mouseClicked(e);
			}
		});
		scrollPane.setViewportView(jtableCourse);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(739, 10, 244, 318);
		panel_2.add(scrollPane_1);

		jlistStudent = new JList();
		scrollPane_1.setViewportView(jlistStudent);

		jbuttonCreateNewCourse = new JButton("New Course");
		jbuttonCreateNewCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonCreateNewCourse_actionPerformed(e);

			}
		});
		jbuttonCreateNewCourse.setFont(new Font("Times New Roman", Font.BOLD, 15));
		jbuttonCreateNewCourse.setBounds(192, 338, 119, 34);
		panel_2.add(jbuttonCreateNewCourse);
		
		JButton jbuttonUpdateCourse = new JButton("Update");
		jbuttonUpdateCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonUpdateCourse_actionPerformed(e);
			}
		});
		jbuttonUpdateCourse.setFont(new Font("Times New Roman", Font.BOLD, 15));
		jbuttonUpdateCourse.setBounds(350, 338, 119, 34);
		panel_2.add(jbuttonUpdateCourse);
		initJFrame();
		
	}


	public void initJFrame() {
		CourseModel courseModel = new CourseModel();

		TeacherModel model = new TeacherModel();

		DefaultTableModel defaultTableModel = new DefaultTableModel() {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

		};
		defaultTableModel.addColumn("ID");
		defaultTableModel.addColumn("Course Name");
		defaultTableModel.addColumn("Teacher Name");
		defaultTableModel.addColumn("Start Date");
		defaultTableModel.addColumn("Date");
		defaultTableModel.addColumn("Fee");
		defaultTableModel.addColumn("Quantity");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		for (Course courses : courseModel.findAll()) {

			defaultTableModel.addRow(new Object[] { courses.getCourseID(), courses.getCourseName(),
					model.findById(courses.getTeacherID()).getName(), dateFormat.format(courses.getStartDate()),
					"Thứ: " + courses.getNgayhoc(), courses.getFee() + " vnd", courses.getQuantity(),

			});
		}
		jtableCourse.setModel(defaultTableModel);
		jtableCourse.getTableHeader().setReorderingAllowed(false);

		jtableCourse.setRowHeight(70);
	}

	public void jtableCourse_mouseClicked(MouseEvent e) {
		CourseModel courseModel = new CourseModel();
		int getSelectedRow = jtableCourse.getSelectedRow();
		courseID = Integer.parseInt(jtableCourse.getValueAt(getSelectedRow, 0).toString());
		StudentModel studentModel = new StudentModel();
		ManagerModel managerModel = new ManagerModel();
		DefaultListModel<Student> defaultListModel = new DefaultListModel<Student>();

		for (Manager managers : managerModel.findManagerByCourse(courseID)) {
			defaultListModel.addElement(studentModel.checkStudent(managers.getMasv()));
		}
		jlistStudent.setModel(defaultListModel);
		jlistStudent.setCellRenderer(new InvoiceCellRender());
	}

	public class InvoiceCellRender extends DefaultListCellRenderer {
		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {
			// TODO Auto-generated method stub
			Student student = (Student) value;
			return super.getListCellRendererComponent(list,
					"st0" + student.getStudentID() + "- " + student.getFullName(), index, isSelected, cellHasFocus);
		}

	}

	public void jbuttonCreateNewCourse_actionPerformed(ActionEvent e) {
		JFrameNewCourse course = new JFrameNewCourse();
		course.setVisible(true);

	}
	
	
	public void jbuttonUpdateCourse_actionPerformed(ActionEvent e) {
		CourseModel courseModel = new CourseModel();
		int getSelectedRow = jtableCourse.getSelectedRow();
		courseID = Integer.parseInt(jtableCourse.getValueAt(getSelectedRow, 0).toString());
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("course", courseModel.findCourseByID(courseID));
		JFrameUpdateCourse jFrameUpdateCourse = new JFrameUpdateCourse(data);
		jFrameUpdateCourse.setVisible(true);
	}
}
