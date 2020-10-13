package com.student.service;

import java.util.List;

import com.student.pojo.Score;
import com.student.pojo.Student;

public interface StudentService {

	public Integer login(Student stu);
	
	public void loginsuccess(Student stu);
	
	Student findstu(Integer sid);
	
	public Student findpwd(Integer sid);
	
	public Integer uppwd(Student stu);
	
	List<Score> findscore(Integer sid);
}
