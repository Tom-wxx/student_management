package com.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.mapper.TeacherMapeer;
import com.student.pojo.Teacher;
import com.student.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherMapeer teamapper;
	
	@Override
	public Integer login(Teacher tea) {
		return teamapper.login(tea);
	}

	@Override
	public void loginsuccess(Teacher tea) {
		teamapper.loginsuccess(tea);
	}

}
