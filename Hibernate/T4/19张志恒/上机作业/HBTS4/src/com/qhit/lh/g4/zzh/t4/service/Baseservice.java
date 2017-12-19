package com.qhit.lh.g4.zzh.t4.service;

import java.io.Serializable;
import java.util.List;

public interface Baseservice {
	public void add(Object object);
	public void delete(Object object);
	public void update(Object object);
	public Object getObjectById(Class clazz,Serializable id);
	public List<Object> queryAll(String sql);
}
