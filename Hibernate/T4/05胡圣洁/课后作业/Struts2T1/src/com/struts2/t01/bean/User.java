package com.struts2.t01.bean;

public class User {
	private int uid;
	private String uname;
	private String upwd;
	private String edu;
	private int sex;
	public User(int uid, String uname, String upwd, String edu, int sex) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.edu = edu;
		this.sex = sex;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	

}
