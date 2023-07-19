package student;

import javax.swing.JPanel;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import entities.Course;
import model.CourseModel;
import model.TeacherModel;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class JPanelCourse extends JPanel {
	private JTable jtableCourse;
	private JButton jbuttonDetails;
	private JPanel panelMainCourse;
	private int valueID;
	private String valueName;
	private Map<String, Object> data;
	private JTextField jtextFieldSearch;
	private JButton jbuttonSearch;
	private JButton jbuttonRefresh;

	/**
	 * Create the panel.
	 */
	public JPanelCourse() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 153, 255));
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Course");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Search: ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_1);
		
		jtextFieldSearch = new JTextField();
		jtextFieldSearch.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		panel_1.add(jtextFieldSearch);
		jtextFieldSearch.setColumns(10);
		
		jbuttonSearch = new JButton("Search");
		jbuttonSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonSearch_jbuttonSearch(e);
			}
		});
		panel_1.add(jbuttonSearch);
		
		jbuttonRefresh = new JButton("Refresh");
		jbuttonRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonRefresh_actionPerformed(e);
			}
		});
		jbuttonRefresh.setIcon(new ImageIcon(JPanelCourse.class.getResource("/icon/352439_refresh_icon.png")));
		panel_1.add(jbuttonRefresh);
		
		panelMainCourse = new JPanel();
		add(panelMainCourse);
		panelMainCourse.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(153, 153, 255));
		panelMainCourse.add(scrollPane, BorderLayout.CENTER);
		
		jtableCourse = new JTable();
		jtableCourse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jtableCourse_mouseClicked(e);
			}
		});
		jtableCourse.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(jtableCourse);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 153, 255));
		add(panel_2);
		
		jbuttonDetails = new JButton("Details");
		jbuttonDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonDetails_actionPerformed(e);
			}
		});
		jbuttonDetails.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		panel_2.add(jbuttonDetails);
		
	}
	public JPanelCourse(Map<String, Object> data) {
		this();
		this.data = data;
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
		defaultTableModel.addColumn("Image");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		for (Course courses : courseModel.findAll()) {
			
			try {
				defaultTableModel.addRow(new Object[] {
						courses.getCourseID(), courses.getCourseName(), model.findById(courses.getTeacherID()).getName(), dateFormat.format(courses.getStartDate()), "Thứ: " + courses.getNgayhoc(), courses.getFee() + " vnd", courses.getQuantity(), 
						Files.readAllBytes(Paths.get(courses.getImage()))
				});
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		jtableCourse.setModel(defaultTableModel);
		jtableCourse.getTableHeader().setReorderingAllowed(false);
		jtableCourse.getColumnModel().getColumn(7).setCellRenderer(new ImageCellRender());
		jtableCourse.setRowHeight(90);
		jbuttonDetails.setEnabled(false);
	}
	private class ImageCellRender extends DefaultTableCellRenderer{

		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			JLabel jLabel = new JLabel();
			byte[] bytes = (byte[]) value;
			ImageIcon imageIcon=new ImageIcon(new ImageIcon(bytes).getImage().getScaledInstance(130, 70,Image.SCALE_DEFAULT));
			jLabel.setIcon(imageIcon);
			//CHỈNH CHO HÌNH VÀO CHÍNH GIỮA
			jLabel.setHorizontalAlignment(JLabel.CENTER);
			return jLabel;
			
		}
	}
	public void jtableCourse_mouseClicked(MouseEvent e) {
		jbuttonDetails.setEnabled(true);
		int getSelectedRow = jtableCourse.getSelectedRow();
		valueID = Integer.parseInt(jtableCourse.getValueAt(getSelectedRow, 0).toString());
		valueName = jtableCourse.getValueAt(getSelectedRow, 2).toString();
	}
	public void jbuttonDetails_actionPerformed(ActionEvent e) {
		CourseModel courseModel = new CourseModel();
		TeacherModel model = new TeacherModel();
		data.put("course", courseModel.findCourseByID(valueID));
		data.put("teacherName", model.findByName(valueName));
		
		JFrameDetails jFrameDetails = new JFrameDetails(data);
		jFrameDetails.setVisible(true);
	}
	public void jbuttonSearch_jbuttonSearch(ActionEvent e) {
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
		defaultTableModel.addColumn("Image");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		for (Course courses : courseModel.searchByName(jtextFieldSearch.getText().toLowerCase().trim())) {
			
			try {
				defaultTableModel.addRow(new Object[] {
						courses.getCourseID(), courses.getCourseName(), model.findById(courses.getTeacherID()).getName(), dateFormat.format(courses.getStartDate()),  "Thứ: " + courses.getNgayhoc(), courses.getFee() + " vnd", courses.getQuantity(), 
						Files.readAllBytes(Paths.get(courses.getImage()))
				});
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		jtableCourse.setModel(defaultTableModel);
		jtableCourse.getTableHeader().setReorderingAllowed(false);
		jtableCourse.getColumnModel().getColumn(7).setCellRenderer(new ImageCellRender());
		jtableCourse.setRowHeight(90);
	}
	public void jbuttonRefresh_actionPerformed(ActionEvent e) {
		initJFrame();
		jtextFieldSearch.setText("");
	}
		

}
