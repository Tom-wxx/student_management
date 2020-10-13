package com.student.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.student.pojo.Score;
import com.student.pojo.Student;

@Mapper
public interface StudentMapper {

	//登录学生
	Integer login(Student stu);
	
	//登陆成功
	void loginsuccess(Student stu);
	
	//查询学生    
	Student fidstu(Integer sid);
	
	//查询密码
	Student findpwd(Integer sid);
	
	//修改密码
	Integer uppwd(Student stu);
	
	//成绩、科目、老师查询
	List<Score> findscore(Integer sid);
	
	
	
}
