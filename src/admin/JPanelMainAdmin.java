package admin;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPanelMainAdmin extends JPanel {

	/**
	 * Create the panel.
	 */
	private Map<String, Object> data;
	private JButton jbuttonListStudent;
	private JPanel panelMainAdmin;
	private JButton jbuttonListCourse;
	public JPanelMainAdmin() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 153, 255));
		add(panel, BorderLayout.WEST);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		jbuttonListStudent = new JButton("List Student");
		jbuttonListStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonListStudent_actionPerformed(e);
			}
		});
		jbuttonListStudent.setBackground(new Color(153, 153, 255));
		jbuttonListStudent.setBorderPainted(false);
		jbuttonListStudent.setIcon(new ImageIcon(JPanelMainAdmin.class.getResource("/icon/Profile.png")));
		jbuttonListStudent.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(jbuttonListStudent);
		
		jbuttonListCourse = new JButton("List Course ");
		jbuttonListCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonListCourse_actionPerformed(e);
			}
		});
		jbuttonListCourse.setBackground(new Color(153, 153, 255));
		jbuttonListCourse.setBorderPainted(false);
		jbuttonListCourse.setFont(new Font("Times New Roman", Font.BOLD, 20));
		jbuttonListCourse.setIcon(new ImageIcon(JPanelMainAdmin.class.getResource("/icon/Save.png")));
		panel.add(jbuttonListCourse);
		
		panelMainAdmin = new JPanel();
		add(panelMainAdmin, BorderLayout.CENTER);
		panelMainAdmin.setLayout(new BorderLayout(0, 0));

	}
	public JPanelMainAdmin(Map<String, Object> data) {
		this();
		this.data = data;
		initJFrame();
	}
	public void initJFrame() {
		JPanelListStudent jPanelListStudent = new JPanelListStudent();
		panelMainAdmin.add(jPanelListStudent);
		jPanelListStudent.setVisible(true);
	}
	public void clearScreen() {
		panelMainAdmin.removeAll();
		panelMainAdmin.revalidate();
	}
	public void jbuttonListStudent_actionPerformed(ActionEvent e) {
		clearScreen();
		JPanelListStudent jPanelListStudent = new JPanelListStudent();
		panelMainAdmin.add(jPanelListStudent);
		jPanelListStudent.setVisible(true);
	}
	public void jbuttonListCourse_actionPerformed(ActionEvent e) {
		clearScreen();
		JPanelCourse jPanelCourse = new JPanelCourse();
		panelMainAdmin.add(jPanelCourse);
		jPanelCourse.setVisible(true);
	}
}
