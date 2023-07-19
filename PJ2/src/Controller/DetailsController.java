package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import student.JFrameDetails;

public class DetailsController implements ActionListener {
	JFrameDetails view;

	public DetailsController(JFrameDetails view) {
		super();
		this.view = view;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();

		if (src.equalsIgnoreCase("GIỚI THIỆU")) {
			view.viewGT();
		} else if (src.equalsIgnoreCase("LỘ TRÌNH")) {
			view.viewLoTrinh();
		} else if (src.equalsIgnoreCase("GIẢNG VIÊN")) {
			view.viewGingVien();
		} else if (src.equalsIgnoreCase("ĐĂNG KÝ")) {
			view.viewDangKy();
		}
	}
}
