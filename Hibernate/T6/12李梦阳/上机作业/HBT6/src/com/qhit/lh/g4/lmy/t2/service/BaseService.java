package com.qhit.lh.g4.lmy.t2.service;

import java.util.List;

public interface BaseService {

	public void add(Object object);
	public void delete(Object object);
	public void update(Object object);
	public List<Object> queryAll(String  fromStr);

}