package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import com.toedter.calendar.JDateChooser;

import model.AccountModel;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

import javax.swing.SwingConstants;

public class JFrameRegister extends JFrame {

	private JPanel contentPane;
	private JTextField jtextFieldFirstname;
	private JTextField jtextFieldLastName;
	private JLabel jlabelLastName;
	private JLabel jlabelFirstName;
	private JTextField jtextFieldPhone;
	private JTextField jtextFieldEmail;
	private JLabel jlabelPhone;
	private JLabel jlabelEmail;
	private JTextField jtextFieldUsername;
	private JLabel jlabelUsername;
	private JLabel jlabelPassword;
	private JDateChooser jdateChooser;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton jbuttonRegister;
	private JPasswordField jpasswordField;
	private JLabel jlabelShow;
	private JLabel jlabelHide;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameRegister frame = new JFrameRegister();
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
	public JFrameRegister() {
		setResizable(false);
		setTitle("Register");
		setBounds(100, 100, 470, 521);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jlabelPassword = new JLabel("Password");
		jlabelPassword.setForeground(Color.LIGHT_GRAY);
		jlabelPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		jlabelPassword.setBounds(47, 290, 111, 45);
		contentPane.add(jlabelPassword);
		
		jlabelUsername = new JLabel("Username");
		jlabelUsername.setForeground(Color.LIGHT_GRAY);
		jlabelUsername.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		jlabelUsername.setBounds(47, 226, 111, 45);
		contentPane.add(jlabelUsername);
		
		jtextFieldUsername = new JTextField();
		jtextFieldUsername.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(jtextFieldUsername.getText().equals("")) {
					jlabelUsername.setVisible(true);
				} else {
					jlabelUsername.setVisible(false);
				}
			}
		});
		jtextFieldUsername.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		jtextFieldUsername.setColumns(10);
		jtextFieldUsername.setBounds(42, 222, 392, 51);
		contentPane.add(jtextFieldUsername);
		
		jlabelEmail = new JLabel("Email");
		jlabelEmail.setForeground(Color.LIGHT_GRAY);
		jlabelEmail.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		jlabelEmail.setBounds(247, 143, 111, 45);
		contentPane.add(jlabelEmail);
		
		jlabelPhone = new JLabel("Phone");
		jlabelPhone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(jtextFieldPhone.getText().equals("")) {
					jlabelPhone.setVisible(true);
				} else {
					jlabelPhone.setVisible(false);
				}
			}
		});
		jlabelPhone.setForeground(Color.LIGHT_GRAY);
		jlabelPhone.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		jlabelPhone.setBounds(46, 144, 111, 43);
		contentPane.add(jlabelPhone);
		
		jlabelLastName = new JLabel("Last Name");
		jlabelLastName.setForeground(new Color(192, 192, 192));
		jlabelLastName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		jlabelLastName.setBounds(247, 71, 87, 36);
		contentPane.add(jlabelLastName);
		
		jlabelFirstName = new JLabel("First Name");
		jlabelFirstName.setForeground(new Color(192, 192, 192));
		jlabelFirstName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		jlabelFirstName.setBounds(45, 71, 86, 36);
		contentPane.add(jlabelFirstName);
		
		jtextFieldFirstname = new JTextField();
		jtextFieldFirstname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				jtextFieldFirstname_keyPressed(e);
			}
		});
		jtextFieldFirstname.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
	
		
		jtextFieldFirstname.setBounds(42, 62, 191, 51);
		contentPane.add(jtextFieldFirstname);
		jtextFieldFirstname.setColumns(10);
		
		jtextFieldLastName = new JTextField();
		jtextFieldLastName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				jtextFieldLastName_keyPressed(e);
			}
		});
		jtextFieldLastName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		jtextFieldLastName.setColumns(10);
		jtextFieldLastName.setBounds(243, 62, 191, 51);
		contentPane.add(jtextFieldLastName);
		
		jtextFieldPhone = new JTextField();
		jtextFieldPhone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(jtextFieldPhone.getText().equals("")) {
					jlabelPhone.setVisible(true);
				} else {
					jlabelPhone.setVisible(false);
				}
			}
		});
		jtextFieldPhone.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		jtextFieldPhone.setColumns(10);
		jtextFieldPhone.setBounds(42, 139, 191, 51);
		contentPane.add(jtextFieldPhone);
		
		jtextFieldEmail = new JTextField();
		jtextFieldEmail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(jtextFieldEmail.getText().equals("")) {
					jlabelEmail.setVisible(true);
				} else {
					jlabelEmail.setVisible(false);
				}
			}
		});
		jtextFieldEmail.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		jtextFieldEmail.setColumns(10);
		jtextFieldEmail.setBounds(243, 139, 191, 51);
		contentPane.add(jtextFieldEmail);
		
		jdateChooser = new JDateChooser();
		jdateChooser.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		jdateChooser.setBounds(42, 377, 191, 51);
		contentPane.add(jdateChooser);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(243, 377, 203, 51);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Other");
		buttonGroup.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setBounds(138, 6, 59, 27);
		panel.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(6, 6, 55, 27);
		panel.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBounds(64, 6, 72, 27);
		panel.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		jbuttonRegister = new JButton("Register");
		jbuttonRegister.setFont(new Font("Times New Roman", Font.BOLD, 20));
		jbuttonRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonRegister_actionPerformed(e);
			}
		});
		jbuttonRegister.setBounds(167, 438, 134, 36);
		contentPane.add(jbuttonRegister);
		
		jpasswordField = new JPasswordField();
		jpasswordField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jpasswordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(new String(jpasswordField.getPassword()).equals("")) {
					jlabelPassword.setVisible(true);
				} else {
					jlabelPassword.setVisible(false);
				}
				
				
			}
		});
		jpasswordField.setBounds(42, 289, 337, 51);
		contentPane.add(jpasswordField);
		
		jlabelShow = new JLabel("");
		jlabelShow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jlabelShow.setVisible(false);
				jlabelHide.setVisible(true);
				jpasswordField.setEchoChar((char) 0);
			}
		});
		jlabelShow.setIcon(new ImageIcon(JFrameRegister.class.getResource("/icon/view.png")));
		jlabelShow.setBounds(389, 300, 45, 32);
		contentPane.add(jlabelShow);
		
		jlabelHide = new JLabel("");
		jlabelHide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jlabelShow.setVisible(true);
				jlabelHide.setVisible(false);
				jpasswordField.setEchoChar('*');
			}
		});
		jlabelHide.setIcon(new ImageIcon(JFrameRegister.class.getResource("/icon/invisible.png")));
		jlabelHide.setBounds(389, 303, 45, 32);
		contentPane.add(jlabelHide);
		
		lblNewLabel = new JLabel("REGISTER");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel.setBounds(140, 2, 190, 52);
		contentPane.add(lblNewLabel);
	}
	public void jtextFieldFirstname_keyPressed(KeyEvent e) {
		if(jtextFieldFirstname.getText().equals("")) {
			jlabelFirstName.setVisible(true);
		} else {
			jlabelFirstName.setVisible(false);
		}
		
	}
	public void jtextFieldLastName_keyPressed(KeyEvent e) {
		if(jtextFieldLastName.getText().equals("")) {
			jlabelLastName.setVisible(true);
		} else {
			jlabelLastName.setVisible(false);
		}
	}
	//7,nguyenhoangtu,acc7,123,28/03/2003,nguyenhoangtu@email.com,phone7,1
	public void jbuttonRegister_actionPerformed(ActionEvent e) {
		String content = "";
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		AccountModel accountModel = new AccountModel();
		content =  String.valueOf(accountModel.findAll().get(accountModel.findAll().size() - 1).getUserID() + 1) + ","
				+ jtextFieldFirstname.getText() + jtextFieldLastName.getText() + "," + jtextFieldUsername.getText() + ","
				+ new String(jpasswordField.getPassword()) + "," + dateFormat.format(jdateChooser.getDate()) + "," + jtextFieldEmail.getText() + "," 
				+ jtextFieldPhone.getText() + "," + "1";
		System.out.println(content);
		if(accountModel.createNewAccount(content)) {
			JOptionPane.showMessageDialog(this, "Tạo tài khoản thành công! Mời đăng nhập");
			this.setVisible(false);
			JFrameLogin frameLogin = new JFrameLogin();
			frameLogin.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(this, "Thất bại");
		}
	}
}
