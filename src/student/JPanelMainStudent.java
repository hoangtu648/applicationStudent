package student;

import javax.swing.JPanel;

import Controller.ControllerStudent;
import entities.Account;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Map;
import java.awt.event.ActionEvent;

public class JPanelMainStudent extends JPanel {
//	private JButton jbuttonProfile;
//	private JPanel panelMainStudent;
//	private JButton jbuttonCourse;
//	private Map<String, Object> data;
//	private JButton jbuttonMyCourse;
//	private JButton jbuttonScore;
//	private JButton jbuttonTuiton;
//	/**
//	 * Create the panel.
//	 */
//	public JPanelMainStudent() {
//		setLayout(new BorderLayout(0, 0));
//		
//		JPanel panel = new JPanel();
//		panel.setBackground(new Color(153, 153, 255));
//		add(panel, BorderLayout.WEST);
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		
//		jbuttonProfile = new JButton("Profile       ");
//		jbuttonProfile.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				jbuttonProfile_actionPerformed(e);
//			}

//		});
//		jbuttonProfile.setIcon(new ImageIcon(JPanelMainStudent.class.getResource("/icon/49576_new_add_plus_user_icon.png")));
//		jbuttonProfile.setForeground(new Color(255, 255, 255));
//		jbuttonProfile.setFocusPainted(false);
//		jbuttonProfile.setFocusCycleRoot(true);
//		jbuttonProfile.setBorderPainted(false);
//		jbuttonProfile.setBackground(new Color(153, 153, 255));
//		jbuttonProfile.setFont(new Font("Times New Roman", Font.BOLD, 20));
//		panel.add(jbuttonProfile);
//		
//		jbuttonCourse = new JButton("Courses     ");
//		jbuttonCourse.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				jbuttonCourse_actionPerformed(e);
//			}
//		});
//		jbuttonCourse.setIcon(new ImageIcon(JPanelMainStudent.class.getResource("/icon/online-learning.png")));
//		jbuttonCourse.setForeground(new Color(255, 255, 255));
//		jbuttonCourse.setFocusPainted(false);
//		jbuttonCourse.setBackground(new Color(153, 153, 255));
//		jbuttonCourse.setBorderPainted(false);
//		jbuttonCourse.setFont(new Font("Times New Roman", Font.BOLD, 20));
//		panel.add(jbuttonCourse);
//		
//		jbuttonMyCourse = new JButton("My Course");
//		jbuttonMyCourse.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				jbuttonMyCourse_actionPerformed(e);
//			}
//		});
//		jbuttonMyCourse.setForeground(new Color(255, 255, 255));
//		jbuttonMyCourse.setFocusPainted(false);
//		jbuttonMyCourse.setBackground(new Color(153, 153, 255));
//		jbuttonMyCourse.setBorderPainted(false);
//		jbuttonMyCourse.setFont(new Font("Times New Roman", Font.BOLD, 20));
//		jbuttonMyCourse.setIcon(new ImageIcon(JPanelMainStudent.class.getResource("/icon/8156552_bill_invoice_payment_receipt_billing_icon.png")));
//		panel.add(jbuttonMyCourse);
//		
//		jbuttonScore = new JButton("Score          ");
//		jbuttonScore.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				jbuttonScore_actionPerformed(e);
//			}
//		});
//		jbuttonScore.setIcon(new ImageIcon(JPanelMainStudent.class.getResource("/icon/8726122_invoice_icon.png")));
//		jbuttonScore.setForeground(Color.WHITE);
//		jbuttonScore.setFont(new Font("Times New Roman", Font.BOLD, 20));
//		jbuttonScore.setFocusPainted(false);
//		jbuttonScore.setBorderPainted(false);
//		jbuttonScore.setBackground(new Color(153, 153, 255));
//		panel.add(jbuttonScore);
//		
//		jbuttonTuiton = new JButton("Tuition       ");
//		jbuttonTuiton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				jbuttonTuiton_actionPerformed(e);
//			}
//		});
//		jbuttonTuiton.setIcon(new ImageIcon(JPanelMainStudent.class.getResource("/icon/8156552_bill_invoice_payment_receipt_billing_icon.png")));
//		jbuttonTuiton.setForeground(Color.WHITE);
//		jbuttonTuiton.setFont(new Font("Times New Roman", Font.BOLD, 20));
//		jbuttonTuiton.setFocusPainted(false);
//		jbuttonTuiton.setBorderPainted(false);
//		jbuttonTuiton.setBackground(new Color(153, 153, 255));
//		panel.add(jbuttonTuiton);
//		
//		panelMainStudent = new JPanel();
//		add(panelMainStudent, BorderLayout.CENTER);
//		panelMainStudent.setLayout(new BorderLayout(0, 0));
//		
//	}
//	public JPanelMainStudent(Map<String, Object> data) {
//		this();
//		this.data = data;
//		initJFrame();
//	}
//	public void clearScreen() {
//		panelMainStudent.removeAll();
//		panelMainStudent.revalidate();
//	}
//	public void jbuttonProfile_actionPerformed(ActionEvent e) {
//		clearScreen();
//		JPanelProfile jPanelProfile = new JPanelProfile(data);
//		panelMainStudent.add(jPanelProfile);
//		jPanelProfile.setVisible(true);
//	
//	}
//	public void initJFrame() {
//		JPanelProfile jPanelProfile = new JPanelProfile(data);
//		panelMainStudent.add(jPanelProfile);
//		jPanelProfile.setVisible(true);
//		
//	}
//	public void jbuttonCourse_actionPerformed(ActionEvent e) {
//		clearScreen();
//		JPanelCourse jPanelCourse = new JPanelCourse(data);
//		panelMainStudent.add(jPanelCourse);
//		jPanelCourse.setVisible(true);
//	}
//	public void jbuttonMyCourse_actionPerformed(ActionEvent e) {
//		clearScreen();
//		JPanelManager jPanelManager = new JPanelManager(data);
//		panelMainStudent.add(jPanelManager);
//		jPanelManager.setVisible(true);
//	}
//	public void jbuttonScore_actionPerformed(ActionEvent e) {
//		clearScreen();
//		JPanelScore jPanelScore = new JPanelScore(data);
//		panelMainStudent.add(jPanelScore);
//		jPanelScore.setVisible(true);
//	}
//	public void jbuttonTuiton_actionPerformed(ActionEvent e) {
//		clearScreen();
//		JPanelHocPhi jPanelHocPhi = new JPanelHocPhi(data);
//		panelMainStudent.add(jPanelHocPhi);
//		jPanelHocPhi.setVisible(true);
//	}
	private JButton jbuttonProfile;
	private JPanel panelMainStudent;
	private JButton jbuttonCourse;
	private Map<String, Object> data;
	private JButton jbuttonMyCourse;
	private JButton jbuttonScore;
	private JButton jbuttonTuiton;

