package com.qhit.lh.g4.lmy.t2.bean;



/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp  implements java.io.Serializable {


    // Fields    

     private Integer eid;
     private String ename;
     private String esex;
     private Integer did;

     private UserInfo userInfo;

    // Constructors

    public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	/** default constructor */
    public Emp() {
    }

	/** minimal constructor */
    public Emp(String ename, String esex) {
        this.ename = ename;
        this.esex = esex;
    }
    
    /** full constructor */
    public Emp(String ename, String esex, Integer did) {
        this.ename = ename;
        this.esex = esex;
        this.did = did;
    }

   
    // Property accessors

    public Integer getEid() {
        return this.eid;
    }
    
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return this.ename;
    }
    
    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEsex() {
        return this.esex;
    }
    
    public void setEsex(String esex) {
        this.esex = esex;
    }

    public Integer getDid() {
        return this.did;
    }
    
    public void setDid(Integer did) {
        this.did = did;
    }
   








}