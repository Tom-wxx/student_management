package com.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.mapper.StudentMapper;
import com.student.pojo.Score;
import com.student.pojo.Student;
import com.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	//依赖注入
	@Autowired
	private StudentMapper stumapper;

	//登录
	@Override
	public Integer login(Student stu) {

		return stumapper.login(stu);
	}

	//登录成功
	@Override
	public void loginsuccess(Student stu) {
		stumapper.loginsuccess(stu);
	}

	//发现学生信息
	@Override
	public Student findstu(Integer sid) {
		return stumapper.fidstu(sid);
	}

	//发现单个信息
	@Override
	public Student findpwd(Integer sid) {

		return stumapper.findpwd(sid);
	}

	//修改密码
	@Override
	public Integer uppwd(Student stu) {
		return stumapper.uppwd(stu);
	}

	//查询成绩
	@Override
	public List<Score> findscore(Integer sid) {
		return stumapper.findscore(sid);
	}

}
