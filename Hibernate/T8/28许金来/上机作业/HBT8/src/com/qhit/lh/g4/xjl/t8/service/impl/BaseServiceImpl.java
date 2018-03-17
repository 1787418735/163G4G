/**
 * 
 */
package com.qhit.lh.g4.xjl.t8.service.impl;

import java.util.List;

import com.qhit.lh.g4.xjl.t8.bean.Emp;
import com.qhit.lh.g4.xjl.t8.bean.UserInfo;
import com.qhit.lh.g4.xjl.t8.dao.BaseDao;
import com.qhit.lh.g4.xjl.t8.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.xjl.t8.service.BaseService;



/**
 * @author 许金来
 *2017-12-19下午5:16:38
 * TODO
 */
public class BaseServiceImpl implements BaseService {

	private BaseDao baseDao = new BaseDaoImpl();

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		baseDao.add(obj);
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		baseDao.delete(obj);
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		baseDao.update(obj);
	}

	@Override
	public List<Object> queryAll(String tableName) {
		// TODO Auto-generated method stub
		return baseDao.queryAll(tableName);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.xjl.t5.service.BaseService#getObjectById(java.lang.Class, int)
	 */
	@Override
	public Object getObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(clazz, id);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.xjl.t5.service.BaseService#getEmpByName(java.lang.String)
	 */
	@Override
	public List<Emp> getEmpByName(String name) {
		// TODO Auto-generated method stub
		return baseDao.getEmpByName(name);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.xjl.t5.service.BaseService#login(com.qhit.lh.g4.xjl.t5.bean.UserInfo)
	 */
	@Override
	public UserInfo login(UserInfo user) {
		// TODO Auto-generated method stub
		return baseDao.login(user);
	}

}
