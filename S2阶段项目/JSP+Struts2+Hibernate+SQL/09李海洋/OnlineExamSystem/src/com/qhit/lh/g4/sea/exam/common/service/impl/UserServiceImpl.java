package com.qhit.lh.g4.sea.exam.common.service.impl;

import com.qhit.lh.g4.sea.exam.common.bean.User;
import com.qhit.lh.g4.sea.exam.common.dao.UserDao;
import com.qhit.lh.g4.sea.exam.common.dao.impl.UserDaoImpl;
import com.qhit.lh.g4.sea.exam.common.service.UserService;

/**
 * @author 李海洋
 *TODO
 *2017年12月27日下午9:57:44
 */
public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.common.service.UserService#Login(com.qhit.lh.g4.sea.exam.common.bean.User)
	 */
	@Override
	public User Login(User user) {
		// TODO Auto-generated method stub
		return userDao.Login(user);
	}

}
