package com.qhit.lh.g4.lmy.t2.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao {
	//增删改查
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public void query(Object obj);
	public Object getObjectById(Class clazz,Serializable id);
	//遍历查询
	public List getObjects(String hql);
	public List<Object> queryAll(String string);
}
