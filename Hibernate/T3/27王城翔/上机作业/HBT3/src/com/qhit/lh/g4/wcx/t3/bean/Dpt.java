package com.qhit.lh.g4.wcx.t3.bean;

/**
 * Dpt entity. @author MyEclipse Persistence Tools
 */

/**
 * @author 王城翔
 * 2017年12月14日下午5:26:44
 * TODO
 */
public class Dpt implements java.io.Serializable {

	// Fields

	private Integer did;
	private String dname;
	private String dadd;

	// Constructors

	/** default constructor */
	public Dpt() {
	}

	/** full constructor */
	public Dpt(String dname, String dadd) {
		this.dname = dname;
		this.dadd = dadd;
	}

	// Property accessors

	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDadd() {
		return this.dadd;
	}

	public void setDadd(String dadd) {
		this.dadd = dadd;
	}

}