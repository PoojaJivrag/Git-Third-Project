package com.BikkadIt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.BikkadIt.model.Student;


@Service
public interface StudentServiceI {

	
	public int addStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudentById(Integer id);
	
}