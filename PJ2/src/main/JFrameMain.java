package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Account;
import student.JPanelMainStudent;
import teacher.JPanelMainTeacher;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.Map;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import admin.JPanelMainAdmin;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameMain extends JFrame {

	private JPanel contentPane;
	private Map<String, Object> data;
	private JLabel jlabelWelcome;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem jmenuItemMyProfile;
	private JMenuItem jmenuItemLogOut;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameMain frame = new JFrameMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameMain() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1131, 592);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Account");
		mnNewMenu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		menuBar.add(mnNewMenu);
		
		jmenuItemMyProfile = new JMenuItem("My Profile");
		jmenuItemMyProfile.setIcon(new ImageIcon(JFrameMain.class.getResource("/icon/Profile.png")));
		jmenuItemMyProfile.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mnNewMenu.add(jmenuItemMyProfile);
		
		jmenuItemLogOut = new JMenuItem("Log Out");
		jmenuItemLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jmenuItemLogOut_actionPerformed(e);
			}
		});
		jmenuItemLogOut.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		jmenuItemLogOut.setIcon(new ImageIcon(JFrameMain.class.getResource("/icon/Next.png")));
		mnNewMenu.add(jmenuItemLogOut);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 51, 255));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		jlabelWelcome = new JLabel("New label");
		jlabelWelcome.setForeground(new Color(255, 255, 255));
		jlabelWelcome.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(jlabelWelcome);
	}
	public JFrameMain(Map<String, Object> data) {
		
		this();
		this.data = data;
		initJFrame();		
		Account account = (Account) data.get("user");
		jlabelWelcome.setText("Welcome " + account.getFullName() + " To T-AcademyManagement");
	}
	public void initJFrame() {
		Account account = (Account) data.get("user");
		if(account.getRole() == 1) {
			JPanelMainStudent jPanelMainStudent = new JPanelMainStudent(data);
			contentPane.add(jPanelMainStudent);
			jPanelMainStudent.setVisible(true);
		} else if(account.getRole() == 2) {
			JPanelMainTeacher jPanelMainTeacher = new JPanelMainTeacher(data);
			contentPane.add(jPanelMainTeacher);
			jPanelMainTeacher.setVisible(true);
		} else if(account.getRole() == 0) {
			JPanelMainAdmin admin = new JPanelMainAdmin(data);
			contentPane.add(admin);
			admin.setVisible(true);
		}
	}
	public void jmenuItemLogOut_actionPerformed(ActionEvent e) {
		JFrameLogin jFrameLogin = new JFrameLogin();
		int result = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất ?", "Thông báo!", JOptionPane.YES_NO_OPTION);
		if(result == 0) {
			jFrameLogin.setVisible(true);
			this.setVisible(false);
		} 
		
	}

}
