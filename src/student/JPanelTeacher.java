package student;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import entities.Teacher;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Map;

import javax.swing.ImageIcon;

public class JPanelTeacher extends JPanel {
	private JLabel jlabelImage;
	private JLabel jlabelTeacherName;
	private Map<String, Object> data;
	/**
	 * Create the panel.
	 */
	public JPanelTeacher() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		jlabelImage = new JLabel("");
		jlabelImage.setBorder(new LineBorder(new Color(0, 0, 0)));
		jlabelImage.setBounds(10, 21, 188, 181);
		panel.add(jlabelImage);
		
		jlabelTeacherName = new JLabel("Teacher Name");
		jlabelTeacherName.setFont(new Font("Times New Roman", Font.BOLD, 25));
		jlabelTeacherName.setBounds(231, 21, 278, 36);
		panel.add(jlabelTeacherName);
		
		JLabel lblKinhNghimCng = new JLabel("Kinh nghi\u1EC7m c\u00F4ng t\u00E1c");
		lblKinhNghimCng.setIcon(new ImageIcon(JPanelTeacher.class.getResource("/icon/Info.png")));
		lblKinhNghimCng.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblKinhNghimCng.setBounds(231, 67, 301, 36);
		panel.add(lblKinhNghimCng);
		
		JLabel lblNewLabel = new JLabel("Qu\u1EA3n l\u00FD \u0111\u00E0o t\u1EA1o t\u1EA1i T - Academy");
		lblNewLabel.setIcon(new ImageIcon(JPanelTeacher.class.getResource("/icon/check-mark.png")));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(257, 113, 340, 36);
		panel.add(lblNewLabel);
		
		JLabel lblVTr = new JLabel("V\u1ECB tr\u00ED \u0111\u00E3 t\u1EEBng \u0111\u1EA3m nhi\u1EC7m: Developer, Teamleader, ");
		lblVTr.setIcon(new ImageIcon(JPanelTeacher.class.getResource("/icon/check-mark.png")));
		lblVTr.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblVTr.setBounds(257, 159, 448, 36);
		panel.add(lblVTr);
		
		JLabel lblProjectManagerTraining = new JLabel(" Project manager, Training manager.");
		lblProjectManagerTraining.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblProjectManagerTraining.setBounds(257, 189, 340, 36);
		panel.add(lblProjectManagerTraining);
		
		JLabel lblKinhNghimCng_1 = new JLabel("Th\u00F4ng tin li\u00EAn h\u1EC7");
		lblKinhNghimCng_1.setIcon(new ImageIcon(JPanelTeacher.class.getResource("/icon/Profile.png")));
		lblKinhNghimCng_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblKinhNghimCng_1.setBounds(231, 235, 301, 36);
		panel.add(lblKinhNghimCng_1);
		
		JLabel lblFacebookHttpswwwfacebookcomluutruonghailan = new JLabel("Facebook: https://www.facebook.com/giangvien\r\n");
		lblFacebookHttpswwwfacebookcomluutruonghailan.setIcon(new ImageIcon(JPanelTeacher.class.getResource("/icon/facebook.png")));
		lblFacebookHttpswwwfacebookcomluutruonghailan.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblFacebookHttpswwwfacebookcomluutruonghailan.setBounds(257, 281, 448, 36);
		panel.add(lblFacebookHttpswwwfacebookcomluutruonghailan);
		
		JLabel lblPhoneXxx = new JLabel("Phone: 0383 xxx xxx");
		lblPhoneXxx.setIcon(new ImageIcon(JPanelTeacher.class.getResource("/icon/telephone.png")));
		lblPhoneXxx.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPhoneXxx.setBounds(257, 327, 448, 36);
		panel.add(lblPhoneXxx);
		
		JLabel lblGmailGiangviengmailcom = new JLabel("Gmail: giangvien@gmail.com\r\n");
		lblGmailGiangviengmailcom.setIcon(new ImageIcon(JPanelTeacher.class.getResource("/icon/gmail.png")));
		lblGmailGiangviengmailcom.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblGmailGiangviengmailcom.setBounds(257, 373, 448, 36);
		panel.add(lblGmailGiangviengmailcom);

	}
	public JPanelTeacher(Map<String, Object> data) {
		this();
		this.data = data;
		initJFrame();
	}
	public void initJFrame() {
		Teacher teacher = (Teacher) data.get("teacherName");
		jlabelTeacherName.setText(teacher.getName());
		ImageIcon imageIcon = new ImageIcon(new ImageIcon(teacher.getImage()).getImage().getScaledInstance(jlabelImage.getWidth(), 
				jlabelImage.getHeight(), Image.SCALE_DEFAULT));
		jlabelImage.setIcon(imageIcon);
	}
}
