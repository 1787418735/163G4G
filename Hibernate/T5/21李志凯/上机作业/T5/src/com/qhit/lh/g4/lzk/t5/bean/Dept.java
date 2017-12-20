package com.qhit.lh.g4.lzk.t5.bean;

import java.util.Set;

import org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag;

/**
 * @author 李志凯
 *2017年12月19日上午11:16:01
 *TODO
 */
public class Dept {
	//添加参数
	private int deptId;
	private String deptName;
	private String 	address;
	
	//1-n的关联：当前部门有哪些员工
	private Set<Emp> emps;
	
	public Set<Emp> getEmps() {
		return emps;
	}
	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}
	//添加有参构造方法，无参构造方法和get，set方法
	public Dept(int deptId, String deptName, String address) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.address = address;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
