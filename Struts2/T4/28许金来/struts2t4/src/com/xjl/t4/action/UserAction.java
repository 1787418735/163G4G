package com.xjl.t4.action;

import com.xjl.t4.bean.User;
import com.xjl.t4.service.UserService;
import com.xjl.t4.service.impl.UserServiceImpl;

public class UserAction {


	private User user;
	UserService uService = new UserServiceImpl();
	

	public String add() throws Exception {
		// TODO Auto-generated method stub
		int row = uService.add(user);
		if(row > 0){
			return "success";
		}else{
			return "error";
		}
	}

	public String delete() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}

	public String update() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}

	public String select() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
