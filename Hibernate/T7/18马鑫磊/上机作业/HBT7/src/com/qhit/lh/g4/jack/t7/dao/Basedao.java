package com.qhit.lh.g4.jack.t7.dao;

import java.io.Serializable;
import java.util.List;

import com.qhit.lh.g4.jack.t7.bean.Dept;
import com.qhit.lh.g4.jack.t7.bean.Emp;
import com.qhit.lh.g4.jack.t7.bean.Userinfo;

public interface Basedao {
	public void add(Object object);
	public void delete(Object object);
	public void update(Object object);
	public Object getObjectById(Class clazz,Serializable id);
	public List<Object> queryAll(String hql);
	public  List<Emp> getEmpByEname(String name);
	public  List<Dept> getInnerQuery(String deptname);
	public  List<Object[]> getCountQuery();
	public  List<Object>  getObjectQuery();
	public  List<Userinfo>   doLogin(Userinfo userinfo);
}
