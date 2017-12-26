package com.qhit.lh.g4.lmy.t2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.lmy.t2.bean.Dept;
import com.qhit.lh.g4.lmy.t2.bean.Emp;
import com.qhit.lh.g4.lmy.t2.bean.UserInfo;
import com.qhit.lh.g4.lmy.t2.dao.BaseDao;
import com.qhit.lh.g4.lmy.t2.dao.impl.BaseDaoImpl;

public class DeptTest {
	private BaseDao basedao =new BaseDaoImpl();
@Test
public void add(){
Emp emp =new Emp();
emp.setEname("马云");
emp.setEsex("M");
Dept dept =new Dept();
dept=(Dept) basedao.getObjectById(Dept.class, 1);
dept.getEmps().add(emp);
emp.setDept(dept);
UserInfo userinfo =new UserInfo();
userinfo.setUname("mxl");
userinfo.setUpwd("123456");
emp.setUserInfo(userinfo);
userinfo.setEmp(emp);
basedao.add(emp);

}
@Test
public void update(){
	Dept dept =(Dept) basedao.getObjectById(Dept.class, 1);
	Emp emp =(Emp) basedao.getObjectById(Emp.class, 1);
	emp.setDept(dept);
	dept.getEmps().add(emp);
	basedao.update(dept);
}
@Test
public void delete(){
	Dept dept =(Dept) basedao.getObjectById(Dept.class, 2);
	basedao.delete(dept);
	
}
@Test
public void queryAll(){
	List<Object> lists  =basedao.queryAll("from Dept");
	for (Object object : lists) {
		Dept dept =(Dept) object;
		System.out.println(dept.getDname()+":");
		for (Object object2 : dept.getEmps()) {
			Emp emp =(Emp) object2;
			System.out.print(emp.getEname());
		}
	}
}
}