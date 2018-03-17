/**
 * 
 */
package com.qhit.lh.g4.xjl.t8.dao;

import java.util.List;

import com.qhit.lh.g4.xjl.t8.bean.Emp;
import com.qhit.lh.g4.xjl.t8.bean.UserInfo;



/**
 * @author 许金来
 *2017-12-19下午4:07:48
 * TODO
 */
public interface BaseDao {

	public List<Emp> getEmpByName(String name);
	
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public List<Object> queryAll(String  tableName);
	
	public Object getObjectById(Class clazz, int id);
	
	public UserInfo login(UserInfo user);
	
}
