package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Course {
	private int courseID;
	private String courseName;
	private Date startDate;
	private double fee;
	private int teacherID;
	private String duration;
	private String image;
	private int quantity;
	private String ngayhoc;
	private String giohoc;

	public Course(int courseID, String courseName, Date startDate, double fee, int teacherID, String duration,
			String image, int quantity, String ngayhoc, String giohoc) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.startDate = startDate;
		this.fee = fee;
		this.teacherID = teacherID;
		this.duration = duration;
		this.image = image;
		this.quantity = quantity;
		this.ngayhoc = ngayhoc;
		this.giohoc = giohoc;
	}

	public Course() {
		super();
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public int getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getNgayhoc() {
		return ngayhoc;
	}

	public void setNgayhoc(String ngayhoc) {
		this.ngayhoc = ngayhoc;
	}

	public String getGiohoc() {
		return giohoc;
	}

	public void setGiohoc(String giohoc) {
		this.giohoc = giohoc;

	}



	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseName=" + courseName + ", startDate=" + startDate + ", fee="
				+ fee + ", teacherID=" + teacherID + ", duration=" + duration + ", image=" + image + ", quantity="
				+ quantity + ", ngayhoc=" + ngayhoc + ", giohoc=" + giohoc + "]";
	}

}
