package com.spring.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.simple.model.Student;
import com.spring.simple.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {//  /student/getData
	//http://localhost/8090/student/save
	@Autowired(required = true)
	private StudentService studentService;
	
    @PostMapping("/save")
	public ResponseEntity<Student>  saveStudent(@RequestBody Student student){
		
	Student student1=	studentService.saveStudent(student);
		
		return ResponseEntity.ok().body(student1);
		
	}
	
	
}
