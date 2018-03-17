package com.jer.ssm.common.listener;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.jer.ssm.user.bean.User;

public class ExitListener implements HttpSessionListener {
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("创建会话");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("会话结束");
		//获取session对象
		HttpSession session = arg0.getSession();
		ServletContext application = session.getServletContext();
		//获取当前会话的用户对象
		User user = (User) session.getAttribute("user");
		//获取在线用户集合
		List<User> users = (List<User>) application.getAttribute("online");
		//从集合中移除将要退出的用户
		users.remove(user);
		//更新在线用户集合
		application.setAttribute("online", users);
	}
}
