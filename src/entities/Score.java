package entities;

import java.util.Date;

import Controller.ControllerScoreInterface;
import model.ScoreModel;
import model.ScoreModelInterface;

public class Score {
//mssv, diemquatrinh, diemgiuaki, diemcuoiki, xeploai(null), ngaynhap
	private int mssv;
	private int courseID;
	private double diemquatrinh;
	private double diemgiuaki;
	private double diemcuoiki;
	private String xeploai;
	private Date ngaynhap;
	private ScoreModelInterface scoreModelInterface ;
	public Score(int mssv, int courseID, double diemquatrinh, double diemgiuaki, double diemcuoiki, String xeploai,
			Date ngaynhap) {
		super();
		this.mssv = mssv;
		this.courseID = courseID;
		this.diemquatrinh = diemquatrinh;
		this.diemgiuaki = diemgiuaki;
		this.diemcuoiki = diemcuoiki;
		this.xeploai = xeploai;
		this.ngaynhap = ngaynhap;
	}
	
	public Score(double diemquatrinh, double diemgiuaki, double diemcuoiki) {
		super();
		this.diemquatrinh = diemquatrinh;
		this.diemgiuaki = diemgiuaki;
		this.diemcuoiki = diemcuoiki;
	}


	public Score(ScoreModelInterface scoreModelInterface) {
		super();
		this.scoreModelInterface = scoreModelInterface;
	}

	public int getMssv() {
		return mssv;
	}
	public void setMssv(int mssv) {
		this.mssv = mssv;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public double getDiemquatrinh() {
		return diemquatrinh;
	}
	public void setDiemquatrinh(double diemquatrinh) {
		this.diemquatrinh = diemquatrinh;
	}
	public double getDiemgiuaki() {
		return diemgiuaki;
	}
	public void setDiemgiuaki(double diemgiuaki) {
		this.diemgiuaki = diemgiuaki;
	}
	public double getDiemcuoiki() {
		return diemcuoiki;
	}
	public void setDiemcuoiki(double diemcuoiki) {
		this.diemcuoiki = diemcuoiki;
	}
	public String getXeploai() {
		return xeploai;
	}
	public void setXeploai(String xeploai) {
		this.xeploai = xeploai;
	}
	public Date getNgaynhap() {
		return ngaynhap;
	}
	public void setNgaynhap(Date ngaynhap) {
		this.ngaynhap = ngaynhap;
	}
	public void createRank(Score score) {
		scoreModelInterface.rank(score);
	}
	public void createRank2(Score score) {
		scoreModelInterface.rank2(score);
	}
	
	@Override
	public String toString() {
		return "Score [mssv=" + mssv + ", courseID=" + courseID + ", diemquatrinh=" + diemquatrinh + ", diemgiuaki="
				+ diemgiuaki + ", diemcuoiki=" + diemcuoiki + ", xeploai=" + xeploai + ", ngaynhap=" + ngaynhap + "]";
	}
	
}
