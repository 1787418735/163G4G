package com.qhit.lh.g4.lkj.t6.bean;
// Generated 2017-12-20 16:31:43 by Hibernate Tools 5.0.6.Final

import java.util.HashSet;
import java.util.Set;


/**
 * Dept generated by hbm2java
 */
public class Dept  implements java.io.Serializable {


     private int did;
     private String dname;
     private String daddress;
     
     private Set<Emp> emps = new HashSet<>();
     
    public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

	public Dept() {
    }

    public Dept(int did, String dname, String daddress) {
       this.did = did;
       this.dname = dname;
       this.daddress = daddress;
    }
   
    public int getDid() {
        return this.did;
    }
    
    public void setDid(int did) {
        this.did = did;
    }
    public String getDname() {
        return this.dname;
    }
    
    public void setDname(String dname) {
        this.dname = dname;
    }
    public String getDaddress() {
        return this.daddress;
    }
    
    public void setDaddress(String daddress) {
        this.daddress = daddress;
    }




}


