package com.spring.simple.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.spring.simple.model.Student;
import com.spring.simple.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
    
	@Autowired
   private StudentRepo studentRepo;
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
		
	}

}
