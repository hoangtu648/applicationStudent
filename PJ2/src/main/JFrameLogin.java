package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import model.AccountModel;

import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFrameLogin extends JFrame {

	private JPanel contentPane;
	private JTextField jtextFieldUsername;
	private JPasswordField jpasswordField;
	private JLabel jlabelShowPass;
	private JLabel jlabelShow;
	private JLabel jlabelHide;
	private JButton jbuttonLogin;
	private JTextField txtTAcademy;
	private JButton jbuttonRegister;

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
					JFrameLogin frame = new JFrameLogin();
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
	public JFrameLogin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 942, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 153, 255));
		panel.setBounds(0, 0, 384, 533);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(JFrameLogin.class.getResource("/icon/afas.png")));
		lblNewLabel.setBounds(123, 165, 160, 180);
		panel.add(lblNewLabel);

		txtTAcademy = new JTextField();
		txtTAcademy.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		txtTAcademy.setForeground(new Color(255, 255, 255));
		txtTAcademy.setBackground(new Color(153, 153, 255));
		txtTAcademy.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtTAcademy.setHorizontalAlignment(SwingConstants.CENTER);
		txtTAcademy.setText("T - ACADEMY");
		txtTAcademy.setBounds(84, 50, 221, 54);
		panel.add(txtTAcademy);
		txtTAcademy.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 51, 255));
		panel_1.setBounds(360, -13, 558, 556);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setBounds(233, 21, 190, 52);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Hello! Let's get started");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(233, 83, 213, 52);
		panel_1.add(lblNewLabel_2);

		jtextFieldUsername = new JTextField();
		jtextFieldUsername.setForeground(new Color(255, 255, 255));
		jtextFieldUsername.setBackground(new Color(153, 51, 255));
		jtextFieldUsername.setBorder(null);
		jtextFieldUsername.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		jtextFieldUsername.setBounds(219, 206, 237, 32);
		panel_1.add(jtextFieldUsername);
		jtextFieldUsername.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(219, 237, 237, 2);
		panel_1.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(219, 336, 237, 2);
		panel_1.add(separator_1);

		jpasswordField = new JPasswordField();
		jpasswordField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jpasswordField.setBackground(new Color(153, 51, 255));
		jpasswordField.setBorder(null);
		jpasswordField.setBounds(219, 304, 237, 32);
		panel_1.add(jpasswordField);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(JFrameLogin.class.getResource("/icon/aaadasfasf.png")));
		lblNewLabel_4.setBounds(125, 190, 82, 66);
		panel_1.add(lblNewLabel_4);

		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon(JFrameLogin.class.getResource("/icon/padlock.png")));
		lblNewLabel_4_1.setBounds(127, 291, 82, 66);
		panel_1.add(lblNewLabel_4_1);

		jbuttonLogin = new JButton("LOGIN");
		jbuttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonLogin_actionPerformed(e);
			}
		});
		jbuttonLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		jbuttonLogin.setForeground(new Color(153, 51, 255));
		jbuttonLogin.setBackground(new Color(255, 255, 255));
		jbuttonLogin.setBounds(275, 388, 101, 42);
		panel_1.add(jbuttonLogin);

		jlabelShow = new JLabel("");
		jlabelShow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_3_mouseClicked(e);
			}
		});
		jlabelShow.setIcon(new ImageIcon(JFrameLogin.class.getResource("/icon/view.png")));
		jlabelShow.setBounds(480, 304, 45, 32);
		panel_1.add(jlabelShow);

		jlabelShowPass = new JLabel("");
		jlabelShowPass.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		jlabelShowPass.setBounds(219, 304, 237, 32);
		panel_1.add(jlabelShowPass);

		jlabelHide = new JLabel("");
		jlabelHide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jlabelHide_mouseClicked(e);
			}
		});
		jlabelHide.setIcon(new ImageIcon(JFrameLogin.class.getResource("/icon/invisible.png")));
		jlabelHide.setBounds(480, 304, 45, 32);
		panel_1.add(jlabelHide);

		jbuttonRegister = new JButton("Create New Account");
		jbuttonRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonRegister_actionPerformed(e);
			}
		});
		jbuttonRegister.setBackground(new Color(153, 51, 255));
		jbuttonRegister.setBorder(null);
		jbuttonRegister.setForeground(new Color(255, 255, 255));
		jbuttonRegister.setFont(new Font("Times New Roman", Font.BOLD, 15));
		jbuttonRegister.setBounds(237, 483, 173, 32);
		panel_1.add(jbuttonRegister);
		jlabelHide.setVisible(false);

	}

	public void lblNewLabel_3_mouseClicked(MouseEvent e) {
		jlabelShow.setVisible(false);
		jlabelHide.setVisible(true);
		jpasswordField.setEchoChar((char) 0);

	}

	public void jlabelHide_mouseClicked(MouseEvent e) {
		jlabelShow.setVisible(true);
		jlabelHide.setVisible(false);
		jpasswordField.setEchoChar('*');
	}

	public void jbuttonLogin_actionPerformed(ActionEvent e) {
		AccountModel accountModel = new AccountModel();
		if (jtextFieldUsername.getText().equalsIgnoreCase("")
				|| new String(jpasswordField.getPassword()).equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ tài khoản và mật khẩu!");
		} else if (accountModel.checkLogin(jtextFieldUsername.getText(), new String(jpasswordField.getPassword()))) {
			JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
			this.setVisible(false);
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("user", accountModel.checkUsername(jtextFieldUsername.getText()));
			JFrameMain jFrameMain = new JFrameMain(data);
			jFrameMain.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(this, "Sai tên tài khoản hoặc mật khẩu!");
		}
	}

	public void jbuttonRegister_actionPerformed(ActionEvent e) {
		JFrameRegister frameRegister = new JFrameRegister();
		frameRegister.setVisible(true);
		this.setVisible(false);
	}
}
