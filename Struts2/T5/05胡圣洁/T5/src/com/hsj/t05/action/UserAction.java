package com.hsj.t05.action;

import java.util.List;

import com.hsj.t05.bean.User;
import com.hsj.t05.service.UserService;
import com.hsj.t05.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private User user;
	private List<User> userlist;


	public List<User> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<User> userlist) {
		this.userlist = userlist;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	UserService userService =new UserServiceImpl();


		public String add() throws Exception {
			// TODO Auto-generated method stub
			int row =userService.addUser(user);
			if(row>0){
				return "addUser";
			}else{
				return "error";
			}
			
		}
		public String queryAll(){
			userlist=userService.queryAllUser();
			if(userlist!=null){
				return "queryAllUser";
			}
			return "error";
			
		}
		public String update(){
			int row =userService.updateUser(user);
			if(row>0){
			return "updateUser";
			}
			return "error";
			
		}
		public String delete(){
			int row=userService.deleteUser(user.getUid());
			if(row>0){
				return "deleteUser";
			}
			return "error";
			
		}
		public String querySingle(){
			user=userService.querySingleUser(user.getUid());
			if(user!=null){
				return "querySingleUser";
			}
			return "error";
			
		}

}
