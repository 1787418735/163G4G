package com.lzk.t4.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.lzk.t4.bean.User;
import com.lzk.t4.dao.UserDao;
import com.lzk.t4.util.DBManager;

public class UserDaoImpl implements UserDao {
	private Connection con;
	private PreparedStatement ps;
	@Override
	public int add(User user) {
		con = DBManager.getConnection();
		String sql = "insert into t_user values (?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUname());
			ps.setString(2, user.getUpwd());
			ps.setString(3, user.getEdu());
			ps.setInt(4, user.getSex());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBManager.close(ps,con);
		}
		return 0;
	}

}
