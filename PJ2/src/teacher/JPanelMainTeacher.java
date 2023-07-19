package teacher;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Map;
import java.awt.event.ActionEvent;

public class JPanelMainTeacher extends JPanel {
	private JButton jbuttonMyCourse;
	private JPanel panelMainTeacher;
	private Map<String, Object> data;
	/**
	 * Create the panel.
	 */
	public JPanelMainTeacher() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 153, 255));
		add(panel, BorderLayout.WEST);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		jbuttonMyCourse = new JButton("My Course");
		jbuttonMyCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonMyCourse_actionPerformed(e);
			}
		});
		jbuttonMyCourse.setBorderPainted(false);
		jbuttonMyCourse.setFocusPainted(false);
		jbuttonMyCourse.setForeground(new Color(255, 255, 255));
		jbuttonMyCourse.setBackground(new Color(153, 153, 255));
		jbuttonMyCourse.setFont(new Font("Times New Roman", Font.BOLD, 20));
		jbuttonMyCourse.setIcon(new ImageIcon(JPanelMainTeacher.class.getResource("/icon/online-learning.png")));
		panel.add(jbuttonMyCourse);
		
		panelMainTeacher = new JPanel();
		add(panelMainTeacher, BorderLayout.CENTER);
		panelMainTeacher.setLayout(new BorderLayout(0, 0));
		
	}
	public JPanelMainTeacher(Map<String, Object> data) {
		this();
		this.data = data;
		initJFrame();
	}
	public void initJFrame() {
		JPanelMyCourse course = new JPanelMyCourse(data);
		panelMainTeacher.add(course);
		course.setVisible(true);
	}
	public void clearScreen() {
		panelMainTeacher.removeAll();
		panelMainTeacher.revalidate();
	}
	public void jbuttonMyCourse_actionPerformed(ActionEvent e) {
		clearScreen();
		JPanelMyCourse course = new JPanelMyCourse(data);
		panelMainTeacher.add(course);
		course.setVisible(true);
	}
}
