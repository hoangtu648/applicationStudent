package teacher;

import javax.swing.JPanel;

import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import entities.Account;
import entities.Course;
import entities.Manager;
import model.CourseModel;
import model.ManagerModel;


import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPanelMyCourse extends JPanel {
	private JTextField jtextFieldCourseName;
	private JTable jtableCourse;
	private Map<String, Object> data;
	private JButton jbuttonViewList;
	private String value;
	private int courseID;
	private JButton jbuttonRefresh;
	private JButton jbuttonSearch;
	/**
	 * Create the panel.
	 */
	public JPanelMyCourse() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("My Course");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Course Name: ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_1);
		
		jtextFieldCourseName = new JTextField();
		jtextFieldCourseName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		panel_1.add(jtextFieldCourseName);
		jtextFieldCourseName.setColumns(10);
		
		jbuttonSearch = new JButton("Search");
		jbuttonSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonSearch_actionPerformed(e);
			}
		});
		jbuttonSearch.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		panel_1.add(jbuttonSearch);
		
		jbuttonRefresh = new JButton("Refresh");
		jbuttonRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonRefresh_actionPerformed(e);
			}
		});
		jbuttonRefresh.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		jbuttonRefresh.setIcon(new ImageIcon(JPanelMyCourse.class.getResource("/icon/352439_refresh_icon.png")));
		panel_1.add(jbuttonRefresh);
		
		JPanel panel_2 = new JPanel();
		add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		jtableCourse = new JTable();
		jtableCourse.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) {
				jtableCourse_mouseClicked(e);
			}
		});
		jtableCourse.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(jtableCourse);
		
		JPanel panel_3 = new JPanel();
		add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		jbuttonViewList = new JButton("View List");
		jbuttonViewList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonViewList_actionPerformed(e);
			}
		});
		jbuttonViewList.setEnabled(false);
		jbuttonViewList.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		panel_3.add(jbuttonViewList);

	}
	public JPanelMyCourse(Map<String, Object> data) {
		this();
		this.data = data;
		initJFrame();
	}
	public void initJFrame() {
		Account account = (Account) data.get("user");
		ManagerModel managerModel = new ManagerModel();
		CourseModel courseModel = new CourseModel();
		DefaultTableModel defaultTableModel = new DefaultTableModel() {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		defaultTableModel.addColumn("Course Name");
		defaultTableModel.addColumn("Classroom");
		defaultTableModel.addColumn("Start Date");
		defaultTableModel.addColumn("Day");
		defaultTableModel.addColumn("Time");
		defaultTableModel.addColumn("");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		for (Course course : courseModel.searchByTeacherID(account.getUserID())) {
			defaultTableModel.addRow(new Object[] {
					course.getCourseName(), managerModel.findManager(course.getCourseID()).getPhonghoc()
					,  dateFormat.format(course.getStartDate()), course.getNgayhoc(), course.getGiohoc()

			});
		}
		jtableCourse.setModel(defaultTableModel);
		jtableCourse.getTableHeader().setReorderingAllowed(false);


	}
	public void jtableCourse_mouseClicked(MouseEvent e) {
		CourseModel courseModel = new CourseModel();
		jbuttonViewList.setEnabled(true);
		int selectedRow = jtableCourse.getSelectedRow();
		value = jtableCourse.getValueAt(selectedRow, 0).toString();
		courseID = courseModel.findCourseByName(value).getCourseID();
		
	}
	public void jbuttonViewList_actionPerformed(ActionEvent e) {
		data.put("courseID", courseID);
		JFrameViewList frameViewList = new JFrameViewList(data);
		frameViewList.setVisible(true);
	}
	
	public void jbuttonSearch_actionPerformed(ActionEvent e) {
		Account account = (Account) data.get("user"); // tra ve cac account dua vao id dang nhap
		
		ManagerModel managerModel = new ManagerModel();
		CourseModel courseModel = new CourseModel();
		DefaultTableModel defaultTableModel = new DefaultTableModel() {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		defaultTableModel.addColumn("Course Name");
		defaultTableModel.addColumn("Classroom");
		defaultTableModel.addColumn("Start Date");
		defaultTableModel.addColumn("Day");
		defaultTableModel.addColumn("Time");
		defaultTableModel.addColumn("");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		for (Course course : courseModel.searchByNameAndTeacherID(jtextFieldCourseName.getText().toLowerCase().trim(), account.getUserID())) {
			defaultTableModel.addRow(new Object[] {
					course.getCourseName(), managerModel.findManager(course.getCourseID()).getPhonghoc()
					,  dateFormat.format(course.getStartDate()), course.getNgayhoc(), course.getGiohoc()

			});
		}
		jtableCourse.setModel(defaultTableModel);
		jtableCourse.getTableHeader().setReorderingAllowed(false);
	}
	public void jbuttonRefresh_actionPerformed(ActionEvent e) {
		initJFrame();
	}
	}


