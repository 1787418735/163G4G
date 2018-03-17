/**
 * 
 */
package com.qhit.lh.g4.sea.t1.bean;

/**
 * @author 李海洋
 *TODO
 *2017年12月9日上午11:05:00
 */
public class User {
	private int userId;
	private String userName;
	private String userPassword;
	private String userSex;
	private int userAge;
	private String phone;
	private String QQ;
	private String address;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String userName, String userPassword, String userSex,
			int userAge, String phone, String qQ, String address) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.userSex = userSex;
		this.userAge = userAge;
		this.phone = phone;
		QQ = qQ;
		this.address = address;
	}

	public User(int userId, String userName, String userPassword,
			String userSex, int userAge, String phone, String qQ, String address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userSex = userSex;
		this.userAge = userAge;
		this.phone = phone;
		QQ = qQ;
		this.address = address;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQQ() {
		return QQ;
	}
	public void setQQ(String qQ) {
		QQ = qQ;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  this.userId+" "+this.userName+" "+this.userPassword+" "+
				this.userSex+" "+this.userAge+" "+this.phone+" "+this.QQ+" "+
				this.address;
	}
}
