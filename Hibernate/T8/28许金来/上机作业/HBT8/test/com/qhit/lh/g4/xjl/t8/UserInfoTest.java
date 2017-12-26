/**
 * 
 */
package com.qhit.lh.g4.xjl.t8;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.g4.xjl.t8.bean.UserInfo;
import com.qhit.lh.g4.xjl.t8.service.BaseService;
import com.qhit.lh.g4.xjl.t8.service.impl.BaseServiceImpl;

/**
 * @author 许金来
 *2017年12月22日上午10:59:47
 */
public class UserInfoTest {

	private BaseService baseService = new BaseServiceImpl();
	@Test
	public void login() {
		
		UserInfo user = new UserInfo();
		user.setUserName("zxm");
		user.setPasword("6666");
		
		user = baseService.login(user);
		
		if (user != null ) {
			System.out.println("登陆成功");
		} else {
			System.out.println("登陆失败");
		}
	}

}
