/**
 * 
 */
package com.qhit.lh.g4.zhy.T1.basedao;

import java.util.List;

import com.qhit.lh.g4.zhy.T1.bean.User;

/**
 * @author 张宏远
 *TODO
 *2017年12月11日下午4:33:50
 */

public interface BaseDao {
public void add(User user);
public void delete(User user);
public void update(User user);
public List<Object> queryAll(String  tableName);
}


