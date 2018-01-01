/**
 * 
 */
package com.qhit.lh.g4.zhy.t8.service;

import java.io.Serializable;
import java.util.List;

import com.qhit.lh.g4.zhy.t8.bean.Emp;

/**
 * @author 张宏远
 *TODO
 *2017年12月20日下午8:25:56
 */
public interface DaseService {
	//添加
	public void add(Object obj);
	//删除
	public void delete(Object obj);
	//修改
	public void update(Object obj);
	//查询
	public Object getObjectById(Class clazz,Serializable id);
	//遍历查询
	public List query(String fromStr);
	
	public List<Emp> getEmpByName(String name);
}
