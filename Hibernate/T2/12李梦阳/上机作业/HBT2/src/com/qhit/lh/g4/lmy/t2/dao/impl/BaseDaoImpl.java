package com.qhit.lh.g4.lmy.t2.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.lmy.t2.dao.BaseDao;
import com.qhit.lh.g4.lmy.t2.utils.HibernateSessionFactory;

public class BaseDaoImpl implements BaseDao {

	private Session session = HibernateSessionFactory.getSession();
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		//开启事务
		Transaction tx = session.beginTransaction();
		//保存数据
		session.save(obj);
		//提交事务
		tx.commit();
		//释放资源
		session.close();
	}

	
	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		//开启事务
		Transaction tx = session.beginTransaction();
		//删除数据
		session.delete(obj);
		//提交事务
		tx.commit();
		//释放资源
		session.close();
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		//开启事务
		Transaction tx = session.beginTransaction();
		//修改数据
		session.update(obj);
		//提交事务
		tx.commit();
		//释放资源
		session.close();
	}

	@Override
	public Object getObjectById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		Object obj = null;
		obj = session.get(clazz, id);
		//提交事务
		tx.commit();
		return obj;
	}
	@Override
	public List getObjects(String hql) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		//声明并实例化一个集合
		List list = new ArrayList<>();
		//调用session实例的createQuery（）方法查询；接着调用list()方法检索所有数据
		list = session.createQuery(hql).list();
		tx.commit();
		session.close();
		return list;
	}


	@Override
	public void query(Object obj) {
		// TODO Auto-generated method stub
		
	}
}
