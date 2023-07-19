package student;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.Data;

import entities.Account;
import entities.Course;
import entities.Manager;
import model.CourseModel;
import model.ManagerModel;
import model.TeacherModel;

public class JPanelHocPhi extends JPanel {
	private JTable jtableCourse;
	private Map<String, Object> dataMain;
	private JLabel totalFee;

	/**
	 * Create the panel.
	 */
	public JPanelHocPhi() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("HỌC PHÍ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		jtableCourse = new JTable();
		scrollPane.setViewportView(jtableCourse);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_1 = new JLabel("Tổng cộng:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel_2.add(lblNewLabel_1);
		
		totalFee = new JLabel("  ");
		totalFee.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel_2.add(totalFee);

	}
	
	public JPanelHocPhi(Map<String, Object> data) {
		this();
		this.dataMain = data;
		initJframe();
	}
	
	public void initJframe() {
		CourseModel courseModel = new CourseModel();
		Course course = (Course) dataMain.get("course");
		Account account = (Account) dataMain.get("user");
		TeacherModel teacherModel = new TeacherModel();
		ManagerModel managerModel = new ManagerModel();
		DefaultTableModel defaultTableModel = new DefaultTableModel() {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd--mm--yyyy");
		defaultTableModel.addColumn("ID Course");
		defaultTableModel.addColumn("Name Course");
		defaultTableModel.addColumn("Name Teacher");
		defaultTableModel.addColumn("Date Login");
		defaultTableModel.addColumn("Fee");
		int result = 0;
		for(Manager managers : managerModel.findManagerByStudent(account.getUserID())) {
			defaultTableModel.addRow(new Object[] {
					managers.getMakh(),courseModel.findCourseByID(managers.getMakh()).getCourseName(),
					teacherModel.findTeacherById(courseModel.findCourseByID(managers.getMakh()).getTeacherID()),
					simpleDateFormat.format(managers.getNgaydangky()),
					courseModel.findCourseByID(managers.getMakh()).getFee() + " VNĐ",
					result += courseModel.findCourseByID(managers.getMakh()).getFee()
					
			});
			totalFee.setText(result + " VNĐ");
		}
		jtableCourse.setModel(defaultTableModel);
		jtableCourse.getTableHeader().setReorderingAllowed(false);
	}

}
