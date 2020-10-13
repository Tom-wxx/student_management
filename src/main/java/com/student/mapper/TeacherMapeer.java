package com.student.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.student.pojo.Teacher;

@Mapper
public interface TeacherMapeer {

	// 登录教师
	Integer login(Teacher tea);

	// 登陆成功
	void loginsuccess(Teacher tea);
	
	//查询教师
	Teacher findtea(Integer tid);
}
