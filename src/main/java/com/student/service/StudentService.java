package com.student.service;

import java.util.List;

import com.student.pojo.Score;
import com.student.pojo.Student;

public interface StudentService {

	//学生登录
	public Integer login(Student stu);
	//登录成功
	public void loginsuccess(Student stu);
	//查询学生信息
	public Student findstu(Integer sid);
	//查询密码
	public Student findpwd(Integer sid);
	//修改密码
	public Integer uppwd(Student stu);
	//查询成绩
	List<Score> findscore(Integer sid);
}
