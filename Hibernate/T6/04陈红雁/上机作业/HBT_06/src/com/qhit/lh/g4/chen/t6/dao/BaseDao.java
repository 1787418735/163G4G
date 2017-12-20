package com.qhit.lh.g4.chen.t6.dao;

import java.util.List;

public interface BaseDao {


	public void add(Object obj);
	
    public void delete(Object obj);
    
    public void update(Object obj);
    
    public List<Object> queryAll();
}
