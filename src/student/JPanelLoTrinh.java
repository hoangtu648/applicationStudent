package student;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.ImageIcon;

public class JPanelLoTrinh extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPanelLoTrinh() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ch\u01B0\u01A1ng 1: T\u1ED5ng quan v\u1EC1 c\u01A1 s\u1EDF d\u1EEF li\u1EC7u");
		lblNewLabel.setIcon(new ImageIcon(JPanelLoTrinh.class.getResource("/icon/check-mark.png")));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel.setBounds(45, 10, 683, 48);
		panel.add(lblNewLabel);
		
		JLabel lblChngM = new JLabel("Ch\u01B0\u01A1ng 2: M\u00F4 h\u00ECnh d\u1EEF li\u1EC7u quan h\u1EC7");
		lblChngM.setIcon(new ImageIcon(JPanelLoTrinh.class.getResource("/icon/check-mark.png")));
		lblChngM.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblChngM.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblChngM.setBounds(45, 79, 683, 48);
		panel.add(lblChngM);
		
		JLabel lblChngNgn = new JLabel("Ch\u01B0\u01A1ng 3: Ng\u00F4n ng\u1EEF truy v\u1EA5n d\u1EEF li\u1EC7u");
		lblChngNgn.setIcon(new ImageIcon(JPanelLoTrinh.class.getResource("/icon/check-mark.png")));
		lblChngNgn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblChngNgn.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblChngNgn.setBounds(45, 155, 683, 48);
		panel.add(lblChngNgn);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ch\u01B0\u01A1ng 4: R\u00E0ng bu\u1ED9c to\u00E0n v\u1EB9n");
		lblNewLabel_1_1.setIcon(new ImageIcon(JPanelLoTrinh.class.getResource("/icon/check-mark.png")));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_1_1.setBounds(45, 224, 683, 48);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblChngL = new JLabel("Ch\u01B0\u01A1ng 5: L\u00FD thuy\u1EBFt thi\u1EBFt k\u1EBF c\u01A1 s\u1EDF d\u1EEF li\u1EC7u");
		lblChngL.setIcon(new ImageIcon(JPanelLoTrinh.class.getResource("/icon/check-mark.png")));
		lblChngL.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblChngL.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblChngL.setBounds(45, 292, 683, 48);
		panel.add(lblChngL);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ph\u1EE5 l\u1EE5c: M\u1ED9t s\u1ED1 \u0111\u1EC1 ki\u1EC3m tra, \u0111\u1EC1 thi m\u00F4n CSDL");
		lblNewLabel_1_2.setIcon(new ImageIcon(JPanelLoTrinh.class.getResource("/icon/check-mark.png")));
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_1_2.setBounds(45, 361, 683, 48);
		panel.add(lblNewLabel_1_2);
		initJFrame();
	}
	public void initJFrame() {
		DefaultTableModel defaultTableModel = new DefaultTableModel();
		defaultTableModel.addColumn("");
		defaultTableModel.addRow(new Object[] {
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
		});
	}

}
