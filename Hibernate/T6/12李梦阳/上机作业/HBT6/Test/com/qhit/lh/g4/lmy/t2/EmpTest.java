package com.qhit.lh.g4.lmy.t2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.g4.lmy.t2.bean.Dept;
import com.qhit.lh.g4.lmy.t2.bean.Emp;
import com.qhit.lh.g4.lmy.t2.bean.UserInfo;
import com.qhit.lh.g4.lmy.t2.dao.BaseDao;
import com.qhit.lh.g4.lmy.t2.dao.impl.BaseDaoImpl;

public class EmpTest {

	private BaseDao basedao =new BaseDaoImpl();
	
	@Test
	public void add() {
		Emp emp =new Emp();
		emp.setEname("张三");
		emp.setEsex("M");
		emp.setDid(1);
		UserInfo userinfo =new UserInfo();
		userinfo.setUname("zs");
		userinfo.setUpwd("123456");
		Dept dept=(Dept) basedao.getObjectById(Dept.class, 1);
		emp.setDept(dept);
		basedao.add(emp);
	}
	@Test
	public void delete() {
		Emp emp =new Emp();
		Dept dept=(Dept) basedao.getObjectById(Dept.class, 1);
		basedao.add(emp);
	}
	@Test
	public void update() {
		Emp emp=(Emp) basedao.getObjectById(Emp.class, 1);
		Dept dept=(Dept) basedao.getObjectById(Dept.class, 2);
		emp.setDept(dept);
		basedao.add(emp);
	}
	@Test
	public void queryAll() {
		List<Object> lists=	basedao.queryAll("from Emp");
		for (Object object : lists) {
			Emp emp = (Emp) object;
			System.out.println(emp.toString());
		}
	}
}