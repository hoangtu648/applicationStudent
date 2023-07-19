package student;

import javax.swing.JPanel;
import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import entities.Account;
import entities.Student;
import model.AccountModel;
import model.StudentModel;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class JPanelProfile extends JPanel {
	private JLabel jlabelImage;
	private JButton jbuttonBrowse;
	private JTextField jtextFieldStudentID;
	private JTextField jtextFieldAccountID;
	private JTextField jtextFieldFullName;
	private JTextField jtextFieldEmail;
	private JTextField jtextFieldPhone;
	private JTextField jtextFieldAddress;
	private final ButtonGroup buttonGroupGender = new ButtonGroup();
	private JButton jbuttonSave;
	private JComboBox jcomboBoxCity;
	private File file;
	private Map<String, Object> data;
	private JDateChooser jdateChooser;
	private JRadioButton jgenderMale;
	private JRadioButton jgenderFemale;
	private JRadioButton jgenderOther;

	/**
	 * Create the panel.
	 */
	public JPanelProfile() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 153, 255));
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("My Profile");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 153, 255));
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		jlabelImage = new JLabel("");
		jlabelImage.setBorder(new LineBorder(new Color(0, 0, 0)));
		jlabelImage.setBounds(10, 36, 168, 181);
		panel_2.add(jlabelImage);
		
		jbuttonBrowse = new JButton("Browse...");
		jbuttonBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonBrowse_actionPerformed(e);
			}
		});
		jbuttonBrowse.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		jbuttonBrowse.setBounds(10, 227, 168, 21);
		panel_2.add(jbuttonBrowse);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(153, 153, 255));
		panel_4.setBorder(null);
		panel_4.setBounds(305, 20, 600, 239);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Student ID: ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 23, 85, 21);
		panel_4.add(lblNewLabel_1);
		
		jtextFieldStudentID = new JTextField();
		jtextFieldStudentID.setEditable(false);
		jtextFieldStudentID.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		jtextFieldStudentID.setBounds(105, 23, 116, 30);
		panel_4.add(jtextFieldStudentID);
		jtextFieldStudentID.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Account ID: ");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(300, 26, 85, 21);
		panel_4.add(lblNewLabel_1_1);
		
		jtextFieldAccountID = new JTextField();
		jtextFieldAccountID.setEditable(false);
		jtextFieldAccountID.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		jtextFieldAccountID.setColumns(10);
		jtextFieldAccountID.setBounds(389, 23, 116, 30);
		panel_4.add(jtextFieldAccountID);
		
		JLabel lblNewLabel_1_2 = new JLabel("Full Name: ");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(10, 65, 85, 21);
		panel_4.add(lblNewLabel_1_2);
		
		jtextFieldFullName = new JTextField();
		jtextFieldFullName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		jtextFieldFullName.setColumns(10);
		jtextFieldFullName.setBounds(105, 65, 116, 30);
		panel_4.add(jtextFieldFullName);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Date Of Birth: ");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_2_1.setBounds(10, 109, 103, 21);
		panel_4.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Email: ");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(10, 156, 85, 21);
		panel_4.add(lblNewLabel_1_3);
		
		jtextFieldEmail = new JTextField();
		jtextFieldEmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		jtextFieldEmail.setColumns(10);
		jtextFieldEmail.setBounds(105, 156, 116, 30);
		panel_4.add(jtextFieldEmail);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Phone: ");
		lblNewLabel_1_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_3_1.setBounds(300, 65, 62, 21);
		panel_4.add(lblNewLabel_1_3_1);
		
		jtextFieldPhone = new JTextField();
		jtextFieldPhone.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		jtextFieldPhone.setColumns(10);
		jtextFieldPhone.setBounds(389, 65, 116, 30);
		panel_4.add(jtextFieldPhone);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("City: ");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(300, 112, 85, 21);
		panel_4.add(lblNewLabel_1_1_1);
		
		jcomboBoxCity = new JComboBox();
		jcomboBoxCity.setBounds(389, 110, 116, 30);
		panel_4.add(jcomboBoxCity);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Address: ");
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_1_2.setBounds(300, 159, 85, 21);
		panel_4.add(lblNewLabel_1_1_2);
		
		jtextFieldAddress = new JTextField();
		jtextFieldAddress.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		jtextFieldAddress.setColumns(10);
		jtextFieldAddress.setBounds(389, 156, 116, 30);
		panel_4.add(jtextFieldAddress);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Gender: ");
		lblNewLabel_1_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_1_3.setBounds(10, 204, 85, 21);
		panel_4.add(lblNewLabel_1_1_3);
		
		jgenderMale = new JRadioButton("Male");
		jgenderMale.setSelected(true);
		buttonGroupGender.add(jgenderMale);
		jgenderMale.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		jgenderMale.setBounds(105, 205, 85, 20);
		panel_4.add(jgenderMale);
		
		jgenderFemale = new JRadioButton("Female");
		buttonGroupGender.add(jgenderFemale);
		jgenderFemale.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		jgenderFemale.setBounds(192, 204, 85, 20);
		panel_4.add(jgenderFemale);
		
		jgenderOther = new JRadioButton("Other");
		buttonGroupGender.add(jgenderOther);
		jgenderOther.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		jgenderOther.setBounds(277, 205, 85, 20);
		panel_4.add(jgenderOther);
		
		jdateChooser = new JDateChooser();
		jdateChooser.setBounds(105, 105, 116, 30);
		panel_4.add(jdateChooser);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(153, 153, 255));
		add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		jbuttonSave = new JButton("Save");
		jbuttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbuttonSave_actionPerformed(e);
			}
		});
		jbuttonSave.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel_3.add(jbuttonSave);

	}
	public JPanelProfile(Map<String, Object> data) {
		this();
		this.data = data;
		initJFrame();
	}
	public void initJFrame() {
		Account account = (Account) data.get("user");
		StudentModel studentModel = new StudentModel();
 		if(account.getUserID() < 10) {
			jtextFieldStudentID.setText("st0" + String.valueOf(account.getUserID()));
			jtextFieldAccountID.setText(String.valueOf(account.getUserID()));
		} else {
			jtextFieldStudentID.setText("st" + String.valueOf(account.getUserID()));
			jtextFieldAccountID.setText("0" + String.valueOf(account.getUserID()));
		}
		DefaultComboBoxModel<String> boxModel = new DefaultComboBoxModel<String>();
		boxModel.addElement("Ha Noi");
		boxModel.addElement("Da Nang");
		boxModel.addElement("Ho Chi Minh");
		
		jcomboBoxCity.setModel(boxModel);
		if(studentModel.checkStudent(account.getUserID()) != null) {
			ImageIcon imageIcon = new ImageIcon(new ImageIcon(studentModel.checkStudent(account.getUserID()).getImage()).getImage().getScaledInstance(jlabelImage.getWidth(), 
					jlabelImage.getHeight(), Image.SCALE_DEFAULT));
			jtextFieldFullName.setText(studentModel.checkStudent(account.getUserID()).getFullName());
			jtextFieldAddress.setText(studentModel.checkStudent(account.getUserID()).getAddress());
			jtextFieldPhone.setText(studentModel.checkStudent(account.getUserID()).getPhone());
			jlabelImage.setIcon(imageIcon);
			jdateChooser.setDate(studentModel.checkStudent(account.getUserID()).getDob());
			jdateChooser.setDateFormatString("dd-MM-yyyy");
			jtextFieldEmail.setText(studentModel.checkStudent(account.getUserID()).getEmail());
			if(studentModel.checkStudent(account.getUserID()).getGender().equalsIgnoreCase("Male")) {
				jgenderMale.setSelected(true);
			} else if(studentModel.checkStudent(account.getUserID()).getGender().equalsIgnoreCase("Female")){
				jgenderFemale.setSelected(true);
			} else {
				jgenderOther.setSelected(true);
			}
				
			
		} 
			
	

	}
	
	public void jbuttonBrowse_actionPerformed(ActionEvent e) {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Select a photo");
		fileChooser.setMultiSelectionEnabled(false);
		int result = fileChooser.showOpenDialog(this);
		if(result == fileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();
			ImageIcon imageIcon = new ImageIcon(new ImageIcon(file.getAbsolutePath()).getImage().getScaledInstance(jlabelImage.getWidth(), 
					jlabelImage.getHeight(), Image.SCALE_DEFAULT));
			
			jlabelImage.setIcon(imageIcon);
	}
		
		
}
	public void jbuttonSave_actionPerformed(ActionEvent e) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String gender = getElementSelected(buttonGroupGender);
		Account account = (Account) data.get("user");
		Student student = new Student();
		StudentModel model = new StudentModel();
		
		
		String content = account.getUserID() + "," + account.getUserID() + "," + jtextFieldFullName.getText() 
		+ "," + simpleDateFormat.format(jdateChooser.getDate()) + 
		"," + gender + "," + jtextFieldEmail.getText() + "," + jtextFieldPhone.getText() + "," 
		+ jtextFieldAddress.getText() + "," + file.getAbsolutePath();
		if(model.checkStudent(account.getUserID()) != null) {
			if(model.updateStudent(account.getUserID(), content)) {
				JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
			} else { 
				JOptionPane.showMessageDialog(this, "Thất bại!");
			}
		} else if(model.checkStudent(account.getUserID()) == null){
			if(model.createNewStudent(content)) {
				JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
				jtextFieldAddress.setText("");
				jtextFieldEmail.setText("");
				jtextFieldPhone.setText("");
				jtextFieldFullName.setText("");
				jdateChooser.setDate(null);
				jlabelImage.setIcon(null);
			} else {
				JOptionPane.showMessageDialog(this, "Thất bại!");
				}
			}
	}
	private String getElementSelected(ButtonGroup buttonGroup) {
		Enumeration<AbstractButton> elements = buttonGroup.getElements();
		
		while(elements.hasMoreElements()) {
			JRadioButton radioButton = (JRadioButton) elements.nextElement();
			if(radioButton.isSelected()) {
				return radioButton.getText();
				
			}
		}
		return null;
	}
//	public void fillData() {
//		StudentModel model = new StudentModel();
//		jdateChooser.setDateFormatString("dd/MM/YYYY");
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		
//		Account account = (Account) data.get("user");
//		if(model.checkStudent(account.getUserID()) != null) {
//			ImageIcon imageIcon = new ImageIcon(new ImageIcon(model.checkStudent(account.getUserID()).getImage()).getImage().getScaledInstance(jlabelImage.getWidth(), 
//					jlabelImage.getHeight(), Image.SCALE_DEFAULT));
//			
//			
//			jtextFieldAddress.setText(model.checkStudent(account.getUserID()).getAddress());
//			jtextFieldEmail.setText(model.checkStudent(account.getUserID()).getEmail());
//			jtextFieldPhone.setText(model.checkStudent(account.getUserID()).getPhone());
//			jtextFieldFullName.setText(model.checkStudent(account.getUserID()).getFullName());
//			jdateChooser.setDate(model.checkStudent(account.getUserID()).getDob());
//			jlabelImage.setIcon(imageIcon);
//		}
//	}
}
