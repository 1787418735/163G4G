package com.qhit.lh.g4.lmy.t2.bean;

import java.util.HashSet;
import java.util.Set;



/**
 * Role entity. @author MyEclipse Persistence Tools
 */

public class Role  implements java.io.Serializable {


    // Fields    

     private Integer rid;
     private String rname;
     private String memo;

     private Set<UserInfo> user=new HashSet(0);
    // Constructors

    public Set<UserInfo> getUser() {
		return user;
	}


	public void setUser(Set<UserInfo> user) {
		this.user = user;
	}


	/** default constructor */
    public Role() {
    }

    
    /** full constructor */
    public Role(String rname, String memo) {
        this.rname = rname;
        this.memo = memo;
    }

   
    // Property accessors

    public Integer getRid() {
        return this.rid;
    }
    
    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return this.rname;
    }
    
    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getMemo() {
        return this.memo;
    }
    
    public void setMemo(String memo) {
        this.memo = memo;
    }
   








}