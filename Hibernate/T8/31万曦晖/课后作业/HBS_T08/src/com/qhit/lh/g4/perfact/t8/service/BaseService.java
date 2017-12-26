/**
 * 
 */
package com.qhit.lh.g4.perfact.t8.service;

import java.io.Serializable;
import java.util.List;


/**
 * @author 万曦晖
 *TODO
 *2017年12月23日上午10:42:53
 */
public interface BaseService {
	public void add(Object object);
	public void delete(Object object);
	public void update(Object object);
	public Object getObjectById(Class clazz,Serializable id);
	public List<Object> queryAll(String sql);
}
