package com.teacher.teach.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.teacher.teach.model.Teacher;


public interface TeacherRepository extends CrudRepository<Teacher, Integer> {
	
	public List<Teacher> findAll();
	public Teacher findById(int teacherno);
		
	

}
