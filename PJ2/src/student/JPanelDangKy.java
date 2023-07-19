package student;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.Date;
import java.util.Map;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;

import entities.Account;
import entities.Course;
import model.ManagerModel;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class JPanelDangKy extends JPanel {
	private JTextField jtextFieldName;
	private JTextField jtextFieldPhone;
	private JTextField jtextFieldEmail;
	private JButton jbuttonTenKhoaHoc;
	private JButton jbuttonPrice;
	private JLabel jlabelLichHoc;
	private JButton jbuttonDangKy;
	private Map<String, Object> data;
	private JLabel jlabelGioHoc;

	/**
	 * Create the panel.
	 */
	public JPanelDangKy() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel panel_3 = new JPanel();
		add(panel_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 153, 255));
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("\u0110\u0103ng k\u00FD kh\u00F3a h\u1ECDc");
		lblNewLabel.setBackground(new Color(153, 153, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("X\u00E1c nh\u1EADn th\u00F4ng tin \u0111\u0103ng k\u00FD");
		lblNewLabel_1.setIcon(new ImageIcon(JPanelDangKy.class.getResource("/icon/Load.png")));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(22, 10, 267, 33);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("H\u1ECD v\u00E0 t\u00EAn: ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(44, 53, 68, 33);
		panel_2.add(lblNewLabel_2);
		
		jtextFieldName = new JTextField();
		jtextFieldName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		jtextFieldName.setBounds(143, 53, 146, 33);
		panel_2.add(jtextFieldName);
		jtextFieldName.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i:");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(44, 103, 89, 33);
		panel_2.add(lblNewLabel_2_1);
		
		jtextFieldPhone = new JTextField();
		jtextFieldPhone.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		jtextFieldPhone.setColumns(10);
		jtextFieldPhone.setBounds(143, 103, 146, 33);
		panel_2.add(jtextFieldPhone);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("\u0110\u1ECBa ch\u1EC9 Email:");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_1_1.setBounds(44, 156, 89, 33);
		panel_2.add(lblNewLabel_2_1_1);
		
		jtextFieldEmail = new JTextField();
		jtextFieldEmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		jtextFieldEmail.setColumns(10);
		jtextFieldEmail.setBounds(143, 156, 146, 33);
		panel_2.add(jtextFieldEmail);
		
		JLabel lblNewLabel_3 = new JLabel("Kh\u00F3a h\u1ECDc: ");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(127, 222, 89, 33);
		panel_2.add(lblNewLabel_3);
		
		jbuttonTenKhoaHoc = new JButton("T\u00EAn kh\u00F3a h\u1ECDc");
		jbuttonTenKhoaHoc.setForeground(new Color(255, 255, 255));
		jbuttonTenKhoaHoc.setFocusPainted(false);
		jbuttonTenKhoaHoc.setBorderPainted(false);
		jbuttonTenKhoaHoc.setBackground(new Color(153, 153, 255));
		jbuttonTenKhoaHoc.setFont(new Font("Times New Roman", Font.BOLD, 15));
		jbuttonTenKhoaHoc.setBounds(214, 215, 166, 48);
		panel_2.add(jbuttonTenKhoaHoc);
		
		JLabel lblNewLabel_3_1 = new JLabel("Gi\u00E1:");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(412, 222, 49, 33);
		panel_2.add(lblNewLabel_3_1);
		
		jbuttonPrice = new JButton("Gi\u00E1 kh\u00F3a h\u1ECDc");
		jbuttonPrice.setForeground(new Color(255, 255, 255));
		jbuttonPrice.setFocusPainted(false);
		jbuttonPrice.setBorderPainted(false);
		jbuttonPrice.setBackground(new Color(153, 153, 255));
		jbuttonPrice.setFont(new Font("Times New Roman", Font.BOLD, 15));
		jbuttonPrice.setBounds(471, 215, 166, 48);
		panel_2.add(jbuttonPrice);
		
		JTextPane txtpnLuV = new JTextPane();
		txtpnLuV.setEditable(false);
		txtpnLuV.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtpnLuV.setText("L\u01B0u \u00FD\r\nV\u00EC s\u1ED1 l\u01B0\u1EE3ng h\u1ECDc vi\u00EAn \u1EDF m\u1ED7i l\u1EDBp r\u1EA5t gi\u1EDBi h\u1EA1n (ch\u1EC9 10 h\u1ECDc vi\u00EAn / l\u1EDBp), n\u00EAn sau khi \u0111\u0103ng k\u00FD, b\u1EA1n vui l\u00F2ng thanh to\u00E1n h\u1ECDc ph\u00ED \u0111\u1EC3 ho\u00E0n t\u1EA5t ghi danh v\u00E0 gi\u1EEF ch\u1ED7. C\u00E1c tr\u01B0\u1EDDng h\u1EE3p \u0111\u0103ng k\u00FD s\u1EDBm nh\u01B0ng n\u1ED9p h\u1ECDc ph\u00ED tr\u1EC5, d\u1EABn \u0111\u1EBFn l\u1EDBp h\u1ECDc \u0111\u00E3 \u0111\u1EE7 ng\u01B0\u1EDDi, T - Academy s\u1EBD kh\u00F4ng gi\u1EA3i quy\u1EBFt.\r\nNgay sau khi ho\u00E0n t\u1EA5t ghi danh, b\u1EA1n s\u1EBD \u0111\u01B0\u1EE3c c\u1EA5p th\u1EBB h\u1ECDc vi\u00EAn c\u1EE7a trung t\u00E2m v\u00E0 l\u1ECBch h\u1ECDc c\u1EE7a kh\u00F3a h\u1ECDc.");
		txtpnLuV.setBounds(332, 53, 364, 138);
		panel_2.add(txtpnLuV);
		
		JLabel lblNewLabel_3_2 = new JLabel("L\u1ECBch h\u1ECDc: ");
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3_2.setBounds(127, 288, 68, 33);
		panel_2.add(lblNewLabel_3_2);
		
		jlabelLichHoc = new JLabel("lich hoc");
		jlabelLichHoc.setFont(new Font("Times New Roman", Font.BOLD, 15));
		jlabelLichHoc.setBounds(214, 288, 89, 33);
		panel_2.add(jlabelLichHoc);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Th\u1EDDi gian:");
		lblNewLabel_3_2_1.setIcon(new ImageIcon(JPanelDangKy.class.getResource("/icon/clock.png")));
		lblNewLabel_3_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3_2_1.setBounds(412, 288, 105, 33);
		panel_2.add(lblNewLabel_3_2_1);
		
		jlabelGioHoc = new JLabel("19h30 - 21g");
		jlabelGioHoc.setFont(new Font("Times New Roman", Font.BOLD, 15));
		jlabelGioHoc.setBounds(548, 288, 89, 33);
		panel_2.add(jlabelGioHoc);
		
		jbuttonDangKy = new JButton("\u0110\u0103ng k\u00FD");
		jbuttonDangKy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonDangKy_actionPerformed(e);
			}
		});
		jbuttonDangKy.setFont(new Font("Times New Roman", Font.BOLD, 15));
		jbuttonDangKy.setBounds(300, 331, 105, 34);
		panel_2.add(jbuttonDangKy);

	}
	public JPanelDangKy(Map<String, Object> data) {
		this();
		this.data = data;
		initJframe();
		
	}
	public void initJframe() {
		Course course = (Course) data.get("course");
		Account account = (Account) data.get("user");
		jbuttonTenKhoaHoc.setText(course.getCourseName());
		jbuttonPrice.setText(String.valueOf(course.getFee()));
		jtextFieldName.setText(account.getFullName());
		jtextFieldPhone.setText(account.getPhone());
		jtextFieldEmail.setText(account.getEmail());
		jlabelLichHoc.setText("Thứ: " + course.getNgayhoc());
		jlabelGioHoc.setText("Giờ: " + course.getGiohoc());
	}
	//4,2,1,p01,10-02-2023
	public void jbuttonDangKy_actionPerformed(ActionEvent e) {
		Course course = (Course) data.get("course");
		Account account = (Account) data.get("user");
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		//findAll().get(findAll().size() - 1).getUserID() + 1
		ManagerModel managerModel = new ManagerModel();
		String content = String.valueOf(managerModel.findAll().get(managerModel.findAll().size() - 1).getId() + 1) 
				+ "," + String.valueOf(account.getUserID()) + "," + String.valueOf(course.getCourseID()) + "," 
				+ "p0" + String.valueOf(course.getCourseID()) + "," + dateFormat.format(new Date());
		if(jtextFieldName.getText().equals("") || jtextFieldEmail.getText().equals("") || jtextFieldPhone.getText().equals("")){
			JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!");
		}else if(managerModel.createManager(content)) {
			JOptionPane.showMessageDialog(this, "Đăng ký thành công");
			
		} else {
			JOptionPane.showConfirmDialog(this, "Đăng ký thất bại");
		}
	}
}
