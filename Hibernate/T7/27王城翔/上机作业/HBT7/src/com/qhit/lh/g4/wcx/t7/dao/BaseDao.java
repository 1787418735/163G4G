package com.qhit.lh.g4.wcx.t7.dao;


import java.util.List;

import com.qhit.lh.g4.wcx.t7.bean.Emp;
import com.qhit.lh.g4.wcx.t7.bean.UserInfo;



public interface BaseDao {
	public List<UserInfo> login(UserInfo user);
	
	public List<Emp> getEmpByName(String name);
	
	public void add(Object obj);

	/**
	 * @param user
	 */
	public void update(Object obj);

	/**
	 * @param user
	 */
	public void delete(Object obj);

	/**
	 * @param string
	 */
	public List<Object> queryAll(String fromStr);   
	
	/**
	 * @param string
	 */
	public Object getObjectById(Class clazz,int id); 
}