	/**
	 * Create the panel.
	 */
	public JPanelMainStudent() {
		setLayout(new BorderLayout(0, 0));

		ActionListener ac = new ControllerStudent(this);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 153, 255));
		add(panel, BorderLayout.WEST);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		// sự kiện nút profile
		jbuttonProfile = new JButton("Profile       ");
		jbuttonProfile.addActionListener(ac);

		jbuttonProfile
				.setIcon(new ImageIcon(JPanelMainStudent.class.getResource("/icon/49576_new_add_plus_user_icon.png")));
		jbuttonProfile.setForeground(new Color(255, 255, 255));
		jbuttonProfile.setFocusPainted(false);
		jbuttonProfile.setFocusCycleRoot(true);
		jbuttonProfile.setBorderPainted(false);
		jbuttonProfile.setBackground(new Color(153, 153, 255));
		jbuttonProfile.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(jbuttonProfile);

		jbuttonCourse = new JButton("Courses     ");
		jbuttonCourse.addActionListener(ac);

		jbuttonCourse.setIcon(new ImageIcon(JPanelMainStudent.class.getResource("/icon/online-learning.png")));
		jbuttonCourse.setForeground(new Color(255, 255, 255));
		jbuttonCourse.setFocusPainted(false);
		jbuttonCourse.setBackground(new Color(153, 153, 255));
		jbuttonCourse.setBorderPainted(false);
		jbuttonCourse.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(jbuttonCourse);
		// sự kiện nút my course
		jbuttonMyCourse = new JButton("My Course");
		jbuttonMyCourse.addActionListener(ac);

		jbuttonMyCourse.setForeground(new Color(255, 255, 255));
		jbuttonMyCourse.setFocusPainted(false);
		jbuttonMyCourse.setBackground(new Color(153, 153, 255));
		jbuttonMyCourse.setBorderPainted(false);
		jbuttonMyCourse.setFont(new Font("Times New Roman", Font.BOLD, 20));
		jbuttonMyCourse.setIcon(new ImageIcon(
				JPanelMainStudent.class.getResource("/icon/8156552_bill_invoice_payment_receipt_billing_icon.png")));
		panel.add(jbuttonMyCourse);
		// sự kiện nút score
		jbuttonScore = new JButton("Score          ");
		jbuttonScore.addActionListener(ac);

		jbuttonScore.setIcon(new ImageIcon(JPanelMainStudent.class.getResource("/icon/8726122_invoice_icon.png")));
		jbuttonScore.setForeground(Color.WHITE);
		jbuttonScore.setFont(new Font("Times New Roman", Font.BOLD, 20));
		jbuttonScore.setFocusPainted(false);
		jbuttonScore.setBorderPainted(false);
		jbuttonScore.setBackground(new Color(153, 153, 255));
		panel.add(jbuttonScore);
		// sự kiện nút tuition
		jbuttonTuiton = new JButton("Tuition       ");
		jbuttonTuiton.addActionListener(ac);

		jbuttonTuiton.setIcon(new ImageIcon(
				JPanelMainStudent.class.getResource("/icon/8156552_bill_invoice_payment_receipt_billing_icon.png")));
		jbuttonTuiton.setForeground(Color.WHITE);
		jbuttonTuiton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		jbuttonTuiton.setFocusPainted(false);
		jbuttonTuiton.setBorderPainted(false);
		jbuttonTuiton.setBackground(new Color(153, 153, 255));
		panel.add(jbuttonTuiton);

		panelMainStudent = new JPanel();
		add(panelMainStudent, BorderLayout.CENTER);
		panelMainStudent.setLayout(new BorderLayout(0, 0));

	}

	public JPanelMainStudent(Map<String, Object> data) {
		this();
		this.data = data;
		initJFrame();
	}

	public void clearScreen() {
		panelMainStudent.removeAll();
		panelMainStudent.revalidate();
	}

