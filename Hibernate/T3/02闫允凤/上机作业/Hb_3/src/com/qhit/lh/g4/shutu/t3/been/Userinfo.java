/**
 * 
 */
package com.qhit.lh.g4.shutu.t3.been;

/**
 * @author S01
 *2017年12月16日上午10:20:02
 *TODO
 */

public class Userinfo implements java.io.Serializable {

	// Fields

	private Integer uid;
	private String uname;
	private String upwd;
	private Emp emp;
	
	// Constructors

	/** default constructor */
	public Userinfo() {
	}

	/** full constructor */
	public Userinfo(String uname, String upwd) {
		this.uname = uname;
		this.upwd = upwd;
	}

	// Property accessors

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
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

}