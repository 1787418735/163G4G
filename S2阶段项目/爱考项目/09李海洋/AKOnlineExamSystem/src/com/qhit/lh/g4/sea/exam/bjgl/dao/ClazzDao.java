package com.qhit.lh.g4.sea.exam.bjgl.dao;

import java.util.List;

import com.qhit.lh.g4.sea.exam.bjgl.bean.ClassInfo;

/**
 * @author 李海洋
 *TODO
 *2018年1月13日上午9:06:30
 */
public interface ClazzDao {
		/**
		 * @return
		 * 获取班级集合
		 */
		public List<ClassInfo> getClazzList();
}
