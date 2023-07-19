package student;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import entities.Account;
import entities.Manager;
import model.CourseModel;
import model.ManagerModel;



import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Map;
import javax.swing.ListSelectionModel;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JPanelManager extends JPanel {
	private JTable jtableManager;
	private Map<String, Object> data;
	private String valueName;
	private JLabel jlabelLichHoc;
	private JLabel jlabelGioHoc;

	/**
	 * Create the panel.
	 */
	public JPanelManager() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("My Course");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_3.add(scrollPane, BorderLayout.CENTER);
		
		jtableManager = new JTable();
		jtableManager.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jtableCourse_mouseClicked(e);
			}
		});
		jtableManager.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(jtableManager);
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Lịch học: ");
		lblNewLabel_1.setIcon(new ImageIcon(JPanelManager.class.getResource("/icon/Load.png")));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(58, 10, 93, 30);
		panel_5.add(lblNewLabel_1);
		
		jlabelLichHoc = new JLabel("*lichhoc");
		jlabelLichHoc.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		jlabelLichHoc.setBounds(68, 67, 93, 30);
		panel_5.add(jlabelLichHoc);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Giờ học:");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(JPanelManager.class.getResource("/icon/clock.png")));
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(58, 123, 93, 30);
		panel_5.add(lblNewLabel_1_1_1);
		
		jlabelGioHoc = new JLabel("*giohoc");
		jlabelGioHoc.setFont(new Font("Times New Roman", Font.BOLD, 15));
		jlabelGioHoc.setBounds(68, 178, 93, 30);
		panel_5.add(jlabelGioHoc);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(JPanelManager.class.getResource("/icon/Info.png")));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(10, 242, 35, 44);
		panel_5.add(lblNewLabel_2);
		
		JTextPane txtpnClickVoKha = new JTextPane();
		txtpnClickVoKha.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		txtpnClickVoKha.setText("Click vào khóa học để xem chi tiết lịch học");
		txtpnClickVoKha.setEditable(false);
		txtpnClickVoKha.setEnabled(false);
		txtpnClickVoKha.setBounds(44, 242, 127, 83);
		panel_5.add(txtpnClickVoKha);

	}
	public JPanelManager(Map<String, Object> data) {
		this();
		this.data = data;
		initJFrame();
	}
	
	public void initJFrame() {
		Account account = (Account) data.get("user");
		ManagerModel managerModel = new ManagerModel();
		CourseModel courseModel = new CourseModel();
		DefaultTableModel defaultTableModel = new DefaultTableModel() {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		defaultTableModel.addColumn("Course Name");
		defaultTableModel.addColumn("Classroom");
		defaultTableModel.addColumn("Date Register");
		defaultTableModel.addColumn("");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		for (Manager managers : managerModel.findManagerByStudent(account.getUserID())) {
			try {
				defaultTableModel.addRow(new Object[] {
						courseModel.findCourseByID(managers.getMakh()).getCourseName(), managers.getPhonghoc(), dateFormat.format(managers.getNgaydangky()),
						Files.readAllBytes(Paths.get(courseModel.findCourseByID(managers.getMakh()).getImage()))
				});
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		jtableManager.setModel(defaultTableModel);
		jtableManager.getTableHeader().setReorderingAllowed(false);
		jtableManager.getColumnModel().getColumn(3).setCellRenderer(new ImageCellRender());
		jtableManager.setRowHeight(90);
		
		
	}
	private class ImageCellRender extends DefaultTableCellRenderer{

		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			JLabel jLabel = new JLabel();
			byte[] bytes = (byte[]) value;
			ImageIcon imageIcon=new ImageIcon(new ImageIcon(bytes).getImage().getScaledInstance(130, 70,Image.SCALE_DEFAULT));
			jLabel.setIcon(imageIcon);
			//CHỈNH CHO HÌNH VÀO CHÍNH GIỮA
			jLabel.setHorizontalAlignment(JLabel.CENTER);
			return jLabel;
			
		}
	}
	public void jtableCourse_mouseClicked(MouseEvent e) {
		CourseModel courseModel = new CourseModel();
		int getSelectedRow = jtableManager.getSelectedRow();
		valueName = jtableManager.getValueAt(getSelectedRow, 0).toString();
		jlabelLichHoc.setText("Thứ: " + courseModel.findCourseByName(valueName).getNgayhoc());
		jlabelGioHoc.setText("Từ: " + courseModel.findCourseByName(valueName).getGiohoc() + " giờ");
		
	}
}
