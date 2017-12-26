package com.qhit.lh.g4.lmy.t2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.g4.lmy.t2.bean.Role;
import com.qhit.lh.g4.lmy.t2.bean.UserInfo;
import com.qhit.lh.g4.lmy.t2.service.BaseService;

public class RoleTest {

	private BaseService baseService;
		@Test
		public void add() {
			//新建角色
			Role role = new Role();
			role.setRname("网易云CEO");
			role.setMemo("CEO");
			//分配账户
			UserInfo userinfo = (UserInfo) baseService.getObjectById(UserInfo.class, 1);
			//建立多对多关联
			role.getUser().add(userinfo);
			
			baseService.add(role);
		}
		@Test
		public void delete() {
			Role role = (Role) baseService.getObjectById(Role.class, 1);
			baseService.delete(role);
		}
		@Test
		public void update() {
			Role role = (Role) baseService.getObjectById(Role.class, 1);
			role.setMemo("执行官");
			UserInfo alice = (UserInfo) baseService.getObjectById(Userinfo.class, 2);
			UserInfo anlsnde = (UserInfo) baseService.getObjectById(Userinfo.class, 5);
			role.getUser().add(alice);
			role.getUser().add(anlsnde);
			baseService.update(role);
		}
		@Test
		public void query() {
			Role role = (Role) baseService.getObjectById(Role.class, 2);
			for (UserInfo userInfo : role.getUser()) {
				System.out.println(role.getRname()+":"+userInfo.getUname());
			}
		}

}
