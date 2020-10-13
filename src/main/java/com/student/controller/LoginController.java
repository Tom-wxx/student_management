package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.student.pojo.Student;
import com.student.pojo.Teacher;
import com.student.service.StudentService;
import com.student.service.TeacherService;

@Controller
@RequestMapping("/login")
public class LoginController {

	// 引入service层
	@Autowired
	private StudentService stuservice;
	@Autowired
	private TeacherService teaservice;

	// 跳入登录页面
	@RequestMapping("/tologin")
	public String tologin() {
		return "login";
	}

	// 进行登录验证操作
	@RequestMapping("/login")
	@ResponseBody
	public String login(Integer username, String password) {
		Student stu = new Student();
		stu.setSid(username);
		stu.setSpwd(password);
		Teacher tea = new Teacher();
		tea.setTid(username);
		tea.setTpwd(password);
		if (!stuservice.login(stu).equals(null)) {
			stuservice.loginsuccess(stu);
			return "{\"result\":\"suceess\",\"authorid\":\"1\"}";
		} else if (!teaservice.login(tea).equals(null)) {
			teaservice.loginsuccess(tea);
			return "{\"result\":\"suceess\",\"authorid\":\"2\"}";
		}
		return "{\"result\":\"error\"}";
	}

	// 进行登录跳转操作
	@RequestMapping("/loginto")
	public ModelAndView loginto(Integer id,Integer authorId) {
		ModelAndView mav=new ModelAndView();
		if (authorId==1) {
			Student stu=stuservice.findstu(id);
			mav.addObject("stu", stu);
			mav.setViewName("stuview");
		} 
		return null;
	}
}