//	public void jbuttonProfile_actionPerformed(ActionEvent e) {
//		clearScreen();
//		JPanelProfile jPanelProfile = new JPanelProfile(data);
//		panelMainStudent.add(jPanelProfile);
//		jPanelProfile.setVisible(true);
//	
//	}
	public void initJFrame() {
		JPanelProfile jPanelProfile = new JPanelProfile(data);
		panelMainStudent.add(jPanelProfile);
		jPanelProfile.setVisible(true);

	}

//	public void jbuttonCourse_actionPerformed(ActionEvent e) {
//		clearScreen();
//		JPanelCourse jPanelCourse = new JPanelCourse(data);
//		panelMainStudent.add(jPanelCourse);
//		jPanelCourse.setVisible(true);
//	}
//	public void jbuttonMyCourse_actionPerformed(ActionEvent e) {
//		clearScreen();
//		JPanelManager jPanelManager = new JPanelManager(data);
//		panelMainStudent.add(jPanelManager);
//		jPanelManager.setVisible(true);
//	}
//	public void jbuttonScore_actionPerformed(ActionEvent e) {
//		clearScreen();
//		JPanelScore jPanelScore = new JPanelScore(data);
//		panelMainStudent.add(jPanelScore);
//		jPanelScore.setVisible(true);
//	}
//	public void jbuttonTuiton_actionPerformed(ActionEvent e) {
//		clearScreen();
//		JPanelHocPhi jPanelHocPhi = new JPanelHocPhi(data);
//		panelMainStudent.add(jPanelHocPhi);
//		jPanelHocPhi.setVisible(true);
//	}	
	public void viewProfile() {
		clearScreen();
		JPanelProfile jPanelProfile = new JPanelProfile(data);
		panelMainStudent.add(jPanelProfile);
		jPanelProfile.setVisible(true);
	}

	public void viewCourse() {
		clearScreen();
		JPanelCourse jPanelCourse = new JPanelCourse(data);
		panelMainStudent.add(jPanelCourse);
		jPanelCourse.setVisible(true);

	}

	public void viewMyCourse() {
		clearScreen();
		JPanelManager jPanelManager = new JPanelManager(data);
		panelMainStudent.add(jPanelManager);
		jPanelManager.setVisible(true);
	}

	public void viewScore() {
		clearScreen();
		JPanelScore jPanelScore = new JPanelScore(data);
		panelMainStudent.add(jPanelScore);
		jPanelScore.setVisible(true);
	}

	public void viewTuition() {
		clearScreen();
		JPanelHocPhi jPanelHocPhi = new JPanelHocPhi(data);
		panelMainStudent.add(jPanelHocPhi);
		jPanelHocPhi.setVisible(true);
	}

}
