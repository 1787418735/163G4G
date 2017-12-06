package com.eslandfa.struts.dao;

import java.util.List;

import com.eslandfa.struts.bean.User;

public interface UserDao {
	public int addUser(User user);
	public int updateUser(User user);
	public int deleteUser(int uid);
	public List<User> queryAllUser();
	public User querySingleUser(int uid);
}
