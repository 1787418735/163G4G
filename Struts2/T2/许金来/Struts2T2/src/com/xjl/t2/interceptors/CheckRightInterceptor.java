package com.xjl.t2.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class CheckRightInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("��������ʼ����");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("��������ʼִ��");
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("��������ʼ");
		String result = arg0.invoke();
		System.out.println("����������");
		System.out.println("���ش��룺"+result);
		return result;
	}

}
