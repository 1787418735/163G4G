package com.qhit.lh.g4.WMH.T04.bean;
// Generated 2017-12-18 18:02:25 by Hibernate Tools 5.0.6.Final

/**
 * TbUser generated by hbm2java
 */
public class TbUser implements java.io.Serializable {

	private Integer uid;
	private String uname;
	private String upwd;
	private int sex;
	private String eduction;

	public TbUser() {
	}

	public TbUser(String uname, String upwd, int sex, String eduction) {
		this.uname = uname;
		this.upwd = upwd;
		this.sex = sex;
		this.eduction = eduction;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return this.upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public int getSex() {
		return this.sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getEduction() {
		return this.eduction;
	}

	public void setEduction(String eduction) {
		this.eduction = eduction;
	}

}
