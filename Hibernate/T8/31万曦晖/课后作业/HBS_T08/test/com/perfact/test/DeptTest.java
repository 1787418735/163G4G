/**
 * 
 */
package com.perfact.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.g4.perfact.t8.bean.Dept;
import com.qhit.lh.g4.perfact.t8.bean.Emp;
import com.qhit.lh.g4.perfact.t8.bean.Userinfo;
import com.qhit.lh.g4.perfact.t8.dao.BaseDao;
import com.qhit.lh.g4.perfact.t8.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.perfact.t8.util.HibernateSessionFactory;

/**
 * @author 万曦晖
 *TODO
 *2017年12月26日上午11:11:36
 */
public class DeptTest {
	private BaseDao basedao =new BaseDaoImpl();
	@Test
	public void add() {
		Emp emp =new Emp();
		emp.setEname("Alice");
		emp.setEsex("M");
		emp.setEbirthday("1956-04-17");
		Dept dept =new Dept();
		dept=(Dept) basedao.getObjectById(Dept.class, 1);
		dept.getEmps().add(emp);
		emp.setDept(dept);
		Userinfo userinfo =new Userinfo();
		userinfo.setUname("alice");
		userinfo.setUpwd("123456");
		emp.setUserinfo(userinfo);
		userinfo.setEmp(emp);
		basedao.add(emp);
	}

	@Test
	public void delete() {
		Dept dept =(Dept) basedao.getObjectById(Dept.class, 2);
		Emp emp =(Emp) basedao.getObjectById(Emp.class, 1);
		emp.setDept(dept);
		dept.getEmps().add(emp);
		basedao.update(dept);
	}

	@Test
	public void update() {
		Dept dept =(Dept) basedao.getObjectById(Dept.class, 2);
		basedao.delete(dept);
	}

	@Test
	public void query() {
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

	@Test
	public void queryByEname() {
		Session session =HibernateSessionFactory.getSession();
		Criteria criteria =session.createCriteria(Emp.class)
				.add(Restrictions.like("ename", "A%"));
		for(Object obj :criteria.list()){
			Emp emp =(Emp) obj;
			System.out.println(emp.getEid()+emp.getEname());
		}
	}

	@Test
	public void queryByEnameTwo() {
		Session session =HibernateSessionFactory.getSession();
		Criteria criteria =session.createCriteria(Emp.class)
				.add(Restrictions.like("ename", "A%"));
		ProjectionList projectionList =Projections.projectionList()
				.add(Projections.property("ename"))
				.add(Projections.property("esex"))
				.add(Projections.property("ebirthday"));
		criteria.setProjection(projectionList);
		for (Object[] obj : (List<Object[]>)criteria.list()) {
			System.out.println(obj[0]+"|"+obj[1]+"|"+obj[2]);
		}
	}

	@Test
	public void queryByDname() {
		Session session =HibernateSessionFactory.getSession();
		Criteria criteria =session.createCriteria(Emp.class)
				.setFetchMode("dept", FetchMode.JOIN)
				.createAlias("dept", "d")
				.add(Restrictions.eq("d.dname", "董事会"));
		for (Object obj : criteria.list()) {
			Emp emp =(Emp)obj;
			System.out.println(emp.getEname()+emp.getDept().getDname());
		}
	}

	@Test
	public void queryByMath() {
		Session session =HibernateSessionFactory.getSession();
		Criteria criteria =session.createCriteria(Dept.class)
				.setFetchMode("emps", FetchMode.JOIN)
				.createAlias("emps", "e");
		ProjectionList projectionList =Projections.projectionList()
				.add(Projections.groupProperty("did"))
				.add(Projections.groupProperty("dname"))
				.add(Projections.groupProperty("daddress"))
				.add(Projections.count("e.eid"));
		criteria.setProjection(projectionList);
		for (Object[] obj : (List<Object[]>) criteria.list()) {
			System.out.println(obj[0]+"|"+obj[1]+"|"+obj[2]+"|"+obj[3]);
		}
	}

	@Test
	public void queryByoutline() {
		DetachedCriteria detachedCriteria =DetachedCriteria.forClass(Dept.class);
		detachedCriteria.setFetchMode("emps", FetchMode.JOIN);

		Session session =HibernateSessionFactory.getSession();
		Criteria criteria =detachedCriteria.getExecutableCriteria(session);
		for (Object obj : criteria.list()) {
			Dept dept =(Dept) obj;
			System.out.println(dept.getDid()+"|"+dept.getDname()+"|"+dept.getDaddress());
		}
	}
}



