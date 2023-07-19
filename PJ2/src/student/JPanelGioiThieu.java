package student;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Map;

import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;

import entities.Course;

import javax.swing.ImageIcon;

public class JPanelGioiThieu extends JPanel {
	private JTextPane txtpnKtQut;
	private Map<String, Object> data;
	private JLabel jlabelBuoiHoc;
	private JLabel jlabelImage;
	/**
	 * Create the panel.
	 */
	public JPanelGioiThieu() {
		setLayout(null);
		
		jlabelImage = new JLabel("");
		jlabelImage.setBorder(new LineBorder(new Color(0, 0, 0)));
		jlabelImage.setBounds(416, 10, 327, 194);
		add(jlabelImage);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 10, 396, 194);
		add(panel);
		panel.setLayout(null);
		
		JLabel jlabel = new JLabel("S\u1ED1 bu\u1ED5i h\u1ECDc Offline:");
		jlabel.setIcon(new ImageIcon(JPanelGioiThieu.class.getResource("/icon/check-mark.png")));
		jlabel.setBounds(10, 10, 206, 25);
		jlabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel.add(jlabel);
		
		jlabelBuoiHoc = new JLabel("");
		jlabelBuoiHoc.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jlabelBuoiHoc.setBounds(210, 10, 100, 25);
		panel.add(jlabelBuoiHoc);
		
		JTextPane txtpnNgoiThiGian = new JTextPane();
		txtpnNgoiThiGian.setFocusable(false);
		txtpnNgoiThiGian.setCaretColor(new Color(240, 240, 240));
		txtpnNgoiThiGian.setBorder(null);
		txtpnNgoiThiGian.setEditable(false);
		txtpnNgoiThiGian.setBackground(new Color(240, 240, 240));
		txtpnNgoiThiGian.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtpnNgoiThiGian.setText(" - Ngo\u00E0i th\u1EDDi gian h\u1ED7 tr\u1EE3 tr\u1EF1c ti\u1EBFp t\u1EA1i l\u1EDBp, h\u1ED7 tr\u1EE3 online 24/7 th\u00F4ng qua group Zalo ri\u00EAng c\u1EE7a l\u1EDBp.\r\n - H\u1ECDc ki\u1EBFn th\u1EE9c n\u00E2ng cao c\u00F9ng gi\u1EA3ng vi\u00EAn, th\u1EF1c h\u00E0nh c\u00E1c b\u00E0i t\u1EADp m\u1EDF r\u1ED9ng, project th\u1EF1c t\u1EBF\r\n");
		txtpnNgoiThiGian.setBounds(10, 45, 376, 139);
		panel.add(txtpnNgoiThiGian);
		
		txtpnKtQut = new JTextPane();
		txtpnKtQut.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		txtpnKtQut.setBounds(10, 231, 733, 199);
		add(txtpnKtQut);
		txtpnKtQut.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpnKtQut.setBackground(new Color(240, 240, 240));
		txtpnKtQut.setText("K\u1EBFt qu\u1EA3 \u0111\u1EA1t \u0111\u01B0\u1EE3c\r\n- N\u1EC1n t\u1EA3ng v\u00E0 t\u01B0 duy l\u1EADp tr\u00ECnh v\u1EEFng ch\u1EAFc \u0111\u1EC3 h\u1ECDc s\u00E2u c\u00E1c kh\u00F3a h\u1ECDc d\u00E0nh cho l\u1EADp tr\u00ECnh vi\u00EAn frontend, backend, fullstack, mobile, application\r\n- R\u00E8n luy\u1EC7n n\u00E2ng cao t\u01B0 duy l\u1EADp tr\u00ECnh v\u00E0 t\u01B0 duy gi\u1EA3i quy\u1EBFt v\u1EA5n \u0111\u1EC1 trong th\u1EF1c t\u1EBF\r\n- Th\u00E0nh th\u1EA1o v\u1EDBi c\u00E1c gi\u1EA3i thu\u1EADt th\u01B0\u1EDDng g\u1EB7p trong th\u1EF1c t\u1EBF\r\n- N\u1EAFm v\u1EEFng c\u00E1c k\u1EF9 thu\u1EADt thao t\u00E1c v\u1EDBi Array v\u00E0 String trong th\u1EF1c t\u1EBF\r\n- D\u1EC5 d\u00E0ng t\u1EF1 h\u1ECDc n\u00E2ng cao ki\u1EBFn th\u1EE9c v\u00E0 h\u1ECDc sang c\u00E1c ng\u00F4n ng\u1EEF l\u1EADp tr\u00ECnh kh\u00E1c\r\n- K\u1EF9 n\u0103ng t\u00ECm ki\u1EBFm t\u00E0i li\u1EC7u tr\u00EAn Google, Stackoverflow\r\n- K\u1EF9 n\u0103ng t\u1ED1i \u01B0u m\u00E3 ngu\u1ED3n, clean code, vi\u1EBFt code \u0111\u1EC3 c\u00F3 th\u1EC3 t\u00E1i s\u1EED d\u1EE5ng\r\n- D\u1EC5 d\u00E0ng h\u1ECDc n\u00E2ng cao m\u1ED9t ng\u00F4n ng\u1EEF ho\u1EB7c chuy\u1EC3n sang m\u1ED9t ng\u00F4n ng\u1EEF l\u1EADp tr\u00ECnh kh\u00E1c");
		txtpnKtQut.setEditable(false);

	}
	public JPanelGioiThieu(Map<String, Object> data) {
		this();
		this.data = data;
		initJFrame();
		
	}
	public void initJFrame() {
		Course course = (Course) data.get("course"); 
		jlabelBuoiHoc.setText(course.getDuration());
		ImageIcon imageIcon = new ImageIcon(new ImageIcon(course.getImage()).getImage().getScaledInstance(jlabelImage.getWidth(), 
				jlabelImage.getHeight(), Image.SCALE_DEFAULT));
		jlabelImage.setIcon(imageIcon);
		
	}
}
