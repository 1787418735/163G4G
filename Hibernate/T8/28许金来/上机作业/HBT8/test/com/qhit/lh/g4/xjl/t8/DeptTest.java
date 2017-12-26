/**
 * 
 */
package com.qhit.lh.g4.xjl.t8;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.junit.Test;

import com.qhit.lh.g4.xjl.t8.bean.Dept;
import com.qhit.lh.g4.xjl.t8.bean.Emp;
import com.qhit.lh.g4.xjl.t8.bean.UserInfo;
import com.qhit.lh.g4.xjl.t8.service.BaseService;
import com.qhit.lh.g4.xjl.t8.service.impl.BaseServiceImpl;
import com.qhit.lh.g4.xjl.t8.utils.HibernateSessionFactory;

/**
 * @author 许金来
 *2017年12月19日上午9:28:214
 */
public class DeptTest {

	private BaseService baseService = new BaseServiceImpl();
	@Test
	public void add() {
		//新建部门
		Dept dept = new Dept();
		dept.setDeptName("外交部");
		dept.setAddress("中国东京");
		
		//有员工，1，从老员工里面调
		Emp emp1 = (Emp) baseService.getObjectById(Emp.class, 1);
		dept.getEmps().add(emp1);
		//没有员工,2招聘新员工
		Emp emp2 = new Emp();
		emp2.setEmpName("张晓红");
		emp2.setEmpSex("F");
		emp2.setBirthday("2017-14-15");
		//分配账户
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("zxh");
		userInfo.setPasword("666666");
		dept.getEmps().add(emp2);
		//一对一关联
		emp2.setUserInfo(userInfo);
		userInfo.setEmp(emp2);
		//n--1
		emp2.setDept(dept);
		//1--n
		dept.getEmps().add(emp2);
		
		baseService.add(dept);
		
	}

	@Test
	public void delete() {
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
		baseService.delete(dept);
	}
	@Test
	public void update() {
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
		dept.setAddress("中国的最远地方");
		
		baseService.update(dept);	
	}
	@Test
	public void query() {
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
		for (Emp emp : dept.getEmps()) {
			System.out.println(dept.getDeptName()+":"+emp.getEmpName()+":");
		}
	}
	
	@Test
	public void getDeptInfo(){
		
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//获取条件查询器
		Criteria criteria = session.createCriteria(Dept.class)
				.setFetchMode("emp",FetchMode.JOIN)
				.createAlias("emp", "e");
		
		ProjectionList pList = Projections.projectionList()
				.add(Projections.property("deptId"))
				.add(Projections.property("deptName"))
				.add(Projections.property("address"))
				.add(Projections.count("e.eid"));
		
		criteria.setProjection(pList);
		
		//执行
		List<Object[]> list = criteria.list();
		
		for (Object[] objects : list) {
			System.out.println(objects[0]+"|"+objects[1]+"|"+objects[2]+"|"+objects[3]);
		}
	}
	
}
