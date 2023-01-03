package com.spring.simple.service;

import java.util.Optional;

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

	@Override
	public Optional<Student> findById(Integer id) {
		Optional<Student> stud= studentRepo.findById(id);
		return stud;
	}

	@Override
	public void deleteById(Integer id) {
		studentRepo.deleteById(id);
		
	}

}
