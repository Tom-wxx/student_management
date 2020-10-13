package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.pojo.Score;
import com.student.pojo.Student;
import com.student.service.StudentService;

@Controller
public class StuController {

	@Autowired
	private StudentService studentservice;
	
	//查询密码
	@RequestMapping("/findpwd")
	@ResponseBody
	public Student findpwd(Integer sid){
		return studentservice.findpwd(sid);
	}
	
	//修改密码
	@RequestMapping("/uppwd")
	@ResponseBody
	public String uppwd(Student stu){
		String result = "{\"result\":\"success\"}";
		if (studentservice.uppwd(stu)==0) {
			result = "{\"result\":\"error\"}";
			return result;
		}
		return result;
	}
	
	//成绩、科目、教师查询
	@RequestMapping("/findscore")
	@ResponseBody
	public List<Score> findscore(Integer sid){
		List<Score> scorelist= studentservice.findscore(sid);
		return scorelist;
	}
	
	//查询学生
	@RequestMapping("/findstu")
	@ResponseBody
	public Student findstu(Integer sid){
		return studentservice.findstu(20170101);
	}
	
}
