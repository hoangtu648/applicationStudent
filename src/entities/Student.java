package entities;

import java.util.Arrays;
import java.util.Date;

public class Student {
	private int studentID;
	private int accountID;
	private String fullName;
	private Date dob;
	private String gender;
	private String email;
	private String phone;
	private String address;
	private String image;
	public Student(int studentID, int accountID, String fullName, Date dob, String gender, String email, String phone,
			String address, String image) {
		super();
		this.studentID = studentID;
		this.accountID = accountID;
		this.fullName = fullName;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.image = image;
	}
	public Student() {
		super();
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", accountID=" + accountID + ", fullName=" + fullName + ", dob="
				+ dob + ", gender=" + gender + ", email=" + email + ", phone=" + phone + ", address=" + address
				+ ", image=" + image + "]";
	}
	
	
}	
