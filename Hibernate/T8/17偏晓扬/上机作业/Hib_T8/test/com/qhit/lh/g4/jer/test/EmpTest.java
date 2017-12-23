package com.qhit.lh.g4.jer.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.g4.jer.t8.bean.Dpt;
import com.qhit.lh.g4.jer.t8.bean.Emp;
import com.qhit.lh.g4.jer.t8.bean.UserInfo;
import com.qhit.lh.g4.jer.t8.service.UserService;
import com.qhit.lh.g4.jer.t8.service.impl.UserServiceImpl;
import com.qhit.lh.g4.jer.t8.utils.HibernateSessionFactory;

/**
 * @author 偏晓阳
 * 2017年12月13日下午5:26:24
 * TODO
 */
public class EmpTest {
	
	private UserService userService = new UserServiceImpl();
	@Test
	public void add() {
		Emp emp = new Emp();
		emp.setEmpName("二狗子");
		emp.setEmpSex(0);
		emp.setBirthday("2017-12-13");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("egz");
		userInfo.setPwd("123456");
		
		emp.setUserInfo(userInfo);
		userInfo.setEmp(emp);
		
		Dpt dpt = (Dpt) userService.getObjectById(Emp.class, 2);
		emp.setDpt(dpt);
		
		userService.add(emp);
		
	}
	
	@Test
	public void update() {
		Emp emp = (Emp) userService.getObjectById(Emp.class, 3);
		emp.setEmpName("李狗蛋");
		
		Dpt dpt = (Dpt) userService.getObjectById(Dpt.class, 2);
		emp.setDpt(dpt);
		userService.update(emp);
	}
	
	@Test
	public void delete() {
		
		Emp emp = (Emp) userService.getObjectById(Emp.class, 1);
		userService.delete(emp);
	}
	
	@Test
	public void query() {
		List<Object> list = userService.queryAll("form Emp");
		for(Object object: list){
				Emp emp = (Emp) object;
				System.out.println(emp.toString());
		}
	}
	
	@Test
	public void getEmpByName(){
		List<Emp> result = userService.getEmpByName("李%");
		
		for(Emp emp : result){
			System.out.println(emp.getEid()+":"+emp.getEmpName());
		}
	}
	
	@Test
	public void getEmpLikeName(){
		Session session = HibernateSessionFactory.getSession();
		Criteria criteria = session.createCriteria(Emp.class).add(Restrictions.like("empName", "李%"));
		List<Emp> list = criteria.list();
		for (Emp emp : list) {
			System.out.println(emp.getEid()+":"+emp.getEmpName());
		}
	}
	
	@Test
	public void getEmpDeptName(){
		Session session = HibernateSessionFactory.getSession();
		Criteria criteria = session.createCriteria(Emp.class).setFetchMode("dpt", FetchMode.JOIN).createAlias("dpt", "d").add(Restrictions.eq("d.dname", "国防部"));
		List<Emp> list = criteria.list();
		for (Emp emp : list) {
			System.out.println(emp.getEid()+":"+emp.getEmpName()+"|"+emp.getDpt().getDname());
		}
	}
	
	

}
