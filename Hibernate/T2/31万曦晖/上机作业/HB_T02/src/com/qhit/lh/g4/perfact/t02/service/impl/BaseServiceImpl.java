/**
 * 
 */
package com.qhit.lh.g4.perfact.t02.service.impl;

import java.util.List;

import com.qhit.lh.g4.perfact.t02.service.BaseService;

/**
 * @author 万曦晖
 *2017年12月12日
 */
public class BaseServiceImpl implements BaseService {
	BaseService baseserce = new BaseServiceImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.perfact.t02.service.BaseService#add(java.lang.Object)
	 */
	@Override
	public void add(Object object) {
		// TODO Auto-generated method stub
		baseserce.add(object);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.perfact.t02.service.BaseService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object object) {
		// TODO Auto-generated method stub
		baseserce.delete(object);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.perfact.t02.service.BaseService#update(java.lang.Object)
	 */
	@Override
	public void update(Object object) {
		// TODO Auto-generated method stub
		baseserce.update(object);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.perfact.t02.service.BaseService#queryAll(java.lang.String)
	 */
	@Override
	public List<Object> queryAll(String fromStr) {
		// TODO Auto-generated method stub
		return baseserce.queryAll(fromStr);
	}
	
}
