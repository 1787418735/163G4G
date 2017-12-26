/**
 * 
 */
package com.qhit.lh.g4.xjl.t7.service;

import java.util.List;

import com.qhit.lh.g4.xjl.t7.bean.Emp;
import com.qhit.lh.g4.xjl.t7.bean.UserInfo;

/**
 * @author 许金来
 *2017-12-19下午5:16:15
 * 
 */
public interface BaseService {


	public List<Emp> getEmpByName(String name);
	//添加
	public void add(Object obj);
	//删除
	public void delete(Object obj);
	//更新
	public void update(Object obj);
	//查询
	public List<Object> queryAll(String  tableName);
	
	public Object getObjectById(Class clazz, int id);
	//登录
	public UserInfo login(UserInfo user);
}
