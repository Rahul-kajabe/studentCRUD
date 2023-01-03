package com.spring.simple.service;

import java.util.Optional;

import com.spring.simple.model.Student;

public interface StudentService {

	public Student saveStudent(Student student);

	public Optional<Student> findById(Integer id);

	public void deleteById(Integer id);

}
