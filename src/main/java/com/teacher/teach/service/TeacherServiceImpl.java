package com.teacher.teach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teacher.teach.model.Teacher;
import com.teacher.teach.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService{
	
	private TeacherRepository teacherRepository;
	
	
    @Autowired
	public TeacherServiceImpl(TeacherRepository teacherRepository) {
		this.teacherRepository = teacherRepository;
	}

	@Override
	public List<Teacher> getAllTeachers() {
		return teacherRepository.findAll();
	}

	@Override
	public Teacher getTeacher(int teacherno) {
		return teacherRepository.findById(teacherno);
	}
	
	
}
