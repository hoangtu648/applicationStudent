package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
	private int userID;
	private String fullName;
	private String userName;
	private String password;

	private String email;
	private String phone;
	private int role;
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public Account(int userID, String fullName, String userName, String password, String email, String phone,
			int role) {
		super();
		this.userID = userID;
		this.fullName = fullName;
		this.userName = userName;
		this.password = password;
	
		this.email = email;
		this.phone = phone;
		this.role = role;
	}
	public Account() {
		super();
	}
	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		return "Account [userID=" + userID + ", fullName=" + fullName + ", userName=" + userName + ", password="
				+ password  + ", email=" + email + ", phone=" + phone + ", role=" + role + "]";
	}
	
}
