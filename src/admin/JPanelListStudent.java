package admin;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import entities.Student;
import model.StudentModel;


public class JPanelListStudent extends JPanel {
	private JTable jtableListStudent;

	/**
	 * Create the panel.
	 */
	public JPanelListStudent() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		add(panel);
		
		JLabel lblNewLabel = new JLabel("List Student");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		jtableListStudent = new JTable();
		scrollPane.setViewportView(jtableListStudent);
		initJFrame();
	}
	public void initJFrame() {
		StudentModel studentModel = new StudentModel();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		DefaultTableModel defaultTableModel = new DefaultTableModel(){

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		defaultTableModel.addColumn("Mssv");
		defaultTableModel.addColumn("Name");
		defaultTableModel.addColumn("DOB");
		defaultTableModel.addColumn("Email");
		defaultTableModel.addColumn("Phone");
		defaultTableModel.addColumn("Image");
		for (Student students : studentModel.findAll()) {
			try {
				defaultTableModel.addRow(new Object[] {
						"st0" + students.getStudentID(), students.getFullName(), dateFormat.format(students.getDob()), students.getEmail(),
						students.getPhone(), Files.readAllBytes(Paths.get(students.getImage()))
				});
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		jtableListStudent.setModel(defaultTableModel);
		jtableListStudent.getTableHeader().setReorderingAllowed(false);
		jtableListStudent.getColumnModel().getColumn(5).setCellRenderer(new ImageCellRender());
		jtableListStudent.setRowHeight(70);
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

}
