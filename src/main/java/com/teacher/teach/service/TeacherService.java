package com.teacher.teach.service;

import java.util.List;

import com.teacher.teach.model.Teacher;

public interface TeacherService {
	public List<Teacher> getAllTeachers();
	public Teacher getTeacher(int teacherno);
		
	
}
