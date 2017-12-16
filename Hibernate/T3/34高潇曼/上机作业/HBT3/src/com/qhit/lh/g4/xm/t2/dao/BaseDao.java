package com.qhit.lh.g4.xm.t2.dao;

import java.util.List;

public interface BaseDao {
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public Object getObjectById(Class clazz,int id);
	public List<Object> queryAll(String tableName);
}
