package com.qhit.lh.g4.yjh.ts1.bean;

public class User {
private String name;
private String password;

public User(String name, String password) {
	super();
	this.name = name;
	this.password = password;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
