package com.qhit.lh.g4.perfact.t6.bean;

import java.util.HashSet;
import java.util.Set;

// Generated 2017-12-20 16:31:43 by Hibernate Tools 5.0.6.Final



/**
 * Role generated by hbm2java
 */
public class Role  implements java.io.Serializable {


	private int roleId;
	private String roleName;
	private String memo;

	private Set<Userinfo> user = new HashSet<>();
	
	
	public Set<Userinfo> getUser() {
		return user;
	}

	public void setUser(Set<Userinfo> user) {
		this.user = user;
	}

	public Role() {
	}

	public Role(int roleId, String roleName, String memo) {
		this.roleId = roleId;
		this.roleName = roleName;
		this.memo = memo;
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}




}


