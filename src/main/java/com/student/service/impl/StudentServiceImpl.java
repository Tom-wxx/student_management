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

	@Autowired
	private StudentMapper stumapper;

	@Override
	public Integer login(Student stu) {

		return stumapper.login(stu);
	}

	@Override
	public void loginsuccess(Student stu) {
		stumapper.loginsuccess(stu);
	}

	@Override
	public Student findstu(Integer sid) {
		return stumapper.fidstu(sid);
	}

	@Override
	public Student findpwd(Integer sid) {

		return stumapper.findpwd(sid);
	}

	@Override
	public Integer uppwd(Student stu) {
		return stumapper.uppwd(stu);
	}

	@Override
	public List<Score> findscore(Integer sid) {
		return stumapper.findscore(sid);
	}

}
