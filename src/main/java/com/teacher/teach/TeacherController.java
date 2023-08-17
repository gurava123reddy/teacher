package com.teacher.teach;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teacher.teach.model.Teacher;
import com.teacher.teach.service.TeacherService;

@RestController
public class TeacherController {
	
	private TeacherService teacherService;
	
	@Autowired
	public TeacherController(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	
	@GetMapping("/teachers")
	public List<Teacher> getAllTeachers(){
		List<Teacher> teacherList = teacherService.getAllTeachers();
		return teacherList;
	}
	
}
